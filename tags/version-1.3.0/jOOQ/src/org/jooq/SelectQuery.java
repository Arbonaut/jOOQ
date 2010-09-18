/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
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
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
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

package org.jooq;

import java.util.Collection;

/**
 * A query for data selection
 *
 * @author Lukas Eder
 */
public interface SelectQuery extends ResultProviderQuery, ConditionProvider, QueryPart {

	/**
	 * Combine this SelectQuery with another one, using the
	 * {@link CombineOperator#UNION} operator.
	 *
	 * @param others
	 *            The SelectQuery to combine this one with
	 * @return
	 * @see #combine(SelectQuery, CombineOperator)
	 */
	SelectQuery combine(SelectQuery... others);

	/**
	 * Combine this SelectQuery with another one, using the given operator.
	 *
	 * @param others
	 *            The SelectQuery to combine this one with
	 * @param operator
	 *            The combine operator
	 * @return
	 */
	SelectQuery combine(CombineOperator operator, SelectQuery... other);

	/**
	 * Use this query as a table
	 * <p>
	 * This method is useful for things like
	 * <code>SELECT * FROM (SELECT * FROM x WHERE x.a = '1') WHERE
	 * @return This result provider as a Table object
	 */
	Table asTable();

	/**
	 * Use this query as a field.
	 * <p>
	 * This method is useful for things like
	 * <code>SELECT y.*, (SELECT a FROM x) a FROM y</code>
	 *
	 * @return This result provider as a Field&lt;?&gt; object
	 */
	<T> Field<T> asField();

	/**
	 * Use this query for IN conditions.
	 * <p>
	 * This method is useful for things like
	 * <code>SELECT * FROM x WHERE x.field IN (SELECT ...)</code>
	 *
	 * @param field
	 *            The field to compare this query's results with
	 * @return This result provider as a InCondition object
	 */
	<T> SubQueryCondition<T> asInCondition(Field<T> field);

	/**
	 * Use this query for NOT IN conditions.
	 * <p>
	 * This method is useful for things like
	 * <code>SELECT * FROM x WHERE x.field NOT IN (SELECT ...)</code>
	 *
	 * @param field
	 *            The field to compare this query's results with
	 * @return This result provider as a InCondition object
	 */
	<T> SubQueryCondition<T> asNotInCondition(Field<T> field);

	/**
	 * Use this query for EQUALS conditions.
	 * <p>
	 * This method is useful for things like
	 * <code>SELECT * FROM x WHERE x.field = (SELECT ...)</code>
	 *
	 * @param field
	 *            The field to compare this query's results with
	 * @return This result provider as a InCondition object
	 */
	<T> SubQueryCondition<T> asCompareCondition(Field<T> field);

	/**
	 * This method is useful for things like
	 * <code>SELECT * FROM x WHERE x.field [any operator] (SELECT ...)</code>
	 *
	 * @param field
	 *            The field to compare this query's results with
	 * @return This result provider as a InCondition object
	 */
	<T> SubQueryCondition<T> asSubQueryCondition(Field<T> field, SubQueryOperator operator);

	/**
	 * Use this query for EXISTS conditions.
	 * <p>
	 * This method is useful for things like
	 * <code>SELECT * FROM x WHERE EXISTS (SELECT ...)</code>
	 *
	 * @param field
	 *            The field to compare this query's results with
	 * @return This result provider as a InCondition object
	 */
	ExistsCondition asExistsCondition();

	/**
	 * Use this query for NOT EXISTS conditions.
	 * <p>
	 * This method is useful for things like
	 * <code>SELECT * FROM x WHERE NOT EXISTS (SELECT ...)</code>
	 *
	 * @param field
	 *            The field to compare this query's results with
	 * @return This result provider as a InCondition object
	 */
	ExistsCondition asNotExistsCondition();

	/**
	 * Adds ordering fields, ordering by the default sort order
	 *
	 * @param fields The ordering fields
	 */
	void addOrderBy(Field<?>... fields);

	/**
	 * Adds ordering fields, ordering by the default sort order
	 *
	 * @param fields The ordering fields
	 */
	void addOrderBy(Collection<Field<?>> fields);

	/**
	 * Adds ordering fields
	 *
	 * @param fields The ordering fields
	 */
	void addOrderBy(OrderByFieldList fields);

	/**
	 * Adds an ordering field
	 *
	 * @param field The ordering field
	 * @param order The sort order
	 */
	void addOrderBy(Field<?> field, SortOrder order);

	FieldList getSelect();
	Class<? extends Record> getRecordType();

	/**
	 * Add a list of select fields
	 *
	 * @param fields
	 */
	void addSelect(Field<?>... fields);

	/**
	 * Add a list of select fields
	 *
	 * @param fields
	 */
	void addSelect(Collection<Field<?>> fields);

	/**
	 * {@inheritDoc}
	 */
	@Override
	void addConditions(Condition... conditions);

	/**
	 * {@inheritDoc}
	 */
	@Override
	void addConditions(Collection<Condition> conditions);

	/**
	 * Add tables to the table product
	 *
	 * @param from The added tables
	 */
	void addFrom(Table... from);

	/**
	 * Add tables to the table product
	 *
	 * @param from The added tables
	 */
	void addFrom(Collection<Table> from);

	/**
	 * Joins the existing table product to a new table using a condition
	 *
	 * @param table The joined table
	 * @param conditions The joining conditions
	 */
	void addJoin(Table table, Condition... conditions);

	/**
	 * Joins the existing table product to a new table using a condition
	 *
	 * @param table The joined table
	 * @param type The type of join
	 * @param conditions The joining conditions
	 */
	void addJoin(Table table, JoinType type, Condition... conditions);

	/**
	 * Joins the existing table product to a new table joining on two fields
	 *
	 * @param <T> The common field type
	 * @param table The joined table
	 * @param field1 The left field of the join condition
	 * @param field2 The right field of the join condition
	 */
	<T> void addJoin(Table table, Field<T> field1, Field<T> field2);

	/**
	 * Joins the existing table product to a new table joining on two fields
	 *
	 * @param <T> The common field type
	 * @param table The joined table
	 * @param type The type of join
	 * @param field1 The left field of the join condition
	 * @param field2 The right field of the join condition
	 */
	<T> void addJoin(Table table, JoinType type, Field<T> field1, Field<T> field2);

	/**
	 * Joins the existing table product to join object
	 *
	 * @param join The join object
	 */
	void addJoin(Join join);

	/**
	 * Adds grouping fields
	 *
	 * @param fields The grouping fields
	 */
	void addGroupBy(Field<?>... fields);

	/**
	 * Adds grouping fields
	 *
	 * @param fields The grouping fields
	 */
	void addGroupBy(Collection<Field<?>> fields);

	/**
	 * Adds new conditions to the having clause of the query, connecting it to
	 * existing conditions with the and operator.
	 *
	 * @param conditions
	 *            The condition
	 */
	<T> void addHaving(Field<T> field, T value);

	/**
	 * Adds new conditions to the having clause of the query, connecting it to
	 * existing conditions with the and operator.
	 *
	 * @param conditions
	 *            The condition
	 */
	<T> void addHaving(Field<T> field, T value, Comparator comparator);

	/**
	 * Adds new conditions to the having clause of the query, connecting it to
	 * existing conditions with the and operator.
	 *
	 * @param conditions
	 *            The condition
	 */
	void addHaving(Condition... conditions);

	/**
	 * Adds new conditions to the having clause of the query, connecting it to
	 * existing conditions with the and operator.
	 *
	 * @param conditions
	 *            The condition
	 */
	void addHaving(Collection<Condition> conditions);

	/**
	 * Limit the results of this select
	 * <p>
	 * This is the same as calling {@link #addLimit(int, int)} with lowerBound = 1
	 *
	 * @param numberOfRows The number of rows to return
	 */
	void addLimit(int numberOfRows);

	/**
	 * Limit the results of this select
	 *
	 * @param lowerBound The lowest rownum starting at 1
	 * @param numberOfRows The number of rows to return
	 */
	void addLimit(int lowerBound, int numberOfRows);
}