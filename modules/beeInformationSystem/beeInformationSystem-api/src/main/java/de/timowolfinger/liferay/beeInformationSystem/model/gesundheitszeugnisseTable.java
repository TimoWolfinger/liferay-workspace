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
 * @see gesundheitszeugnisse
 * @generated
 */
public class gesundheitszeugnisseTable
	extends BaseTable<gesundheitszeugnisseTable> {

	public static final gesundheitszeugnisseTable INSTANCE =
		new gesundheitszeugnisseTable();

	public final Column<gesundheitszeugnisseTable, Long>
		gesundheitszeugnisse_id = createColumn(
			"gesundheitszeugnisse_id", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<gesundheitszeugnisseTable, String>
		seriennummer_lt_form = createColumn(
			"seriennummer_lt_form", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<gesundheitszeugnisseTable, String> dokument =
		createColumn(
			"dokument", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<gesundheitszeugnisseTable, Date> ausstellungsdatum =
		createColumn(
			"ausstellungsdatum", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<gesundheitszeugnisseTable, String> dokument_dateityp =
		createColumn(
			"dokument_dateityp", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private gesundheitszeugnisseTable() {
		super("gesundheitszeugnisse", gesundheitszeugnisseTable::new);
	}

}