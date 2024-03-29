/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap.buttons.groups.interfaces;

import com.jwebmp.plugins.bootstrap.buttons.groups.BSButtonGroup;
import com.jwebmp.plugins.bootstrap.buttons.groups.options.BSButtonGroupSizeOptions;

/**
 * @author GedMarc
 * @since 16 Feb 2017
 */
public interface IBSButtonGroup
{

	/**
	 * Sets the screen reader label for this group
	 *
	 * @param label
	 *
	 * @return
	 */
	BSButtonGroup<?> setAriaLabel(String label);

	/**
	 * Sizes
	 * <p>
	 * Fancy larger or smaller buttons? Add .btn-lg or .btn-sm for additional sizes.
	 *
	 * @param size
	 *
	 * @return
	 */
	BSButtonGroup<?> setSize(BSButtonGroupSizeOptions size);

}
