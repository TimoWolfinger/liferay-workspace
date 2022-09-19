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

package de.timowolfinger.liferay.beeInformationSystem.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import de.timowolfinger.liferay.beeInformationSystem.model.voelkerentwicklung;

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

		if (voelkerentwicklung_id ==
				voelkerentwicklungCacheModel.voelkerentwicklung_id) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, voelkerentwicklung_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{voelkerentwicklung_id=");
		sb.append(voelkerentwicklung_id);
		sb.append(", anzahl_bebrueteter_rahmen=");
		sb.append(anzahl_bebrueteter_rahmen);
		sb.append(", abschaetzung_anzahl_individuen=");
		sb.append(abschaetzung_anzahl_individuen);
		sb.append(", bienenvoelker_id=");
		sb.append(bienenvoelker_id);
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

		voelkerentwicklungImpl.setVoelkerentwicklung_id(voelkerentwicklung_id);
		voelkerentwicklungImpl.setAnzahl_bebrueteter_rahmen(
			anzahl_bebrueteter_rahmen);
		voelkerentwicklungImpl.setAbschaetzung_anzahl_individuen(
			abschaetzung_anzahl_individuen);
		voelkerentwicklungImpl.setBienenvoelker_id(bienenvoelker_id);

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
		voelkerentwicklung_id = objectInput.readLong();

		anzahl_bebrueteter_rahmen = objectInput.readFloat();

		abschaetzung_anzahl_individuen = objectInput.readLong();

		bienenvoelker_id = objectInput.readLong();
		datum = objectInput.readLong();

		stockwaage_gewicht_kg = objectInput.readFloat();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(voelkerentwicklung_id);

		objectOutput.writeFloat(anzahl_bebrueteter_rahmen);

		objectOutput.writeLong(abschaetzung_anzahl_individuen);

		objectOutput.writeLong(bienenvoelker_id);
		objectOutput.writeLong(datum);

		objectOutput.writeFloat(stockwaage_gewicht_kg);
	}

	public long voelkerentwicklung_id;
	public float anzahl_bebrueteter_rahmen;
	public long abschaetzung_anzahl_individuen;
	public long bienenvoelker_id;
	public long datum;
	public float stockwaage_gewicht_kg;

}