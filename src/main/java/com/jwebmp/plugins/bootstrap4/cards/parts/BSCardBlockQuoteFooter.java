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
package com.jwebmp.plugins.bootstrap4.cards.parts;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.cards.BSCardChildren;
import com.jwebmp.plugins.bootstrap4.cards.BSCardOptions;
import com.jwebmp.plugins.bootstrap4.options.*;
import com.jwebmp.plugins.bootstrap4.options.interfaces.IBSLayout;

import javax.validation.constraints.NotNull;

/**
 * Block quote format for inside a bootstrap card
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardBlockQuoteFooter<J extends BSCardBlockQuoteFooter<J>>
		extends Div<IComponentHierarchyBase, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements BSCardChildren<IComponentHierarchyBase, J>, IBSLayout<J>
{


	/**
	 * Block quote format for inside a bootstrap card
	 */
	public BSCardBlockQuoteFooter()
	{
		setTag("footer");
		addClass(BSCardOptions.BlockQuote_Footer);
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBackground(BSBackgroundOptions backgroundOptions)
	{
		addClass(backgroundOptions);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addForeground(BSColoursOptions coloursOptions)
	{
		addClass(coloursOptions);
		return (J) this;
	}

	/**
	 * Sets the margins (without checking for previous applied)
	 *
	 * @param margin
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addMargin(BSMarginOptions margin)
	{
		addClass(margin);
		return (J) this;
	}

	/**
	 * Applies the padding to the card
	 *
	 * @param padding
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addPadding(BSPaddingOptions padding)
	{
		addClass(padding);
		return (J) this;
	}

	/**
	 * Sets the border to the correct structure
	 *
	 * @param border
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBorder(BSBorderOptions border)
	{
		addClass(border);
		return (J) this;
	}
}
