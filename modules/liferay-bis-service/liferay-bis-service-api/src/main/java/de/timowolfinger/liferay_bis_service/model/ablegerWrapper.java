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

		attributes.put("id", getId());
		attributes.put("bezeichnung", getBezeichnung());
		attributes.put("datum_ablegerbildung", getDatum_ablegerbildung());
		attributes.put("muttervolk_id", getMuttervolk_id());
		attributes.put("erfolgreich", getErfolgreich());
		attributes.put("abgeschlossen", getAbgeschlossen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		Long muttervolk_id = (Long)attributes.get("muttervolk_id");

		if (muttervolk_id != null) {
			setMuttervolk_id(muttervolk_id);
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
	 * Returns the bezeichnung of this ableger.
	 *
	 * @return the bezeichnung of this ableger
	 */
	@Override
	public String getBezeichnung() {
		return model.getBezeichnung();
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
	 * Returns the ID of this ableger.
	 *
	 * @return the ID of this ableger
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the muttervolk_id of this ableger.
	 *
	 * @return the muttervolk_id of this ableger
	 */
	@Override
	public long getMuttervolk_id() {
		return model.getMuttervolk_id();
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
	 * Sets the bezeichnung of this ableger.
	 *
	 * @param bezeichnung the bezeichnung of this ableger
	 */
	@Override
	public void setBezeichnung(String bezeichnung) {
		model.setBezeichnung(bezeichnung);
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
	 * Sets the ID of this ableger.
	 *
	 * @param id the ID of this ableger
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the muttervolk_id of this ableger.
	 *
	 * @param muttervolk_id the muttervolk_id of this ableger
	 */
	@Override
	public void setMuttervolk_id(long muttervolk_id) {
		model.setMuttervolk_id(muttervolk_id);
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
	@Override
	public ablegerWrapper cloneWithOriginalValues() {
		return this;
	}
}