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

package com.jwebmp.plugins.bootstrap.options.interfaces;

import com.jwebmp.plugins.bootstrap.options.*;

import jakarta.validation.constraints.NotNull;

public interface IBSLayout<J extends IBSLayout<J>>
{
	/**
	 * Sets the style with the given colours
	 *
	 * @param backgroundOptions
	 * 		background colour
	 *
	 * @return
	 */
	
	@NotNull
	J addBackground(BSBackgroundOptions backgroundOptions);

	/**
	 * Sets the style with the given colours
	 *
	 * @param coloursOptions
	 * 		text colour
	 *
	 * @return
	 */
	
	@NotNull
	J addForeground(BSColoursOptions coloursOptions);

	/**
	 * Sets the margins (without checking for previous applied)
	 *
	 * @param margin
	 *
	 * @return
	 */
	
	@NotNull
	J addMargin(BSMarginOptions margin);

	/**
	 * Applies the padding to the card
	 *
	 * @param padding
	 *
	 * @return
	 */
	
	@NotNull
	J addPadding(BSPaddingOptions padding);

	/**
	 * Sets the border to the correct structure
	 *
	 * @param border
	 *
	 * @return
	 */
	
	@NotNull
	J addBorder(BSBorderOptions border);

	/**
	 * Returns the Bootstrap layout options
	 *
	 * @return The IBSLayout Options
	 */
	default IBSLayout<?> asLayout()
	{
		return this;
	}
}
