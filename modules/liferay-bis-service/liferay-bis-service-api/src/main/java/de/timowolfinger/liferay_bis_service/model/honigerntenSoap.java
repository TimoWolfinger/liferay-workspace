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
public class honigerntenSoap implements Serializable {

	public static honigerntenSoap toSoapModel(honigernten model) {
		honigerntenSoap soapModel = new honigerntenSoap();

		soapModel.setId(model.getId());
		soapModel.setErntedatum(model.getErntedatum());
		soapModel.setErntemenge_kg(model.getErntemenge_kg());
		soapModel.setBienenvolk_id(model.getBienenvolk_id());
		soapModel.setTracht_id(model.getTracht_id());

		return soapModel;
	}

	public static honigerntenSoap[] toSoapModels(honigernten[] models) {
		honigerntenSoap[] soapModels = new honigerntenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static honigerntenSoap[][] toSoapModels(honigernten[][] models) {
		honigerntenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new honigerntenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new honigerntenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static honigerntenSoap[] toSoapModels(List<honigernten> models) {
		List<honigerntenSoap> soapModels = new ArrayList<honigerntenSoap>(
			models.size());

		for (honigernten model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new honigerntenSoap[soapModels.size()]);
	}

	public honigerntenSoap() {
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

	public Date getErntedatum() {
		return _erntedatum;
	}

	public void setErntedatum(Date erntedatum) {
		_erntedatum = erntedatum;
	}

	public int getErntemenge_kg() {
		return _erntemenge_kg;
	}

	public void setErntemenge_kg(int erntemenge_kg) {
		_erntemenge_kg = erntemenge_kg;
	}

	public long getBienenvolk_id() {
		return _bienenvolk_id;
	}

	public void setBienenvolk_id(long bienenvolk_id) {
		_bienenvolk_id = bienenvolk_id;
	}

	public long getTracht_id() {
		return _tracht_id;
	}

	public void setTracht_id(long tracht_id) {
		_tracht_id = tracht_id;
	}

	private long _id;
	private Date _erntedatum;
	private int _erntemenge_kg;
	private long _bienenvolk_id;
	private long _tracht_id;

}