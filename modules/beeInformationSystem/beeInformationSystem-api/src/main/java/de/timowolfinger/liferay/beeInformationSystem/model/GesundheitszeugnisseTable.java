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
 * The table class for the &quot;gesundheitszeugnisse&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Gesundheitszeugnisse
 * @generated
 */
public class GesundheitszeugnisseTable
	extends BaseTable<GesundheitszeugnisseTable> {

	public static final GesundheitszeugnisseTable INSTANCE =
		new GesundheitszeugnisseTable();

	public final Column<GesundheitszeugnisseTable, Long>
		gesundheitszeugnisse_id = createColumn(
			"gesundheitszeugnisse_id", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<GesundheitszeugnisseTable, String>
		seriennummer_lt_form = createColumn(
			"seriennummer_lt_form", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GesundheitszeugnisseTable, String> dokument =
		createColumn(
			"dokument", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GesundheitszeugnisseTable, Date> ausstellungsdatum =
		createColumn(
			"ausstellungsdatum", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<GesundheitszeugnisseTable, String> dokument_dateityp =
		createColumn(
			"dokument_dateityp", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private GesundheitszeugnisseTable() {
		super("gesundheitszeugnisse", GesundheitszeugnisseTable::new);
	}

}