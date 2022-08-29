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
public class bienenvoelkerSoap implements Serializable {

	public static bienenvoelkerSoap toSoapModel(bienenvoelker model) {
		bienenvoelkerSoap soapModel = new bienenvoelkerSoap();

		soapModel.setId(model.getId());
		soapModel.setBezeichnung(model.getBezeichnung());
		soapModel.setWeisel_jahr(model.getWeisel_jahr());
		soapModel.setBemerkungen(model.getBemerkungen());
		soapModel.setMuttervolk(model.getMuttervolk());
		soapModel.setBienenrasse_id(model.getBienenrasse_id());
		soapModel.setBeutemass_id(model.getBeutemass_id());
		soapModel.setGeo_coordinaten(model.getGeo_coordinaten());
		soapModel.setAnschaffung_ableger_jahr(
			model.getAnschaffung_ableger_jahr());
		soapModel.setAktiv(model.getAktiv());
		soapModel.setAufloesung_tod_jahr(model.getAufloesung_tod_jahr());
		soapModel.setGesundheitszeugnis_id(model.getGesundheitszeugnis_id());

		return soapModel;
	}

	public static bienenvoelkerSoap[] toSoapModels(bienenvoelker[] models) {
		bienenvoelkerSoap[] soapModels = new bienenvoelkerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static bienenvoelkerSoap[][] toSoapModels(bienenvoelker[][] models) {
		bienenvoelkerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new bienenvoelkerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new bienenvoelkerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static bienenvoelkerSoap[] toSoapModels(List<bienenvoelker> models) {
		List<bienenvoelkerSoap> soapModels = new ArrayList<bienenvoelkerSoap>(
			models.size());

		for (bienenvoelker model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new bienenvoelkerSoap[soapModels.size()]);
	}

	public bienenvoelkerSoap() {
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

	public long getWeisel_jahr() {
		return _weisel_jahr;
	}

	public void setWeisel_jahr(long weisel_jahr) {
		_weisel_jahr = weisel_jahr;
	}

	public String getBemerkungen() {
		return _bemerkungen;
	}

	public void setBemerkungen(String bemerkungen) {
		_bemerkungen = bemerkungen;
	}

	public long getMuttervolk() {
		return _muttervolk;
	}

	public void setMuttervolk(long muttervolk) {
		_muttervolk = muttervolk;
	}

	public long getBienenrasse_id() {
		return _bienenrasse_id;
	}

	public void setBienenrasse_id(long bienenrasse_id) {
		_bienenrasse_id = bienenrasse_id;
	}

	public long getBeutemass_id() {
		return _beutemass_id;
	}

	public void setBeutemass_id(long beutemass_id) {
		_beutemass_id = beutemass_id;
	}

	public String getGeo_coordinaten() {
		return _geo_coordinaten;
	}

	public void setGeo_coordinaten(String geo_coordinaten) {
		_geo_coordinaten = geo_coordinaten;
	}

	public int getAnschaffung_ableger_jahr() {
		return _anschaffung_ableger_jahr;
	}

	public void setAnschaffung_ableger_jahr(int anschaffung_ableger_jahr) {
		_anschaffung_ableger_jahr = anschaffung_ableger_jahr;
	}

	public Boolean getAktiv() {
		return _aktiv;
	}

	public void setAktiv(Boolean aktiv) {
		_aktiv = aktiv;
	}

	public int getAufloesung_tod_jahr() {
		return _aufloesung_tod_jahr;
	}

	public void setAufloesung_tod_jahr(int aufloesung_tod_jahr) {
		_aufloesung_tod_jahr = aufloesung_tod_jahr;
	}

	public long getGesundheitszeugnis_id() {
		return _gesundheitszeugnis_id;
	}

	public void setGesundheitszeugnis_id(long gesundheitszeugnis_id) {
		_gesundheitszeugnis_id = gesundheitszeugnis_id;
	}

	private long _id;
	private String _bezeichnung;
	private long _weisel_jahr;
	private String _bemerkungen;
	private long _muttervolk;
	private long _bienenrasse_id;
	private long _beutemass_id;
	private String _geo_coordinaten;
	private int _anschaffung_ableger_jahr;
	private Boolean _aktiv;
	private int _aufloesung_tod_jahr;
	private long _gesundheitszeugnis_id;

}