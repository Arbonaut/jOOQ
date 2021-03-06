/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Funcparms extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1788605060;

	/**
	 * The singleton instance of SYSCAT.FUNCPARMS
	 */
	public static final org.jooq.util.db2.syscat.tables.Funcparms FUNCPARMS = new org.jooq.util.db2.syscat.tables.Funcparms();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.FUNCSCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> FUNCSCHEMA = createField("FUNCSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.FUNCNAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> FUNCNAME = createField("FUNCNAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.SPECIFICNAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFICNAME = createField("SPECIFICNAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.ROWTYPE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ROWTYPE = createField("ROWTYPE", org.jooq.impl.SQLDataType.CHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.ORDINAL</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> ORDINAL = createField("ORDINAL", org.jooq.impl.SQLDataType.SMALLINT, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.PARMNAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PARMNAME = createField("PARMNAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.TYPESCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPESCHEMA = createField("TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.TYPENAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPENAME = createField("TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.LENGTH</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> LENGTH = createField("LENGTH", org.jooq.impl.SQLDataType.INTEGER, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.SCALE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.SMALLINT, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.CODEPAGE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> CODEPAGE = createField("CODEPAGE", org.jooq.impl.SQLDataType.SMALLINT, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.CAST_FUNCID</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CAST_FUNCID = createField("CAST_FUNCID", org.jooq.impl.SQLDataType.INTEGER, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.AS_LOCATOR</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> AS_LOCATOR = createField("AS_LOCATOR", org.jooq.impl.SQLDataType.CHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.TARGET_TYPESCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TARGET_TYPESCHEMA = createField("TARGET_TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.TARGET_TYPENAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TARGET_TYPENAME = createField("TARGET_TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.SCOPE_TABSCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_TABSCHEMA = createField("SCOPE_TABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.SCOPE_TABNAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_TABNAME = createField("SCOPE_TABNAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCPARMS);

	/**
	 * The table column <code>SYSCAT.FUNCPARMS.TRANSFORM_GRPNAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TRANSFORM_GRPNAME = createField("TRANSFORM_GRPNAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCPARMS);

	/**
	 * No further instances allowed
	 */
	private Funcparms() {
		super("FUNCPARMS", org.jooq.util.db2.syscat.Syscat.SYSCAT);
	}
}
