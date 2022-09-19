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

import de.timowolfinger.liferay.beeInformationSystem.model.bienenrassen;
import de.timowolfinger.liferay.beeInformationSystem.service.bienenrassenLocalService;
import de.timowolfinger.liferay.beeInformationSystem.service.bienenrassenLocalServiceUtil;
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
 * Provides the base implementation for the bienenrassen local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.timowolfinger.liferay.beeInformationSystem.service.impl.bienenrassenLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see de.timowolfinger.liferay.beeInformationSystem.service.impl.bienenrassenLocalServiceImpl
 * @generated
 */
public abstract class bienenrassenLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, bienenrassenLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>bienenrassenLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>bienenrassenLocalServiceUtil</code>.
	 */

	/**
	 * Adds the bienenrassen to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bienenrassenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrassen the bienenrassen
	 * @return the bienenrassen that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public bienenrassen addbienenrassen(bienenrassen bienenrassen) {
		bienenrassen.setNew(true);

		return bienenrassenPersistence.update(bienenrassen);
	}

	/**
	 * Creates a new bienenrassen with the primary key. Does not add the bienenrassen to the database.
	 *
	 * @param bienenrassen_id the primary key for the new bienenrassen
	 * @return the new bienenrassen
	 */
	@Override
	@Transactional(enabled = false)
	public bienenrassen createbienenrassen(long bienenrassen_id) {
		return bienenrassenPersistence.create(bienenrassen_id);
	}

	/**
	 * Deletes the bienenrassen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bienenrassenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrassen_id the primary key of the bienenrassen
	 * @return the bienenrassen that was removed
	 * @throws PortalException if a bienenrassen with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public bienenrassen deletebienenrassen(long bienenrassen_id)
		throws PortalException {

		return bienenrassenPersistence.remove(bienenrassen_id);
	}

	/**
	 * Deletes the bienenrassen from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bienenrassenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrassen the bienenrassen
	 * @return the bienenrassen that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public bienenrassen deletebienenrassen(bienenrassen bienenrassen) {
		return bienenrassenPersistence.remove(bienenrassen);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return bienenrassenPersistence.dslQuery(dslQuery);
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
			bienenrassen.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return bienenrassenPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.bienenrassenModelImpl</code>.
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

		return bienenrassenPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.bienenrassenModelImpl</code>.
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

		return bienenrassenPersistence.findWithDynamicQuery(
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
		return bienenrassenPersistence.countWithDynamicQuery(dynamicQuery);
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

		return bienenrassenPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public bienenrassen fetchbienenrassen(long bienenrassen_id) {
		return bienenrassenPersistence.fetchByPrimaryKey(bienenrassen_id);
	}

	/**
	 * Returns the bienenrassen with the primary key.
	 *
	 * @param bienenrassen_id the primary key of the bienenrassen
	 * @return the bienenrassen
	 * @throws PortalException if a bienenrassen with the primary key could not be found
	 */
	@Override
	public bienenrassen getbienenrassen(long bienenrassen_id)
		throws PortalException {

		return bienenrassenPersistence.findByPrimaryKey(bienenrassen_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(bienenrassenLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(bienenrassen.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("bienenrassen_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			bienenrassenLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(bienenrassen.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"bienenrassen_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(bienenrassenLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(bienenrassen.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("bienenrassen_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return bienenrassenPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return bienenrassenLocalService.deletebienenrassen(
			(bienenrassen)persistedModel);
	}

	@Override
	public BasePersistence<bienenrassen> getBasePersistence() {
		return bienenrassenPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return bienenrassenPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the bienenrassens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>de.timowolfinger.liferay.beeInformationSystem.model.impl.bienenrassenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bienenrassens
	 * @param end the upper bound of the range of bienenrassens (not inclusive)
	 * @return the range of bienenrassens
	 */
	@Override
	public List<bienenrassen> getbienenrassens(int start, int end) {
		return bienenrassenPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of bienenrassens.
	 *
	 * @return the number of bienenrassens
	 */
	@Override
	public int getbienenrassensCount() {
		return bienenrassenPersistence.countAll();
	}

	/**
	 * Updates the bienenrassen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bienenrassenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bienenrassen the bienenrassen
	 * @return the bienenrassen that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public bienenrassen updatebienenrassen(bienenrassen bienenrassen) {
		return bienenrassenPersistence.update(bienenrassen);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			bienenrassenLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		bienenrassenLocalService = (bienenrassenLocalService)aopProxy;

		_setLocalServiceUtilService(bienenrassenLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return bienenrassenLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return bienenrassen.class;
	}

	protected String getModelClassName() {
		return bienenrassen.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = bienenrassenPersistence.getDataSource();

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
		bienenrassenLocalService bienenrassenLocalService) {

		try {
			Field field = bienenrassenLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, bienenrassenLocalService);
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

	protected bienenrassenLocalService bienenrassenLocalService;

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