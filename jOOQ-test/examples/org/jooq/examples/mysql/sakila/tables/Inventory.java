/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Inventory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> {

	private static final long serialVersionUID = 2055637605;

	/**
	 * The singleton instance of sakila.inventory
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Inventory INVENTORY = new org.jooq.examples.mysql.sakila.tables.Inventory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.InventoryRecord.class;
	}

	/**
	 * The table column <code>sakila.inventory.inventory_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, java.lang.Integer> INVENTORY_ID = createField("inventory_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>sakila.inventory.film_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_inventory_film
	 * FOREIGN KEY (film_id)
	 * REFERENCES sakila.film (film_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, java.lang.Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>sakila.inventory.store_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_inventory_store
	 * FOREIGN KEY (store_id)
	 * REFERENCES sakila.store (store_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, java.lang.Byte> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>sakila.inventory.last_update</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public Inventory() {
		super("inventory", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	public Inventory(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_INVENTORY;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_INVENTORY_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_INVENTORY_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_INVENTORY_FILM, org.jooq.examples.mysql.sakila.Keys.FK_INVENTORY_STORE);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.Inventory as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Inventory(alias);
	}
}
