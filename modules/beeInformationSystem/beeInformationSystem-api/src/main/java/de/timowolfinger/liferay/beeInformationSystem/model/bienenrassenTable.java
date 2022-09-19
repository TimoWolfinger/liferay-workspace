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
 * The table class for the &quot;bienenrassen&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see bienenrassen
 * @generated
 */
public class bienenrassenTable extends BaseTable<bienenrassenTable> {

	public static final bienenrassenTable INSTANCE = new bienenrassenTable();

	public final Column<bienenrassenTable, Long> bienenrassen_id = createColumn(
		"bienenrassen_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<bienenrassenTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private bienenrassenTable() {
		super("bienenrassen", bienenrassenTable::new);
	}

}