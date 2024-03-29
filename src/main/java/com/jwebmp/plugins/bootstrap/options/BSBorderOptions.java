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
package com.jwebmp.plugins.bootstrap.options;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Borders
 * <p>
 * Use border utilities to quickly style the border and border-radius of an element. Great for images, buttons, or any other element.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSBorderOptions
		implements IBSComponentOptions
{
	/**
	 * makes all 4 corners rounded
	 */
	Rounded,
	Rounded_0,
	Rounded_1,
	Rounded_2,
	/**
	 * Only round the top
	 */
	Rounded_Top,
	/**
	 * Only rounds the bottom
	 */
	Rounded_Bottom,
	/**
	 * Rounds the left
	 */
	Rounded_Left,
	/**
	 * Rounds the right
	 */
	Rounded_Right,
	/**
	 * Makes the display in circular format
	 */
	Rounded_Circle,
	/**
	 * Defines a border
	 */
	Border,
	/**
	 * Sets primary
	 */
	Border_Primary,
	/**
	 * Sets secondary
	 */
	Border_Secondary,
	/**
	 * Sets danger
	 */
	Border_Danger,
	/**
	 * Sets to dark theme
	 */
	Border_Dark,
	/**
	 * Sets to light theme
	 */
	Border_Light,
	/**
	 * Sets to success theme
	 */
	Border_Success,
	/**
	 * Sets to warning theme
	 */
	Border_Warning,
	Border_Info;
	
	@Override
	public String toString()
	{
		return "border " + name().toLowerCase()
		                         .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
