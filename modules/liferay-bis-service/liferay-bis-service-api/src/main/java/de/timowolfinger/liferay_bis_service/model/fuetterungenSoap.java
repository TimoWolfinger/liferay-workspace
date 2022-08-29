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
public class fuetterungenSoap implements Serializable {

	public static fuetterungenSoap toSoapModel(fuetterungen model) {
		fuetterungenSoap soapModel = new fuetterungenSoap();

		soapModel.setId(model.getId());
		soapModel.setFuttermittel_id(model.getFuttermittel_id());
		soapModel.setBeginn(model.getBeginn());
		soapModel.setEnde(model.getEnde());
		soapModel.setMenge_kg(model.getMenge_kg());
		soapModel.setBienenvolk_id(model.getBienenvolk_id());

		return soapModel;
	}

	public static fuetterungenSoap[] toSoapModels(fuetterungen[] models) {
		fuetterungenSoap[] soapModels = new fuetterungenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static fuetterungenSoap[][] toSoapModels(fuetterungen[][] models) {
		fuetterungenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new fuetterungenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new fuetterungenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static fuetterungenSoap[] toSoapModels(List<fuetterungen> models) {
		List<fuetterungenSoap> soapModels = new ArrayList<fuetterungenSoap>(
			models.size());

		for (fuetterungen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new fuetterungenSoap[soapModels.size()]);
	}

	public fuetterungenSoap() {
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

	public long getFuttermittel_id() {
		return _futtermittel_id;
	}

	public void setFuttermittel_id(long futtermittel_id) {
		_futtermittel_id = futtermittel_id;
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

	public long getMenge_kg() {
		return _menge_kg;
	}

	public void setMenge_kg(long menge_kg) {
		_menge_kg = menge_kg;
	}

	public long getBienenvolk_id() {
		return _bienenvolk_id;
	}

	public void setBienenvolk_id(long bienenvolk_id) {
		_bienenvolk_id = bienenvolk_id;
	}

	private long _id;
	private long _futtermittel_id;
	private Date _beginn;
	private Date _ende;
	private long _menge_kg;
	private long _bienenvolk_id;

}