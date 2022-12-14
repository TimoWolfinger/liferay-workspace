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

package de.timowolfinger.liferay.beeInformationSystem.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Bienenvolk}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Bienenvolk
 * @generated
 */
public class BienenvolkWrapper
	extends BaseModelWrapper<Bienenvolk>
	implements Bienenvolk, ModelWrapper<Bienenvolk> {

	public BienenvolkWrapper(Bienenvolk bienenvolk) {
		super(bienenvolk);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bienenvolk_id", getBienenvolk_id());
		attributes.put("bezeichnung", getBezeichnung());
		attributes.put("weisel_jahr", getWeisel_jahr());
		attributes.put("bemerkungen", getBemerkungen());
		attributes.put("bienenvolk_id", getBienenvolk_id());
		attributes.put("bienenrasse_id", getBienenrasse_id());
		attributes.put("beutemass_id", getBeutemass_id());
		attributes.put("geo_coordinaten", getGeo_coordinaten());
		attributes.put(
			"anschaffung_ableger_jahr", getAnschaffung_ableger_jahr());
		attributes.put("aktiv", getAktiv());
		attributes.put("aufloesung_tod_jahr", getAufloesung_tod_jahr());
		attributes.put("gesundheitszeugnis_id", getGesundheitszeugnis_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bienenvolk_id = (Long)attributes.get("bienenvolk_id");

		if (bienenvolk_id != null) {
			setBienenvolk_id(bienenvolk_id);
		}

		String bezeichnung = (String)attributes.get("bezeichnung");

		if (bezeichnung != null) {
			setBezeichnung(bezeichnung);
		}

		Long weisel_jahr = (Long)attributes.get("weisel_jahr");

		if (weisel_jahr != null) {
			setWeisel_jahr(weisel_jahr);
		}

		String bemerkungen = (String)attributes.get("bemerkungen");

		if (bemerkungen != null) {
			setBemerkungen(bemerkungen);
		}

		Long bienenvolk_id = (Long)attributes.get("bienenvolk_id");

		if (bienenvolk_id != null) {
			setBienenvolk_id(bienenvolk_id);
		}

		Long bienenrasse_id = (Long)attributes.get("bienenrasse_id");

		if (bienenrasse_id != null) {
			setBienenrasse_id(bienenrasse_id);
		}

		Long beutemass_id = (Long)attributes.get("beutemass_id");

		if (beutemass_id != null) {
			setBeutemass_id(beutemass_id);
		}

		String geo_coordinaten = (String)attributes.get("geo_coordinaten");

		if (geo_coordinaten != null) {
			setGeo_coordinaten(geo_coordinaten);
		}

		Integer anschaffung_ableger_jahr = (Integer)attributes.get(
			"anschaffung_ableger_jahr");

		if (anschaffung_ableger_jahr != null) {
			setAnschaffung_ableger_jahr(anschaffung_ableger_jahr);
		}

		Boolean aktiv = (Boolean)attributes.get("aktiv");

		if (aktiv != null) {
			setAktiv(aktiv);
		}

		Integer aufloesung_tod_jahr = (Integer)attributes.get(
			"aufloesung_tod_jahr");

		if (aufloesung_tod_jahr != null) {
			setAufloesung_tod_jahr(aufloesung_tod_jahr);
		}

		Long gesundheitszeugnis_id = (Long)attributes.get(
			"gesundheitszeugnis_id");

		if (gesundheitszeugnis_id != null) {
			setGesundheitszeugnis_id(gesundheitszeugnis_id);
		}
	}

	@Override
	public Bienenvolk cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the aktiv of this bienenvolk.
	 *
	 * @return the aktiv of this bienenvolk
	 */
	@Override
	public Boolean getAktiv() {
		return model.getAktiv();
	}

	/**
	 * Returns the anschaffung_ableger_jahr of this bienenvolk.
	 *
	 * @return the anschaffung_ableger_jahr of this bienenvolk
	 */
	@Override
	public int getAnschaffung_ableger_jahr() {
		return model.getAnschaffung_ableger_jahr();
	}

	/**
	 * Returns the aufloesung_tod_jahr of this bienenvolk.
	 *
	 * @return the aufloesung_tod_jahr of this bienenvolk
	 */
	@Override
	public int getAufloesung_tod_jahr() {
		return model.getAufloesung_tod_jahr();
	}

	/**
	 * Returns the bemerkungen of this bienenvolk.
	 *
	 * @return the bemerkungen of this bienenvolk
	 */
	@Override
	public String getBemerkungen() {
		return model.getBemerkungen();
	}

	/**
	 * Returns the beutemass_id of this bienenvolk.
	 *
	 * @return the beutemass_id of this bienenvolk
	 */
	@Override
	public long getBeutemass_id() {
		return model.getBeutemass_id();
	}

	/**
	 * Returns the bezeichnung of this bienenvolk.
	 *
	 * @return the bezeichnung of this bienenvolk
	 */
	@Override
	public String getBezeichnung() {
		return model.getBezeichnung();
	}

	/**
	 * Returns the bienenrasse_id of this bienenvolk.
	 *
	 * @return the bienenrasse_id of this bienenvolk
	 */
	@Override
	public long getBienenrasse_id() {
		return model.getBienenrasse_id();
	}

	/**
	 * Returns the bienenvolk_id of this bienenvolk.
	 *
	 * @return the bienenvolk_id of this bienenvolk
	 */
	@Override
	public long getBienenvolk_id() {
		return model.getBienenvolk_id();
	}

	/**
	 * Returns the geo_coordinaten of this bienenvolk.
	 *
	 * @return the geo_coordinaten of this bienenvolk
	 */
	@Override
	public String getGeo_coordinaten() {
		return model.getGeo_coordinaten();
	}

	/**
	 * Returns the gesundheitszeugnis_id of this bienenvolk.
	 *
	 * @return the gesundheitszeugnis_id of this bienenvolk
	 */
	@Override
	public long getGesundheitszeugnis_id() {
		return model.getGesundheitszeugnis_id();
	}

	/**
	 * Returns the primary key of this bienenvolk.
	 *
	 * @return the primary key of this bienenvolk
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the weisel_jahr of this bienenvolk.
	 *
	 * @return the weisel_jahr of this bienenvolk
	 */
	@Override
	public long getWeisel_jahr() {
		return model.getWeisel_jahr();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the aktiv of this bienenvolk.
	 *
	 * @param aktiv the aktiv of this bienenvolk
	 */
	@Override
	public void setAktiv(Boolean aktiv) {
		model.setAktiv(aktiv);
	}

	/**
	 * Sets the anschaffung_ableger_jahr of this bienenvolk.
	 *
	 * @param anschaffung_ableger_jahr the anschaffung_ableger_jahr of this bienenvolk
	 */
	@Override
	public void setAnschaffung_ableger_jahr(int anschaffung_ableger_jahr) {
		model.setAnschaffung_ableger_jahr(anschaffung_ableger_jahr);
	}

	/**
	 * Sets the aufloesung_tod_jahr of this bienenvolk.
	 *
	 * @param aufloesung_tod_jahr the aufloesung_tod_jahr of this bienenvolk
	 */
	@Override
	public void setAufloesung_tod_jahr(int aufloesung_tod_jahr) {
		model.setAufloesung_tod_jahr(aufloesung_tod_jahr);
	}

	/**
	 * Sets the bemerkungen of this bienenvolk.
	 *
	 * @param bemerkungen the bemerkungen of this bienenvolk
	 */
	@Override
	public void setBemerkungen(String bemerkungen) {
		model.setBemerkungen(bemerkungen);
	}

	/**
	 * Sets the beutemass_id of this bienenvolk.
	 *
	 * @param beutemass_id the beutemass_id of this bienenvolk
	 */
	@Override
	public void setBeutemass_id(long beutemass_id) {
		model.setBeutemass_id(beutemass_id);
	}

	/**
	 * Sets the bezeichnung of this bienenvolk.
	 *
	 * @param bezeichnung the bezeichnung of this bienenvolk
	 */
	@Override
	public void setBezeichnung(String bezeichnung) {
		model.setBezeichnung(bezeichnung);
	}

	/**
	 * Sets the bienenrasse_id of this bienenvolk.
	 *
	 * @param bienenrasse_id the bienenrasse_id of this bienenvolk
	 */
	@Override
	public void setBienenrasse_id(long bienenrasse_id) {
		model.setBienenrasse_id(bienenrasse_id);
	}

	/**
	 * Sets the bienenvolk_id of this bienenvolk.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this bienenvolk
	 */
	@Override
	public void setBienenvolk_id(long bienenvolk_id) {
		model.setBienenvolk_id(bienenvolk_id);
	}

	/**
	 * Sets the geo_coordinaten of this bienenvolk.
	 *
	 * @param geo_coordinaten the geo_coordinaten of this bienenvolk
	 */
	@Override
	public void setGeo_coordinaten(String geo_coordinaten) {
		model.setGeo_coordinaten(geo_coordinaten);
	}

	/**
	 * Sets the gesundheitszeugnis_id of this bienenvolk.
	 *
	 * @param gesundheitszeugnis_id the gesundheitszeugnis_id of this bienenvolk
	 */
	@Override
	public void setGesundheitszeugnis_id(long gesundheitszeugnis_id) {
		model.setGesundheitszeugnis_id(gesundheitszeugnis_id);
	}

	/**
	 * Sets the primary key of this bienenvolk.
	 *
	 * @param primaryKey the primary key of this bienenvolk
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the weisel_jahr of this bienenvolk.
	 *
	 * @param weisel_jahr the weisel_jahr of this bienenvolk
	 */
	@Override
	public void setWeisel_jahr(long weisel_jahr) {
		model.setWeisel_jahr(weisel_jahr);
	}

	@Override
	protected BienenvolkWrapper wrap(Bienenvolk bienenvolk) {
		return new BienenvolkWrapper(bienenvolk);
	}

}