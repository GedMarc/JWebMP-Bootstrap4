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
package com.jwebmp.plugins.bootstrap.navbar.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Placement
 * <p>
 * Use our position utilities to place navbars in non-static positions. Choose from fixed to the top, fixed to the bottom, or stickied to
 * the top. Note that position: sticky, used for .sticky-top,
 * isn’t fully supported in every browser.
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public enum BSNavBarPositioning
		implements IBSComponentOptions
{

	/**
	 * Choose from fixed to the top, fixed to the bottom, or stickied to the top. Note that position: sticky, used for .sticky-top, isn’t
	 * fully supported in every browser.
	 */
	Fixed_Top,
	/**
	 * Choose from fixed to the top, fixed to the bottom, or stickied to the top. Note that position: sticky, used for .sticky-top, isn’t
	 * fully supported in every browser.
	 */
	Fixed_Bottom,
	/**
	 * Choose from fixed to the top, fixed to the bottom, or stickied to the top. Note that position: sticky, used for .sticky-top, isn’t
	 * fully supported in every browser.
	 */
	Sticky_Top,
	;

	BSNavBarPositioning()
	{
		//Nothing Needed
	}

	@JsonValue
	@Override
	public String toString()
	{
		return "navbar-" + name().toLowerCase()
		                         .replace(STRING_DOLLAR, STRING_SPACE)
		                         .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
