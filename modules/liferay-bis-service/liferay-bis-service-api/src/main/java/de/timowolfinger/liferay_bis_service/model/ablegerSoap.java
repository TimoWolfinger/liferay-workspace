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
public class ablegerSoap implements Serializable {

	public static ablegerSoap toSoapModel(ableger model) {
		ablegerSoap soapModel = new ablegerSoap();

		soapModel.setId(model.getId());
		soapModel.setBezeichnung(model.getBezeichnung());
		soapModel.setDatum_ablegerbildung(model.getDatum_ablegerbildung());
		soapModel.setMuttervolk_id(model.getMuttervolk_id());
		soapModel.setErfolgreich(model.getErfolgreich());
		soapModel.setAbgeschlossen(model.getAbgeschlossen());

		return soapModel;
	}

	public static ablegerSoap[] toSoapModels(ableger[] models) {
		ablegerSoap[] soapModels = new ablegerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ablegerSoap[][] toSoapModels(ableger[][] models) {
		ablegerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ablegerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ablegerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ablegerSoap[] toSoapModels(List<ableger> models) {
		List<ablegerSoap> soapModels = new ArrayList<ablegerSoap>(
			models.size());

		for (ableger model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ablegerSoap[soapModels.size()]);
	}

	public ablegerSoap() {
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

	public Date getDatum_ablegerbildung() {
		return _datum_ablegerbildung;
	}

	public void setDatum_ablegerbildung(Date datum_ablegerbildung) {
		_datum_ablegerbildung = datum_ablegerbildung;
	}

	public long getMuttervolk_id() {
		return _muttervolk_id;
	}

	public void setMuttervolk_id(long muttervolk_id) {
		_muttervolk_id = muttervolk_id;
	}

	public Boolean getErfolgreich() {
		return _erfolgreich;
	}

	public void setErfolgreich(Boolean erfolgreich) {
		_erfolgreich = erfolgreich;
	}

	public Boolean getAbgeschlossen() {
		return _abgeschlossen;
	}

	public void setAbgeschlossen(Boolean abgeschlossen) {
		_abgeschlossen = abgeschlossen;
	}

	private long _id;
	private String _bezeichnung;
	private Date _datum_ablegerbildung;
	private long _muttervolk_id;
	private Boolean _erfolgreich;
	private Boolean _abgeschlossen;

}