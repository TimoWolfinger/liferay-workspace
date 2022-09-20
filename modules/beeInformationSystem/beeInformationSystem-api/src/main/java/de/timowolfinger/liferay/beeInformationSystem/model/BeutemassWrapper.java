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
 * This class is a wrapper for {@link Beutemass}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Beutemass
 * @generated
 */
public class BeutemassWrapper
	extends BaseModelWrapper<Beutemass>
	implements Beutemass, ModelWrapper<Beutemass> {

	public BeutemassWrapper(Beutemass beutemass) {
		super(beutemass);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("beutemass_id", getBeutemass_id());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long beutemass_id = (Long)attributes.get("beutemass_id");

		if (beutemass_id != null) {
			setBeutemass_id(beutemass_id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public Beutemass cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the beutemass_id of this beutemass.
	 *
	 * @return the beutemass_id of this beutemass
	 */
	@Override
	public long getBeutemass_id() {
		return model.getBeutemass_id();
	}

	/**
	 * Returns the name of this beutemass.
	 *
	 * @return the name of this beutemass
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this beutemass.
	 *
	 * @return the primary key of this beutemass
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
	 * Sets the beutemass_id of this beutemass.
	 *
	 * @param beutemass_id the beutemass_id of this beutemass
	 */
	@Override
	public void setBeutemass_id(long beutemass_id) {
		model.setBeutemass_id(beutemass_id);
	}

	/**
	 * Sets the name of this beutemass.
	 *
	 * @param name the name of this beutemass
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this beutemass.
	 *
	 * @param primaryKey the primary key of this beutemass
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected BeutemassWrapper wrap(Beutemass beutemass) {
		return new BeutemassWrapper(beutemass);
	}

}