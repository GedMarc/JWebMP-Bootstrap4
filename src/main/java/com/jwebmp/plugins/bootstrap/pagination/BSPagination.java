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
package com.jwebmp.plugins.bootstrap.pagination;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.pagination.options.BSPaginationAlignmentOptions;
import com.jwebmp.plugins.bootstrap.pagination.options.BSPaginationSizingOptions;
import com.jwebmp.plugins.bootstrap.pagination.parts.BSPaginationLink;
import com.jwebmp.plugins.bootstrap.pagination.parts.BSPaginationList;
import com.jwebmp.plugins.bootstrap.pagination.parts.BSPaginationListItem;

/**
 * Pagination
 * <p>
 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page approach
 * to long lists of content improves general performance, such
 * as in search results or inboxes.
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Pagination",
		description = "Pagination\n" + "Documentation and examples for showing pagination to indicate a series of related content exists " + "across multiple pages.",
		url = "https://v4-alpha.getbootstrap.com/components/pagination/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSPagination<J extends BSPagination<J>>
		extends Div<BSPaginationChildren, BSPaginationAttributes, GlobalFeatures, GlobalEvents, J>
		implements IBSPagination
{


	/**
	 * The actual list for the pagination
	 */
	private BSPaginationList<?> pageList;

	/**
	 * Pagination
	 * <p>
	 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page
	 * approach to long lists of content improves general performance,
	 * such as in search results or inboxes.
	 *
	 * @param sizing
	 * 		Fancy larger or smaller pagination? Add .pagination-lg or .pagination-sm for additional sizes.
	 */
	public BSPagination(BSPaginationSizingOptions sizing)
	{
		this();
		getPageList().addClass(sizing);

	}

	/**
	 * Pagination
	 * <p>
	 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page
	 * approach to long lists of content improves general performance,
	 * such as in search results or inboxes.
	 * <p>
	 */
	public BSPagination()
	{
		setTag("nav");
	}

	/**
	 * Pagination
	 * <p>
	 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page
	 * approach to long lists of content improves general performance,
	 * such as in search results or inboxes.
	 *
	 * @param alignment
	 * 		Change the alignment of pagination components with flexbox utilities.
	 */
	public BSPagination(BSPaginationAlignmentOptions alignment)
	{
		this();
		getPageList().addClass(alignment);

	}

	/**
	 * Pagination
	 * <p>
	 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page
	 * approach to long lists of content improves general performance,
	 * such as in search results or inboxes.
	 *
	 * @param alignment
	 * 		Change the alignment of pagination components with flexbox utilities.
	 * @param sizing
	 * 		Fancy larger or smaller pagination? Add .pagination-lg or .pagination-sm for additional sizes.
	 */
	public BSPagination(BSPaginationSizingOptions sizing, BSPaginationAlignmentOptions alignment)
	{
		this();
		getPageList().addClass(sizing);
		getPageList().addClass(alignment);

	}

	/**
	 * Creates a new pagination button link.
	 * <p>
	 * Use .getParent() to access the list item object
	 *
	 * @param ariaLabel
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public BSPaginationLink<?> createPageLink(String ariaLabel)
	{
		BSPaginationListItem<?> listItem = new BSPaginationListItem<>();
		BSPaginationLink<?> newLink = new BSPaginationLink<>(ariaLabel);

		listItem.add(newLink);
		getPageList().add(listItem);
		return newLink;

	}

	/**
	 * The actual list for the pagination
	 *
	 * @return
	 */
	@Override
	public final BSPaginationList<?> getPageList()
	{
		if (pageList == null)
		{
			setPageList(new BSPaginationList<>());
		}
		return pageList;
	}

	/**
	 * The actual list for the pagination
	 *
	 * @param pageList
	 */
	@Override
	public void setPageList(BSPaginationList<?> pageList)
	{
		if (this.pageList != null)
		{
			getChildren().remove(this.pageList);
		}
		this.pageList = pageList;
		if (this.pageList != null)
		{
			add(this.pageList);
		}
	}

	/**
	 * A neater view
	 *
	 * @return
	 */
	public IBSPagination asMe()
	{
		return this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
