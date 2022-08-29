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

package de.timowolfinger.liferay_bis_service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import de.timowolfinger.liferay_bis_service.model.voelkerentwicklung;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing voelkerentwicklung in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class voelkerentwicklungCacheModel
	implements CacheModel<voelkerentwicklung>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof voelkerentwicklungCacheModel)) {
			return false;
		}

		voelkerentwicklungCacheModel voelkerentwicklungCacheModel =
			(voelkerentwicklungCacheModel)object;

		if (id == voelkerentwicklungCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", anzahl_bebrueteter_rahmen=");
		sb.append(anzahl_bebrueteter_rahmen);
		sb.append(", abschaetzung_anzahl_individuen=");
		sb.append(abschaetzung_anzahl_individuen);
		sb.append(", bienenvolk_id=");
		sb.append(bienenvolk_id);
		sb.append(", datum=");
		sb.append(datum);
		sb.append(", stockwaage_gewicht_kg=");
		sb.append(stockwaage_gewicht_kg);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public voelkerentwicklung toEntityModel() {
		voelkerentwicklungImpl voelkerentwicklungImpl =
			new voelkerentwicklungImpl();

		voelkerentwicklungImpl.setId(id);
		voelkerentwicklungImpl.setAnzahl_bebrueteter_rahmen(
			anzahl_bebrueteter_rahmen);
		voelkerentwicklungImpl.setAbschaetzung_anzahl_individuen(
			abschaetzung_anzahl_individuen);
		voelkerentwicklungImpl.setBienenvolk_id(bienenvolk_id);

		if (datum == Long.MIN_VALUE) {
			voelkerentwicklungImpl.setDatum(null);
		}
		else {
			voelkerentwicklungImpl.setDatum(new Date(datum));
		}

		voelkerentwicklungImpl.setStockwaage_gewicht_kg(stockwaage_gewicht_kg);

		voelkerentwicklungImpl.resetOriginalValues();

		return voelkerentwicklungImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		anzahl_bebrueteter_rahmen = objectInput.readFloat();

		abschaetzung_anzahl_individuen = objectInput.readLong();

		bienenvolk_id = objectInput.readLong();
		datum = objectInput.readLong();

		stockwaage_gewicht_kg = objectInput.readFloat();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeFloat(anzahl_bebrueteter_rahmen);

		objectOutput.writeLong(abschaetzung_anzahl_individuen);

		objectOutput.writeLong(bienenvolk_id);
		objectOutput.writeLong(datum);

		objectOutput.writeFloat(stockwaage_gewicht_kg);
	}

	public long id;
	public float anzahl_bebrueteter_rahmen;
	public long abschaetzung_anzahl_individuen;
	public long bienenvolk_id;
	public long datum;
	public float stockwaage_gewicht_kg;

}