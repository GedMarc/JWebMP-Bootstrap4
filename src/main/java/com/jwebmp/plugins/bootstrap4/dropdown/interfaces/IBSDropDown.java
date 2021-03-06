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

package com.jwebmp.plugins.bootstrap4.dropdown.interfaces;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap4.dropdown.BSDropDown;
import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownButton;
import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownLink;
import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownMenu;

import java.util.Comparator;

public interface IBSDropDown<J extends BSDropDown<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * adds a default drop down button
	 *
	 * @return
	 */
	BSDropDownButton<?> addDropDownButton();

	/**
	 * Adds the drop down button to the drop down (add before menu)
	 *
	 * @param buttonOptions
	 *
	 * @return
	 */
	BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions);

	BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions, BSButtonSizeOptions sizeOptions);

    Link<?> addDropDownLink();

    /**
	 * Adds the menu to the drop down (call after button)
	 *
	 * @return
	 */
	BSDropDownMenu<?> addDropDownMenu();
}
