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
public class voelkerentwicklungSoap implements Serializable {

	public static voelkerentwicklungSoap toSoapModel(voelkerentwicklung model) {
		voelkerentwicklungSoap soapModel = new voelkerentwicklungSoap();

		soapModel.setId(model.getId());
		soapModel.setAnzahl_bebrueteter_rahmen(
			model.getAnzahl_bebrueteter_rahmen());
		soapModel.setAbschaetzung_anzahl_individuen(
			model.getAbschaetzung_anzahl_individuen());
		soapModel.setBienenvolk_id(model.getBienenvolk_id());
		soapModel.setDatum(model.getDatum());
		soapModel.setStockwaage_gewicht_kg(model.getStockwaage_gewicht_kg());

		return soapModel;
	}

	public static voelkerentwicklungSoap[] toSoapModels(
		voelkerentwicklung[] models) {

		voelkerentwicklungSoap[] soapModels =
			new voelkerentwicklungSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static voelkerentwicklungSoap[][] toSoapModels(
		voelkerentwicklung[][] models) {

		voelkerentwicklungSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new voelkerentwicklungSoap[models.length][models[0].length];
		}
		else {
			soapModels = new voelkerentwicklungSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static voelkerentwicklungSoap[] toSoapModels(
		List<voelkerentwicklung> models) {

		List<voelkerentwicklungSoap> soapModels =
			new ArrayList<voelkerentwicklungSoap>(models.size());

		for (voelkerentwicklung model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new voelkerentwicklungSoap[soapModels.size()]);
	}

	public voelkerentwicklungSoap() {
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

	public float getAnzahl_bebrueteter_rahmen() {
		return _anzahl_bebrueteter_rahmen;
	}

	public void setAnzahl_bebrueteter_rahmen(float anzahl_bebrueteter_rahmen) {
		_anzahl_bebrueteter_rahmen = anzahl_bebrueteter_rahmen;
	}

	public long getAbschaetzung_anzahl_individuen() {
		return _abschaetzung_anzahl_individuen;
	}

	public void setAbschaetzung_anzahl_individuen(
		long abschaetzung_anzahl_individuen) {

		_abschaetzung_anzahl_individuen = abschaetzung_anzahl_individuen;
	}

	public long getBienenvolk_id() {
		return _bienenvolk_id;
	}

	public void setBienenvolk_id(long bienenvolk_id) {
		_bienenvolk_id = bienenvolk_id;
	}

	public Date getDatum() {
		return _datum;
	}

	public void setDatum(Date datum) {
		_datum = datum;
	}

	public float getStockwaage_gewicht_kg() {
		return _stockwaage_gewicht_kg;
	}

	public void setStockwaage_gewicht_kg(float stockwaage_gewicht_kg) {
		_stockwaage_gewicht_kg = stockwaage_gewicht_kg;
	}

	private long _id;
	private float _anzahl_bebrueteter_rahmen;
	private long _abschaetzung_anzahl_individuen;
	private long _bienenvolk_id;
	private Date _datum;
	private float _stockwaage_gewicht_kg;

}