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

import de.timowolfinger.liferay.beeInformationSystem.model.behandlungen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing behandlungen in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class behandlungenCacheModel
	implements CacheModel<behandlungen>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof behandlungenCacheModel)) {
			return false;
		}

		behandlungenCacheModel behandlungenCacheModel =
			(behandlungenCacheModel)object;

		if (behandlungen_id == behandlungenCacheModel.behandlungen_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, behandlungen_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{behandlungen_id=");
		sb.append(behandlungen_id);
		sb.append(", bienenvolk_id=");
		sb.append(bienenvolk_id);
		sb.append(", medikament_id=");
		sb.append(medikament_id);
		sb.append(", beginn=");
		sb.append(beginn);
		sb.append(", ende=");
		sb.append(ende);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public behandlungen toEntityModel() {
		behandlungenImpl behandlungenImpl = new behandlungenImpl();

		behandlungenImpl.setBehandlungen_id(behandlungen_id);
		behandlungenImpl.setBienenvolk_id(bienenvolk_id);
		behandlungenImpl.setMedikament_id(medikament_id);

		if (beginn == Long.MIN_VALUE) {
			behandlungenImpl.setBeginn(null);
		}
		else {
			behandlungenImpl.setBeginn(new Date(beginn));
		}

		if (ende == Long.MIN_VALUE) {
			behandlungenImpl.setEnde(null);
		}
		else {
			behandlungenImpl.setEnde(new Date(ende));
		}

		behandlungenImpl.resetOriginalValues();

		return behandlungenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		behandlungen_id = objectInput.readLong();

		bienenvolk_id = objectInput.readLong();

		medikament_id = objectInput.readLong();
		beginn = objectInput.readLong();
		ende = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(behandlungen_id);

		objectOutput.writeLong(bienenvolk_id);

		objectOutput.writeLong(medikament_id);
		objectOutput.writeLong(beginn);
		objectOutput.writeLong(ende);
	}

	public long behandlungen_id;
	public long bienenvolk_id;
	public long medikament_id;
	public long beginn;
	public long ende;

}