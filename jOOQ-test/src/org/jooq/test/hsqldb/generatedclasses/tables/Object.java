/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class Object extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ObjectRecord> {

	private static final long serialVersionUID = 301857823;

	/**
	 * The singleton instance of OBJECT
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.Object OBJECT = new org.jooq.test.hsqldb.generatedclasses.tables.Object();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.ObjectRecord> __RECORD_TYPE = org.jooq.test.hsqldb.generatedclasses.tables.records.ObjectRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.ObjectRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.ObjectRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ObjectRecord, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, OBJECT);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (OTHER, null) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.ObjectRecord, java.lang.Object> OTHER = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ObjectRecord, java.lang.Object>("OTHER", org.jooq.impl.SQLDataType.OTHER, OBJECT);

	/**
	 * No further instances allowed
	 */
	private Object() {
		super("OBJECT", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}
}