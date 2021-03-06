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

package com.liferay.portal.kernel.atom;

import java.util.Date;

/**
 * @author Igor Spasic
 */
public abstract class BaseAtomCollectionAdapter<E>
	implements AtomCollectionAdapter<E> {

	public void deleteEntry(
			String resourceName, AtomRequestContext atomRequestContext)
		throws AtomException {

		try {
			doDeleteEntry(resourceName, atomRequestContext);
		}
		catch (Exception e) {
			Class<?> clazz = e.getClass();

			String className = clazz.getName();

			if (className.startsWith("NoSuch")) {
				throw new AtomException(SC_NOT_FOUND);
			}

			throw new AtomException(SC_INTERNAL_SERVER_ERROR, e);
		}
	}

	public E getEntry(
			String resourceName, AtomRequestContext atomRequestContext)
		throws AtomException {

		try {
			return doGetEntry(resourceName, atomRequestContext);
		}
		catch (Exception e) {
			Class<?> clazz = e.getClass();

			String className = clazz.getName();

			if (className.startsWith("NoSuch")) {
				throw new AtomException(SC_NOT_FOUND);
			}

			throw new AtomException(SC_INTERNAL_SERVER_ERROR, e);
		}
	}

	public Iterable<E> getFeedEntries(AtomRequestContext atomRequestContext)
		throws AtomException {

		try {
			return doGetFeedEntries(atomRequestContext);
		}
		catch (Exception e) {
			String className = e.getClass().getName();

			if (className.startsWith("NoSuch")) {
				throw new AtomException(SC_NOT_FOUND);
			}

			throw new AtomException(SC_INTERNAL_SERVER_ERROR, e);
		}
	}

	public E postEntry(
			String title, String summary, String content, Date date,
			AtomRequestContext atomRequestContext)
		throws AtomException {

		try {
			return doPostEntry(
				title, summary, content, date, atomRequestContext);
		}
		catch (Exception e) {
			Class<?> clazz = e.getClass();

			String className = clazz.getName();

			if (className.startsWith("NoSuch")) {
				throw new AtomException(SC_NOT_FOUND);
			}

			throw new AtomException(SC_INTERNAL_SERVER_ERROR, e);
		}
	}

	public void putEntry(
			E entry, String title, String summary, String content, Date date,
			AtomRequestContext atomRequestContext)
		throws AtomException {

		try {
			doPutEntry(
				entry, title, summary, content, date, atomRequestContext);
		}
		catch (Exception e) {
			Class<?> clazz = e.getClass();

			String className = clazz.getName();

			if (className.startsWith("NoSuch")) {
				throw new AtomException(SC_NOT_FOUND);
			}

			throw new AtomException(SC_INTERNAL_SERVER_ERROR, e);
		}
	}

	protected abstract void doDeleteEntry(
			String resourceName, AtomRequestContext atomRequestContext)
		throws Exception;

	protected abstract E doGetEntry(
			String resourceName, AtomRequestContext atomRequestContext)
		throws Exception;

	protected abstract Iterable<E> doGetFeedEntries(
			AtomRequestContext atomRequestContext)
		throws Exception;

	protected abstract E doPostEntry(
			String title, String summary, String content, Date date,
			AtomRequestContext atomRequestContext)
		throws Exception;

	protected abstract void doPutEntry(
			E entry, String title, String summary, String content, Date date,
			AtomRequestContext atomRequestContext)
		throws Exception;

}