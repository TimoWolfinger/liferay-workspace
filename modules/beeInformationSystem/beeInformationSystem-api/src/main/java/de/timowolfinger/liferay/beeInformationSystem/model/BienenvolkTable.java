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
 * The table class for the &quot;bienenvolk&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Bienenvolk
 * @generated
 */
public class BienenvolkTable extends BaseTable<BienenvolkTable> {

	public static final BienenvolkTable INSTANCE = new BienenvolkTable();

	public final Column<BienenvolkTable, Long> bienenvolk_id = createColumn(
		"bienenvolk_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BienenvolkTable, String> bezeichnung = createColumn(
		"bezeichnung", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BienenvolkTable, Long> weisel_jahr = createColumn(
		"weisel_jahr", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BienenvolkTable, String> bemerkungen = createColumn(
		"bemerkungen", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BienenvolkTable, Long> bienenvolk_id = createColumn(
		"muttervolk", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BienenvolkTable, Long> bienenrasse_id = createColumn(
		"bienenrasse_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BienenvolkTable, Long> beutemass_id = createColumn(
		"beutemass_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BienenvolkTable, String> geo_coordinaten = createColumn(
		"geo_coordinaten", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BienenvolkTable, Integer> anschaffung_ableger_jahr =
		createColumn(
			"anschaffung_ableger_jahr", Integer.class, Types.INTEGER,
			Column.FLAG_DEFAULT);
	public final Column<BienenvolkTable, Boolean> aktiv = createColumn(
		"aktiv", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<BienenvolkTable, Integer> aufloesung_tod_jahr =
		createColumn(
			"aufloesung_tod_jahr", Integer.class, Types.INTEGER,
			Column.FLAG_DEFAULT);
	public final Column<BienenvolkTable, Long> gesundheitszeugnis_id =
		createColumn(
			"gesundheitszeugnis_id", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private BienenvolkTable() {
		super("bienenvolk", BienenvolkTable::new);
	}

}