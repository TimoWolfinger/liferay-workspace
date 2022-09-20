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
 * This class is a wrapper for {@link Honigernten}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Honigernten
 * @generated
 */
public class HonigerntenWrapper
	extends BaseModelWrapper<Honigernten>
	implements Honigernten, ModelWrapper<Honigernten> {

	public HonigerntenWrapper(Honigernten honigernten) {
		super(honigernten);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("honigernten_id", getHonigernten_id());
		attributes.put("erntedatum", getErntedatum());
		attributes.put("erntemenge_kg", getErntemenge_kg());
		attributes.put("bienenvolk_id", getBienenvolk_id());
		attributes.put("tracht_id", getTracht_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long honigernten_id = (Long)attributes.get("honigernten_id");

		if (honigernten_id != null) {
			setHonigernten_id(honigernten_id);
		}

		Date erntedatum = (Date)attributes.get("erntedatum");

		if (erntedatum != null) {
			setErntedatum(erntedatum);
		}

		Integer erntemenge_kg = (Integer)attributes.get("erntemenge_kg");

		if (erntemenge_kg != null) {
			setErntemenge_kg(erntemenge_kg);
		}

		Long bienenvolk_id = (Long)attributes.get("bienenvolk_id");

		if (bienenvolk_id != null) {
			setBienenvolk_id(bienenvolk_id);
		}

		Long tracht_id = (Long)attributes.get("tracht_id");

		if (tracht_id != null) {
			setTracht_id(tracht_id);
		}
	}

	@Override
	public Honigernten cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bienenvolk_id of this honigernten.
	 *
	 * @return the bienenvolk_id of this honigernten
	 */
	@Override
	public long getBienenvolk_id() {
		return model.getBienenvolk_id();
	}

	/**
	 * Returns the erntedatum of this honigernten.
	 *
	 * @return the erntedatum of this honigernten
	 */
	@Override
	public Date getErntedatum() {
		return model.getErntedatum();
	}

	/**
	 * Returns the erntemenge_kg of this honigernten.
	 *
	 * @return the erntemenge_kg of this honigernten
	 */
	@Override
	public int getErntemenge_kg() {
		return model.getErntemenge_kg();
	}

	/**
	 * Returns the honigernten_id of this honigernten.
	 *
	 * @return the honigernten_id of this honigernten
	 */
	@Override
	public long getHonigernten_id() {
		return model.getHonigernten_id();
	}

	/**
	 * Returns the primary key of this honigernten.
	 *
	 * @return the primary key of this honigernten
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tracht_id of this honigernten.
	 *
	 * @return the tracht_id of this honigernten
	 */
	@Override
	public long getTracht_id() {
		return model.getTracht_id();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the bienenvolk_id of this honigernten.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this honigernten
	 */
	@Override
	public void setBienenvolk_id(long bienenvolk_id) {
		model.setBienenvolk_id(bienenvolk_id);
	}

	/**
	 * Sets the erntedatum of this honigernten.
	 *
	 * @param erntedatum the erntedatum of this honigernten
	 */
	@Override
	public void setErntedatum(Date erntedatum) {
		model.setErntedatum(erntedatum);
	}

	/**
	 * Sets the erntemenge_kg of this honigernten.
	 *
	 * @param erntemenge_kg the erntemenge_kg of this honigernten
	 */
	@Override
	public void setErntemenge_kg(int erntemenge_kg) {
		model.setErntemenge_kg(erntemenge_kg);
	}

	/**
	 * Sets the honigernten_id of this honigernten.
	 *
	 * @param honigernten_id the honigernten_id of this honigernten
	 */
	@Override
	public void setHonigernten_id(long honigernten_id) {
		model.setHonigernten_id(honigernten_id);
	}

	/**
	 * Sets the primary key of this honigernten.
	 *
	 * @param primaryKey the primary key of this honigernten
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tracht_id of this honigernten.
	 *
	 * @param tracht_id the tracht_id of this honigernten
	 */
	@Override
	public void setTracht_id(long tracht_id) {
		model.setTracht_id(tracht_id);
	}

	@Override
	protected HonigerntenWrapper wrap(Honigernten honigernten) {
		return new HonigerntenWrapper(honigernten);
	}

}