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
package com.jwebmp.plugins.bootstrap.buttons.groups;

import com.jwebmp.plugins.bootstrap.buttons.groups.options.BSButtonGroupOptions;

/**
 * Vertical variation
 * <p>
 * Make a set of buttons appear vertically stacked rather than horizontally. Split button dropdowns are not supported here.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSButtonGroupVertical<J extends BSButtonGroupVertical<J>>
		extends BSButtonGroup<J>
{


	/**
	 * Vertical variation
	 * <p>
	 * Make a set of buttons appear vertically stacked rather than horizontally. Split button dropdowns are not supported here.
	 */
	public BSButtonGroupVertical()
	{
		addClass(BSButtonGroupOptions.Btn_Group_Vertical);
		removeClass(BSButtonGroupOptions.Btn_Group);
	}
}
