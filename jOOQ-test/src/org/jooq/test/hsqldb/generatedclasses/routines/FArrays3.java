/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class FArrays3 extends org.jooq.impl.AbstractRoutine<java.lang.String[]> {

	private static final long serialVersionUID = 1506348980;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String[]> RETURN_VALUE = new org.jooq.impl.ParameterImpl<java.lang.String[]>("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String[]> IN_ARRAY = new org.jooq.impl.ParameterImpl<java.lang.String[]>("IN_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public FArrays3() {
		super(org.jooq.SQLDialect.HSQLDB, "F_ARRAYS3", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the routine
	 */
	public void setInArray(java.lang.String[] value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setInArray(org.jooq.Field<java.lang.String[]> field) {
		setField(IN_ARRAY, field);
	}
}