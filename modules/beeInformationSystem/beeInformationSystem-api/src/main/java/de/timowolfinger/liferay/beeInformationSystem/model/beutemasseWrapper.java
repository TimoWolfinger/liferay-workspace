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
 * This class is a wrapper for {@link beutemasse}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see beutemasse
 * @generated
 */
public class beutemasseWrapper
	extends BaseModelWrapper<beutemasse>
	implements beutemasse, ModelWrapper<beutemasse> {

	public beutemasseWrapper(beutemasse beutemasse) {
		super(beutemasse);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("beutemasse_id", getBeutemasse_id());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long beutemasse_id = (Long)attributes.get("beutemasse_id");

		if (beutemasse_id != null) {
			setBeutemasse_id(beutemasse_id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public beutemasse cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the beutemasse_id of this beutemasse.
	 *
	 * @return the beutemasse_id of this beutemasse
	 */
	@Override
	public long getBeutemasse_id() {
		return model.getBeutemasse_id();
	}

	/**
	 * Returns the name of this beutemasse.
	 *
	 * @return the name of this beutemasse
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this beutemasse.
	 *
	 * @return the primary key of this beutemasse
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
	 * Sets the beutemasse_id of this beutemasse.
	 *
	 * @param beutemasse_id the beutemasse_id of this beutemasse
	 */
	@Override
	public void setBeutemasse_id(long beutemasse_id) {
		model.setBeutemasse_id(beutemasse_id);
	}

	/**
	 * Sets the name of this beutemasse.
	 *
	 * @param name the name of this beutemasse
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this beutemasse.
	 *
	 * @param primaryKey the primary key of this beutemasse
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected beutemasseWrapper wrap(beutemasse beutemasse) {
		return new beutemasseWrapper(beutemasse);
	}

}