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
package com.jwebmp.plugins.bootstrap.buttons.groups.options;

import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Button group
 * <p>
 * Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style behavior
 * with our buttons plugin.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public enum BSButtonGroupOptions
		implements IBSComponentOptions
{
	/**
	 * Button group
	 * <p>
	 * Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style
	 * behavior with our buttons plugin.
	 */
	Btn_Group,
	/**
	 * Make a set of buttons appear vertically stacked rather than horizontally. Split button dropdowns are not supported here.
	 */
	Btn_Group_Vertical;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
