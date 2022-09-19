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
 * This class is a wrapper for {@link futtermittel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see futtermittel
 * @generated
 */
public class futtermittelWrapper
	extends BaseModelWrapper<futtermittel>
	implements futtermittel, ModelWrapper<futtermittel> {

	public futtermittelWrapper(futtermittel futtermittel) {
		super(futtermittel);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("futtermittel_id", getFuttermittel_id());
		attributes.put("name", getName());
		attributes.put("hersteller_id", getHersteller_id());
		attributes.put("gebindegroesse", getGebindegroesse());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long futtermittel_id = (Long)attributes.get("futtermittel_id");

		if (futtermittel_id != null) {
			setFuttermittel_id(futtermittel_id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long hersteller_id = (Long)attributes.get("hersteller_id");

		if (hersteller_id != null) {
			setHersteller_id(hersteller_id);
		}

		String gebindegroesse = (String)attributes.get("gebindegroesse");

		if (gebindegroesse != null) {
			setGebindegroesse(gebindegroesse);
		}
	}

	@Override
	public futtermittel cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the futtermittel_id of this futtermittel.
	 *
	 * @return the futtermittel_id of this futtermittel
	 */
	@Override
	public long getFuttermittel_id() {
		return model.getFuttermittel_id();
	}

	/**
	 * Returns the gebindegroesse of this futtermittel.
	 *
	 * @return the gebindegroesse of this futtermittel
	 */
	@Override
	public String getGebindegroesse() {
		return model.getGebindegroesse();
	}

	/**
	 * Returns the hersteller_id of this futtermittel.
	 *
	 * @return the hersteller_id of this futtermittel
	 */
	@Override
	public long getHersteller_id() {
		return model.getHersteller_id();
	}

	/**
	 * Returns the name of this futtermittel.
	 *
	 * @return the name of this futtermittel
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this futtermittel.
	 *
	 * @return the primary key of this futtermittel
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
	 * Sets the futtermittel_id of this futtermittel.
	 *
	 * @param futtermittel_id the futtermittel_id of this futtermittel
	 */
	@Override
	public void setFuttermittel_id(long futtermittel_id) {
		model.setFuttermittel_id(futtermittel_id);
	}

	/**
	 * Sets the gebindegroesse of this futtermittel.
	 *
	 * @param gebindegroesse the gebindegroesse of this futtermittel
	 */
	@Override
	public void setGebindegroesse(String gebindegroesse) {
		model.setGebindegroesse(gebindegroesse);
	}

	/**
	 * Sets the hersteller_id of this futtermittel.
	 *
	 * @param hersteller_id the hersteller_id of this futtermittel
	 */
	@Override
	public void setHersteller_id(long hersteller_id) {
		model.setHersteller_id(hersteller_id);
	}

	/**
	 * Sets the name of this futtermittel.
	 *
	 * @param name the name of this futtermittel
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this futtermittel.
	 *
	 * @param primaryKey the primary key of this futtermittel
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected futtermittelWrapper wrap(futtermittel futtermittel) {
		return new futtermittelWrapper(futtermittel);
	}

}