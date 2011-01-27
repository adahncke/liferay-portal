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

package com.liferay.portal.kernel.notifications;

/**
 * @author Edward Han
 */
public class UnknownChannelException extends ChannelException {
	public UnknownChannelException(long userId) {
		_userId = userId;
	}

	public UnknownChannelException(Throwable cause, long userId) {
		super(cause);
		_userId = userId;
	}

	@Override
	public String getMessage() {
		return MESSAGE_PREFIX + _userId;
	}

	public long getUserId() {
		return _userId;
	}

	protected final String MESSAGE_PREFIX =
		"No channel with userId exists: ";

	private long _userId;
}