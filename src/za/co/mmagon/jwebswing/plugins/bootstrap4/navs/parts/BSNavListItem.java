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
package za.co.mmagon.jwebswing.plugins.bootstrap4.navs.parts;

import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navs.BSNavsOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navs.interfaces.BSNavsChildren;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 23 Jan 2017
 */
public class BSNavListItem<J extends BSNavListItem<J>>
		extends ListItem<J>
		implements BSNavsChildren
{

	private static final long serialVersionUID = 1L;
	private final BSNavLinkItem linkItem;

	/**
	 * Constructs a list item with a link item inside
	 */
	public BSNavListItem(String name)
	{
		linkItem = new BSNavLinkItem(name);
		add(linkItem);
		addClass(BSNavsOptions.Nav_Item);
	}

	/**
	 * Sets this link item active
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActive(boolean active)
	{
		if (active)
		{
			addClass(BSNavsOptions.Active);
		}
		else
		{
			removeClass(BSNavsOptions.Active);
		}
		return (J) this;
	}

	/**
	 * Sets this link item disabled
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(boolean disabled)
	{
		if (disabled)
		{
			addClass(BSNavsOptions.Disabled);
		}
		else
		{
			removeClass(BSNavsOptions.Disabled);
		}
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