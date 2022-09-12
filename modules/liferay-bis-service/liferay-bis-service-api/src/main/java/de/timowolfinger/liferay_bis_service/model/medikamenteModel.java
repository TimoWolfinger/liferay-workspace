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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the medikamente service. Represents a row in the &quot;medikamente&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.timowolfinger.liferay_bis_service.model.impl.medikamenteModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.timowolfinger.liferay_bis_service.model.impl.medikamenteImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see medikamente
 * @generated
 */
@ProviderType
public interface medikamenteModel extends BaseModel<medikamente> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a medikamente model instance should use the {@link medikamente} interface instead.
	 */

	/**
	 * Returns the primary key of this medikamente.
	 *
	 * @return the primary key of this medikamente
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this medikamente.
	 *
	 * @param primaryKey the primary key of this medikamente
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this medikamente.
	 *
	 * @return the ID of this medikamente
	 */
	public long getId();

	/**
	 * Sets the ID of this medikamente.
	 *
	 * @param id the ID of this medikamente
	 */
	public void setId(long id);

	/**
	 * Returns the name of this medikamente.
	 *
	 * @return the name of this medikamente
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this medikamente.
	 *
	 * @param name the name of this medikamente
	 */
	public void setName(String name);

	/**
	 * Returns the hersteller_id of this medikamente.
	 *
	 * @return the hersteller_id of this medikamente
	 */
	public long getHersteller_id();

	/**
	 * Sets the hersteller_id of this medikamente.
	 *
	 * @param hersteller_id the hersteller_id of this medikamente
	 */
	public void setHersteller_id(long hersteller_id);

	/**
	 * Returns the dosierung of this medikamente.
	 *
	 * @return the dosierung of this medikamente
	 */
	@AutoEscape
	public String getDosierung();

	/**
	 * Sets the dosierung of this medikamente.
	 *
	 * @param dosierung the dosierung of this medikamente
	 */
	public void setDosierung(String dosierung);

	@Override
	public medikamente cloneWithOriginalValues();

}