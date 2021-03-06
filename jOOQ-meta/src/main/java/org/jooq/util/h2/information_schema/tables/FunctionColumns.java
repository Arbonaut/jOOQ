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
public class FunctionColumns extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1460371886;

	/**
	 * The singleton instance of INFORMATION_SCHEMA.FUNCTION_COLUMNS
	 */
	public static final org.jooq.util.h2.information_schema.tables.FunctionColumns FUNCTION_COLUMNS = new org.jooq.util.h2.information_schema.tables.FunctionColumns();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_CATALOG</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ALIAS_CATALOG = createField("ALIAS_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_SCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ALIAS_SCHEMA = createField("ALIAS_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ALIAS_NAME = createField("ALIAS_NAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_CLASS</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> JAVA_CLASS = createField("JAVA_CLASS", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_METHOD</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> JAVA_METHOD = createField("JAVA_METHOD", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_COUNT</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> COLUMN_COUNT = createField("COLUMN_COUNT", org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.POS</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.DATA_TYPE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.TYPE_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.PRECISION</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PRECISION = createField("PRECISION", org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.SCALE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.RADIX</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> RADIX = createField("RADIX", org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.NULLABLE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_TYPE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> COLUMN_TYPE = createField("COLUMN_TYPE", org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.REMARKS</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * The table column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_DEFAULT</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_DEFAULT = createField("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * No further instances allowed
	 */
	private FunctionColumns() {
		super("FUNCTION_COLUMNS", org.jooq.util.h2.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}
