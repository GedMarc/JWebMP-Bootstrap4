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
package com.jwebmp.plugins.bootstrap.collapse;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;
import com.jwebmp.plugins.bootstrap.toggle.BSToggleAttributes;
import jakarta.validation.constraints.NotNull;

/**
 * Collapse
 * <p>
 * The Bootstrap collapse plugin allows you to toggle content on your pages with a few classes thanks to some helpful JavaScript.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Collapse",
		description = "The Bootstrap collapse plugin allows you to toggle content on your pages with a few classes thanks to some helpful " +
		              "JavaScript.",
		url = "https://v4-alpha.getbootstrap.com/components/collapse/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSCollapse
{
	private static final String Collapse = "collapse";

	private BSCollapse()
	{
	}

	/**
	 * Apply a collapse to given components
	 *
	 * @param linkController
	 * @param display
	 * @param hideOnStart
	 */
	public static void link(Link<?> linkController, IComponentHierarchyBase<?,?> display, boolean hideOnStart)
	{
		if (display != null)
		{
			display.addClass(Collapse);
			if (!hideOnStart)
			{
				display.addClass(BSDefaultOptions.Show);
			}
			linkController.addAttribute(GlobalAttributes.Aria_Controls.toString(), display.asBase().getID());
			linkController.addAttribute(LinkAttributes.Data_Target.toString(), display.asBase().getID(true));
		}

		linkController.addAttribute(LinkAttributes.Data_Toggle, Collapse);
		linkController.addAttribute(GlobalAttributes.Aria_Expanded, Boolean.toString(!hideOnStart));
	}

	/**
	 * Apply a collapse to given components
	 *
	 * @param buttonController
	 * @param display
	 * @param hideOnStart
	 */
	@SuppressWarnings("Duplicates")
	public static void link(Button<?,?,?,?,?> buttonController, @NotNull IComponentHierarchyBase<?,?> display, boolean hideOnStart)
	{
		display.addClass(Collapse);
		if (!hideOnStart)
		{
			display.addClass(BSDefaultOptions.Show);
			display.asAttributeBase().addAttribute(GlobalAttributes.Aria_LabelledBy, buttonController.getID());

			buttonController.addAttribute(GlobalAttributes.Aria_Expanded.toString(), "true");
		}
		buttonController.addAttribute(GlobalAttributes.Aria_Controls.toString(), display.asBase().getID());
		buttonController.addAttribute(BSToggleAttributes.Data_Toggle.toString(), Collapse);
		buttonController.addAttribute(BSToggleAttributes.Data_Target.toString(), display.asBase().getID(true));
		buttonController.addAttribute(GlobalAttributes.Aria_Expanded.toString(), Boolean.toString(!hideOnStart));
	}

	/**
	 * Attempts to link any component
	 *
	 * @param anyComponent
	 * @param display
	 * @param hideOnStart
	 */
	@SuppressWarnings("Duplicates")
	public static void link(IComponentHierarchyBase<?,?> anyComponent, @NotNull IComponentHierarchyBase<?,?> display, boolean hideOnStart)
	{
		display.addClass(Collapse);
		if (!hideOnStart)
		{
			display.addClass(BSDefaultOptions.Show);
			display.asAttributeBase().addAttribute(GlobalAttributes.Aria_LabelledBy, anyComponent.asBase().getID());
			anyComponent.asAttributeBase().addAttribute(GlobalAttributes.Aria_Expanded.toString(), "true");
		}
		anyComponent.asAttributeBase().addAttribute(GlobalAttributes.Aria_Controls.toString(), display.asBase().getID());
		anyComponent.asAttributeBase().addAttribute(BSToggleAttributes.Data_Toggle.toString(), Collapse);
		anyComponent.asAttributeBase().addAttribute(BSToggleAttributes.Data_Target.toString(), display.asBase().getID(true));
		anyComponent.asAttributeBase().addAttribute(GlobalAttributes.Aria_Expanded.toString(), Boolean.toString(!hideOnStart));
	}
}
