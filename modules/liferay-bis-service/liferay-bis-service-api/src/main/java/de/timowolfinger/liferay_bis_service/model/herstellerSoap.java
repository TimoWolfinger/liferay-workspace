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
public class herstellerSoap implements Serializable {

	public static herstellerSoap toSoapModel(hersteller model) {
		herstellerSoap soapModel = new herstellerSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static herstellerSoap[] toSoapModels(hersteller[] models) {
		herstellerSoap[] soapModels = new herstellerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static herstellerSoap[][] toSoapModels(hersteller[][] models) {
		herstellerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new herstellerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new herstellerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static herstellerSoap[] toSoapModels(List<hersteller> models) {
		List<herstellerSoap> soapModels = new ArrayList<herstellerSoap>(
			models.size());

		for (hersteller model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new herstellerSoap[soapModels.size()]);
	}

	public herstellerSoap() {
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private long _id;
	private String _name;

}