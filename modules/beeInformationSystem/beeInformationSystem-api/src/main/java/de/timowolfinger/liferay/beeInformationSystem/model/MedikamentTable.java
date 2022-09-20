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
 * The table class for the &quot;medikament&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Medikament
 * @generated
 */
public class MedikamentTable extends BaseTable<MedikamentTable> {

	public static final MedikamentTable INSTANCE = new MedikamentTable();

	public final Column<MedikamentTable, Long> medikament_id = createColumn(
		"medikament_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MedikamentTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedikamentTable, Long> hersteller_id = createColumn(
		"hersteller_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedikamentTable, String> dosierung = createColumn(
		"dosierung", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private MedikamentTable() {
		super("medikament", MedikamentTable::new);
	}

}