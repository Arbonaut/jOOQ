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

import static org.jooq.impl.Factory.function;
import static org.jooq.impl.Factory.val;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.SQLDialect;

/**
 * @author Lukas Eder
 */
class Rpad extends AbstractFunction<String> {

    /**
     * Generated UID
     */
    private static final long             serialVersionUID = -7273879239726265322L;

    private final Field<String>           field;
    private final Field<? extends Number> length;
    private final Field<String>           character;

    Rpad(Field<String> field, Field<? extends Number> length) {
        this(field, length, null);
    }

    Rpad(Field<String> field, Field<? extends Number> length, Field<String> character) {
        super("rpad", SQLDataType.VARCHAR, field, length, character);

        this.field = field;
        this.length = length;
        this.character = character;
    }

    @Override
    final Field<String> getFunction0(Configuration configuration) {
        switch (configuration.getDialect()) {
            case ASE:
            case SQLSERVER:
            case SYBASE: {
                if (character == null) {
                    return Factory.concat(field, Factory.repeat(" ", length.sub(Factory.length(field))));
                }
                else {
                    return Factory.concat(field, Factory.repeat(character, length.sub(Factory.length(field))));
                }
            }

            default: {

                // MySQL only knows the 3 parameter version
                if (character == null) {
                    if (configuration.getDialect() == SQLDialect.MYSQL) {
                        return function("rpad", SQLDataType.VARCHAR, field, length, val(" "));
                    }
                    else {
                        return function("rpad", SQLDataType.VARCHAR, field, length);
                    }
                }
                else {
                    return function("rpad", SQLDataType.VARCHAR, field, length, character);
                }
            }
        }
    }
}
