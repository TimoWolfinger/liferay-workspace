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
 * This class is a wrapper for {@link Behandlung}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Behandlung
 * @generated
 */
public class BehandlungWrapper
	extends BaseModelWrapper<Behandlung>
	implements Behandlung, ModelWrapper<Behandlung> {

	public BehandlungWrapper(Behandlung behandlung) {
		super(behandlung);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("behandlung_id", getBehandlung_id());
		attributes.put("bienenvolk_id", getBienenvolk_id());
		attributes.put("medikament_id", getMedikament_id());
		attributes.put("beginn", getBeginn());
		attributes.put("ende", getEnde());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long behandlung_id = (Long)attributes.get("behandlung_id");

		if (behandlung_id != null) {
			setBehandlung_id(behandlung_id);
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
	public Behandlung cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the beginn of this behandlung.
	 *
	 * @return the beginn of this behandlung
	 */
	@Override
	public Date getBeginn() {
		return model.getBeginn();
	}

	/**
	 * Returns the behandlung_id of this behandlung.
	 *
	 * @return the behandlung_id of this behandlung
	 */
	@Override
	public long getBehandlung_id() {
		return model.getBehandlung_id();
	}

	/**
	 * Returns the bienenvolk_id of this behandlung.
	 *
	 * @return the bienenvolk_id of this behandlung
	 */
	@Override
	public long getBienenvolk_id() {
		return model.getBienenvolk_id();
	}

	/**
	 * Returns the ende of this behandlung.
	 *
	 * @return the ende of this behandlung
	 */
	@Override
	public Date getEnde() {
		return model.getEnde();
	}

	/**
	 * Returns the medikament_id of this behandlung.
	 *
	 * @return the medikament_id of this behandlung
	 */
	@Override
	public long getMedikament_id() {
		return model.getMedikament_id();
	}

	/**
	 * Returns the primary key of this behandlung.
	 *
	 * @return the primary key of this behandlung
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
	 * Sets the beginn of this behandlung.
	 *
	 * @param beginn the beginn of this behandlung
	 */
	@Override
	public void setBeginn(Date beginn) {
		model.setBeginn(beginn);
	}

	/**
	 * Sets the behandlung_id of this behandlung.
	 *
	 * @param behandlung_id the behandlung_id of this behandlung
	 */
	@Override
	public void setBehandlung_id(long behandlung_id) {
		model.setBehandlung_id(behandlung_id);
	}

	/**
	 * Sets the bienenvolk_id of this behandlung.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this behandlung
	 */
	@Override
	public void setBienenvolk_id(long bienenvolk_id) {
		model.setBienenvolk_id(bienenvolk_id);
	}

	/**
	 * Sets the ende of this behandlung.
	 *
	 * @param ende the ende of this behandlung
	 */
	@Override
	public void setEnde(Date ende) {
		model.setEnde(ende);
	}

	/**
	 * Sets the medikament_id of this behandlung.
	 *
	 * @param medikament_id the medikament_id of this behandlung
	 */
	@Override
	public void setMedikament_id(long medikament_id) {
		model.setMedikament_id(medikament_id);
	}

	/**
	 * Sets the primary key of this behandlung.
	 *
	 * @param primaryKey the primary key of this behandlung
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected BehandlungWrapper wrap(Behandlung behandlung) {
		return new BehandlungWrapper(behandlung);
	}

}