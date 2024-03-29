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
package com.jwebmp.plugins.bootstrap.buttons.styles;

import com.jwebmp.plugins.bootstrap.buttons.BSButton;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions;

/**
 * Buttons
 * <p>
 * Use Bootstrap’s custom button styles for actions in forms, dialogs, and more. Includes support for a handful of contextual variations,
 * sizes, states, and more.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSButtonSuccessOutline<J extends BSButtonSuccessOutline<J>>
		extends BSButton<J>
{
	/**
	 * Indicates a successful or positive action
	 */
	public BSButtonSuccessOutline()
	{
		this(null);
	}
	/**
	 * Indicates a successful or positive action
	 */
	public BSButtonSuccessOutline(String text)
	{
		super(text);
		addClass(BSButtonOptions.Btn_Outline_Success);
	}

}
