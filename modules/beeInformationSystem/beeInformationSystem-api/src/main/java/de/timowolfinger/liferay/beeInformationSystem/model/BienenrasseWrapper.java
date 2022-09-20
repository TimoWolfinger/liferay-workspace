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
 * This class is a wrapper for {@link Bienenrasse}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Bienenrasse
 * @generated
 */
public class BienenrasseWrapper
	extends BaseModelWrapper<Bienenrasse>
	implements Bienenrasse, ModelWrapper<Bienenrasse> {

	public BienenrasseWrapper(Bienenrasse bienenrasse) {
		super(bienenrasse);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bienenrasse_id", getBienenrasse_id());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bienenrasse_id = (Long)attributes.get("bienenrasse_id");

		if (bienenrasse_id != null) {
			setBienenrasse_id(bienenrasse_id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public Bienenrasse cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bienenrasse_id of this bienenrasse.
	 *
	 * @return the bienenrasse_id of this bienenrasse
	 */
	@Override
	public long getBienenrasse_id() {
		return model.getBienenrasse_id();
	}

	/**
	 * Returns the name of this bienenrasse.
	 *
	 * @return the name of this bienenrasse
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this bienenrasse.
	 *
	 * @return the primary key of this bienenrasse
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
	 * Sets the bienenrasse_id of this bienenrasse.
	 *
	 * @param bienenrasse_id the bienenrasse_id of this bienenrasse
	 */
	@Override
	public void setBienenrasse_id(long bienenrasse_id) {
		model.setBienenrasse_id(bienenrasse_id);
	}

	/**
	 * Sets the name of this bienenrasse.
	 *
	 * @param name the name of this bienenrasse
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this bienenrasse.
	 *
	 * @param primaryKey the primary key of this bienenrasse
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected BienenrasseWrapper wrap(Bienenrasse bienenrasse) {
		return new BienenrasseWrapper(bienenrasse);
	}

}