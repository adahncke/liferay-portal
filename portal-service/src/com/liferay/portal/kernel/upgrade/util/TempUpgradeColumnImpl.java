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

package com.liferay.portal.kernel.upgrade.util;

/**
 * @author Alexander Chow
 * @author Brian Wing Shun Chan
 */
public class TempUpgradeColumnImpl extends BaseUpgradeColumnImpl {

	public TempUpgradeColumnImpl(String name) {
		super(name);
	}

	public TempUpgradeColumnImpl(String name, Integer oldColumnType) {
		super(name, oldColumnType);
	}

	@Override
	public Integer getNewColumnType(Integer defaultType) {
		return getOldColumnType(defaultType);
	}

	public Object getNewValue(Object oldValue) throws Exception {
		return oldValue;
	}

}