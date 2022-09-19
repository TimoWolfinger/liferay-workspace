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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link voelkerentwicklung}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see voelkerentwicklung
 * @generated
 */
public class voelkerentwicklungWrapper
	extends BaseModelWrapper<voelkerentwicklung>
	implements ModelWrapper<voelkerentwicklung>, voelkerentwicklung {

	public voelkerentwicklungWrapper(voelkerentwicklung voelkerentwicklung) {
		super(voelkerentwicklung);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("voelkerentwicklung_id", getVoelkerentwicklung_id());
		attributes.put(
			"anzahl_bebrueteter_rahmen", getAnzahl_bebrueteter_rahmen());
		attributes.put(
			"abschaetzung_anzahl_individuen",
			getAbschaetzung_anzahl_individuen());
		attributes.put("bienenvoelker_id", getBienenvoelker_id());
		attributes.put("datum", getDatum());
		attributes.put("stockwaage_gewicht_kg", getStockwaage_gewicht_kg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long voelkerentwicklung_id = (Long)attributes.get(
			"voelkerentwicklung_id");

		if (voelkerentwicklung_id != null) {
			setVoelkerentwicklung_id(voelkerentwicklung_id);
		}

		Float anzahl_bebrueteter_rahmen = (Float)attributes.get(
			"anzahl_bebrueteter_rahmen");

		if (anzahl_bebrueteter_rahmen != null) {
			setAnzahl_bebrueteter_rahmen(anzahl_bebrueteter_rahmen);
		}

		Long abschaetzung_anzahl_individuen = (Long)attributes.get(
			"abschaetzung_anzahl_individuen");

		if (abschaetzung_anzahl_individuen != null) {
			setAbschaetzung_anzahl_individuen(abschaetzung_anzahl_individuen);
		}

		Long bienenvoelker_id = (Long)attributes.get("bienenvoelker_id");

		if (bienenvoelker_id != null) {
			setBienenvoelker_id(bienenvoelker_id);
		}

		Date datum = (Date)attributes.get("datum");

		if (datum != null) {
			setDatum(datum);
		}

		Float stockwaage_gewicht_kg = (Float)attributes.get(
			"stockwaage_gewicht_kg");

		if (stockwaage_gewicht_kg != null) {
			setStockwaage_gewicht_kg(stockwaage_gewicht_kg);
		}
	}

	@Override
	public voelkerentwicklung cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the abschaetzung_anzahl_individuen of this voelkerentwicklung.
	 *
	 * @return the abschaetzung_anzahl_individuen of this voelkerentwicklung
	 */
	@Override
	public long getAbschaetzung_anzahl_individuen() {
		return model.getAbschaetzung_anzahl_individuen();
	}

	/**
	 * Returns the anzahl_bebrueteter_rahmen of this voelkerentwicklung.
	 *
	 * @return the anzahl_bebrueteter_rahmen of this voelkerentwicklung
	 */
	@Override
	public float getAnzahl_bebrueteter_rahmen() {
		return model.getAnzahl_bebrueteter_rahmen();
	}

	/**
	 * Returns the bienenvoelker_id of this voelkerentwicklung.
	 *
	 * @return the bienenvoelker_id of this voelkerentwicklung
	 */
	@Override
	public long getBienenvoelker_id() {
		return model.getBienenvoelker_id();
	}

	/**
	 * Returns the datum of this voelkerentwicklung.
	 *
	 * @return the datum of this voelkerentwicklung
	 */
	@Override
	public Date getDatum() {
		return model.getDatum();
	}

	/**
	 * Returns the primary key of this voelkerentwicklung.
	 *
	 * @return the primary key of this voelkerentwicklung
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the stockwaage_gewicht_kg of this voelkerentwicklung.
	 *
	 * @return the stockwaage_gewicht_kg of this voelkerentwicklung
	 */
	@Override
	public float getStockwaage_gewicht_kg() {
		return model.getStockwaage_gewicht_kg();
	}

	/**
	 * Returns the voelkerentwicklung_id of this voelkerentwicklung.
	 *
	 * @return the voelkerentwicklung_id of this voelkerentwicklung
	 */
	@Override
	public long getVoelkerentwicklung_id() {
		return model.getVoelkerentwicklung_id();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the abschaetzung_anzahl_individuen of this voelkerentwicklung.
	 *
	 * @param abschaetzung_anzahl_individuen the abschaetzung_anzahl_individuen of this voelkerentwicklung
	 */
	@Override
	public void setAbschaetzung_anzahl_individuen(
		long abschaetzung_anzahl_individuen) {

		model.setAbschaetzung_anzahl_individuen(abschaetzung_anzahl_individuen);
	}

	/**
	 * Sets the anzahl_bebrueteter_rahmen of this voelkerentwicklung.
	 *
	 * @param anzahl_bebrueteter_rahmen the anzahl_bebrueteter_rahmen of this voelkerentwicklung
	 */
	@Override
	public void setAnzahl_bebrueteter_rahmen(float anzahl_bebrueteter_rahmen) {
		model.setAnzahl_bebrueteter_rahmen(anzahl_bebrueteter_rahmen);
	}

	/**
	 * Sets the bienenvoelker_id of this voelkerentwicklung.
	 *
	 * @param bienenvoelker_id the bienenvoelker_id of this voelkerentwicklung
	 */
	@Override
	public void setBienenvoelker_id(long bienenvoelker_id) {
		model.setBienenvoelker_id(bienenvoelker_id);
	}

	/**
	 * Sets the datum of this voelkerentwicklung.
	 *
	 * @param datum the datum of this voelkerentwicklung
	 */
	@Override
	public void setDatum(Date datum) {
		model.setDatum(datum);
	}

	/**
	 * Sets the primary key of this voelkerentwicklung.
	 *
	 * @param primaryKey the primary key of this voelkerentwicklung
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the stockwaage_gewicht_kg of this voelkerentwicklung.
	 *
	 * @param stockwaage_gewicht_kg the stockwaage_gewicht_kg of this voelkerentwicklung
	 */
	@Override
	public void setStockwaage_gewicht_kg(float stockwaage_gewicht_kg) {
		model.setStockwaage_gewicht_kg(stockwaage_gewicht_kg);
	}

	/**
	 * Sets the voelkerentwicklung_id of this voelkerentwicklung.
	 *
	 * @param voelkerentwicklung_id the voelkerentwicklung_id of this voelkerentwicklung
	 */
	@Override
	public void setVoelkerentwicklung_id(long voelkerentwicklung_id) {
		model.setVoelkerentwicklung_id(voelkerentwicklung_id);
	}

	@Override
	protected voelkerentwicklungWrapper wrap(
		voelkerentwicklung voelkerentwicklung) {

		return new voelkerentwicklungWrapper(voelkerentwicklung);
	}

}