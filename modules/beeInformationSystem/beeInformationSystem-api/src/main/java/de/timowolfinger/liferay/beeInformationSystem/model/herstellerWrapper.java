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
 * This class is a wrapper for {@link hersteller}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see hersteller
 * @generated
 */
public class herstellerWrapper
	extends BaseModelWrapper<hersteller>
	implements hersteller, ModelWrapper<hersteller> {

	public herstellerWrapper(hersteller hersteller) {
		super(hersteller);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("hersteller_id", getHersteller_id());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long hersteller_id = (Long)attributes.get("hersteller_id");

		if (hersteller_id != null) {
			setHersteller_id(hersteller_id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public hersteller cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the hersteller_id of this hersteller.
	 *
	 * @return the hersteller_id of this hersteller
	 */
	@Override
	public long getHersteller_id() {
		return model.getHersteller_id();
	}

	/**
	 * Returns the name of this hersteller.
	 *
	 * @return the name of this hersteller
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this hersteller.
	 *
	 * @return the primary key of this hersteller
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
	 * Sets the hersteller_id of this hersteller.
	 *
	 * @param hersteller_id the hersteller_id of this hersteller
	 */
	@Override
	public void setHersteller_id(long hersteller_id) {
		model.setHersteller_id(hersteller_id);
	}

	/**
	 * Sets the name of this hersteller.
	 *
	 * @param name the name of this hersteller
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this hersteller.
	 *
	 * @param primaryKey the primary key of this hersteller
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected herstellerWrapper wrap(hersteller hersteller) {
		return new herstellerWrapper(hersteller);
	}

}