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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Beutemass service. Represents a row in the &quot;beutemass&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemassModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BeutemassImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Beutemass
 * @generated
 */
@ProviderType
public interface BeutemassModel extends BaseModel<Beutemass> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a beutemass model instance should use the {@link Beutemass} interface instead.
	 */

	/**
	 * Returns the primary key of this beutemass.
	 *
	 * @return the primary key of this beutemass
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this beutemass.
	 *
	 * @param primaryKey the primary key of this beutemass
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the beutemass_id of this beutemass.
	 *
	 * @return the beutemass_id of this beutemass
	 */
	public long getBeutemass_id();

	/**
	 * Sets the beutemass_id of this beutemass.
	 *
	 * @param beutemass_id the beutemass_id of this beutemass
	 */
	public void setBeutemass_id(long beutemass_id);

	/**
	 * Returns the name of this beutemass.
	 *
	 * @return the name of this beutemass
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this beutemass.
	 *
	 * @param name the name of this beutemass
	 */
	public void setName(String name);

	@Override
	public Beutemass cloneWithOriginalValues();

}