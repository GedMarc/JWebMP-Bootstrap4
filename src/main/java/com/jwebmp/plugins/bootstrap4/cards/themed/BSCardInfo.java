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
package com.jwebmp.plugins.bootstrap4.cards.themed;

import com.jwebmp.plugins.bootstrap4.cards.BSCard;
import com.jwebmp.plugins.bootstrap4.options.BSBackgroundOptions;
import com.jwebmp.plugins.bootstrap4.options.BSColoursOptions;

/**
 * Background variants
 * <p>
 * Cards include their own variant classes for quickly changing the background-color and border-color of a card. Darker colors require the
 * use of .card-inverse.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardInfo
		extends BSCard
{


	/**
	 * Background variants
	 * <p>
	 * Cards include their own variant classes for quickly changing the background-color and border-color of a card. Darker colors require
	 * the use of .card-inverse.
	 */
	public BSCardInfo()
	{
		addClass(BSBackgroundOptions.Bg_Info);
		addClass(BSColoursOptions.Text_White);
	}

}
