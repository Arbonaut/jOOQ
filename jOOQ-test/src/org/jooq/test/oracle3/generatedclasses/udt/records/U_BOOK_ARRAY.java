/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class U_BOOK_ARRAY extends org.jooq.impl.ArrayRecordImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1962723424;

	public U_BOOK_ARRAY(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle3.generatedclasses.TEST.TEST, "U_BOOK_ARRAY", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType(), configuration);
	}

	public U_BOOK_ARRAY(org.jooq.Configuration configuration, org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE... array) {
		this(configuration);
		set(array);
	}

	public U_BOOK_ARRAY(org.jooq.Configuration configuration, java.util.List<? extends org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE> list) {
		this(configuration);
		setList(list);
	}
}
