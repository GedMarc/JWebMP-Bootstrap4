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
package com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.hiddenbstab;

import com.jwebmp.FileTemplates;
import com.jwebmp.base.angular.directives.AngularDirectiveBase;

import javax.validation.constraints.NotNull;

/**
 * Maps to the angular function of right click
 *
 * @author GedMarc
 * @since 25 Jun 2016
 */
public class HiddenBSTabDirective
		extends AngularDirectiveBase
{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new right click directive based on the angular object passed in
	 * <p>
	 */
	public HiddenBSTabDirective()
	{
		super("showBsTab");
	}

	/**
	 * Renders the right click directive from the JavaScript file
	 *
	 * @return
	 */
	@Override
	@NotNull
	public String renderFunction()
	{
		return FileTemplates.getFileTemplate(HiddenBSTabDirective.class, "HiddenBSTab", "HiddenBSTab.min.js")
		                    .toString();
	}

}