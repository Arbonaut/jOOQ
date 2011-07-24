/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class FilmRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> {

	private static final long serialVersionUID = 601268186;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setFilmId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.FILM_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Short getFilmId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> fetchFilmActorList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR)
			.where(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> getFilmActorList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR)
			.where(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord> fetchFilmCategoryList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY)
			.where(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord> getFilmCategoryList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY)
			.where(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> fetchInventoryList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY)
			.where(org.jooq.examples.mysql.sakila.tables.Inventory.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> getInventoryList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY)
			.where(org.jooq.examples.mysql.sakila.tables.Inventory.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.FILM_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.DESCRIPTION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDescription() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.DESCRIPTION);
	}

	/**
	 * An uncommented item
	 */
	public void setReleaseYear(java.sql.Date value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.RELEASE_YEAR, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Date getReleaseYear() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.RELEASE_YEAR);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film.language_id]
	 * REFERENCES language [sakila.language.language_id]
	 * </pre></code>
	 */
	public void setLanguageId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film.language_id]
	 * REFERENCES language [sakila.language.language_id]
	 * </pre></code>
	 */
	public java.lang.Byte getLanguageId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film.language_id]
	 * REFERENCES language [sakila.language.language_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.LanguageRecord fetchLanguageByLanguageId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE)
			.where(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.LANGUAGE_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film.language_id]
	 * REFERENCES language [sakila.language.language_id]
	 * </pre></code>
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public org.jooq.examples.mysql.sakila.tables.records.LanguageRecord getLanguageByLanguageId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE)
			.where(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.LANGUAGE_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film.original_language_id]
	 * REFERENCES language [sakila.language.language_id]
	 * </pre></code>
	 */
	public void setOriginalLanguageId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.ORIGINAL_LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film.original_language_id]
	 * REFERENCES language [sakila.language.language_id]
	 * </pre></code>
	 */
	public java.lang.Byte getOriginalLanguageId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.ORIGINAL_LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film.original_language_id]
	 * REFERENCES language [sakila.language.language_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.LanguageRecord fetchLanguageByOriginalLanguageId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE)
			.where(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.ORIGINAL_LANGUAGE_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film.original_language_id]
	 * REFERENCES language [sakila.language.language_id]
	 * </pre></code>
	 *
	 * @deprecated Because of risk of ambiguity (#187), code generation for this<br/>
	 *             method will not be supported anymore, soon.<br/><br/>
	 *             If you wish to remove this method, adapt your configuration:<br/>
	 *             <code>generator.generate.deprecated=false</code>
	 */
	@Deprecated
	public org.jooq.examples.mysql.sakila.tables.records.LanguageRecord getLanguageByOriginalLanguageId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE)
			.where(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Film.ORIGINAL_LANGUAGE_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setRentalDuration(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.RENTAL_DURATION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getRentalDuration() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.RENTAL_DURATION);
	}

	/**
	 * An uncommented item
	 */
	public void setRentalRate(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.RENTAL_RATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getRentalRate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.RENTAL_RATE);
	}

	/**
	 * An uncommented item
	 */
	public void setLength(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.LENGTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getLength() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.LENGTH);
	}

	/**
	 * An uncommented item
	 */
	public void setReplacementCost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.REPLACEMENT_COST, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getReplacementCost() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.REPLACEMENT_COST);
	}

	/**
	 * An uncommented item
	 */
	public void setRating(org.jooq.examples.mysql.sakila.enums.FilmRating value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.RATING, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.examples.mysql.sakila.enums.FilmRating getRating() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.RATING);
	}

	/**
	 * An uncommented item
	 */
	public void setSpecialFeatures(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.SPECIAL_FEATURES, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSpecialFeatures() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.SPECIAL_FEATURES);
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Film.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Film.LAST_UPDATE);
	}

	/**
	 * Create a detached FilmRecord
	 */
	public FilmRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Film.FILM);
	}

	/**
	 * Create an attached FilmRecord
	 */
	public FilmRecord(org.jooq.Configuration configuration) {
		super(org.jooq.examples.mysql.sakila.tables.Film.FILM, configuration);
	}
}