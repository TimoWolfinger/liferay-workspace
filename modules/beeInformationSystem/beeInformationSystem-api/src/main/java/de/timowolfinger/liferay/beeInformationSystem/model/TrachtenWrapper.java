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
 * This class is a wrapper for {@link Trachten}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Trachten
 * @generated
 */
public class TrachtenWrapper
	extends BaseModelWrapper<Trachten>
	implements ModelWrapper<Trachten>, Trachten {

	public TrachtenWrapper(Trachten trachten) {
		super(trachten);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("trachten_id", getTrachten_id());
		attributes.put("bezeichnung", getBezeichnung());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long trachten_id = (Long)attributes.get("trachten_id");

		if (trachten_id != null) {
			setTrachten_id(trachten_id);
		}

		String bezeichnung = (String)attributes.get("bezeichnung");

		if (bezeichnung != null) {
			setBezeichnung(bezeichnung);
		}
	}

	@Override
	public Trachten cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bezeichnung of this trachten.
	 *
	 * @return the bezeichnung of this trachten
	 */
	@Override
	public String getBezeichnung() {
		return model.getBezeichnung();
	}

	/**
	 * Returns the primary key of this trachten.
	 *
	 * @return the primary key of this trachten
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the trachten_id of this trachten.
	 *
	 * @return the trachten_id of this trachten
	 */
	@Override
	public long getTrachten_id() {
		return model.getTrachten_id();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the bezeichnung of this trachten.
	 *
	 * @param bezeichnung the bezeichnung of this trachten
	 */
	@Override
	public void setBezeichnung(String bezeichnung) {
		model.setBezeichnung(bezeichnung);
	}

	/**
	 * Sets the primary key of this trachten.
	 *
	 * @param primaryKey the primary key of this trachten
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the trachten_id of this trachten.
	 *
	 * @param trachten_id the trachten_id of this trachten
	 */
	@Override
	public void setTrachten_id(long trachten_id) {
		model.setTrachten_id(trachten_id);
	}

	@Override
	protected TrachtenWrapper wrap(Trachten trachten) {
		return new TrachtenWrapper(trachten);
	}

}