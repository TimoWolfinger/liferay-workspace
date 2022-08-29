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
public class medikamenteSoap implements Serializable {

	public static medikamenteSoap toSoapModel(medikamente model) {
		medikamenteSoap soapModel = new medikamenteSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setHersteller_id(model.getHersteller_id());
		soapModel.setDosierung(model.getDosierung());

		return soapModel;
	}

	public static medikamenteSoap[] toSoapModels(medikamente[] models) {
		medikamenteSoap[] soapModels = new medikamenteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static medikamenteSoap[][] toSoapModels(medikamente[][] models) {
		medikamenteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new medikamenteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new medikamenteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static medikamenteSoap[] toSoapModels(List<medikamente> models) {
		List<medikamenteSoap> soapModels = new ArrayList<medikamenteSoap>(
			models.size());

		for (medikamente model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new medikamenteSoap[soapModels.size()]);
	}

	public medikamenteSoap() {
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

	public long getHersteller_id() {
		return _hersteller_id;
	}

	public void setHersteller_id(long hersteller_id) {
		_hersteller_id = hersteller_id;
	}

	public String getDosierung() {
		return _dosierung;
	}

	public void setDosierung(String dosierung) {
		_dosierung = dosierung;
	}

	private long _id;
	private String _name;
	private long _hersteller_id;
	private String _dosierung;

}