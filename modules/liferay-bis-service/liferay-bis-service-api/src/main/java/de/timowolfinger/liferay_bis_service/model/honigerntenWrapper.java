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
 * This class is a wrapper for {@link honigernten}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see honigernten
 * @generated
 */
public class honigerntenWrapper
	extends BaseModelWrapper<honigernten>
	implements honigernten, ModelWrapper<honigernten> {

	public honigerntenWrapper(honigernten honigernten) {
		super(honigernten);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("erntedatum", getErntedatum());
		attributes.put("erntemenge_kg", getErntemenge_kg());
		attributes.put("bienenvolk_id", getBienenvolk_id());
		attributes.put("tracht_id", getTracht_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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
	 * Returns the ID of this honigernten.
	 *
	 * @return the ID of this honigernten
	 */
	@Override
	public long getId() {
		return model.getId();
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
	 * Sets the ID of this honigernten.
	 *
	 * @param id the ID of this honigernten
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
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
	protected honigerntenWrapper wrap(honigernten honigernten) {
		return new honigerntenWrapper(honigernten);
	}

	@Override
	public honigerntenWrapper cloneWithOriginalValues() {
		return this;
	}
}