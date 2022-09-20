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
 * @see Bienenrassen
 * @generated
 */
public class BienenrassenTable extends BaseTable<BienenrassenTable> {

	public static final BienenrassenTable INSTANCE = new BienenrassenTable();

	public final Column<BienenrassenTable, Long> bienenrassen_id = createColumn(
		"bienenrassen_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BienenrassenTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private BienenrassenTable() {
		super("bienenrassen", BienenrassenTable::new);
	}

}