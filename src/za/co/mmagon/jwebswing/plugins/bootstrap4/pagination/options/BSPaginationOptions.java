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
package za.co.mmagon.jwebswing.plugins.bootstrap4.pagination.options;

import za.co.mmagon.jwebswing.plugins.bootstrap4.options.IBSComponentOptions;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_DASH;

/**
 * Pagination
 * <p>
 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page approach
 * to long lists of content improves general performance, such
 * as in search results or inboxes.<p>
 * Included is support for left and right aligned content, content alignment options, nesting, and more.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSPaginationOptions
		implements IBSComponentOptions
{
	/**
	 * Pagination
	 * <p>
	 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page
	 * approach to long lists of content improves general performance,
	 * such as in search results or inboxes.
	 */
	Pagination,
	/**
	 * Pagination
	 * <p>
	 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page
	 * approach to long lists of content improves general performance,
	 * such as in search results or inboxes.
	 */
	Page_Item,
	/**
	 * Pagination
	 * <p>
	 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page
	 * approach to long lists of content improves general performance,
	 * such as in search results or inboxes.
	 */
	Page_Link,;

	BSPaginationOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}