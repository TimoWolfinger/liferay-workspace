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
 * The base model interface for the Voelkerentwicklung service. Represents a row in the &quot;voelkerentwicklung&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.VoelkerentwicklungModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.VoelkerentwicklungImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Voelkerentwicklung
 * @generated
 */
@ProviderType
public interface VoelkerentwicklungModel extends BaseModel<Voelkerentwicklung> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a voelkerentwicklung model instance should use the {@link Voelkerentwicklung} interface instead.
	 */

	/**
	 * Returns the primary key of this voelkerentwicklung.
	 *
	 * @return the primary key of this voelkerentwicklung
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this voelkerentwicklung.
	 *
	 * @param primaryKey the primary key of this voelkerentwicklung
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the voelkerentwicklung_id of this voelkerentwicklung.
	 *
	 * @return the voelkerentwicklung_id of this voelkerentwicklung
	 */
	public long getVoelkerentwicklung_id();

	/**
	 * Sets the voelkerentwicklung_id of this voelkerentwicklung.
	 *
	 * @param voelkerentwicklung_id the voelkerentwicklung_id of this voelkerentwicklung
	 */
	public void setVoelkerentwicklung_id(long voelkerentwicklung_id);

	/**
	 * Returns the anzahl_bebrueteter_rahmen of this voelkerentwicklung.
	 *
	 * @return the anzahl_bebrueteter_rahmen of this voelkerentwicklung
	 */
	public float getAnzahl_bebrueteter_rahmen();

	/**
	 * Sets the anzahl_bebrueteter_rahmen of this voelkerentwicklung.
	 *
	 * @param anzahl_bebrueteter_rahmen the anzahl_bebrueteter_rahmen of this voelkerentwicklung
	 */
	public void setAnzahl_bebrueteter_rahmen(float anzahl_bebrueteter_rahmen);

	/**
	 * Returns the abschaetzung_anzahl_individuen of this voelkerentwicklung.
	 *
	 * @return the abschaetzung_anzahl_individuen of this voelkerentwicklung
	 */
	public long getAbschaetzung_anzahl_individuen();

	/**
	 * Sets the abschaetzung_anzahl_individuen of this voelkerentwicklung.
	 *
	 * @param abschaetzung_anzahl_individuen the abschaetzung_anzahl_individuen of this voelkerentwicklung
	 */
	public void setAbschaetzung_anzahl_individuen(
		long abschaetzung_anzahl_individuen);

	/**
	 * Returns the bienenvolk_id of this voelkerentwicklung.
	 *
	 * @return the bienenvolk_id of this voelkerentwicklung
	 */
	public long getBienenvolk_id();

	/**
	 * Sets the bienenvolk_id of this voelkerentwicklung.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this voelkerentwicklung
	 */
	public void setBienenvolk_id(long bienenvolk_id);

	/**
	 * Returns the datum of this voelkerentwicklung.
	 *
	 * @return the datum of this voelkerentwicklung
	 */
	public Date getDatum();

	/**
	 * Sets the datum of this voelkerentwicklung.
	 *
	 * @param datum the datum of this voelkerentwicklung
	 */
	public void setDatum(Date datum);

	/**
	 * Returns the stockwaage_gewicht_kg of this voelkerentwicklung.
	 *
	 * @return the stockwaage_gewicht_kg of this voelkerentwicklung
	 */
	public float getStockwaage_gewicht_kg();

	/**
	 * Sets the stockwaage_gewicht_kg of this voelkerentwicklung.
	 *
	 * @param stockwaage_gewicht_kg the stockwaage_gewicht_kg of this voelkerentwicklung
	 */
	public void setStockwaage_gewicht_kg(float stockwaage_gewicht_kg);

	@Override
	public Voelkerentwicklung cloneWithOriginalValues();

}