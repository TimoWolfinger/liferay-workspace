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
 * The base model interface for the Honigernten service. Represents a row in the &quot;honigernten&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigerntenModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.HonigerntenImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Honigernten
 * @generated
 */
@ProviderType
public interface HonigerntenModel extends BaseModel<Honigernten> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a honigernten model instance should use the {@link Honigernten} interface instead.
	 */

	/**
	 * Returns the primary key of this honigernten.
	 *
	 * @return the primary key of this honigernten
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this honigernten.
	 *
	 * @param primaryKey the primary key of this honigernten
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the honigernten_id of this honigernten.
	 *
	 * @return the honigernten_id of this honigernten
	 */
	public long getHonigernten_id();

	/**
	 * Sets the honigernten_id of this honigernten.
	 *
	 * @param honigernten_id the honigernten_id of this honigernten
	 */
	public void setHonigernten_id(long honigernten_id);

	/**
	 * Returns the erntedatum of this honigernten.
	 *
	 * @return the erntedatum of this honigernten
	 */
	public Date getErntedatum();

	/**
	 * Sets the erntedatum of this honigernten.
	 *
	 * @param erntedatum the erntedatum of this honigernten
	 */
	public void setErntedatum(Date erntedatum);

	/**
	 * Returns the erntemenge_kg of this honigernten.
	 *
	 * @return the erntemenge_kg of this honigernten
	 */
	public int getErntemenge_kg();

	/**
	 * Sets the erntemenge_kg of this honigernten.
	 *
	 * @param erntemenge_kg the erntemenge_kg of this honigernten
	 */
	public void setErntemenge_kg(int erntemenge_kg);

	/**
	 * Returns the bienenvolk_id of this honigernten.
	 *
	 * @return the bienenvolk_id of this honigernten
	 */
	public long getBienenvolk_id();

	/**
	 * Sets the bienenvolk_id of this honigernten.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this honigernten
	 */
	public void setBienenvolk_id(long bienenvolk_id);

	/**
	 * Returns the tracht_id of this honigernten.
	 *
	 * @return the tracht_id of this honigernten
	 */
	public long getTracht_id();

	/**
	 * Sets the tracht_id of this honigernten.
	 *
	 * @param tracht_id the tracht_id of this honigernten
	 */
	public void setTracht_id(long tracht_id);

	@Override
	public Honigernten cloneWithOriginalValues();

}