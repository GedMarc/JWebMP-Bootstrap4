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
package com.jwebmp.plugins.bootstrap.pagination.parts;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.guicedee.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.pagination.options.BSPaginationOptions;

/**
 * A pagination link for an item, usually auto generated from BSPagination
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public class BSPaginationLink<J extends BSPaginationLink<J>>
		extends Link<J>
{


	/**
	 * A pagination link for an item, usually auto generated from BSPagination
	 *
	 * @param ariaLabel
	 * 		In addition, as pages likely have more than one such navigation section, it’s advisable to provide a descriptive aria-label
	 * 		for the
	 * 		nav to reflect its purpose. For example, if
	 * 		the pagination component is used to navigate between a set of search results, an appropriate label could be aria-label="Search
	 * 		results pages".
	 */
	public BSPaginationLink(String ariaLabel)
	{
		addClass(BSPaginationOptions.Page_Link);
		addAttribute(LinkAttributes.HRef, StaticStrings.STRING_HASH);
		addAttribute(GlobalAttributes.Aria_Label, ariaLabel);
	}

	/**
	 * Returns this items parent (usually, may throw exceptions if used other than BSPagination.createLink();
	 *
	 * @return
	 */
	public BSPaginationListItem<?> getListItem()
	{
		return (BSPaginationListItem<?>) getParent();
	}
}
