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
package com.jwebmp.plugins.bootstrap.forms.groups.sets;

import com.guicedee.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Input group
 * <p>
 * Easily extend form controls by adding text, buttons, or button groups on either side of textual
 *
 * @author GedMarc
 */
public enum BSComponentInputGroupOptions
		implements IBSComponentOptions
{
	/**
	 * Denotes an input group association
	 */
	Input_Group,
	/**
	 *
	 */
	Input_Group_Prepend,
	Input_Group_Append,
	Input_Group_Text,
	/**
	 * Sizing
	 * <p>
	 * Add the relative form sizing classes to the .input-group itself and contents within will automatically resize—no need for repeating
	 * the form control size classes on each element.
	 */
	Input_Group_Lg,
	/**
	 * Sizing
	 * <p>
	 * Add the relative form sizing classes to the .input-group itself and contents within will automatically resize—no need for repeating
	 * the form control size classes on each element.
	 */
	Input_Group_Sm;

	BSComponentInputGroupOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
