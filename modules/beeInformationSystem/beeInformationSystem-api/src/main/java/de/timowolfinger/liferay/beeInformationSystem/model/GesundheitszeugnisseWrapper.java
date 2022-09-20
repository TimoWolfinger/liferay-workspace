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
 * This class is a wrapper for {@link Gesundheitszeugnisse}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Gesundheitszeugnisse
 * @generated
 */
public class GesundheitszeugnisseWrapper
	extends BaseModelWrapper<Gesundheitszeugnisse>
	implements Gesundheitszeugnisse, ModelWrapper<Gesundheitszeugnisse> {

	public GesundheitszeugnisseWrapper(
		Gesundheitszeugnisse gesundheitszeugnisse) {

		super(gesundheitszeugnisse);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("gesundheitszeugnisse_id", getGesundheitszeugnisse_id());
		attributes.put("seriennummer_lt_form", getSeriennummer_lt_form());
		attributes.put("dokument", getDokument());
		attributes.put("ausstellungsdatum", getAusstellungsdatum());
		attributes.put("dokument_dateityp", getDokument_dateityp());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long gesundheitszeugnisse_id = (Long)attributes.get(
			"gesundheitszeugnisse_id");

		if (gesundheitszeugnisse_id != null) {
			setGesundheitszeugnisse_id(gesundheitszeugnisse_id);
		}

		String seriennummer_lt_form = (String)attributes.get(
			"seriennummer_lt_form");

		if (seriennummer_lt_form != null) {
			setSeriennummer_lt_form(seriennummer_lt_form);
		}

		String dokument = (String)attributes.get("dokument");

		if (dokument != null) {
			setDokument(dokument);
		}

		Date ausstellungsdatum = (Date)attributes.get("ausstellungsdatum");

		if (ausstellungsdatum != null) {
			setAusstellungsdatum(ausstellungsdatum);
		}

		String dokument_dateityp = (String)attributes.get("dokument_dateityp");

		if (dokument_dateityp != null) {
			setDokument_dateityp(dokument_dateityp);
		}
	}

	@Override
	public Gesundheitszeugnisse cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the ausstellungsdatum of this gesundheitszeugnisse.
	 *
	 * @return the ausstellungsdatum of this gesundheitszeugnisse
	 */
	@Override
	public Date getAusstellungsdatum() {
		return model.getAusstellungsdatum();
	}

	/**
	 * Returns the dokument of this gesundheitszeugnisse.
	 *
	 * @return the dokument of this gesundheitszeugnisse
	 */
	@Override
	public String getDokument() {
		return model.getDokument();
	}

	/**
	 * Returns the dokument_dateityp of this gesundheitszeugnisse.
	 *
	 * @return the dokument_dateityp of this gesundheitszeugnisse
	 */
	@Override
	public String getDokument_dateityp() {
		return model.getDokument_dateityp();
	}

	/**
	 * Returns the gesundheitszeugnisse_id of this gesundheitszeugnisse.
	 *
	 * @return the gesundheitszeugnisse_id of this gesundheitszeugnisse
	 */
	@Override
	public long getGesundheitszeugnisse_id() {
		return model.getGesundheitszeugnisse_id();
	}

	/**
	 * Returns the primary key of this gesundheitszeugnisse.
	 *
	 * @return the primary key of this gesundheitszeugnisse
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the seriennummer_lt_form of this gesundheitszeugnisse.
	 *
	 * @return the seriennummer_lt_form of this gesundheitszeugnisse
	 */
	@Override
	public String getSeriennummer_lt_form() {
		return model.getSeriennummer_lt_form();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ausstellungsdatum of this gesundheitszeugnisse.
	 *
	 * @param ausstellungsdatum the ausstellungsdatum of this gesundheitszeugnisse
	 */
	@Override
	public void setAusstellungsdatum(Date ausstellungsdatum) {
		model.setAusstellungsdatum(ausstellungsdatum);
	}

	/**
	 * Sets the dokument of this gesundheitszeugnisse.
	 *
	 * @param dokument the dokument of this gesundheitszeugnisse
	 */
	@Override
	public void setDokument(String dokument) {
		model.setDokument(dokument);
	}

	/**
	 * Sets the dokument_dateityp of this gesundheitszeugnisse.
	 *
	 * @param dokument_dateityp the dokument_dateityp of this gesundheitszeugnisse
	 */
	@Override
	public void setDokument_dateityp(String dokument_dateityp) {
		model.setDokument_dateityp(dokument_dateityp);
	}

	/**
	 * Sets the gesundheitszeugnisse_id of this gesundheitszeugnisse.
	 *
	 * @param gesundheitszeugnisse_id the gesundheitszeugnisse_id of this gesundheitszeugnisse
	 */
	@Override
	public void setGesundheitszeugnisse_id(long gesundheitszeugnisse_id) {
		model.setGesundheitszeugnisse_id(gesundheitszeugnisse_id);
	}

	/**
	 * Sets the primary key of this gesundheitszeugnisse.
	 *
	 * @param primaryKey the primary key of this gesundheitszeugnisse
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the seriennummer_lt_form of this gesundheitszeugnisse.
	 *
	 * @param seriennummer_lt_form the seriennummer_lt_form of this gesundheitszeugnisse
	 */
	@Override
	public void setSeriennummer_lt_form(String seriennummer_lt_form) {
		model.setSeriennummer_lt_form(seriennummer_lt_form);
	}

	@Override
	protected GesundheitszeugnisseWrapper wrap(
		Gesundheitszeugnisse gesundheitszeugnisse) {

		return new GesundheitszeugnisseWrapper(gesundheitszeugnisse);
	}

}