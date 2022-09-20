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
 * This class is a wrapper for {@link Tracht}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Tracht
 * @generated
 */
public class TrachtWrapper
	extends BaseModelWrapper<Tracht> implements ModelWrapper<Tracht>, Tracht {

	public TrachtWrapper(Tracht tracht) {
		super(tracht);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tracht_id", getTracht_id());
		attributes.put("bezeichnung", getBezeichnung());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tracht_id = (Long)attributes.get("tracht_id");

		if (tracht_id != null) {
			setTracht_id(tracht_id);
		}

		String bezeichnung = (String)attributes.get("bezeichnung");

		if (bezeichnung != null) {
			setBezeichnung(bezeichnung);
		}
	}

	@Override
	public Tracht cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bezeichnung of this tracht.
	 *
	 * @return the bezeichnung of this tracht
	 */
	@Override
	public String getBezeichnung() {
		return model.getBezeichnung();
	}

	/**
	 * Returns the primary key of this tracht.
	 *
	 * @return the primary key of this tracht
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tracht_id of this tracht.
	 *
	 * @return the tracht_id of this tracht
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
	 * Sets the bezeichnung of this tracht.
	 *
	 * @param bezeichnung the bezeichnung of this tracht
	 */
	@Override
	public void setBezeichnung(String bezeichnung) {
		model.setBezeichnung(bezeichnung);
	}

	/**
	 * Sets the primary key of this tracht.
	 *
	 * @param primaryKey the primary key of this tracht
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tracht_id of this tracht.
	 *
	 * @param tracht_id the tracht_id of this tracht
	 */
	@Override
	public void setTracht_id(long tracht_id) {
		model.setTracht_id(tracht_id);
	}

	@Override
	protected TrachtWrapper wrap(Tracht tracht) {
		return new TrachtWrapper(tracht);
	}

}