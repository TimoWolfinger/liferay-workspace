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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class behandlungenSoap implements Serializable {

	public static behandlungenSoap toSoapModel(behandlungen model) {
		behandlungenSoap soapModel = new behandlungenSoap();

		soapModel.setId(model.getId());
		soapModel.setBienenvolk_id(model.getBienenvolk_id());
		soapModel.setMedikament_id(model.getMedikament_id());
		soapModel.setBeginn(model.getBeginn());
		soapModel.setEnde(model.getEnde());

		return soapModel;
	}

	public static behandlungenSoap[] toSoapModels(behandlungen[] models) {
		behandlungenSoap[] soapModels = new behandlungenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static behandlungenSoap[][] toSoapModels(behandlungen[][] models) {
		behandlungenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new behandlungenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new behandlungenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static behandlungenSoap[] toSoapModels(List<behandlungen> models) {
		List<behandlungenSoap> soapModels = new ArrayList<behandlungenSoap>(
			models.size());

		for (behandlungen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new behandlungenSoap[soapModels.size()]);
	}

	public behandlungenSoap() {
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

	public long getBienenvolk_id() {
		return _bienenvolk_id;
	}

	public void setBienenvolk_id(long bienenvolk_id) {
		_bienenvolk_id = bienenvolk_id;
	}

	public long getMedikament_id() {
		return _medikament_id;
	}

	public void setMedikament_id(long medikament_id) {
		_medikament_id = medikament_id;
	}

	public Date getBeginn() {
		return _beginn;
	}

	public void setBeginn(Date beginn) {
		_beginn = beginn;
	}

	public Date getEnde() {
		return _ende;
	}

	public void setEnde(Date ende) {
		_ende = ende;
	}

	private long _id;
	private long _bienenvolk_id;
	private long _medikament_id;
	private Date _beginn;
	private Date _ende;

}