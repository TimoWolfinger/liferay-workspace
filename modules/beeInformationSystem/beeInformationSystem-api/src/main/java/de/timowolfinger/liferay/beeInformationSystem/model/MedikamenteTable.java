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
 * The table class for the &quot;medikamente&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Medikamente
 * @generated
 */
public class MedikamenteTable extends BaseTable<MedikamenteTable> {

	public static final MedikamenteTable INSTANCE = new MedikamenteTable();

	public final Column<MedikamenteTable, Long> medikamente_id = createColumn(
		"medikamente_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MedikamenteTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MedikamenteTable, Long> hersteller_id = createColumn(
		"hersteller_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MedikamenteTable, String> dosierung = createColumn(
		"dosierung", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private MedikamenteTable() {
		super("medikamente", MedikamenteTable::new);
	}

}