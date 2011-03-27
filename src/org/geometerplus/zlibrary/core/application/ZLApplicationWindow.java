/*
 * Copyright (C) 2007-2011 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.zlibrary.core.application;

import org.geometerplus.zlibrary.core.view.ZLView;

abstract public class ZLApplicationWindow {
	private ZLApplication myApplication;

	protected ZLApplicationWindow(ZLApplication application) {
		myApplication = application;
		myApplication.setWindow(this);
	}

	public ZLApplication getApplication() {
		return myApplication;
	}

	abstract protected void refreshMenu();
	
	abstract protected void repaintView();
	abstract protected void scrollViewManually(int startX, int startY, int endX, int endY, boolean horizontally);
	abstract protected void scrollViewToCenter();
	abstract protected void startViewAutoScrolling(ZLView.PageIndex viewPage, boolean horizontally);

	abstract protected void rotate();
	abstract protected boolean canRotate();

	abstract protected void close();

	abstract protected int getBatteryLevel();
}
