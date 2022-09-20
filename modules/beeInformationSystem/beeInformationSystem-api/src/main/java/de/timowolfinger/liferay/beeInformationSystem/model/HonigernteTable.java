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
 * The table class for the &quot;honigernte&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Honigernte
 * @generated
 */
public class HonigernteTable extends BaseTable<HonigernteTable> {

	public static final HonigernteTable INSTANCE = new HonigernteTable();

	public final Column<HonigernteTable, Long> honigernte_id = createColumn(
		"honigernte_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<HonigernteTable, Date> erntedatum = createColumn(
		"erntedatum", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HonigernteTable, Integer> erntemenge_kg = createColumn(
		"erntemenge_kg", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<HonigernteTable, Long> bienenvolk_id = createColumn(
		"bienenvolk_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HonigernteTable, Long> tracht_id = createColumn(
		"tracht_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private HonigernteTable() {
		super("honigernte", HonigernteTable::new);
	}

}