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
 * This class is a wrapper for {@link fuetterungen}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see fuetterungen
 * @generated
 */
public class fuetterungenWrapper
	extends BaseModelWrapper<fuetterungen>
	implements fuetterungen, ModelWrapper<fuetterungen> {

	public fuetterungenWrapper(fuetterungen fuetterungen) {
		super(fuetterungen);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("futtermittel_id", getFuttermittel_id());
		attributes.put("beginn", getBeginn());
		attributes.put("ende", getEnde());
		attributes.put("menge_kg", getMenge_kg());
		attributes.put("bienenvolk_id", getBienenvolk_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long futtermittel_id = (Long)attributes.get("futtermittel_id");

		if (futtermittel_id != null) {
			setFuttermittel_id(futtermittel_id);
		}

		Date beginn = (Date)attributes.get("beginn");

		if (beginn != null) {
			setBeginn(beginn);
		}

		Date ende = (Date)attributes.get("ende");

		if (ende != null) {
			setEnde(ende);
		}

		Long menge_kg = (Long)attributes.get("menge_kg");

		if (menge_kg != null) {
			setMenge_kg(menge_kg);
		}

		Long bienenvolk_id = (Long)attributes.get("bienenvolk_id");

		if (bienenvolk_id != null) {
			setBienenvolk_id(bienenvolk_id);
		}
	}

	/**
	 * Returns the beginn of this fuetterungen.
	 *
	 * @return the beginn of this fuetterungen
	 */
	@Override
	public Date getBeginn() {
		return model.getBeginn();
	}

	/**
	 * Returns the bienenvolk_id of this fuetterungen.
	 *
	 * @return the bienenvolk_id of this fuetterungen
	 */
	@Override
	public long getBienenvolk_id() {
		return model.getBienenvolk_id();
	}

	/**
	 * Returns the ende of this fuetterungen.
	 *
	 * @return the ende of this fuetterungen
	 */
	@Override
	public Date getEnde() {
		return model.getEnde();
	}

	/**
	 * Returns the futtermittel_id of this fuetterungen.
	 *
	 * @return the futtermittel_id of this fuetterungen
	 */
	@Override
	public long getFuttermittel_id() {
		return model.getFuttermittel_id();
	}

	/**
	 * Returns the ID of this fuetterungen.
	 *
	 * @return the ID of this fuetterungen
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the menge_kg of this fuetterungen.
	 *
	 * @return the menge_kg of this fuetterungen
	 */
	@Override
	public long getMenge_kg() {
		return model.getMenge_kg();
	}

	/**
	 * Returns the primary key of this fuetterungen.
	 *
	 * @return the primary key of this fuetterungen
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
	 * Sets the beginn of this fuetterungen.
	 *
	 * @param beginn the beginn of this fuetterungen
	 */
	@Override
	public void setBeginn(Date beginn) {
		model.setBeginn(beginn);
	}

	/**
	 * Sets the bienenvolk_id of this fuetterungen.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this fuetterungen
	 */
	@Override
	public void setBienenvolk_id(long bienenvolk_id) {
		model.setBienenvolk_id(bienenvolk_id);
	}

	/**
	 * Sets the ende of this fuetterungen.
	 *
	 * @param ende the ende of this fuetterungen
	 */
	@Override
	public void setEnde(Date ende) {
		model.setEnde(ende);
	}

	/**
	 * Sets the futtermittel_id of this fuetterungen.
	 *
	 * @param futtermittel_id the futtermittel_id of this fuetterungen
	 */
	@Override
	public void setFuttermittel_id(long futtermittel_id) {
		model.setFuttermittel_id(futtermittel_id);
	}

	/**
	 * Sets the ID of this fuetterungen.
	 *
	 * @param id the ID of this fuetterungen
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the menge_kg of this fuetterungen.
	 *
	 * @param menge_kg the menge_kg of this fuetterungen
	 */
	@Override
	public void setMenge_kg(long menge_kg) {
		model.setMenge_kg(menge_kg);
	}

	/**
	 * Sets the primary key of this fuetterungen.
	 *
	 * @param primaryKey the primary key of this fuetterungen
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected fuetterungenWrapper wrap(fuetterungen fuetterungen) {
		return new fuetterungenWrapper(fuetterungen);
	}

	@Override
	public fuetterungenWrapper cloneWithOriginalValues() {
		return this;
	}
	
}