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

package de.timowolfinger.liferay_bis_service.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class trachtenSoap implements Serializable {

	public static trachtenSoap toSoapModel(trachten model) {
		trachtenSoap soapModel = new trachtenSoap();

		soapModel.setId(model.getId());
		soapModel.setBezeichnung(model.getBezeichnung());

		return soapModel;
	}

	public static trachtenSoap[] toSoapModels(trachten[] models) {
		trachtenSoap[] soapModels = new trachtenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static trachtenSoap[][] toSoapModels(trachten[][] models) {
		trachtenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new trachtenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new trachtenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static trachtenSoap[] toSoapModels(List<trachten> models) {
		List<trachtenSoap> soapModels = new ArrayList<trachtenSoap>(
			models.size());

		for (trachten model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new trachtenSoap[soapModels.size()]);
	}

	public trachtenSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getBezeichnung() {
		return _bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		_bezeichnung = bezeichnung;
	}

	private long _id;
	private String _bezeichnung;

}