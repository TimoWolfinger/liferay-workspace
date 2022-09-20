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

import de.timowolfinger.liferay.beeInformationSystem.model.Behandlung;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Behandlung in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BehandlungCacheModel
	implements CacheModel<Behandlung>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BehandlungCacheModel)) {
			return false;
		}

		BehandlungCacheModel behandlungCacheModel =
			(BehandlungCacheModel)object;

		if (behandlung_id == behandlungCacheModel.behandlung_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, behandlung_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{behandlung_id=");
		sb.append(behandlung_id);
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
	public Behandlung toEntityModel() {
		BehandlungImpl behandlungImpl = new BehandlungImpl();

		behandlungImpl.setBehandlung_id(behandlung_id);
		behandlungImpl.setBienenvolk_id(bienenvolk_id);
		behandlungImpl.setMedikament_id(medikament_id);

		if (beginn == Long.MIN_VALUE) {
			behandlungImpl.setBeginn(null);
		}
		else {
			behandlungImpl.setBeginn(new Date(beginn));
		}

		if (ende == Long.MIN_VALUE) {
			behandlungImpl.setEnde(null);
		}
		else {
			behandlungImpl.setEnde(new Date(ende));
		}

		behandlungImpl.resetOriginalValues();

		return behandlungImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		behandlung_id = objectInput.readLong();

		bienenvolk_id = objectInput.readLong();

		medikament_id = objectInput.readLong();
		beginn = objectInput.readLong();
		ende = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(behandlung_id);

		objectOutput.writeLong(bienenvolk_id);

		objectOutput.writeLong(medikament_id);
		objectOutput.writeLong(beginn);
		objectOutput.writeLong(ende);
	}

	public long behandlung_id;
	public long bienenvolk_id;
	public long medikament_id;
	public long beginn;
	public long ende;

}