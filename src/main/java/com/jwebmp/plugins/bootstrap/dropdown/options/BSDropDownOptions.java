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
package com.jwebmp.plugins.bootstrap.dropdown.options;

import com.guicedee.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Dropdowns
 * <p>
 * Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included
 * Bootstrap dropdown JavaScript plugin. They’re toggled by clicking,
 * not by hovering; this is an intentional design decision.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public enum BSDropDownOptions
		implements IBSComponentOptions
{
	Dropdown,
	Dropdown_Lg,
	Dropdown_Sm,
	DropUp,
	DropRight,
	DropLeft,
	Dropdown_Item,
	Dropdown_Menu,
	Dropdown_Toggle,
	Dropdown_Divider,
	Dropdown_Toggle_Split,
	Dropdown_Header,
	Arrow_None,
	Dropdown_Menu_Right;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
