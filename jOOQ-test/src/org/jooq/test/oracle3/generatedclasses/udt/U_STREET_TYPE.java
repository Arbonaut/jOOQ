/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt;

/**
 * This class is generated by jOOQ.
 */
public class U_STREET_TYPE extends org.jooq.impl.UDTImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE> {

	private static final long serialVersionUID = 1447600362;

	/**
	 * The singleton instance of TEST.U_STREET_TYPE
	 */
	public static final org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE U_STREET_TYPE = new org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE> __RECORD_TYPE = org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE, java.lang.String> STREET = createField("STREET", org.jooq.impl.SQLDataType.VARCHAR, U_STREET_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE, java.lang.String> NO = createField("NO", org.jooq.impl.SQLDataType.VARCHAR, U_STREET_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE, org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY> FLOORS = createField("FLOORS", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY.class), U_STREET_TYPE);

	/**
	 * No further instances allowed
	 */
	private U_STREET_TYPE() {
		super("U_STREET_TYPE", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}
}