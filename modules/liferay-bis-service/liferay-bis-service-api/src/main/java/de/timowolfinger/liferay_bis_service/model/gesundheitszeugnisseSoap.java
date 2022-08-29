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
public class gesundheitszeugnisseSoap implements Serializable {

	public static gesundheitszeugnisseSoap toSoapModel(
		gesundheitszeugnisse model) {

		gesundheitszeugnisseSoap soapModel = new gesundheitszeugnisseSoap();

		soapModel.setId(model.getId());
		soapModel.setSeriennummer_lt_form(model.getSeriennummer_lt_form());
		soapModel.setDokument(model.getDokument());
		soapModel.setAusstellungsdatum(model.getAusstellungsdatum());
		soapModel.setDokument_dateityp(model.getDokument_dateityp());

		return soapModel;
	}

	public static gesundheitszeugnisseSoap[] toSoapModels(
		gesundheitszeugnisse[] models) {

		gesundheitszeugnisseSoap[] soapModels =
			new gesundheitszeugnisseSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static gesundheitszeugnisseSoap[][] toSoapModels(
		gesundheitszeugnisse[][] models) {

		gesundheitszeugnisseSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new gesundheitszeugnisseSoap[models.length][models[0].length];
		}
		else {
			soapModels = new gesundheitszeugnisseSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static gesundheitszeugnisseSoap[] toSoapModels(
		List<gesundheitszeugnisse> models) {

		List<gesundheitszeugnisseSoap> soapModels =
			new ArrayList<gesundheitszeugnisseSoap>(models.size());

		for (gesundheitszeugnisse model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new gesundheitszeugnisseSoap[soapModels.size()]);
	}

	public gesundheitszeugnisseSoap() {
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

	public String getSeriennummer_lt_form() {
		return _seriennummer_lt_form;
	}

	public void setSeriennummer_lt_form(String seriennummer_lt_form) {
		_seriennummer_lt_form = seriennummer_lt_form;
	}

	public String getDokument() {
		return _dokument;
	}

	public void setDokument(String dokument) {
		_dokument = dokument;
	}

	public Date getAusstellungsdatum() {
		return _ausstellungsdatum;
	}

	public void setAusstellungsdatum(Date ausstellungsdatum) {
		_ausstellungsdatum = ausstellungsdatum;
	}

	public String getDokument_dateityp() {
		return _dokument_dateityp;
	}

	public void setDokument_dateityp(String dokument_dateityp) {
		_dokument_dateityp = dokument_dateityp;
	}

	private long _id;
	private String _seriennummer_lt_form;
	private String _dokument;
	private Date _ausstellungsdatum;
	private String _dokument_dateityp;

}