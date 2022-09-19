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

package de.timowolfinger.liferay.beeInformationSystem.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import de.timowolfinger.liferay.beeInformationSystem.model.medikamente;
import de.timowolfinger.liferay.beeInformationSystem.service.medikamenteService;
import de.timowolfinger.liferay.beeInformationSystem.service.medikamenteServiceUtil;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.ablegerPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.behandlungenPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.beutemassePersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.bienenrassenPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.bienenvoelkerPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.fuetterungenPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.futtermittelPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.gesundheitszeugnissePersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.herstellerPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.honigerntenPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.medikamentePersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.trachtenPersistence;
import de.timowolfinger.liferay.beeInformationSystem.service.persistence.voelkerentwicklungPersistence;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the medikamente remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.timowolfinger.liferay.beeInformationSystem.service.impl.medikamenteServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see de.timowolfinger.liferay.beeInformationSystem.service.impl.medikamenteServiceImpl
 * @generated
 */
public abstract class medikamenteServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, medikamenteService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>medikamenteService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>medikamenteServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			medikamenteService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		medikamenteService = (medikamenteService)aopProxy;

		_setServiceUtilService(medikamenteService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return medikamenteService.class.getName();
	}

	protected Class<?> getModelClass() {
		return medikamente.class;
	}

	protected String getModelClassName() {
		return medikamente.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = medikamentePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(medikamenteService medikamenteService) {
		try {
			Field field = medikamenteServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, medikamenteService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected ablegerPersistence ablegerPersistence;

	@Reference
	protected behandlungenPersistence behandlungenPersistence;

	@Reference
	protected beutemassePersistence beutemassePersistence;

	@Reference
	protected bienenrassenPersistence bienenrassenPersistence;

	@Reference
	protected bienenvoelkerPersistence bienenvoelkerPersistence;

	@Reference
	protected fuetterungenPersistence fuetterungenPersistence;

	@Reference
	protected futtermittelPersistence futtermittelPersistence;

	@Reference
	protected gesundheitszeugnissePersistence gesundheitszeugnissePersistence;

	@Reference
	protected herstellerPersistence herstellerPersistence;

	@Reference
	protected honigerntenPersistence honigerntenPersistence;

	@Reference
	protected de.timowolfinger.liferay.beeInformationSystem.service.
		medikamenteLocalService medikamenteLocalService;

	protected medikamenteService medikamenteService;

	@Reference
	protected medikamentePersistence medikamentePersistence;

	@Reference
	protected trachtenPersistence trachtenPersistence;

	@Reference
	protected voelkerentwicklungPersistence voelkerentwicklungPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

}