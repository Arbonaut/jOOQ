/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Systable extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -561414275;

	/**
	 * The singleton instance of SYS.SYSTABLE
	 */
	public static final org.jooq.util.sybase.sys.tables.Systable SYSTABLE = new org.jooq.util.sybase.sys.tables.Systable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>SYS.SYSTABLE.table_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_ID = createField("table_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTABLE.file_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> FILE_ID = createField("file_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>SYS.SYSTABLE.count</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>SYS.SYSTABLE.first_page</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> FIRST_PAGE = createField("first_page", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>SYS.SYSTABLE.last_page</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> LAST_PAGE = createField("last_page", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTABLE.primary_root</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PRIMARY_ROOT = createField("primary_root", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTABLE.creator</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CREATOR = createField("creator", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTABLE.first_ext_page</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> FIRST_EXT_PAGE = createField("first_ext_page", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>SYS.SYSTABLE.last_ext_page</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> LAST_EXT_PAGE = createField("last_ext_page", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>SYS.SYSTABLE.table_page_count</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_PAGE_COUNT = createField("table_page_count", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTABLE.ext_page_count</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> EXT_PAGE_COUNT = createField("ext_page_count", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTABLE.object_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>SYS.SYSTABLE.table_name</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>SYS.SYSTABLE.table_type</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_TYPE = createField("table_type", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>SYS.SYSTABLE.view_def</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> VIEW_DEF = createField("view_def", org.jooq.impl.SQLDataType.LONGVARCHAR, this);

	/**
	 * The table column <code>SYS.SYSTABLE.remarks</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.LONGVARCHAR, this);

	/**
	 * The table column <code>SYS.SYSTABLE.replicate</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> REPLICATE = createField("replicate", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>SYS.SYSTABLE.existing_obj</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> EXISTING_OBJ = createField("existing_obj", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>SYS.SYSTABLE.remote_location</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> REMOTE_LOCATION = createField("remote_location", org.jooq.impl.SQLDataType.LONGVARCHAR, this);

	/**
	 * The table column <code>SYS.SYSTABLE.remote_objtype</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> REMOTE_OBJTYPE = createField("remote_objtype", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>SYS.SYSTABLE.srvid</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> SRVID = createField("srvid", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTABLE.server_type</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SERVER_TYPE = createField("server_type", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>SYS.SYSTABLE.primary_hash_limit</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PRIMARY_HASH_LIMIT = createField("primary_hash_limit", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>SYS.SYSTABLE.page_map_start</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PAGE_MAP_START = createField("page_map_start", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>SYS.SYSTABLE.source</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SOURCE = createField("source", org.jooq.impl.SQLDataType.LONGVARCHAR, this);

	/**
	 * The table column <code>SYS.SYSTABLE.encrypted</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ENCRYPTED = createField("encrypted", org.jooq.impl.SQLDataType.CHAR, this);

	public Systable() {
		super("SYSTABLE", org.jooq.util.sybase.sys.Sys.SYS);
	}

	public Systable(java.lang.String alias) {
		super(alias, org.jooq.util.sybase.sys.Sys.SYS, org.jooq.util.sybase.sys.tables.Systable.SYSTABLE);
	}

	@Override
	public org.jooq.util.sybase.sys.tables.Systable as(java.lang.String alias) {
		return new org.jooq.util.sybase.sys.tables.Systable(alias);
	}
}
