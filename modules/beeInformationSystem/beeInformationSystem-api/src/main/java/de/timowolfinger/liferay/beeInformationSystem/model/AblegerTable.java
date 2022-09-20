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

package de.timowolfinger.liferay.beeInformationSystem.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;ableger&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Ableger
 * @generated
 */
public class AblegerTable extends BaseTable<AblegerTable> {

	public static final AblegerTable INSTANCE = new AblegerTable();

	public final Column<AblegerTable, Long> ableger_id = createColumn(
		"ableger_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AblegerTable, String> bezeichnung = createColumn(
		"bezeichnung", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AblegerTable, Date> datum_ablegerbildung = createColumn(
		"datum_ablegerbildung", Date.class, Types.TIMESTAMP,
		Column.FLAG_DEFAULT);
	public final Column<AblegerTable, Long> bienenvolk_id = createColumn(
		"muttervolk_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AblegerTable, Boolean> erfolgreich = createColumn(
		"erfolgreich", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<AblegerTable, Boolean> abgeschlossen = createColumn(
		"abgeschlossen", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);

	private AblegerTable() {
		super("ableger", AblegerTable::new);
	}

}