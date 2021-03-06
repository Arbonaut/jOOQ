/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Iiconstraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1102063461;

	/**
	 * The singleton instance of $ingres.iiconstraints
	 */
	public static final org.jooq.util.ingres.ingres.tables.Iiconstraints IICONSTRAINTS = new org.jooq.util.ingres.ingres.tables.Iiconstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>$ingres.iiconstraints.constraint_name</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * The table column <code>$ingres.iiconstraints.schema_name</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * The table column <code>$ingres.iiconstraints.table_name</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * The table column <code>$ingres.iiconstraints.constraint_type</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_TYPE = createField("constraint_type", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * The table column <code>$ingres.iiconstraints.create_date</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * The table column <code>$ingres.iiconstraints.text_sequence</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> TEXT_SEQUENCE = createField("text_sequence", org.jooq.impl.SQLDataType.BIGINT, IICONSTRAINTS);

	/**
	 * The table column <code>$ingres.iiconstraints.text_segment</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TEXT_SEGMENT = createField("text_segment", org.jooq.impl.SQLDataType.VARCHAR, IICONSTRAINTS);

	/**
	 * The table column <code>$ingres.iiconstraints.system_use</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SYSTEM_USE = createField("system_use", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private Iiconstraints() {
		super("iiconstraints", org.jooq.util.ingres.ingres.$ingres.$INGRES);
	}
}
