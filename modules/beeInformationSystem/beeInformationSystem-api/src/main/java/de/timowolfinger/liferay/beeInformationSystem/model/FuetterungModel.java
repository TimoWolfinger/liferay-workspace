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

import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Fuetterung service. Represents a row in the &quot;fuetterung&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.FuetterungImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Fuetterung
 * @generated
 */
@ProviderType
public interface FuetterungModel extends BaseModel<Fuetterung> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a fuetterung model instance should use the {@link Fuetterung} interface instead.
	 */

	/**
	 * Returns the primary key of this fuetterung.
	 *
	 * @return the primary key of this fuetterung
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this fuetterung.
	 *
	 * @param primaryKey the primary key of this fuetterung
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the fuetterung_id of this fuetterung.
	 *
	 * @return the fuetterung_id of this fuetterung
	 */
	public long getFuetterung_id();

	/**
	 * Sets the fuetterung_id of this fuetterung.
	 *
	 * @param fuetterung_id the fuetterung_id of this fuetterung
	 */
	public void setFuetterung_id(long fuetterung_id);

	/**
	 * Returns the futtermittel_id of this fuetterung.
	 *
	 * @return the futtermittel_id of this fuetterung
	 */
	public long getFuttermittel_id();

	/**
	 * Sets the futtermittel_id of this fuetterung.
	 *
	 * @param futtermittel_id the futtermittel_id of this fuetterung
	 */
	public void setFuttermittel_id(long futtermittel_id);

	/**
	 * Returns the beginn of this fuetterung.
	 *
	 * @return the beginn of this fuetterung
	 */
	public Date getBeginn();

	/**
	 * Sets the beginn of this fuetterung.
	 *
	 * @param beginn the beginn of this fuetterung
	 */
	public void setBeginn(Date beginn);

	/**
	 * Returns the ende of this fuetterung.
	 *
	 * @return the ende of this fuetterung
	 */
	public Date getEnde();

	/**
	 * Sets the ende of this fuetterung.
	 *
	 * @param ende the ende of this fuetterung
	 */
	public void setEnde(Date ende);

	/**
	 * Returns the menge_kg of this fuetterung.
	 *
	 * @return the menge_kg of this fuetterung
	 */
	public long getMenge_kg();

	/**
	 * Sets the menge_kg of this fuetterung.
	 *
	 * @param menge_kg the menge_kg of this fuetterung
	 */
	public void setMenge_kg(long menge_kg);

	/**
	 * Returns the bienenvolk_id of this fuetterung.
	 *
	 * @return the bienenvolk_id of this fuetterung
	 */
	public long getBienenvolk_id();

	/**
	 * Sets the bienenvolk_id of this fuetterung.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this fuetterung
	 */
	public void setBienenvolk_id(long bienenvolk_id);

	@Override
	public Fuetterung cloneWithOriginalValues();

}