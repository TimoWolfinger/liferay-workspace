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
 * The table class for the &quot;trachten&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see trachten
 * @generated
 */
public class trachtenTable extends BaseTable<trachtenTable> {

	public static final trachtenTable INSTANCE = new trachtenTable();

	public final Column<trachtenTable, Long> trachten_id = createColumn(
		"trachten_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<trachtenTable, String> bezeichnung = createColumn(
		"bezeichnung", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private trachtenTable() {
		super("trachten", trachtenTable::new);
	}

}