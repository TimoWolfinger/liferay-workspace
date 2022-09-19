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

		attributes.put("behandlungen_id", getBehandlungen_id());
		attributes.put("bienenvolk_id", getBienenvolk_id());
		attributes.put("medikament_id", getMedikament_id());
		attributes.put("beginn", getBeginn());
		attributes.put("ende", getEnde());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long behandlungen_id = (Long)attributes.get("behandlungen_id");

		if (behandlungen_id != null) {
			setBehandlungen_id(behandlungen_id);
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

	@Override
	public behandlungen cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
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
	 * Returns the behandlungen_id of this behandlungen.
	 *
	 * @return the behandlungen_id of this behandlungen
	 */
	@Override
	public long getBehandlungen_id() {
		return model.getBehandlungen_id();
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
	 * Sets the behandlungen_id of this behandlungen.
	 *
	 * @param behandlungen_id the behandlungen_id of this behandlungen
	 */
	@Override
	public void setBehandlungen_id(long behandlungen_id) {
		model.setBehandlungen_id(behandlungen_id);
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

}