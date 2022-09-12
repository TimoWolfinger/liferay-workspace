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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link trachten}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see trachten
 * @generated
 */
public class trachtenWrapper
	extends BaseModelWrapper<trachten>
	implements ModelWrapper<trachten>, trachten {

	public trachtenWrapper(trachten trachten) {
		super(trachten);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("bezeichnung", getBezeichnung());

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
	}

	@Override
	public trachten cloneWithOriginalValues() {
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
	 * Returns the ID of this trachten.
	 *
	 * @return the ID of this trachten
	 */
	@Override
	public long getId() {
		return model.getId();
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
	 * Sets the ID of this trachten.
	 *
	 * @param id the ID of this trachten
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
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

	@Override
	protected trachtenWrapper wrap(trachten trachten) {
		return new trachtenWrapper(trachten);
	}

}