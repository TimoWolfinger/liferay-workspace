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

import de.timowolfinger.liferay.beeInformationSystem.model.trachten;
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
import de.timowolfinger.liferay.beeInformationSystem.service.trachtenLocalService;
import de.timowolfinger.liferay.beeInformationSystem.service.trachtenLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the trachten local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.timowolfinger.liferay.beeInformationSystem.service.impl.trachtenLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see de.timowolfinger.liferay.beeInformationSystem.service.impl.trachtenLocalServiceImpl
 * @generated
 */
public abstract class trachtenLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, trachtenLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>trachtenLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>trachtenLocalServiceUtil</code>.
	 */

	/**
	 * Adds the trachten to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect trachtenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param trachten the trachten
	 * @return the trachten that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public trachten addtrachten(trachten trachten) {
		trachten.setNew(true);

		return trachtenPersistence.update(trachten);
	}

	/**
	 * Creates a new trachten with the primary key. Does not add the trachten to the database.
	 *
	 * @param trachten_id the primary key for the new trachten
	 * @return the new trachten
	 */
	@Override
	@Transactional(enabled = false)
	public trachten createtrachten(long trachten_id) {
		return trachtenPersistence.create(trachten_id);
	}

	/**
	 * Deletes the trachten with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect trachtenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param trachten_id the primary key of the trachten
	 * @return the trachten that was removed
	 * @throws PortalException if a trachten with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public trachten deletetrachten(long trachten_id) throws PortalException {
		return trachtenPersistence.remove(trachten_id);
	}

	/**
	 * Deletes the trachten from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect trachtenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param trachten the trachten
	 * @return the trachten that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public trachten deletetrachten(trachten trachten) {
		return trachtenPersistence.remove(trachten);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return trachtenPersistence.dslQuery(dslQuery);
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
			trachten.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return trachtenPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.trachtenModelImpl</code>.
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

		return trachtenPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.trachtenModelImpl</code>.
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

		return trachtenPersistence.findWithDynamicQuery(
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
		return trachtenPersistence.countWithDynamicQuery(dynamicQuery);
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

		return trachtenPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public trachten fetchtrachten(long trachten_id) {
		return trachtenPersistence.fetchByPrimaryKey(trachten_id);
	}

	/**
	 * Returns the trachten with the primary key.
	 *
	 * @param trachten_id the primary key of the trachten
	 * @return the trachten
	 * @throws PortalException if a trachten with the primary key could not be found
	 */
	@Override
	public trachten gettrachten(long trachten_id) throws PortalException {
		return trachtenPersistence.findByPrimaryKey(trachten_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(trachtenLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(trachten.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("trachten_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			trachtenLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(trachten.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"trachten_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(trachtenLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(trachten.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("trachten_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return trachtenPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return trachtenLocalService.deletetrachten((trachten)persistedModel);
	}

	@Override
	public BasePersistence<trachten> getBasePersistence() {
		return trachtenPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return trachtenPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the trachtens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.trachtenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of trachtens
	 * @param end the upper bound of the range of trachtens (not inclusive)
	 * @return the range of trachtens
	 */
	@Override
	public List<trachten> gettrachtens(int start, int end) {
		return trachtenPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of trachtens.
	 *
	 * @return the number of trachtens
	 */
	@Override
	public int gettrachtensCount() {
		return trachtenPersistence.countAll();
	}

	/**
	 * Updates the trachten in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect trachtenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param trachten the trachten
	 * @return the trachten that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public trachten updatetrachten(trachten trachten) {
		return trachtenPersistence.update(trachten);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			trachtenLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		trachtenLocalService = (trachtenLocalService)aopProxy;

		_setLocalServiceUtilService(trachtenLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return trachtenLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return trachten.class;
	}

	protected String getModelClassName() {
		return trachten.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = trachtenPersistence.getDataSource();

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
		trachtenLocalService trachtenLocalService) {

		try {
			Field field = trachtenLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, trachtenLocalService);
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
	protected medikamentePersistence medikamentePersistence;

	protected trachtenLocalService trachtenLocalService;

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