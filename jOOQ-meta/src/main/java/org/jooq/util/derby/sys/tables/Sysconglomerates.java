/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Sysconglomerates extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -664432102;

	/**
	 * The singleton instance of SYS.SYSCONGLOMERATES
	 */
	public static final org.jooq.util.derby.sys.tables.Sysconglomerates SYSCONGLOMERATES = new org.jooq.util.derby.sys.tables.Sysconglomerates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>SYS.SYSCONGLOMERATES.SCHEMAID</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMAID = createField("SCHEMAID", org.jooq.impl.SQLDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * The table column <code>SYS.SYSCONGLOMERATES.TABLEID</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLEID = createField("TABLEID", org.jooq.impl.SQLDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * The table column <code>SYS.SYSCONGLOMERATES.CONGLOMERATENUMBER</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> CONGLOMERATENUMBER = createField("CONGLOMERATENUMBER", org.jooq.impl.SQLDataType.BIGINT, SYSCONGLOMERATES);

	/**
	 * The table column <code>SYS.SYSCONGLOMERATES.CONGLOMERATENAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONGLOMERATENAME = createField("CONGLOMERATENAME", org.jooq.impl.SQLDataType.VARCHAR, SYSCONGLOMERATES);

	/**
	 * The table column <code>SYS.SYSCONGLOMERATES.ISINDEX</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> ISINDEX = createField("ISINDEX", org.jooq.impl.SQLDataType.BOOLEAN, SYSCONGLOMERATES);

	/**
	 * The table column <code>SYS.SYSCONGLOMERATES.DESCRIPTOR</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DESCRIPTOR = createField("DESCRIPTOR", org.jooq.impl.SQLDataType.CLOB, SYSCONGLOMERATES);

	/**
	 * The table column <code>SYS.SYSCONGLOMERATES.ISCONSTRAINT</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> ISCONSTRAINT = createField("ISCONSTRAINT", org.jooq.impl.SQLDataType.BOOLEAN, SYSCONGLOMERATES);

	/**
	 * The table column <code>SYS.SYSCONGLOMERATES.CONGLOMERATEID</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONGLOMERATEID = createField("CONGLOMERATEID", org.jooq.impl.SQLDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * No further instances allowed
	 */
	private Sysconglomerates() {
		super("SYSCONGLOMERATES", org.jooq.util.derby.sys.Sys.SYS);
	}
}
