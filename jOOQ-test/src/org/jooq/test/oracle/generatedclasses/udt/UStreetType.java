/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.udt;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class UStreetType extends org.jooq.impl.UDTImpl<org.jooq.test.oracle.generatedclasses.udt.records.UStreetTypeRecord> {

	private static final long serialVersionUID = 2147149954;

	/**
	 * The singleton instance of U_STREET_TYPE
	 */
	public static final org.jooq.test.oracle.generatedclasses.udt.UStreetType U_STREET_TYPE = new org.jooq.test.oracle.generatedclasses.udt.UStreetType();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.udt.records.UStreetTypeRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.udt.records.UStreetTypeRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.udt.records.UStreetTypeRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.udt.records.UStreetTypeRecord, java.lang.String> STREET = new org.jooq.impl.UDTFieldImpl<org.jooq.test.oracle.generatedclasses.udt.records.UStreetTypeRecord, java.lang.String>("STREET", org.jooq.impl.SQLDataType.VARCHAR, U_STREET_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.udt.records.UStreetTypeRecord, java.lang.String> NO = new org.jooq.impl.UDTFieldImpl<org.jooq.test.oracle.generatedclasses.udt.records.UStreetTypeRecord, java.lang.String>("NO", org.jooq.impl.SQLDataType.VARCHAR, U_STREET_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.udt.records.UStreetTypeRecord, org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord> FLOORS = new org.jooq.impl.UDTFieldImpl<org.jooq.test.oracle.generatedclasses.udt.records.UStreetTypeRecord, org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord>("FLOORS", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord.class), U_STREET_TYPE);

	/**
	 * No further instances allowed
	 */
	private UStreetType() {
		super("U_STREET_TYPE", org.jooq.test.oracle.generatedclasses.Test.TEST);
	}
}