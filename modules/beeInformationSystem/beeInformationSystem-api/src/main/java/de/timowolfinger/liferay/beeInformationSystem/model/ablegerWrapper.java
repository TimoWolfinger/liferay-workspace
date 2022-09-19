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
 * This class is a wrapper for {@link ableger}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ableger
 * @generated
 */
public class ablegerWrapper
	extends BaseModelWrapper<ableger>
	implements ableger, ModelWrapper<ableger> {

	public ablegerWrapper(ableger ableger) {
		super(ableger);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ableger_id", getAbleger_id());
		attributes.put("bezeichnung", getBezeichnung());
		attributes.put("datum_ablegerbildung", getDatum_ablegerbildung());
		attributes.put("bienen_id", getBienen_id());
		attributes.put("erfolgreich", getErfolgreich());
		attributes.put("abgeschlossen", getAbgeschlossen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ableger_id = (Long)attributes.get("ableger_id");

		if (ableger_id != null) {
			setAbleger_id(ableger_id);
		}

		String bezeichnung = (String)attributes.get("bezeichnung");

		if (bezeichnung != null) {
			setBezeichnung(bezeichnung);
		}

		Date datum_ablegerbildung = (Date)attributes.get(
			"datum_ablegerbildung");

		if (datum_ablegerbildung != null) {
			setDatum_ablegerbildung(datum_ablegerbildung);
		}

		Long bienen_id = (Long)attributes.get("bienen_id");

		if (bienen_id != null) {
			setBienen_id(bienen_id);
		}

		Boolean erfolgreich = (Boolean)attributes.get("erfolgreich");

		if (erfolgreich != null) {
			setErfolgreich(erfolgreich);
		}

		Boolean abgeschlossen = (Boolean)attributes.get("abgeschlossen");

		if (abgeschlossen != null) {
			setAbgeschlossen(abgeschlossen);
		}
	}

	@Override
	public ableger cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the abgeschlossen of this ableger.
	 *
	 * @return the abgeschlossen of this ableger
	 */
	@Override
	public Boolean getAbgeschlossen() {
		return model.getAbgeschlossen();
	}

	/**
	 * Returns the ableger_id of this ableger.
	 *
	 * @return the ableger_id of this ableger
	 */
	@Override
	public long getAbleger_id() {
		return model.getAbleger_id();
	}

	/**
	 * Returns the bezeichnung of this ableger.
	 *
	 * @return the bezeichnung of this ableger
	 */
	@Override
	public String getBezeichnung() {
		return model.getBezeichnung();
	}

	/**
	 * Returns the bienen_id of this ableger.
	 *
	 * @return the bienen_id of this ableger
	 */
	@Override
	public long getBienen_id() {
		return model.getBienen_id();
	}

	/**
	 * Returns the datum_ablegerbildung of this ableger.
	 *
	 * @return the datum_ablegerbildung of this ableger
	 */
	@Override
	public Date getDatum_ablegerbildung() {
		return model.getDatum_ablegerbildung();
	}

	/**
	 * Returns the erfolgreich of this ableger.
	 *
	 * @return the erfolgreich of this ableger
	 */
	@Override
	public Boolean getErfolgreich() {
		return model.getErfolgreich();
	}

	/**
	 * Returns the primary key of this ableger.
	 *
	 * @return the primary key of this ableger
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the abgeschlossen of this ableger.
	 *
	 * @param abgeschlossen the abgeschlossen of this ableger
	 */
	@Override
	public void setAbgeschlossen(Boolean abgeschlossen) {
		model.setAbgeschlossen(abgeschlossen);
	}

	/**
	 * Sets the ableger_id of this ableger.
	 *
	 * @param ableger_id the ableger_id of this ableger
	 */
	@Override
	public void setAbleger_id(long ableger_id) {
		model.setAbleger_id(ableger_id);
	}

	/**
	 * Sets the bezeichnung of this ableger.
	 *
	 * @param bezeichnung the bezeichnung of this ableger
	 */
	@Override
	public void setBezeichnung(String bezeichnung) {
		model.setBezeichnung(bezeichnung);
	}

	/**
	 * Sets the bienen_id of this ableger.
	 *
	 * @param bienen_id the bienen_id of this ableger
	 */
	@Override
	public void setBienen_id(long bienen_id) {
		model.setBienen_id(bienen_id);
	}

	/**
	 * Sets the datum_ablegerbildung of this ableger.
	 *
	 * @param datum_ablegerbildung the datum_ablegerbildung of this ableger
	 */
	@Override
	public void setDatum_ablegerbildung(Date datum_ablegerbildung) {
		model.setDatum_ablegerbildung(datum_ablegerbildung);
	}

	/**
	 * Sets the erfolgreich of this ableger.
	 *
	 * @param erfolgreich the erfolgreich of this ableger
	 */
	@Override
	public void setErfolgreich(Boolean erfolgreich) {
		model.setErfolgreich(erfolgreich);
	}

	/**
	 * Sets the primary key of this ableger.
	 *
	 * @param primaryKey the primary key of this ableger
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected ablegerWrapper wrap(ableger ableger) {
		return new ablegerWrapper(ableger);
	}

}