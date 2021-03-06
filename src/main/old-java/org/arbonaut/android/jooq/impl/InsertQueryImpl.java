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

import static org.jooq.SQLDialect.MYSQL;
import static org.jooq.impl.Factory.val;
import static org.jooq.util.sqlite.SQLiteFactory.rowid;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;


import org.jooq.BindContext;
import org.jooq.Condition;
import org.jooq.Configuration;
import org.jooq.ExecuteContext;
import org.jooq.ExecuteListener;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.InsertQuery;
import org.jooq.Merge;
import org.jooq.MergeNotMatchedStep;
import org.jooq.MergeOnConditionStep;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.RenderContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.Table;
import org.jooq.UpdatableTable;
import org.jooq.exception.SQLDialectNotSupportedException;
import org.jooq.util.sqlite.SQLiteFactory;

/**
 * @author Lukas Eder
 */
class InsertQueryImpl<R extends Record> extends AbstractStoreQuery<R> implements InsertQuery<R> {

    private static final long        serialVersionUID = 4466005417945353842L;

    private final FieldMapForUpdate  updateMap;
    private final FieldMapsForInsert insertMaps;
    private final FieldList          returning;
    private Result<R>                returned;
    private boolean                  onDuplicateKeyUpdate;
    private boolean                  onDuplicateKeyIgnore;

    InsertQueryImpl(Configuration configuration, Table<R> into) {
        super(configuration, into);

        updateMap = new FieldMapForUpdate();
        insertMaps = new FieldMapsForInsert();
        returning = new FieldList();
    }

    @Override
    public final void setRecord(R record) {
        for (Field<?> field : record.getFields()) {
            addValue(record, field);
        }
    }

    @Override
    public final void newRecord() {
        insertMaps.newRecord();
    }

    @Override
    protected final FieldMapForInsert getValues() {
        return insertMaps.getMap();
    }

    @Override
    public final void addRecord(R record) {
        newRecord();
        setRecord(record);
    }

    @Override
    public final void onDuplicateKeyUpdate(boolean flag) {
        this.onDuplicateKeyIgnore = false;
        this.onDuplicateKeyUpdate = flag;
    }

    @Override
    public final void onDuplicateKeyIgnore(boolean flag) {
        this.onDuplicateKeyUpdate = false;
        this.onDuplicateKeyIgnore = flag;
    }

    @Override
    public final <T> void addValueForUpdate(Field<T> field, T value) {
        addValueForUpdate(field, val(value, field));
    }

    @Override
    public final <T> void addValueForUpdate(Field<T> field, Field<T> value) {
        if (value == null) {
            updateMap.put(field, val(null, field));
        }
        else {
            updateMap.put(field, value);
        }
    }

    @Override
    public final void addValuesForUpdate(Map<? extends Field<?>, ?> map) {
        updateMap.set(map);
    }

    @Override
    public final void addValues(Map<? extends Field<?>, ?> map) {
        insertMaps.getMap().set(map);
    }

    @Override
    public final void toSQL(RenderContext context) {

        // ON DUPLICATE KEY UPDATE clause
        // ------------------------------
        if (onDuplicateKeyUpdate) {
            switch (context.getDialect()) {

                // MySQL has a nice syntax for this
                case CUBRID:
                case MYSQL: {
                    toSQLInsert(context);
                    context.formatSeparator()
                           .keyword("on duplicate key update ")
                           .sql(updateMap);

                    break;
                }

                // Some dialects can't really handle this clause. Simulation
                // should be done in two steps
                case H2: {
                    throw new SQLDialectNotSupportedException("The ON DUPLICATE KEY UPDATE clause cannot be simulated for " + context.getDialect());
                }

                // Some databases allow for simulating this clause using a
                // MERGE statement
                case DB2:
                case HSQLDB:
                case ORACLE:
                case SQLSERVER:
                case SYBASE: {
                    context.sql(toMerge());
                    break;
                }

                default:
                    throw new SQLDialectNotSupportedException("The ON DUPLICATE KEY UPDATE clause cannot be simulated for " + context.getDialect());
            }
        }

        // ON DUPLICATE KEY IGNORE clause
        // ------------------------------
        else if (onDuplicateKeyIgnore) {
            switch (context.getDialect()) {

                // MySQL has a nice, native syntax for this
                case MYSQL: {
                    toSQLInsert(context);
                    break;
                }

                // CUBRID can simulate this using ON DUPLICATE KEY UPDATE
                case CUBRID: {
                    FieldMapForUpdate update = new FieldMapForUpdate();
                    Field<?> field = getInto().getField(0);
                    update.put(field, field);

                    toSQLInsert(context);
                    context.formatSeparator()
                           .keyword("on duplicate key update ")
                           .sql(update);

                    break;
                }

                // Some dialects can't really handle this clause. Simulation
                // should be done in two steps
                case H2: {
                    throw new SQLDialectNotSupportedException("The ON DUPLICATE KEY IGNORE clause cannot be simulated for " + context.getDialect());
                }

                // Some databases allow for simulating this clause using a
                // MERGE statement
                case DB2:
                case HSQLDB:
                case ORACLE:
                case SQLSERVER:
                case SYBASE: {
                    context.sql(toMerge());
                    break;
                }

                default:
                    throw new SQLDialectNotSupportedException("The ON DUPLICATE KEY IGNORE clause cannot be simulated for " + context.getDialect());
            }
        }

        // Default mode
        // ------------
        else {
            toSQLInsert(context);
        }
    }

    @Override
    public final void bind(BindContext context) {

        // ON DUPLICATE KEY UPDATE clause
        // ------------------------------
        if (onDuplicateKeyUpdate) {
            switch (context.getDialect()) {

                // MySQL has a nice syntax for this
                case CUBRID:
                case MYSQL: {
                    bindInsert(context);
                    break;
                }

                // Some dialects can't really handle this clause. Simulation
                // is done in two steps
                case H2: {
                    throw new SQLDialectNotSupportedException("The ON DUPLICATE KEY UPDATE clause cannot be simulated for " + context.getDialect());
                }

                // Some databases allow for simulating this clause using a
                // MERGE statement
                case DB2:
                case HSQLDB:
                case ORACLE:
                case SQLSERVER:
                case SYBASE: {
                    context.bind(toMerge());
                    break;
                }

                default:
                    throw new SQLDialectNotSupportedException("The ON DUPLICATE KEY UPDATE clause cannot be simulated for " + context.getDialect());
            }
        }

        // ON DUPLICATE KEY IGNORE clause
        // ------------------------------
        else if (onDuplicateKeyIgnore) {
            switch (context.getDialect()) {

                // MySQL has a nice, native syntax for this
                case MYSQL: {
                    bindInsert(context);
                    break;
                }

                // CUBRID can simulate this using ON DUPLICATE KEY UPDATE
                case CUBRID: {
                    bindInsert(context);
                    break;
                }

                // Some dialects can't really handle this clause. Simulation
                // is done in two steps
                case H2: {
                    throw new SQLDialectNotSupportedException("The ON DUPLICATE KEY IGNORE clause cannot be simulated for " + context.getDialect());
                }

                // Some databases allow for simulating this clause using a
                // MERGE statement
                case DB2:
                case HSQLDB:
                case ORACLE:
                case SQLSERVER:
                case SYBASE: {
                    context.bind(toMerge());
                    break;
                }

                default:
                    throw new SQLDialectNotSupportedException("The ON DUPLICATE KEY IGNORE clause cannot be simulated for " + context.getDialect());
            }
        }

        // Default mode
        // ------------
        else {
            bindInsert(context);
        }
    }

    private final void toSQLInsert(RenderContext context) {
        context.keyword("insert ")
               // [#1295] MySQL natively supports the IGNORE keyword
               .keyword((onDuplicateKeyIgnore && context.getDialect() == MYSQL) ? "ignore " : "")
               .keyword("into ")
               .sql(getInto())
               .sql(" ")
               .sql(insertMaps);

        if (!returning.isEmpty()) {
            switch (context.getDialect()) {
                case FIREBIRD:
                case POSTGRES:
                    context.formatSeparator()
                           .keyword("returning ")
                           .sql(returning);
                    break;

                default:
                    // Other dialects don't render a RETURNING clause, but
                    // use JDBC's Statement.RETURN_GENERATED_KEYS mode instead
            }
        }
    }

    private final void bindInsert(BindContext context) {
        context.bind(getInto())
               .bind(insertMaps)
               .bind(updateMap);

        switch (context.getDialect()) {
            case FIREBIRD:
            case POSTGRES:
                context.bind((QueryPart) returning);
                break;

            default:
                // Other dialects don't bind a RETURNING clause, but
                // use JDBC's Statement.RETURN_GENERATED_KEYS mode instead
        }
    }

    @SuppressWarnings("unchecked")
    private final Merge<R> toMerge() {
        if (getInto() instanceof UpdatableTable) {
            UpdatableTable<R> into = (UpdatableTable<R>) getInto();

            Condition condition = null;
            List<Field<?>> key = new ArrayList<Field<?>>();

            for (Field<?> f : into.getMainKey().getFields()) {
                Field<Object> field = (Field<Object>) f;
                Field<Object> value = (Field<Object>) insertMaps.getMap().get(field);

                key.add(value);
                Condition other = field.equal(value);

                if (condition == null) {
                    condition = other;
                }
                else {
                    condition = condition.and(other);
                }
            }

            MergeOnConditionStep<R> on =
            create().mergeInto(into)
                    .usingDual()
                    .on(condition);

            // [#1295] Use UPDATE clause only when with ON DUPLICATE KEY UPDATE,
            // not with ON DUPLICATE KEY IGNORE
            MergeNotMatchedStep<R> notMatched = on;
            if (onDuplicateKeyUpdate) {
                notMatched = on.whenMatchedThenUpdate()
                               .set(updateMap);
            }

            return notMatched.whenNotMatchedThenInsert(insertMaps.getMap().keySet())
                             .values(insertMaps.getMap().values());
        }
        else {
            throw new IllegalStateException("The ON DUPLICATE KEY IGNORE/UPDATE clause cannot be simulated when inserting into non-updatable tables : " + getInto());
        }
    }

    @Override
    public final boolean isExecutable() {
        return insertMaps.isExecutable();
    }

    @Override
    protected final void prepare(ExecuteContext ctx) throws SQLException {
        Connection connection = ctx.getConnection();

        // Just in case, always set Sybase ASE statement mode to return
        // Generated keys if client code wants to SELECT @@identity afterwards
        if (ctx.getDialect() == SQLDialect.ASE) {
            ctx.statement(connection.prepareStatement(ctx.sql(), Statement.RETURN_GENERATED_KEYS));
            return;
        }

        // Normal statement preparing if no values should be returned
        else if (returning.isEmpty()) {
            super.prepare(ctx);
            return;
        }

        // Values should be returned from the INSERT
        else {
            switch (ctx.getDialect()) {

                // Postgres uses the RETURNING clause in SQL
                case FIREBIRD:
                case POSTGRES:
                // SQLite will select last_insert_rowid() after the INSER
                case SQLITE:
                // Sybase will select @@identity after the INSERT
                case CUBRID:
                case SYBASE:
                    super.prepare(ctx);
                    return;

                // Some dialects can only return AUTO_INCREMENT values
                // Other values have to be fetched in a second step
                // [#1260] TODO CUBRID supports this, but there's a JDBC bug
                case ASE:
                case DERBY:
                case H2:
                case INGRES:
                case MYSQL:
                case SQLSERVER:
                    ctx.statement(connection.prepareStatement(ctx.sql(), Statement.RETURN_GENERATED_KEYS));
                    return;

                // The default is to return all requested fields directly
                default: {
                    List<String> names = new ArrayList<String>();

                    for (Field<?> field : returning) {
                        names.add(field.getName());
                    }

                    ctx.statement(connection.prepareStatement(ctx.sql(), names.toArray(new String[names.size()])));
                    return;
                }
            }
        }
    }

    @Override
    protected final int execute(ExecuteContext ctx, ExecuteListener listener) throws SQLException {
        if (returning.isEmpty()) {
            return super.execute(ctx, listener);
        }
        else {
            int result = 1;
            ResultSet rs;
            switch (ctx.getDialect()) {

                // SQLite can select _rowid_ after the insert
                case SQLITE: {
                    listener.executeStart(ctx);
                    result = ctx.statement().executeUpdate();
                    listener.executeEnd(ctx);

                    SQLiteFactory create = new SQLiteFactory(ctx.getConnection(), ctx.getSettings());
                    returned =
                    create.select(returning)
                          .from(getInto())
                          .where(rowid().equal(rowid().getDataType().convert(create.lastID())))
                          .fetchInto(getInto());

                    return result;
                }

                // Sybase can select @@identity after the insert
                // TODO [#832] Fix this. This might be a driver issue. JDBC
                // Generated keys don't work with jconn3, but they seem to work
                // with jTDS (which is used for Sybase ASE integration)
                case CUBRID:
                case SYBASE: {
                    listener.executeStart(ctx);
                    result = ctx.statement().executeUpdate();
                    listener.executeEnd(ctx);

                    selectReturning(ctx.configuration(), create(ctx).lastID());
                    return result;
                }

                // Some dialects can only retrieve "identity" (AUTO_INCREMENT) values
                // Additional values have to be fetched explicitly
                // [#1260] TODO CUBRID supports this, but there's a JDBC bug
                case ASE:
                case DERBY:
                case H2:
                case INGRES:
                case MYSQL:
                case SQLSERVER: {
                    listener.executeStart(ctx);
                    result = ctx.statement().executeUpdate();
                    listener.executeEnd(ctx);

                    rs = ctx.statement().getGeneratedKeys();

                    try {
                        List<Object> list = new ArrayList<Object>();
                        while (rs.next()) {
                            list.add(rs.getObject(1));
                        }

                        selectReturning(ctx, list.toArray());
                        return result;
                    }
                    finally {
                        rs.close();
                    }
                }

                // Firebird and Postgres can execute the INSERT .. RETURNING
                // clause like a select clause. JDBC support is not implemented
                // in the Postgres JDBC driver
                case FIREBIRD:
                case POSTGRES: {
                    listener.executeStart(ctx);
                    rs = ctx.statement().executeQuery();
                    listener.executeEnd(ctx);

                    break;
                }

                // These dialects have full JDBC support
                case DB2:
                case HSQLDB:
                case ORACLE:
                default: {
                    listener.executeStart(ctx);
                    result = ctx.statement().executeUpdate();
                    listener.executeEnd(ctx);

                    rs = ctx.statement().getGeneratedKeys();
                    break;
                }
            }

            ExecuteContext ctx2 = new DefaultExecuteContext(ctx.configuration());
            ExecuteListener listener2 = new ExecuteListeners(ctx2);

            ctx2.resultSet(rs);
            returned = new CursorImpl<R>(ctx2, listener2, returning).fetch().into(getInto());
            return result;
        }
    }

    /**
     * Get the returning record in those dialects that do not support fetching
     * arbitrary fields from JDBC's {@link Statement#getGeneratedKeys()} method.
     */
    @SuppressWarnings("unchecked")
    private final void selectReturning(Configuration configuration, Object... values) {
        if (values != null && values.length > 0) {
            Table<R> into = getInto();

            // This shouldn't be null, as relevant dialects should
            // return empty generated keys ResultSet
            if (into.getIdentity() != null) {
                Field<Number> field = (Field<Number>) into.getIdentity().getField();
                Number[] ids = new Number[values.length];
                for (int i = 0; i < values.length; i++) {
                    ids[i] = field.getDataType().convert(values[i]);
                }

                // Only the IDENTITY value was requested. No need for an
                // additional query
                if (returning.size() == 1 && returning.get(0).equals(field)) {
                    for (Number id : ids) {
                        R typed = Util.newRecord(into, configuration);
                        ((AbstractRecord) typed).setValue(field, new Value<Number>(id));
                        getReturnedRecords().add(typed);
                    }
                }

                // Other values are requested, too. Run another query
                else {
                    returned =
                    create(configuration).select(returning)
                                         .from(into)
                                         .where(field.in(ids))
                                         .fetchInto(into);
                }
            }
        }
    }

    @Override
    public final void setReturning() {
        setReturning(getInto().getFields());
    }

    @Override
    public final void setReturning(Identity<R, ? extends Number> identity) {
        if (identity != null) {
            setReturning(identity.getField());
        }
    }

    @Override
    public final void setReturning(Field<?>... fields) {
        setReturning(Arrays.asList(fields));
    }

    @Override
    public final void setReturning(Collection<? extends Field<?>> fields) {
        returning.clear();
        returning.addAll(fields);
    }

    @Override
    public final R getReturnedRecord() {
        if (getReturnedRecords().size() == 0) {
            return null;
        }

        return getReturnedRecords().get(0);
    }

    @Override
    public final Result<R> getReturnedRecords() {
        if (returned == null) {
            returned = new ResultImpl<R>(getConfiguration(), returning);
        }

        return returned;
    }
}
