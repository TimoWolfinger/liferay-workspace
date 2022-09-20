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

/**
 * The table class for the &quot;bienenvoelker&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Bienenvoelker
 * @generated
 */
public class BienenvoelkerTable extends BaseTable<BienenvoelkerTable> {

	public static final BienenvoelkerTable INSTANCE = new BienenvoelkerTable();

	public final Column<BienenvoelkerTable, Long> bienenvoelker_id =
		createColumn(
			"bienenvoelker_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BienenvoelkerTable, String> bezeichnung = createColumn(
		"bezeichnung", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BienenvoelkerTable, Long> weisel_jahr = createColumn(
		"weisel_jahr", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BienenvoelkerTable, String> bemerkungen = createColumn(
		"bemerkungen", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BienenvoelkerTable, Long> bienenvoelker_id =
		createColumn(
			"muttervolk", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BienenvoelkerTable, Long> bienenrasse_id = createColumn(
		"bienenrasse_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BienenvoelkerTable, Long> beutemass_id = createColumn(
		"beutemass_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BienenvoelkerTable, String> geo_coordinaten =
		createColumn(
			"geo_coordinaten", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BienenvoelkerTable, Integer> anschaffung_ableger_jahr =
		createColumn(
			"anschaffung_ableger_jahr", Integer.class, Types.INTEGER,
			Column.FLAG_DEFAULT);
	public final Column<BienenvoelkerTable, Boolean> aktiv = createColumn(
		"aktiv", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<BienenvoelkerTable, Integer> aufloesung_tod_jahr =
		createColumn(
			"aufloesung_tod_jahr", Integer.class, Types.INTEGER,
			Column.FLAG_DEFAULT);
	public final Column<BienenvoelkerTable, Long> gesundheitszeugnis_id =
		createColumn(
			"gesundheitszeugnis_id", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private BienenvoelkerTable() {
		super("bienenvoelker", BienenvoelkerTable::new);
	}

}