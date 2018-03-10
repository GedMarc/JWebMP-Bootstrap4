/*
 * Copyright (C) 2017 Marc Magon
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
package za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.IBSComponentOptions;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.*;

/**
 * Color schemes
 * <p>
 * Theming the navbar has never been easier thanks to the combination of theming classes and background-color utilities. Choose from
 * .navbar-light for use with light background colors, or
 * .navbar-inverse for dark background colors. Then, customize with .bg-* utilities.
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public enum BSNavBarColourSchemes
		implements IBSComponentOptions
{
	/**
	 * Color schemes
	 * <p>
	 * Theming the navbar has never been easier thanks to the combination of theming classes and background-color utilities. Choose from
	 * .navbar-light for use with light background colors, or
	 * .navbar-inverse for dark background colors. Then, customize with .bg-* utilities.
	 */
	Navbar_Light,
	/**
	 * Color schemes
	 * <p>
	 * Theming the navbar has never been easier thanks to the combination of theming classes and background-color utilities. Choose from
	 * .navbar-light for use with light background colors, or
	 * .navbar-inverse for dark background colors. Then, customize with .bg-* utilities.
	 */
	Navbar_Dark;

	BSNavBarColourSchemes()
	{
		//Nothing Needed
	}

	@JsonValue
	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_DOLLAR, CHAR_SPACE)
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}