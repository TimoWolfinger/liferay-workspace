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
 * This class is a wrapper for {@link medikamente}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see medikamente
 * @generated
 */
public class medikamenteWrapper
	extends BaseModelWrapper<medikamente>
	implements medikamente, ModelWrapper<medikamente> {

	public medikamenteWrapper(medikamente medikamente) {
		super(medikamente);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("medikamente_id", getMedikamente_id());
		attributes.put("name", getName());
		attributes.put("hersteller_id", getHersteller_id());
		attributes.put("dosierung", getDosierung());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long medikamente_id = (Long)attributes.get("medikamente_id");

		if (medikamente_id != null) {
			setMedikamente_id(medikamente_id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long hersteller_id = (Long)attributes.get("hersteller_id");

		if (hersteller_id != null) {
			setHersteller_id(hersteller_id);
		}

		String dosierung = (String)attributes.get("dosierung");

		if (dosierung != null) {
			setDosierung(dosierung);
		}
	}

	@Override
	public medikamente cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the dosierung of this medikamente.
	 *
	 * @return the dosierung of this medikamente
	 */
	@Override
	public String getDosierung() {
		return model.getDosierung();
	}

	/**
	 * Returns the hersteller_id of this medikamente.
	 *
	 * @return the hersteller_id of this medikamente
	 */
	@Override
	public long getHersteller_id() {
		return model.getHersteller_id();
	}

	/**
	 * Returns the medikamente_id of this medikamente.
	 *
	 * @return the medikamente_id of this medikamente
	 */
	@Override
	public long getMedikamente_id() {
		return model.getMedikamente_id();
	}

	/**
	 * Returns the name of this medikamente.
	 *
	 * @return the name of this medikamente
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this medikamente.
	 *
	 * @return the primary key of this medikamente
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
	 * Sets the dosierung of this medikamente.
	 *
	 * @param dosierung the dosierung of this medikamente
	 */
	@Override
	public void setDosierung(String dosierung) {
		model.setDosierung(dosierung);
	}

	/**
	 * Sets the hersteller_id of this medikamente.
	 *
	 * @param hersteller_id the hersteller_id of this medikamente
	 */
	@Override
	public void setHersteller_id(long hersteller_id) {
		model.setHersteller_id(hersteller_id);
	}

	/**
	 * Sets the medikamente_id of this medikamente.
	 *
	 * @param medikamente_id the medikamente_id of this medikamente
	 */
	@Override
	public void setMedikamente_id(long medikamente_id) {
		model.setMedikamente_id(medikamente_id);
	}

	/**
	 * Sets the name of this medikamente.
	 *
	 * @param name the name of this medikamente
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this medikamente.
	 *
	 * @param primaryKey the primary key of this medikamente
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected medikamenteWrapper wrap(medikamente medikamente) {
		return new medikamenteWrapper(medikamente);
	}

}