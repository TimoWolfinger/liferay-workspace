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

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the gesundheitszeugnisse service. Represents a row in the &quot;gesundheitszeugnisse&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.gesundheitszeugnisseModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.gesundheitszeugnisseImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see gesundheitszeugnisse
 * @generated
 */
@ProviderType
public interface gesundheitszeugnisseModel
	extends BaseModel<gesundheitszeugnisse> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a gesundheitszeugnisse model instance should use the {@link gesundheitszeugnisse} interface instead.
	 */

	/**
	 * Returns the primary key of this gesundheitszeugnisse.
	 *
	 * @return the primary key of this gesundheitszeugnisse
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this gesundheitszeugnisse.
	 *
	 * @param primaryKey the primary key of this gesundheitszeugnisse
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the gesundheitszeugnisse_id of this gesundheitszeugnisse.
	 *
	 * @return the gesundheitszeugnisse_id of this gesundheitszeugnisse
	 */
	public long getGesundheitszeugnisse_id();

	/**
	 * Sets the gesundheitszeugnisse_id of this gesundheitszeugnisse.
	 *
	 * @param gesundheitszeugnisse_id the gesundheitszeugnisse_id of this gesundheitszeugnisse
	 */
	public void setGesundheitszeugnisse_id(long gesundheitszeugnisse_id);

	/**
	 * Returns the seriennummer_lt_form of this gesundheitszeugnisse.
	 *
	 * @return the seriennummer_lt_form of this gesundheitszeugnisse
	 */
	@AutoEscape
	public String getSeriennummer_lt_form();

	/**
	 * Sets the seriennummer_lt_form of this gesundheitszeugnisse.
	 *
	 * @param seriennummer_lt_form the seriennummer_lt_form of this gesundheitszeugnisse
	 */
	public void setSeriennummer_lt_form(String seriennummer_lt_form);

	/**
	 * Returns the dokument of this gesundheitszeugnisse.
	 *
	 * @return the dokument of this gesundheitszeugnisse
	 */
	@AutoEscape
	public String getDokument();

	/**
	 * Sets the dokument of this gesundheitszeugnisse.
	 *
	 * @param dokument the dokument of this gesundheitszeugnisse
	 */
	public void setDokument(String dokument);

	/**
	 * Returns the ausstellungsdatum of this gesundheitszeugnisse.
	 *
	 * @return the ausstellungsdatum of this gesundheitszeugnisse
	 */
	public Date getAusstellungsdatum();

	/**
	 * Sets the ausstellungsdatum of this gesundheitszeugnisse.
	 *
	 * @param ausstellungsdatum the ausstellungsdatum of this gesundheitszeugnisse
	 */
	public void setAusstellungsdatum(Date ausstellungsdatum);

	/**
	 * Returns the dokument_dateityp of this gesundheitszeugnisse.
	 *
	 * @return the dokument_dateityp of this gesundheitszeugnisse
	 */
	@AutoEscape
	public String getDokument_dateityp();

	/**
	 * Sets the dokument_dateityp of this gesundheitszeugnisse.
	 *
	 * @param dokument_dateityp the dokument_dateityp of this gesundheitszeugnisse
	 */
	public void setDokument_dateityp(String dokument_dateityp);

	@Override
	public gesundheitszeugnisse cloneWithOriginalValues();

}