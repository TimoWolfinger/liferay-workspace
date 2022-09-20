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
 * The table class for the &quot;behandlung&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Behandlung
 * @generated
 */
public class BehandlungTable extends BaseTable<BehandlungTable> {

	public static final BehandlungTable INSTANCE = new BehandlungTable();

	public final Column<BehandlungTable, Long> behandlung_id = createColumn(
		"behandlung_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BehandlungTable, Long> bienenvolk_id = createColumn(
		"bienenvolk_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BehandlungTable, Long> medikament_id = createColumn(
		"medikament_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BehandlungTable, Date> beginn = createColumn(
		"beginn", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BehandlungTable, Date> ende = createColumn(
		"ende", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private BehandlungTable() {
		super("behandlung", BehandlungTable::new);
	}

}