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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import de.timowolfinger.liferay.beeInformationSystem.model.Behandlungen;
import de.timowolfinger.liferay.beeInformationSystem.model.BehandlungenModel;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Behandlungen service. Represents a row in the &quot;behandlungen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>BehandlungenModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BehandlungenImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BehandlungenImpl
 * @generated
 */
public class BehandlungenModelImpl
	extends BaseModelImpl<Behandlungen> implements BehandlungenModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a behandlungen model instance should use the <code>Behandlungen</code> interface instead.
	 */
	public static final String TABLE_NAME = "behandlungen";

	public static final Object[][] TABLE_COLUMNS = {
		{"behandlungen_id", Types.BIGINT}, {"bienenvolk_id", Types.BIGINT},
		{"dmedikament_id", Types.BIGINT}, {"beginn", Types.TIMESTAMP},
		{"ende", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("behandlungen_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("bienenvolk_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("dmedikament_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("beginn", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("ende", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table behandlungen (behandlungen_id LONG not null primary key,bienenvolk_id LONG,dmedikament_id LONG,beginn DATE null,ende DATE null)";

	public static final String TABLE_SQL_DROP = "drop table behandlungen";

	public static final String ORDER_BY_JPQL =
		" ORDER BY behandlungen.behandlungen_id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY behandlungen.behandlungen_id ASC";

	public static final String DATA_SOURCE = "extDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long BEHANDLUNGEN_ID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public BehandlungenModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _behandlungen_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBehandlungen_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _behandlungen_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Behandlungen.class;
	}

	@Override
	public String getModelClassName() {
		return Behandlungen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Behandlungen, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Behandlungen, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Behandlungen, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((Behandlungen)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Behandlungen, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Behandlungen, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Behandlungen)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Behandlungen, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Behandlungen, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Behandlungen, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Behandlungen, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Behandlungen, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Behandlungen, Object>>();
		Map<String, BiConsumer<Behandlungen, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Behandlungen, ?>>();

		attributeGetterFunctions.put(
			"behandlungen_id", Behandlungen::getBehandlungen_id);
		attributeSetterBiConsumers.put(
			"behandlungen_id",
			(BiConsumer<Behandlungen, Long>)Behandlungen::setBehandlungen_id);
		attributeGetterFunctions.put(
			"bienenvolk_id", Behandlungen::getBienenvolk_id);
		attributeSetterBiConsumers.put(
			"bienenvolk_id",
			(BiConsumer<Behandlungen, Long>)Behandlungen::setBienenvolk_id);
		attributeGetterFunctions.put(
			"medikament_id", Behandlungen::getMedikament_id);
		attributeSetterBiConsumers.put(
			"medikament_id",
			(BiConsumer<Behandlungen, Long>)Behandlungen::setMedikament_id);
		attributeGetterFunctions.put("beginn", Behandlungen::getBeginn);
		attributeSetterBiConsumers.put(
			"beginn", (BiConsumer<Behandlungen, Date>)Behandlungen::setBeginn);
		attributeGetterFunctions.put("ende", Behandlungen::getEnde);
		attributeSetterBiConsumers.put(
			"ende", (BiConsumer<Behandlungen, Date>)Behandlungen::setEnde);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getBehandlungen_id() {
		return _behandlungen_id;
	}

	@Override
	public void setBehandlungen_id(long behandlungen_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_behandlungen_id = behandlungen_id;
	}

	@Override
	public long getBienenvolk_id() {
		return _bienenvolk_id;
	}

	@Override
	public void setBienenvolk_id(long bienenvolk_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bienenvolk_id = bienenvolk_id;
	}

	@Override
	public long getMedikament_id() {
		return _medikament_id;
	}

	@Override
	public void setMedikament_id(long medikament_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_medikament_id = medikament_id;
	}

	@Override
	public Date getBeginn() {
		return _beginn;
	}

	@Override
	public void setBeginn(Date beginn) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_beginn = beginn;
	}

	@Override
	public Date getEnde() {
		return _ende;
	}

	@Override
	public void setEnde(Date ende) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ende = ende;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Behandlungen.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Behandlungen toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Behandlungen>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BehandlungenImpl behandlungenImpl = new BehandlungenImpl();

		behandlungenImpl.setBehandlungen_id(getBehandlungen_id());
		behandlungenImpl.setBienenvolk_id(getBienenvolk_id());
		behandlungenImpl.setMedikament_id(getMedikament_id());
		behandlungenImpl.setBeginn(getBeginn());
		behandlungenImpl.setEnde(getEnde());

		behandlungenImpl.resetOriginalValues();

		return behandlungenImpl;
	}

	@Override
	public Behandlungen cloneWithOriginalValues() {
		BehandlungenImpl behandlungenImpl = new BehandlungenImpl();

		behandlungenImpl.setBehandlungen_id(
			this.<Long>getColumnOriginalValue("behandlungen_id"));
		behandlungenImpl.setBienenvolk_id(
			this.<Long>getColumnOriginalValue("bienenvolk_id"));
		behandlungenImpl.setMedikament_id(
			this.<Long>getColumnOriginalValue("dmedikament_id"));
		behandlungenImpl.setBeginn(this.<Date>getColumnOriginalValue("beginn"));
		behandlungenImpl.setEnde(this.<Date>getColumnOriginalValue("ende"));

		return behandlungenImpl;
	}

	@Override
	public int compareTo(Behandlungen behandlungen) {
		int value = 0;

		if (getBehandlungen_id() < behandlungen.getBehandlungen_id()) {
			value = -1;
		}
		else if (getBehandlungen_id() > behandlungen.getBehandlungen_id()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Behandlungen)) {
			return false;
		}

		Behandlungen behandlungen = (Behandlungen)object;

		long primaryKey = behandlungen.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Behandlungen> toCacheModel() {
		BehandlungenCacheModel behandlungenCacheModel =
			new BehandlungenCacheModel();

		behandlungenCacheModel.behandlungen_id = getBehandlungen_id();

		behandlungenCacheModel.bienenvolk_id = getBienenvolk_id();

		behandlungenCacheModel.medikament_id = getMedikament_id();

		Date beginn = getBeginn();

		if (beginn != null) {
			behandlungenCacheModel.beginn = beginn.getTime();
		}
		else {
			behandlungenCacheModel.beginn = Long.MIN_VALUE;
		}

		Date ende = getEnde();

		if (ende != null) {
			behandlungenCacheModel.ende = ende.getTime();
		}
		else {
			behandlungenCacheModel.ende = Long.MIN_VALUE;
		}

		return behandlungenCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Behandlungen, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Behandlungen, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Behandlungen, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Behandlungen)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Behandlungen, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Behandlungen, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Behandlungen, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Behandlungen)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Behandlungen>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Behandlungen.class, ModelWrapper.class);

	}

	private long _behandlungen_id;
	private long _bienenvolk_id;
	private long _medikament_id;
	private Date _beginn;
	private Date _ende;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Behandlungen, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Behandlungen)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("behandlungen_id", _behandlungen_id);
		_columnOriginalValues.put("bienenvolk_id", _bienenvolk_id);
		_columnOriginalValues.put("dmedikament_id", _medikament_id);
		_columnOriginalValues.put("beginn", _beginn);
		_columnOriginalValues.put("ende", _ende);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("dmedikament_id", "medikament_id");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("behandlungen_id", 1L);

		columnBitmasks.put("bienenvolk_id", 2L);

		columnBitmasks.put("dmedikament_id", 4L);

		columnBitmasks.put("beginn", 8L);

		columnBitmasks.put("ende", 16L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Behandlungen _escapedModel;

}