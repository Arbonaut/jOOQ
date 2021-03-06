/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class ReferentialConstraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 804114038;

	/**
	 * The singleton instance of information_schema.REFERENTIAL_CONSTRAINTS
	 */
	public static final org.jooq.util.mysql.information_schema.tables.ReferentialConstraints REFERENTIAL_CONSTRAINTS = new org.jooq.util.mysql.information_schema.tables.ReferentialConstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * The table column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * The table column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * The table column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_CONSTRAINT_CATALOG = createField("UNIQUE_CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * The table column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_CONSTRAINT_SCHEMA = createField("UNIQUE_CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * The table column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_CONSTRAINT_NAME = createField("UNIQUE_CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * The table column <code>information_schema.REFERENTIAL_CONSTRAINTS.MATCH_OPTION</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> MATCH_OPTION = createField("MATCH_OPTION", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * The table column <code>information_schema.REFERENTIAL_CONSTRAINTS.UPDATE_RULE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UPDATE_RULE = createField("UPDATE_RULE", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * The table column <code>information_schema.REFERENTIAL_CONSTRAINTS.DELETE_RULE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DELETE_RULE = createField("DELETE_RULE", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * The table column <code>information_schema.REFERENTIAL_CONSTRAINTS.TABLE_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * The table column <code>information_schema.REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REFERENCED_TABLE_NAME = createField("REFERENCED_TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, REFERENTIAL_CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private ReferentialConstraints() {
		super("REFERENTIAL_CONSTRAINTS", org.jooq.util.mysql.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}
