/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package de.timowolfinger.liferay_bis_service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;ableger&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ableger
 * @generated
 */
public class ablegerTable extends BaseTable<ablegerTable> {

	public static final ablegerTable INSTANCE = new ablegerTable();

	public final Column<ablegerTable, Long> id = createColumn(
		"id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ablegerTable, String> bezeichnung = createColumn(
		"bezeichnung", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ablegerTable, Date> datum_ablegerbildung = createColumn(
		"datum_ablegerbildung", Date.class, Types.TIMESTAMP,
		Column.FLAG_DEFAULT);
	public final Column<ablegerTable, Long> muttervolk_id = createColumn(
		"muttervolk_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ablegerTable, Boolean> erfolgreich = createColumn(
		"erfolgreich", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<ablegerTable, Boolean> abgeschlossen = createColumn(
		"abgeschlossen", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);

	private ablegerTable() {
		super("ableger", ablegerTable::new);
	}

}