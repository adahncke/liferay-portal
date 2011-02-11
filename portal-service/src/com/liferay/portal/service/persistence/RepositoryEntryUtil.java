/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.model.RepositoryEntry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the repository entry service. This utility wraps {@link RepositoryEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RepositoryEntryPersistence
 * @see RepositoryEntryPersistenceImpl
 * @generated
 */
public class RepositoryEntryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(RepositoryEntry repositoryEntry) {
		getPersistence().clearCache(repositoryEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RepositoryEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RepositoryEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RepositoryEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static RepositoryEntry remove(RepositoryEntry repositoryEntry)
		throws SystemException {
		return getPersistence().remove(repositoryEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static RepositoryEntry update(RepositoryEntry repositoryEntry,
		boolean merge) throws SystemException {
		return getPersistence().update(repositoryEntry, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static RepositoryEntry update(RepositoryEntry repositoryEntry,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(repositoryEntry, merge, serviceContext);
	}

	/**
	* Caches the repository entry in the entity cache if it is enabled.
	*
	* @param repositoryEntry the repository entry to cache
	*/
	public static void cacheResult(
		com.liferay.portal.model.RepositoryEntry repositoryEntry) {
		getPersistence().cacheResult(repositoryEntry);
	}

	/**
	* Caches the repository entries in the entity cache if it is enabled.
	*
	* @param repositoryEntries the repository entries to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.model.RepositoryEntry> repositoryEntries) {
		getPersistence().cacheResult(repositoryEntries);
	}

	/**
	* Creates a new repository entry with the primary key. Does not add the repository entry to the database.
	*
	* @param repositoryEntryId the primary key for the new repository entry
	* @return the new repository entry
	*/
	public static com.liferay.portal.model.RepositoryEntry create(
		long repositoryEntryId) {
		return getPersistence().create(repositoryEntryId);
	}

	/**
	* Removes the repository entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param repositoryEntryId the primary key of the repository entry to remove
	* @return the repository entry that was removed
	* @throws com.liferay.portal.NoSuchRepositoryEntryException if a repository entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.RepositoryEntry remove(
		long repositoryEntryId)
		throws com.liferay.portal.NoSuchRepositoryEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(repositoryEntryId);
	}

	public static com.liferay.portal.model.RepositoryEntry updateImpl(
		com.liferay.portal.model.RepositoryEntry repositoryEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(repositoryEntry, merge);
	}

	/**
	* Finds the repository entry with the primary key or throws a {@link com.liferay.portal.NoSuchRepositoryEntryException} if it could not be found.
	*
	* @param repositoryEntryId the primary key of the repository entry to find
	* @return the repository entry
	* @throws com.liferay.portal.NoSuchRepositoryEntryException if a repository entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.RepositoryEntry findByPrimaryKey(
		long repositoryEntryId)
		throws com.liferay.portal.NoSuchRepositoryEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(repositoryEntryId);
	}

	/**
	* Finds the repository entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param repositoryEntryId the primary key of the repository entry to find
	* @return the repository entry, or <code>null</code> if a repository entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.RepositoryEntry fetchByPrimaryKey(
		long repositoryEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(repositoryEntryId);
	}

	/**
	* Finds all the repository entries where repositoryId = &#63;.
	*
	* @param repositoryId the repository ID to search with
	* @return the matching repository entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.RepositoryEntry> findByRepositoryId(
		long repositoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRepositoryId(repositoryId);
	}

	/**
	* Finds a range of all the repository entries where repositoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param repositoryId the repository ID to search with
	* @param start the lower bound of the range of repository entries to return
	* @param end the upper bound of the range of repository entries to return (not inclusive)
	* @return the range of matching repository entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.RepositoryEntry> findByRepositoryId(
		long repositoryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRepositoryId(repositoryId, start, end);
	}

	/**
	* Finds an ordered range of all the repository entries where repositoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param repositoryId the repository ID to search with
	* @param start the lower bound of the range of repository entries to return
	* @param end the upper bound of the range of repository entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching repository entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.RepositoryEntry> findByRepositoryId(
		long repositoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRepositoryId(repositoryId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first repository entry in the ordered set where repositoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param repositoryId the repository ID to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching repository entry
	* @throws com.liferay.portal.NoSuchRepositoryEntryException if a matching repository entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.RepositoryEntry findByRepositoryId_First(
		long repositoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchRepositoryEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRepositoryId_First(repositoryId, orderByComparator);
	}

	/**
	* Finds the last repository entry in the ordered set where repositoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param repositoryId the repository ID to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching repository entry
	* @throws com.liferay.portal.NoSuchRepositoryEntryException if a matching repository entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.RepositoryEntry findByRepositoryId_Last(
		long repositoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchRepositoryEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRepositoryId_Last(repositoryId, orderByComparator);
	}

	/**
	* Finds the repository entries before and after the current repository entry in the ordered set where repositoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param repositoryEntryId the primary key of the current repository entry
	* @param repositoryId the repository ID to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next repository entry
	* @throws com.liferay.portal.NoSuchRepositoryEntryException if a repository entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.RepositoryEntry[] findByRepositoryId_PrevAndNext(
		long repositoryEntryId, long repositoryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchRepositoryEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRepositoryId_PrevAndNext(repositoryEntryId,
			repositoryId, orderByComparator);
	}

	/**
	* Finds the repository entry where repositoryId = &#63; and mappedId = &#63; or throws a {@link com.liferay.portal.NoSuchRepositoryEntryException} if it could not be found.
	*
	* @param repositoryId the repository ID to search with
	* @param mappedId the mapped ID to search with
	* @return the matching repository entry
	* @throws com.liferay.portal.NoSuchRepositoryEntryException if a matching repository entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.RepositoryEntry findByR_M(
		long repositoryId, java.lang.String mappedId)
		throws com.liferay.portal.NoSuchRepositoryEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByR_M(repositoryId, mappedId);
	}

	/**
	* Finds the repository entry where repositoryId = &#63; and mappedId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param repositoryId the repository ID to search with
	* @param mappedId the mapped ID to search with
	* @return the matching repository entry, or <code>null</code> if a matching repository entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.RepositoryEntry fetchByR_M(
		long repositoryId, java.lang.String mappedId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByR_M(repositoryId, mappedId);
	}

	/**
	* Finds the repository entry where repositoryId = &#63; and mappedId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param repositoryId the repository ID to search with
	* @param mappedId the mapped ID to search with
	* @return the matching repository entry, or <code>null</code> if a matching repository entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.RepositoryEntry fetchByR_M(
		long repositoryId, java.lang.String mappedId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByR_M(repositoryId, mappedId, retrieveFromCache);
	}

	/**
	* Finds all the repository entries.
	*
	* @return the repository entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.RepositoryEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the repository entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of repository entries to return
	* @param end the upper bound of the range of repository entries to return (not inclusive)
	* @return the range of repository entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.RepositoryEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the repository entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of repository entries to return
	* @param end the upper bound of the range of repository entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of repository entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.RepositoryEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the repository entries where repositoryId = &#63; from the database.
	*
	* @param repositoryId the repository ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRepositoryId(long repositoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRepositoryId(repositoryId);
	}

	/**
	* Removes the repository entry where repositoryId = &#63; and mappedId = &#63; from the database.
	*
	* @param repositoryId the repository ID to search with
	* @param mappedId the mapped ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByR_M(long repositoryId, java.lang.String mappedId)
		throws com.liferay.portal.NoSuchRepositoryEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByR_M(repositoryId, mappedId);
	}

	/**
	* Removes all the repository entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the repository entries where repositoryId = &#63;.
	*
	* @param repositoryId the repository ID to search with
	* @return the number of matching repository entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRepositoryId(long repositoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRepositoryId(repositoryId);
	}

	/**
	* Counts all the repository entries where repositoryId = &#63; and mappedId = &#63;.
	*
	* @param repositoryId the repository ID to search with
	* @param mappedId the mapped ID to search with
	* @return the number of matching repository entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByR_M(long repositoryId, java.lang.String mappedId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByR_M(repositoryId, mappedId);
	}

	/**
	* Counts all the repository entries.
	*
	* @return the number of repository entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RepositoryEntryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RepositoryEntryPersistence)PortalBeanLocatorUtil.locate(RepositoryEntryPersistence.class.getName());

			ReferenceRegistry.registerReference(RepositoryEntryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(RepositoryEntryPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(RepositoryEntryUtil.class,
			"_persistence");
	}

	private static RepositoryEntryPersistence _persistence;
}