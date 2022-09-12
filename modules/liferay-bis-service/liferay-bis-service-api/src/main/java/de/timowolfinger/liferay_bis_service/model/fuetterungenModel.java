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

import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the fuetterungen service. Represents a row in the &quot;fuetterungen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.timowolfinger.liferay_bis_service.model.impl.fuetterungenModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.timowolfinger.liferay_bis_service.model.impl.fuetterungenImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see fuetterungen
 * @generated
 */
@ProviderType
public interface fuetterungenModel extends BaseModel<fuetterungen> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a fuetterungen model instance should use the {@link fuetterungen} interface instead.
	 */

	/**
	 * Returns the primary key of this fuetterungen.
	 *
	 * @return the primary key of this fuetterungen
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this fuetterungen.
	 *
	 * @param primaryKey the primary key of this fuetterungen
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this fuetterungen.
	 *
	 * @return the ID of this fuetterungen
	 */
	public long getId();

	/**
	 * Sets the ID of this fuetterungen.
	 *
	 * @param id the ID of this fuetterungen
	 */
	public void setId(long id);

	/**
	 * Returns the futtermittel_id of this fuetterungen.
	 *
	 * @return the futtermittel_id of this fuetterungen
	 */
	public long getFuttermittel_id();

	/**
	 * Sets the futtermittel_id of this fuetterungen.
	 *
	 * @param futtermittel_id the futtermittel_id of this fuetterungen
	 */
	public void setFuttermittel_id(long futtermittel_id);

	/**
	 * Returns the beginn of this fuetterungen.
	 *
	 * @return the beginn of this fuetterungen
	 */
	public Date getBeginn();

	/**
	 * Sets the beginn of this fuetterungen.
	 *
	 * @param beginn the beginn of this fuetterungen
	 */
	public void setBeginn(Date beginn);

	/**
	 * Returns the ende of this fuetterungen.
	 *
	 * @return the ende of this fuetterungen
	 */
	public Date getEnde();

	/**
	 * Sets the ende of this fuetterungen.
	 *
	 * @param ende the ende of this fuetterungen
	 */
	public void setEnde(Date ende);

	/**
	 * Returns the menge_kg of this fuetterungen.
	 *
	 * @return the menge_kg of this fuetterungen
	 */
	public long getMenge_kg();

	/**
	 * Sets the menge_kg of this fuetterungen.
	 *
	 * @param menge_kg the menge_kg of this fuetterungen
	 */
	public void setMenge_kg(long menge_kg);

	/**
	 * Returns the bienenvolk_id of this fuetterungen.
	 *
	 * @return the bienenvolk_id of this fuetterungen
	 */
	public long getBienenvolk_id();

	/**
	 * Sets the bienenvolk_id of this fuetterungen.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this fuetterungen
	 */
	public void setBienenvolk_id(long bienenvolk_id);

	@Override
	public fuetterungen cloneWithOriginalValues();

}