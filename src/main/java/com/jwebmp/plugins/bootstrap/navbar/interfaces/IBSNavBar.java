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

package com.jwebmp.plugins.bootstrap.navbar.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.forms.BSForm;
import com.jwebmp.plugins.bootstrap.navbar.*;
import com.jwebmp.plugins.bootstrap.navbar.enumerations.BSNavBarColourSchemes;
import com.jwebmp.plugins.bootstrap.navbar.enumerations.BSNavBarPositioning;
import com.jwebmp.plugins.bootstrap.navbar.parts.BSNavBarBrand;
import com.jwebmp.plugins.bootstrap.navbar.parts.BSNavBarHeaderSpan;
import com.jwebmp.plugins.bootstrap.navbar.parts.BSNavBarText;
import com.jwebmp.plugins.bootstrap.navbar.toggler.*;
import com.jwebmp.plugins.bootstrap.navs.*;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSLayout;

import jakarta.validation.constraints.NotNull;

public interface IBSNavBar<J extends BSNavBar<J>>
		extends ICssStructure<J>, IBSLayout<J>
{
	@NotNull
	J setNavBarTheme(BSNavBarColourSchemes schemes);

	/**
	 * Shortcut method to add only a brand image
	 *
	 * @param brandImage
	 *
	 * @return
	 */
	BSNavBarBrand<?> addBrandImage(String brandImage);

	/**
	 * Adds a new brand with the given options
	 *
	 * @param brandName
	 * @param brandImage
	 *
	 * @return
	 */
	BSNavBarBrand<?> addBrand(String brandName, String brandImage);

	/**
	 * Adds a new brand with the given text
	 *
	 * @param brand
	 *
	 * @return
	 */
	BSNavBarBrand<?> addBrand(String brand);

	/**
	 * Sets this navbar's positioning
	 *
	 * @param position
	 *
	 * @return
	 */
	@NotNull
	J addPositioning(BSNavBarPositioning position);

	/**
	 * Adds the given header text
	 *
	 * @param text
	 *
	 * @return
	 */
	BSNavBarHeaderSpan<?, ?> addHeaderText(String text);

	/**
	 * Adds a configured form to the nav bar
	 *
	 * @return
	 */
	@NotNull
	BSForm<?> addForm();

	@NotNull
	BSNavBarToggleButton<?> addToggle();
	
	J addNavs(BSNavBarNavs<?> navigation);
	
	@NotNull BSNavBarToggleContainer<?> addToggleWithContainer();
	
	BSNavBarText addText(String text);
}
