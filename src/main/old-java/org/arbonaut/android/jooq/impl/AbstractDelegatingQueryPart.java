/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.impl;

import java.util.Arrays;
import java.util.List;

import org.jooq.Attachable;
import org.jooq.AttachableInternal;
import org.jooq.BindContext;
import org.jooq.Configuration;
import org.jooq.QueryPart;
import org.jooq.RenderContext;

/**
 * @author Lukas Eder
 */
abstract class AbstractDelegatingQueryPart<Q extends QueryPart> extends AbstractQueryPart implements AttachableInternal {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = 6710523592699040547L;
    private final Q           delegate;

    AbstractDelegatingQueryPart(Q delegate) {
        this.delegate = delegate;
    }

    @Override
    @Deprecated
    public void attach(Configuration configuration) {
        delegate.attach(configuration);
    }

    @Override
    public Configuration getConfiguration() {
        if (delegate instanceof AttachableInternal) {
            return ((AttachableInternal) delegate).getConfiguration();
        }

        return super.getConfiguration();
    }

    @Override
    public final void toSQL(RenderContext context) {
        context.sql(delegate);
    }

    @Override
    public final void bind(BindContext context) {
        context.bind(delegate);
    }

    @Override
    public List<Attachable> getAttachables() {
        return Arrays.<Attachable>asList(delegate);
    }

    final Q getDelegate() {
        return delegate;
    }
}
