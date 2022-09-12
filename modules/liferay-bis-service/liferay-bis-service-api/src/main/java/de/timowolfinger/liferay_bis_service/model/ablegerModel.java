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

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the ableger service. Represents a row in the &quot;ableger&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.timowolfinger.liferay_bis_service.model.impl.ablegerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.timowolfinger.liferay_bis_service.model.impl.ablegerImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ableger
 * @generated
 */
@ProviderType
public interface ablegerModel extends BaseModel<ableger> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ableger model instance should use the {@link ableger} interface instead.
	 */

	/**
	 * Returns the primary key of this ableger.
	 *
	 * @return the primary key of this ableger
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ableger.
	 *
	 * @param primaryKey the primary key of this ableger
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this ableger.
	 *
	 * @return the ID of this ableger
	 */
	public long getId();

	/**
	 * Sets the ID of this ableger.
	 *
	 * @param id the ID of this ableger
	 */
	public void setId(long id);

	/**
	 * Returns the bezeichnung of this ableger.
	 *
	 * @return the bezeichnung of this ableger
	 */
	@AutoEscape
	public String getBezeichnung();

	/**
	 * Sets the bezeichnung of this ableger.
	 *
	 * @param bezeichnung the bezeichnung of this ableger
	 */
	public void setBezeichnung(String bezeichnung);

	/**
	 * Returns the datum_ablegerbildung of this ableger.
	 *
	 * @return the datum_ablegerbildung of this ableger
	 */
	public Date getDatum_ablegerbildung();

	/**
	 * Sets the datum_ablegerbildung of this ableger.
	 *
	 * @param datum_ablegerbildung the datum_ablegerbildung of this ableger
	 */
	public void setDatum_ablegerbildung(Date datum_ablegerbildung);

	/**
	 * Returns the muttervolk_id of this ableger.
	 *
	 * @return the muttervolk_id of this ableger
	 */
	public long getMuttervolk_id();

	/**
	 * Sets the muttervolk_id of this ableger.
	 *
	 * @param muttervolk_id the muttervolk_id of this ableger
	 */
	public void setMuttervolk_id(long muttervolk_id);

	/**
	 * Returns the erfolgreich of this ableger.
	 *
	 * @return the erfolgreich of this ableger
	 */
	public Boolean getErfolgreich();

	/**
	 * Sets the erfolgreich of this ableger.
	 *
	 * @param erfolgreich the erfolgreich of this ableger
	 */
	public void setErfolgreich(Boolean erfolgreich);

	/**
	 * Returns the abgeschlossen of this ableger.
	 *
	 * @return the abgeschlossen of this ableger
	 */
	public Boolean getAbgeschlossen();

	/**
	 * Sets the abgeschlossen of this ableger.
	 *
	 * @param abgeschlossen the abgeschlossen of this ableger
	 */
	public void setAbgeschlossen(Boolean abgeschlossen);

	@Override
	public ableger cloneWithOriginalValues();

}