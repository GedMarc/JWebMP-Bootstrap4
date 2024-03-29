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
 * Clearfix
 * <p>
 * Easily clear floats by adding .clearfix to the parent element. Utilizes the micro clearfix as popularized by Nicolas Gallagher. Can also
 * be used as a mixin.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSImageOptions
		implements IBSComponentOptions
{
	/**
	 * Adds rounded corners to an image (not available in IE8)
	 */
	Img_Rounded,
	/**
	 * Shapes the image to a circle (not available in IE8)
	 */
	Img_Circle,
	/**
	 * Shapes the image to a thumbnail
	 */
	Img_Thumbnail,
	/**
	 * Makes an image responsive (will scale nicely to the parent element)
	 */
	Img_Fluid,
	/**
	 * Makes an image responsive (will scale nicely to the parent element), used in some
	 */
	Img_Responsive;

	@Override
	public String toString()
	{
		return name().toLowerCase().replace(CHAR_UNDERSCORE,CHAR_DASH);
	}
}
