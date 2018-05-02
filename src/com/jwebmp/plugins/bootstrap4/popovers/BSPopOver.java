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
package com.jwebmp.plugins.bootstrap4.popovers;

import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.base.html.Div;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.popovers.interfaces.BSPopOverChildren;
import com.jwebmp.plugins.bootstrap4.popovers.interfaces.BSPopOverEvents;
import com.jwebmp.plugins.bootstrap4.popovers.interfaces.BSPopOverFeatures;
import com.jwebmp.plugins.bootstrap4.popovers.interfaces.IBSPopOver;

/**
 * Popovers
 * <p>
 * Add small overlay content, like those found in iOS, to any element for housing secondary information.
 * <p>
 * Overview
 * <p>
 * Things to know when using the popover plugin:
 * <p>
 * Popovers rely on the 3rd party library Tether for positioning. You must include tether.min.js before bootstrap.js in order for popovers
 * to work! Popovers require the tooltip plugin as a dependency.
 * Popovers are opt-in for performance reasons, so you must initialize them yourself. Zero-length title and content values will never show a
 * popover. Specify container: 'body' to avoid rendering
 * problems in more complex components (like our input groups, button groups, etc). Triggering popovers on hidden elements will not work.
 * Popovers for .disabled or disabled elements must be triggered
 * on a wrapper element. When triggered from hyperlinks that span multiple lines, popovers will be centered. Use white-space: nowrap; on
 * your as to avoid this behavior.
 * <p>
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Popovers",
		description = "Add small overlay content, like those found in iOS, to any element for housing secondary information.",
		url = "https://v4-alpha.getbootstrap.com/components/popovers/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSPopOver<J extends BSPopOver<J>>
		extends Div<BSPopOverChildren, BSPopOverAttributes, BSPopOverFeatures, BSPopOverEvents, J>
		implements IBSPopOver
{

	private static final long serialVersionUID = 1L;
	/**
	 * P
	 */
	private BSPopOverFeature feature;

	/**
	 * Popovers
	 * <p>
	 * Add small overlay content, like those found in iOS, to any element for housing secondary information.
	 * <p>
	 * Overview
	 * <p>
	 * Things to know when using the popover plugin:
	 * <p>
	 * Popovers rely on the 3rd party library Tether for positioning.
	 * <p>
	 * You must include tether.min.js before bootstrap.js in order for popovers to work!
	 * <p>
	 * Popovers require the tooltip plugin as a
	 * <p>
	 * dependency. Popovers are opt-in for performance reasons, so you must initialize them yourself.
	 * <p>
	 * Zero-length title and content values will never show a popover. Specify container: 'body' to avoid
	 * <p>
	 * rendering problems in more complex components (like our input groups, button groups, etc).
	 * <p>
	 * Triggering popovers on hidden elements will not work. Popovers for .disabled or disabled elements must be triggered on a wrapper
	 * element. When triggered from hyperlinks that span multiple
	 * lines, popovers will be centered.
	 * <p>
	 * Use white-space: nowrap; on your as to avoid this behavior.
	 * <p>
	 * <p>
	 *
	 * @param displayedComponent
	 * 		Shortcut for getOptions().setContent
	 */
	public BSPopOver(ComponentHierarchyBase displayedComponent)
	{
		addFeature(getFeature());
		if (displayedComponent != null)
		{
			displayedComponent.setTiny(true);
			getOptions().setContent(displayedComponent.toString(true));
		}
	}

	/**
	 * Returns the feature if any is required
	 *
	 * @return
	 */
	public final BSPopOverFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BSPopOverFeature(this);
		}
		return feature;
	}

	/**
	 * Returns the options if any is required
	 *
	 * @return
	 */
	@Override
	public final BSPopOverOptions getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Neater representation
	 *
	 * @return
	 */
	public IBSPopOver asMe()
	{
		return this;
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