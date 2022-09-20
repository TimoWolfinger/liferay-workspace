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
 * This class is a wrapper for {@link Medikament}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Medikament
 * @generated
 */
public class MedikamentWrapper
	extends BaseModelWrapper<Medikament>
	implements Medikament, ModelWrapper<Medikament> {

	public MedikamentWrapper(Medikament medikament) {
		super(medikament);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("medikament_id", getMedikament_id());
		attributes.put("name", getName());
		attributes.put("hersteller_id", getHersteller_id());
		attributes.put("dosierung", getDosierung());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long medikament_id = (Long)attributes.get("medikament_id");

		if (medikament_id != null) {
			setMedikament_id(medikament_id);
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
	public Medikament cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the dosierung of this medikament.
	 *
	 * @return the dosierung of this medikament
	 */
	@Override
	public String getDosierung() {
		return model.getDosierung();
	}

	/**
	 * Returns the hersteller_id of this medikament.
	 *
	 * @return the hersteller_id of this medikament
	 */
	@Override
	public long getHersteller_id() {
		return model.getHersteller_id();
	}

	/**
	 * Returns the medikament_id of this medikament.
	 *
	 * @return the medikament_id of this medikament
	 */
	@Override
	public long getMedikament_id() {
		return model.getMedikament_id();
	}

	/**
	 * Returns the name of this medikament.
	 *
	 * @return the name of this medikament
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this medikament.
	 *
	 * @return the primary key of this medikament
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
	 * Sets the dosierung of this medikament.
	 *
	 * @param dosierung the dosierung of this medikament
	 */
	@Override
	public void setDosierung(String dosierung) {
		model.setDosierung(dosierung);
	}

	/**
	 * Sets the hersteller_id of this medikament.
	 *
	 * @param hersteller_id the hersteller_id of this medikament
	 */
	@Override
	public void setHersteller_id(long hersteller_id) {
		model.setHersteller_id(hersteller_id);
	}

	/**
	 * Sets the medikament_id of this medikament.
	 *
	 * @param medikament_id the medikament_id of this medikament
	 */
	@Override
	public void setMedikament_id(long medikament_id) {
		model.setMedikament_id(medikament_id);
	}

	/**
	 * Sets the name of this medikament.
	 *
	 * @param name the name of this medikament
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this medikament.
	 *
	 * @param primaryKey the primary key of this medikament
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected MedikamentWrapper wrap(Medikament medikament) {
		return new MedikamentWrapper(medikament);
	}

}