/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Constraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1781090470;

	/**
	 * The singleton instance of INFORMATION_SCHEMA.CONSTRAINTS
	 */
	public static final org.jooq.util.h2.information_schema.tables.Constraints CONSTRAINTS = new org.jooq.util.h2.information_schema.tables.Constraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_CATALOG</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_SCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_TYPE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_TYPE = createField("CONSTRAINT_TYPE", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_CATALOG</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_SCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.UNIQUE_INDEX_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_INDEX_NAME = createField("UNIQUE_INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.CHECK_EXPRESSION</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CHECK_EXPRESSION = createField("CHECK_EXPRESSION", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.COLUMN_LIST</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_LIST = createField("COLUMN_LIST", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.REMARKS</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.SQL</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SQL = createField("SQL", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.CONSTRAINTS.ID</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private Constraints() {
		super("CONSTRAINTS", org.jooq.util.h2.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}
