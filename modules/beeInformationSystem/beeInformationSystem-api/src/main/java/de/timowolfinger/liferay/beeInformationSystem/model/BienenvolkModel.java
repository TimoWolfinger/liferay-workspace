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
 * The base model interface for the Bienenvolk service. Represents a row in the &quot;bienenvolk&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvolkModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.BienenvolkImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Bienenvolk
 * @generated
 */
@ProviderType
public interface BienenvolkModel extends BaseModel<Bienenvolk> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a bienenvolk model instance should use the {@link Bienenvolk} interface instead.
	 */

	/**
	 * Returns the primary key of this bienenvolk.
	 *
	 * @return the primary key of this bienenvolk
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this bienenvolk.
	 *
	 * @param primaryKey the primary key of this bienenvolk
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the bienenvolk_id of this bienenvolk.
	 *
	 * @return the bienenvolk_id of this bienenvolk
	 */
	public long getBienenvolk_id();

	/**
	 * Sets the bienenvolk_id of this bienenvolk.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this bienenvolk
	 */
	public void setBienenvolk_id(long bienenvolk_id);

	/**
	 * Returns the bezeichnung of this bienenvolk.
	 *
	 * @return the bezeichnung of this bienenvolk
	 */
	@AutoEscape
	public String getBezeichnung();

	/**
	 * Sets the bezeichnung of this bienenvolk.
	 *
	 * @param bezeichnung the bezeichnung of this bienenvolk
	 */
	public void setBezeichnung(String bezeichnung);

	/**
	 * Returns the weisel_jahr of this bienenvolk.
	 *
	 * @return the weisel_jahr of this bienenvolk
	 */
	public long getWeisel_jahr();

	/**
	 * Sets the weisel_jahr of this bienenvolk.
	 *
	 * @param weisel_jahr the weisel_jahr of this bienenvolk
	 */
	public void setWeisel_jahr(long weisel_jahr);

	/**
	 * Returns the bemerkungen of this bienenvolk.
	 *
	 * @return the bemerkungen of this bienenvolk
	 */
	@AutoEscape
	public String getBemerkungen();

	/**
	 * Sets the bemerkungen of this bienenvolk.
	 *
	 * @param bemerkungen the bemerkungen of this bienenvolk
	 */
	public void setBemerkungen(String bemerkungen);

	/**
	 * Returns the bienenvolk_id of this bienenvolk.
	 *
	 * @return the bienenvolk_id of this bienenvolk
	 */
	public long getBienenvolk_id();

	/**
	 * Sets the bienenvolk_id of this bienenvolk.
	 *
	 * @param bienenvolk_id the bienenvolk_id of this bienenvolk
	 */
	public void setBienenvolk_id(long bienenvolk_id);

	/**
	 * Returns the bienenrasse_id of this bienenvolk.
	 *
	 * @return the bienenrasse_id of this bienenvolk
	 */
	public long getBienenrasse_id();

	/**
	 * Sets the bienenrasse_id of this bienenvolk.
	 *
	 * @param bienenrasse_id the bienenrasse_id of this bienenvolk
	 */
	public void setBienenrasse_id(long bienenrasse_id);

	/**
	 * Returns the beutemass_id of this bienenvolk.
	 *
	 * @return the beutemass_id of this bienenvolk
	 */
	public long getBeutemass_id();

	/**
	 * Sets the beutemass_id of this bienenvolk.
	 *
	 * @param beutemass_id the beutemass_id of this bienenvolk
	 */
	public void setBeutemass_id(long beutemass_id);

	/**
	 * Returns the geo_coordinaten of this bienenvolk.
	 *
	 * @return the geo_coordinaten of this bienenvolk
	 */
	@AutoEscape
	public String getGeo_coordinaten();

	/**
	 * Sets the geo_coordinaten of this bienenvolk.
	 *
	 * @param geo_coordinaten the geo_coordinaten of this bienenvolk
	 */
	public void setGeo_coordinaten(String geo_coordinaten);

	/**
	 * Returns the anschaffung_ableger_jahr of this bienenvolk.
	 *
	 * @return the anschaffung_ableger_jahr of this bienenvolk
	 */
	public int getAnschaffung_ableger_jahr();

	/**
	 * Sets the anschaffung_ableger_jahr of this bienenvolk.
	 *
	 * @param anschaffung_ableger_jahr the anschaffung_ableger_jahr of this bienenvolk
	 */
	public void setAnschaffung_ableger_jahr(int anschaffung_ableger_jahr);

	/**
	 * Returns the aktiv of this bienenvolk.
	 *
	 * @return the aktiv of this bienenvolk
	 */
	public Boolean getAktiv();

	/**
	 * Sets the aktiv of this bienenvolk.
	 *
	 * @param aktiv the aktiv of this bienenvolk
	 */
	public void setAktiv(Boolean aktiv);

	/**
	 * Returns the aufloesung_tod_jahr of this bienenvolk.
	 *
	 * @return the aufloesung_tod_jahr of this bienenvolk
	 */
	public int getAufloesung_tod_jahr();

	/**
	 * Sets the aufloesung_tod_jahr of this bienenvolk.
	 *
	 * @param aufloesung_tod_jahr the aufloesung_tod_jahr of this bienenvolk
	 */
	public void setAufloesung_tod_jahr(int aufloesung_tod_jahr);

	/**
	 * Returns the gesundheitszeugnis_id of this bienenvolk.
	 *
	 * @return the gesundheitszeugnis_id of this bienenvolk
	 */
	public long getGesundheitszeugnis_id();

	/**
	 * Sets the gesundheitszeugnis_id of this bienenvolk.
	 *
	 * @param gesundheitszeugnis_id the gesundheitszeugnis_id of this bienenvolk
	 */
	public void setGesundheitszeugnis_id(long gesundheitszeugnis_id);

	@Override
	public Bienenvolk cloneWithOriginalValues();

}