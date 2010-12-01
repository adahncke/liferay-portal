/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.documentlibrary.util.comparator;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portlet.documentlibrary.model.DLFileVersion;

import java.util.Comparator;

/**
 * @author Bruno Farache
 */
public class FileVersionVersionComparator
	implements Comparator<DLFileVersion> {

	public FileVersionVersionComparator() {
		this(false);
	}

	public FileVersionVersionComparator(boolean ascending) {
		_ascending = ascending;
	}

	public int compare(DLFileVersion fileVersion1, DLFileVersion fileVersion2) {
		int value = 0;

		int[] versionParts1 = StringUtil.split(
			fileVersion1.getVersion(), StringPool.PERIOD, 0);
		int[] versionParts2 = StringUtil.split(
			fileVersion2.getVersion(), StringPool.PERIOD, 0);

		if ((versionParts1.length != 2) && (versionParts2.length != 2)) {
			value = 0;
		}
		else if ((versionParts1.length != 2)) {
			value = -1;
		}
		else if ((versionParts2.length != 2)) {
			value = 1;
		}
		else if (versionParts1[0] > versionParts2[0]) {
			value = 1;
		}
		else if (versionParts1[0] < versionParts2[0]) {
			value = -1;
		}
		else if (versionParts1[1] > versionParts2[1]) {
			value = 1;
		}
		else if (versionParts1[1] < versionParts2[1]) {
			value = -1;
		}

		if (_ascending) {
			return value;
		}
		else {
			return -value;
		}
	}

	public boolean isAscending() {
		return _ascending;
	}

	private boolean _ascending;

}