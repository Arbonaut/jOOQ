/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_639_numbers_table", schema = "public")
public class T_639NumbersTableRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = 1038443264;

	/**
	 * The table column <code>public.t_639_numbers_table.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.short</code>
	 */
	public void setShort(java.lang.Short value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.short</code>
	 */
	@javax.persistence.Column(name = "short", precision = 16)
	public java.lang.Short getShort() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.integer</code>
	 */
	public void setInteger(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.integer</code>
	 */
	@javax.persistence.Column(name = "integer", precision = 32)
	public java.lang.Integer getInteger() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.long</code>
	 */
	public void setLong(java.lang.Long value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.long</code>
	 */
	@javax.persistence.Column(name = "long", precision = 64)
	public java.lang.Long getLong() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.byte_decimal</code>
	 */
	public void setByteDecimal(java.lang.Byte value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE_DECIMAL, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.byte_decimal</code>
	 */
	@javax.persistence.Column(name = "byte_decimal", precision = 2)
	public java.lang.Byte getByteDecimal() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE_DECIMAL);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.short_decimal</code>
	 */
	public void setShortDecimal(java.lang.Short value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT_DECIMAL, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.short_decimal</code>
	 */
	@javax.persistence.Column(name = "short_decimal", precision = 4)
	public java.lang.Short getShortDecimal() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT_DECIMAL);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.integer_decimal</code>
	 */
	public void setIntegerDecimal(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER_DECIMAL, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.integer_decimal</code>
	 */
	@javax.persistence.Column(name = "integer_decimal", precision = 9)
	public java.lang.Integer getIntegerDecimal() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER_DECIMAL);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.long_decimal</code>
	 */
	public void setLongDecimal(java.lang.Long value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG_DECIMAL, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.long_decimal</code>
	 */
	@javax.persistence.Column(name = "long_decimal", precision = 18)
	public java.lang.Long getLongDecimal() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG_DECIMAL);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.big_integer</code>
	 */
	public void setBigInteger(java.math.BigInteger value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_INTEGER, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.big_integer</code>
	 */
	@javax.persistence.Column(name = "big_integer", precision = 22)
	public java.math.BigInteger getBigInteger() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_INTEGER);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.big_decimal</code>
	 */
	public void setBigDecimal(java.math.BigDecimal value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_DECIMAL, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.big_decimal</code>
	 */
	@javax.persistence.Column(name = "big_decimal", precision = 22, scale = 5)
	public java.math.BigDecimal getBigDecimal() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_DECIMAL);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.float</code>
	 */
	public void setFloat(java.lang.Float value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.FLOAT, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.float</code>
	 */
	@javax.persistence.Column(name = "float", precision = 24)
	public java.lang.Float getFloat() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.FLOAT);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.double</code>
	 */
	public void setDouble(java.lang.Double value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.DOUBLE, value);
	}

	/**
	 * The table column <code>public.t_639_numbers_table.double</code>
	 */
	@javax.persistence.Column(name = "double", precision = 53)
	public java.lang.Double getDouble() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.DOUBLE);
	}

	/**
	 * Create a detached T_639NumbersTableRecord
	 */
	public T_639NumbersTableRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE);
	}
}
