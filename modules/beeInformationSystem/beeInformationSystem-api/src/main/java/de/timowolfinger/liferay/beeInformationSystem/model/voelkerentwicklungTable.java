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
 * The table class for the &quot;voelkerentwicklung&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see voelkerentwicklung
 * @generated
 */
public class voelkerentwicklungTable
	extends BaseTable<voelkerentwicklungTable> {

	public static final voelkerentwicklungTable INSTANCE =
		new voelkerentwicklungTable();

	public final Column<voelkerentwicklungTable, Long> voelkerentwicklung_id =
		createColumn(
			"voelkerentwicklung_id", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<voelkerentwicklungTable, Float>
		anzahl_bebrueteter_rahmen = createColumn(
			"anzahl_bebrueteter_rahmen", Float.class, Types.FLOAT,
			Column.FLAG_DEFAULT);
	public final Column<voelkerentwicklungTable, Long>
		abschaetzung_anzahl_individuen = createColumn(
			"abschaetzung_anzahl_individuen", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<voelkerentwicklungTable, Long> bienenvoelker_id =
		createColumn(
			"bienenvoelker_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<voelkerentwicklungTable, Date> datum = createColumn(
		"datum", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<voelkerentwicklungTable, Float> stockwaage_gewicht_kg =
		createColumn(
			"stockwaage_gewicht_kg", Float.class, Types.FLOAT,
			Column.FLAG_DEFAULT);

	private voelkerentwicklungTable() {
		super("voelkerentwicklung", voelkerentwicklungTable::new);
	}

}