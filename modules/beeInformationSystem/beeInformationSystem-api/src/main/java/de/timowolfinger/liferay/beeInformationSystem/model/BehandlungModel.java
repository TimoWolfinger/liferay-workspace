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
 * The base model interface for the Behandlung service. Represents a row in the &quot;behandlung&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BehandlungModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BehandlungImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Behandlung
 * @generated
 */
@ProviderType
public interface BehandlungModel extends BaseModel<Behandlung> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a behandlung model instance should use the {@link Behandlung} interface instead.
	 */

	/**
	 * Returns the primary key of this behandlung.
	 *
	 * @return the primary key of this behandlung
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this behandlung.
	 *
	 * @param primaryKey the primary key of this behandlung
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the behandlung_id of this behandlung.
	 *
	 * @return the behandlung_id of this behandlung
	 */
	public long getBehandlung_id();

	/**
	 * Sets the behandlung_id of this behandlung.
	 *
	 * @param behandlung_id the behandlung_id of this behandlung
	 */
	public void setBehandlung_id(long behandlung_id);

	/**
	 * Returns the bienenvolk_id of this behandlung.
	 *
	 * @return the bienenvolk_id of this behandlung
	 */
	public long getBienenvolk_id();

	/**
	 * Sets the bienenvolk_id of this behandlung.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this behandlung
	 */
	public void setBienenvolk_id(long bienenvolk_id);

	/**
	 * Returns the medikament_id of this behandlung.
	 *
	 * @return the medikament_id of this behandlung
	 */
	public long getMedikament_id();

	/**
	 * Sets the medikament_id of this behandlung.
	 *
	 * @param medikament_id the medikament_id of this behandlung
	 */
	public void setMedikament_id(long medikament_id);

	/**
	 * Returns the beginn of this behandlung.
	 *
	 * @return the beginn of this behandlung
	 */
	public Date getBeginn();

	/**
	 * Sets the beginn of this behandlung.
	 *
	 * @param beginn the beginn of this behandlung
	 */
	public void setBeginn(Date beginn);

	/**
	 * Returns the ende of this behandlung.
	 *
	 * @return the ende of this behandlung
	 */
	public Date getEnde();

	/**
	 * Sets the ende of this behandlung.
	 *
	 * @param ende the ende of this behandlung
	 */
	public void setEnde(Date ende);

	@Override
	public Behandlung cloneWithOriginalValues();

}