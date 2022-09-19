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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import de.timowolfinger.liferay.beeInformationSystem.model.fuetterungen;
import de.timowolfinger.liferay.beeInformationSystem.service.fuetterungenLocalService;
import de.timowolfinger.liferay.beeInformationSystem.service.fuetterungenLocalServiceUtil;
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

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the fuetterungen local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.timowolfinger.liferay.beeInformationSystem.service.impl.fuetterungenLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see de.timowolfinger.liferay.beeInformationSystem.service.impl.fuetterungenLocalServiceImpl
 * @generated
 */
public abstract class fuetterungenLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, fuetterungenLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>fuetterungenLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>fuetterungenLocalServiceUtil</code>.
	 */

	/**
	 * Adds the fuetterungen to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect fuetterungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterungen the fuetterungen
	 * @return the fuetterungen that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public fuetterungen addfuetterungen(fuetterungen fuetterungen) {
		fuetterungen.setNew(true);

		return fuetterungenPersistence.update(fuetterungen);
	}

	/**
	 * Creates a new fuetterungen with the primary key. Does not add the fuetterungen to the database.
	 *
	 * @param fuetterungen_id the primary key for the new fuetterungen
	 * @return the new fuetterungen
	 */
	@Override
	@Transactional(enabled = false)
	public fuetterungen createfuetterungen(long fuetterungen_id) {
		return fuetterungenPersistence.create(fuetterungen_id);
	}

	/**
	 * Deletes the fuetterungen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect fuetterungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterungen_id the primary key of the fuetterungen
	 * @return the fuetterungen that was removed
	 * @throws PortalException if a fuetterungen with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public fuetterungen deletefuetterungen(long fuetterungen_id)
		throws PortalException {

		return fuetterungenPersistence.remove(fuetterungen_id);
	}

	/**
	 * Deletes the fuetterungen from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect fuetterungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterungen the fuetterungen
	 * @return the fuetterungen that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public fuetterungen deletefuetterungen(fuetterungen fuetterungen) {
		return fuetterungenPersistence.remove(fuetterungen);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return fuetterungenPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			fuetterungen.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return fuetterungenPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.fuetterungenModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return fuetterungenPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.fuetterungenModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return fuetterungenPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return fuetterungenPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return fuetterungenPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public fuetterungen fetchfuetterungen(long fuetterungen_id) {
		return fuetterungenPersistence.fetchByPrimaryKey(fuetterungen_id);
	}

	/**
	 * Returns the fuetterungen with the primary key.
	 *
	 * @param fuetterungen_id the primary key of the fuetterungen
	 * @return the fuetterungen
	 * @throws PortalException if a fuetterungen with the primary key could not be found
	 */
	@Override
	public fuetterungen getfuetterungen(long fuetterungen_id)
		throws PortalException {

		return fuetterungenPersistence.findByPrimaryKey(fuetterungen_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(fuetterungenLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(fuetterungen.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("fuetterungen_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			fuetterungenLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(fuetterungen.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"fuetterungen_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(fuetterungenLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(fuetterungen.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("fuetterungen_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return fuetterungenPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return fuetterungenLocalService.deletefuetterungen(
			(fuetterungen)persistedModel);
	}

	@Override
	public BasePersistence<fuetterungen> getBasePersistence() {
		return fuetterungenPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return fuetterungenPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the fuetterungens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.fuetterungenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fuetterungens
	 * @param end the upper bound of the range of fuetterungens (not inclusive)
	 * @return the range of fuetterungens
	 */
	@Override
	public List<fuetterungen> getfuetterungens(int start, int end) {
		return fuetterungenPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of fuetterungens.
	 *
	 * @return the number of fuetterungens
	 */
	@Override
	public int getfuetterungensCount() {
		return fuetterungenPersistence.countAll();
	}

	/**
	 * Updates the fuetterungen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect fuetterungenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fuetterungen the fuetterungen
	 * @return the fuetterungen that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public fuetterungen updatefuetterungen(fuetterungen fuetterungen) {
		return fuetterungenPersistence.update(fuetterungen);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			fuetterungenLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		fuetterungenLocalService = (fuetterungenLocalService)aopProxy;

		_setLocalServiceUtilService(fuetterungenLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return fuetterungenLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return fuetterungen.class;
	}

	protected String getModelClassName() {
		return fuetterungen.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = fuetterungenPersistence.getDataSource();

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

	private void _setLocalServiceUtilService(
		fuetterungenLocalService fuetterungenLocalService) {

		try {
			Field field = fuetterungenLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, fuetterungenLocalService);
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

	protected fuetterungenLocalService fuetterungenLocalService;

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
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}