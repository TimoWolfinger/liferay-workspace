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
 * This class is a wrapper for {@link Fuetterung}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Fuetterung
 * @generated
 */
public class FuetterungWrapper
	extends BaseModelWrapper<Fuetterung>
	implements Fuetterung, ModelWrapper<Fuetterung> {

	public FuetterungWrapper(Fuetterung fuetterung) {
		super(fuetterung);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fuetterung_id", getFuetterung_id());
		attributes.put("futtermittel_id", getFuttermittel_id());
		attributes.put("beginn", getBeginn());
		attributes.put("ende", getEnde());
		attributes.put("menge_kg", getMenge_kg());
		attributes.put("bienenvolk_id", getBienenvolk_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fuetterung_id = (Long)attributes.get("fuetterung_id");

		if (fuetterung_id != null) {
			setFuetterung_id(fuetterung_id);
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

	@Override
	public Fuetterung cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the beginn of this fuetterung.
	 *
	 * @return the beginn of this fuetterung
	 */
	@Override
	public Date getBeginn() {
		return model.getBeginn();
	}

	/**
	 * Returns the bienenvolk_id of this fuetterung.
	 *
	 * @return the bienenvolk_id of this fuetterung
	 */
	@Override
	public long getBienenvolk_id() {
		return model.getBienenvolk_id();
	}

	/**
	 * Returns the ende of this fuetterung.
	 *
	 * @return the ende of this fuetterung
	 */
	@Override
	public Date getEnde() {
		return model.getEnde();
	}

	/**
	 * Returns the fuetterung_id of this fuetterung.
	 *
	 * @return the fuetterung_id of this fuetterung
	 */
	@Override
	public long getFuetterung_id() {
		return model.getFuetterung_id();
	}

	/**
	 * Returns the futtermittel_id of this fuetterung.
	 *
	 * @return the futtermittel_id of this fuetterung
	 */
	@Override
	public long getFuttermittel_id() {
		return model.getFuttermittel_id();
	}

	/**
	 * Returns the menge_kg of this fuetterung.
	 *
	 * @return the menge_kg of this fuetterung
	 */
	@Override
	public long getMenge_kg() {
		return model.getMenge_kg();
	}

	/**
	 * Returns the primary key of this fuetterung.
	 *
	 * @return the primary key of this fuetterung
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
	 * Sets the beginn of this fuetterung.
	 *
	 * @param beginn the beginn of this fuetterung
	 */
	@Override
	public void setBeginn(Date beginn) {
		model.setBeginn(beginn);
	}

	/**
	 * Sets the bienenvolk_id of this fuetterung.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this fuetterung
	 */
	@Override
	public void setBienenvolk_id(long bienenvolk_id) {
		model.setBienenvolk_id(bienenvolk_id);
	}

	/**
	 * Sets the ende of this fuetterung.
	 *
	 * @param ende the ende of this fuetterung
	 */
	@Override
	public void setEnde(Date ende) {
		model.setEnde(ende);
	}

	/**
	 * Sets the fuetterung_id of this fuetterung.
	 *
	 * @param fuetterung_id the fuetterung_id of this fuetterung
	 */
	@Override
	public void setFuetterung_id(long fuetterung_id) {
		model.setFuetterung_id(fuetterung_id);
	}

	/**
	 * Sets the futtermittel_id of this fuetterung.
	 *
	 * @param futtermittel_id the futtermittel_id of this fuetterung
	 */
	@Override
	public void setFuttermittel_id(long futtermittel_id) {
		model.setFuttermittel_id(futtermittel_id);
	}

	/**
	 * Sets the menge_kg of this fuetterung.
	 *
	 * @param menge_kg the menge_kg of this fuetterung
	 */
	@Override
	public void setMenge_kg(long menge_kg) {
		model.setMenge_kg(menge_kg);
	}

	/**
	 * Sets the primary key of this fuetterung.
	 *
	 * @param primaryKey the primary key of this fuetterung
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected FuetterungWrapper wrap(Fuetterung fuetterung) {
		return new FuetterungWrapper(fuetterung);
	}

}