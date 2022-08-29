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
 * This class is a wrapper for {@link behandlungen}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see behandlungen
 * @generated
 */
public class behandlungenWrapper
	extends BaseModelWrapper<behandlungen>
	implements behandlungen, ModelWrapper<behandlungen> {

	public behandlungenWrapper(behandlungen behandlungen) {
		super(behandlungen);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("bienenvolk_id", getBienenvolk_id());
		attributes.put("medikament_id", getMedikament_id());
		attributes.put("beginn", getBeginn());
		attributes.put("ende", getEnde());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long bienenvolk_id = (Long)attributes.get("bienenvolk_id");

		if (bienenvolk_id != null) {
			setBienenvolk_id(bienenvolk_id);
		}

		Long medikament_id = (Long)attributes.get("medikament_id");

		if (medikament_id != null) {
			setMedikament_id(medikament_id);
		}

		Date beginn = (Date)attributes.get("beginn");

		if (beginn != null) {
			setBeginn(beginn);
		}

		Date ende = (Date)attributes.get("ende");

		if (ende != null) {
			setEnde(ende);
		}
	}

	/**
	 * Returns the beginn of this behandlungen.
	 *
	 * @return the beginn of this behandlungen
	 */
	@Override
	public Date getBeginn() {
		return model.getBeginn();
	}

	/**
	 * Returns the bienenvolk_id of this behandlungen.
	 *
	 * @return the bienenvolk_id of this behandlungen
	 */
	@Override
	public long getBienenvolk_id() {
		return model.getBienenvolk_id();
	}

	/**
	 * Returns the ende of this behandlungen.
	 *
	 * @return the ende of this behandlungen
	 */
	@Override
	public Date getEnde() {
		return model.getEnde();
	}

	/**
	 * Returns the ID of this behandlungen.
	 *
	 * @return the ID of this behandlungen
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the medikament_id of this behandlungen.
	 *
	 * @return the medikament_id of this behandlungen
	 */
	@Override
	public long getMedikament_id() {
		return model.getMedikament_id();
	}

	/**
	 * Returns the primary key of this behandlungen.
	 *
	 * @return the primary key of this behandlungen
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
	 * Sets the beginn of this behandlungen.
	 *
	 * @param beginn the beginn of this behandlungen
	 */
	@Override
	public void setBeginn(Date beginn) {
		model.setBeginn(beginn);
	}

	/**
	 * Sets the bienenvolk_id of this behandlungen.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this behandlungen
	 */
	@Override
	public void setBienenvolk_id(long bienenvolk_id) {
		model.setBienenvolk_id(bienenvolk_id);
	}

	/**
	 * Sets the ende of this behandlungen.
	 *
	 * @param ende the ende of this behandlungen
	 */
	@Override
	public void setEnde(Date ende) {
		model.setEnde(ende);
	}

	/**
	 * Sets the ID of this behandlungen.
	 *
	 * @param id the ID of this behandlungen
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the medikament_id of this behandlungen.
	 *
	 * @param medikament_id the medikament_id of this behandlungen
	 */
	@Override
	public void setMedikament_id(long medikament_id) {
		model.setMedikament_id(medikament_id);
	}

	/**
	 * Sets the primary key of this behandlungen.
	 *
	 * @param primaryKey the primary key of this behandlungen
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected behandlungenWrapper wrap(behandlungen behandlungen) {
		return new behandlungenWrapper(behandlungen);
	}

	@Override
	public behandlungenWrapper cloneWithOriginalValues() {
		return this;
	}
}