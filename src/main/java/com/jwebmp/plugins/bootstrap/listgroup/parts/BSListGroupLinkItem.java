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
package com.jwebmp.plugins.bootstrap.listgroup.parts;

import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.plugins.bootstrap.listgroup.BSListGroupOptions;

import jakarta.validation.constraints.NotNull;

/**
 * Links and buttons Use &gt;a&lt;s or &gt;button&lt;s to create actionable list group items with hover, disabled, and active states by
 * adding .list-group-item-action. We separate these pseudo-classes
 * to ensure list groups made of non-interactive elements (like &gt;li&lt;s or &gt;div&lt;s) don’t provide a click or tap affordance.
 * <p>
 * Be sure to not use the standard .btn classes here.
 *
 * @param <J>
 *
 * @author GedMarc
 * @since 19 Jan 2017
 */
public class BSListGroupLinkItem<J extends BSListGroupLinkItem<J>>
		extends BSListGroupListItem<J>
{


	/**
	 * Links and buttons Use &gt;a&lt;s or &gt;button&lt;s to create actionable list group items with hover, disabled, and active states by
	 * adding .list-group-item-action. We separate these
	 * pseudo-classes to ensure list groups made of non-interactive elements (like &gt;li&lt;s or &gt;div&lt;s) don’t provide a click or
	 * tap
	 * affordance.
	 * <p>
	 * Be sure to not use the standard .btn classes here.
	 *
	 * @param text
	 */
	public BSListGroupLinkItem(String text)
	{
		this(null, text);
	}

	/**
	 * Links and buttons Use &gt;a&lt;s or &gt;button&lt;s to create actionable list group items with hover, disabled, and active states by
	 * adding .list-group-item-action. We separate these
	 * pseudo-classes to ensure list groups made of non-interactive elements (like &gt;li&lt;s or &gt;div&lt;s) don’t provide a click or
	 * tap
	 * affordance.
	 * <p>
	 * Be sure to not use the standard .btn classes here.
	 *
	 * @param url
	 * @param text
	 */
	public BSListGroupLinkItem(String url, String text)
	{
		super(text);
		setTag("a");
		addAttribute(LinkAttributes.HRef.toString(), url);
		addClass(BSListGroupOptions.List_Group_Item_Action);
	}

	@NotNull
	@SuppressWarnings("unchecked")
	public J setUrl(String url)
	{
		addAttribute(LinkAttributes.HRef.toString(), url);
		return (J) this;
	}

	@NotNull
	@SuppressWarnings("unchecked")
	public J setStyle(BSListGroupOptions options)
	{
		addClass(options);
		return (J) this;
	}

}
