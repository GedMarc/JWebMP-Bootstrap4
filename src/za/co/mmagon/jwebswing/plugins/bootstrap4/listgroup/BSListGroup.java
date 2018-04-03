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
package za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.children.ListItemChildren;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.BSCardChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.parts.BSListGroupButtonItem;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.parts.BSListGroupLinkItem;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.parts.BSListGroupListItem;

import javax.validation.constraints.NotNull;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.HTML_TAB;

/**
 * List group
 * <p>
 * List groups are a flexible and powerful component for displaying a series of content. List group items can be modified and extended to
 * support just about any content within. They can also be used
 * as navigation with the right modifier class.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap ListGroup",
		description = "List groups are a flexible and powerful component for displaying a series of content. List group items can be " + "modified and extended to support just about any content within. They can also be used as navigation with " + "the right modifier class.",
		url = "https://v4-alpha.getbootstrap.com/components/list-group/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSListGroup<J extends BSListGroup<J>>
		extends Div<BSListGroupChildren, BSListGroupAttributes, GlobalFeatures, BSListGroupEvents, J>
		implements BSCardChildren, IBSListGroup<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * List group
	 * <p>
	 * List groups are a flexible and powerful component for displaying a series of content. List group items can be modified and extended
	 * to support just about any content within. They can also be
	 * used as navigation with the right modifier class.
	 */
	public BSListGroup()
	{
		setTag("ul");
		addClass(BSListGroupOptions.List_Group);
	}

	/**
	 * The slimmer version
	 *
	 * @return
	 */
	public IBSListGroup<J> asMe()
	{
		return this;
	}

	/**
	 * Adds a new button item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSListGroupButtonItem<?> addButtonItem(String text)
	{
		BSListGroupButtonItem<?> item = new BSListGroupButtonItem<>();
		if (text != null)
		{
			item.setText(text);
		}
		add(item);
		return item;
	}

	/**
	 * Adds a new button item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSListGroupButtonItem<?> addButtonItem(ListItemChildren icon, String text)
	{
		BSListGroupButtonItem<?> item = new BSListGroupButtonItem<>();
		item.add(icon);
		item.setRenderTextBeforeChildren(false);
		if (text != null)
		{
			item.setText(HTML_TAB + text);
		}
		add(item);
		return item;
	}

	/**
	 * Adds a new link item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSListGroupLinkItem<?> addLinkItem(String text)
	{
		BSListGroupLinkItem<?> item = new BSListGroupLinkItem<>(text);
		if (text != null)
		{
			item.setText(text);
		}
		add(item);
		return item;
	}

	/**
	 * Adds a new listem item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSListGroupListItem<?> addListItem(String text)
	{
		BSListGroupListItem<?> item = new BSListGroupListItem<>();
		if (text != null)
		{
			item.setText(text);
		}
		add(item);
		return item;
	}

	/**
	 * Flush
	 * Add .list-group-flush to remove some borders and rounded corners to render list group items edge-to-edge in a parent container (e
	 * .g.,
	 * cards).
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFlush()
	{
		addClass(BSListGroupOptions.List_Group_Flush);
		return (J) this;
	}


	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
