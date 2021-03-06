/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VBookRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.VBookRecord> implements org.jooq.test.h2.generatedclasses.tables.interfaces.IVBook {

	private static final long serialVersionUID = -605993249;

	/**
	 * The table column <code>PUBLIC.V_BOOK.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.ID);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.AUTHOR_ID</code>
	 */
	@Override
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.AUTHOR_ID, value);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.AUTHOR_ID</code>
	 */
	@Override
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.AUTHOR_ID);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.CO_AUTHOR_ID</code>
	 */
	@Override
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.CO_AUTHOR_ID, value);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.CO_AUTHOR_ID</code>
	 */
	@Override
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.CO_AUTHOR_ID);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.DETAILS_ID</code>
	 */
	@Override
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.DETAILS_ID, value);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.DETAILS_ID</code>
	 */
	@Override
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.DETAILS_ID);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.TITLE</code>
	 */
	@Override
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.TITLE, value);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.TITLE</code>
	 */
	@Override
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.TITLE);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.PUBLISHED_IN</code>
	 */
	@Override
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.PUBLISHED_IN, value);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.PUBLISHED_IN</code>
	 */
	@Override
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.PUBLISHED_IN);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.LANGUAGE_ID</code>
	 */
	@Override
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.LANGUAGE_ID, value);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.LANGUAGE_ID</code>
	 */
	@Override
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.LANGUAGE_ID);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.CONTENT_TEXT</code>
	 */
	@Override
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.CONTENT_TEXT, value);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.CONTENT_TEXT</code>
	 */
	@Override
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.CONTENT_TEXT);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.CONTENT_PDF</code>
	 */
	@Override
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.CONTENT_PDF, value);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.CONTENT_PDF</code>
	 */
	@Override
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.CONTENT_PDF);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.REC_VERSION</code>
	 */
	@Override
	public void setRecVersion(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.REC_VERSION, value);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.REC_VERSION</code>
	 */
	@Override
	public java.lang.Integer getRecVersion() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.REC_VERSION);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.REC_TIMESTAMP</code>
	 */
	@Override
	public void setRecTimestamp(java.sql.Timestamp value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.VBook.REC_TIMESTAMP, value);
	}

	/**
	 * The table column <code>PUBLIC.V_BOOK.REC_TIMESTAMP</code>
	 */
	@Override
	public java.sql.Timestamp getRecTimestamp() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.VBook.REC_TIMESTAMP);
	}

	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.VBook.V_BOOK);
	}
}
