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
package com.jwebmp.plugins.bootstrap4.modal.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.bootstrap4.modal.BSModal;

/**
 * @author GedMarc
 * @since 21 Feb 2017
 */
public class BSModalToggleFeature
		extends Feature<GlobalFeatures, JavaScriptPart<?>,BSModalToggleFeature>
{
	
	public BSModalToggleFeature(BSModal modal)
	{
		super("BSModalToggleFeature", modal);
		setComponent(modal);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID() + "modal('toggle');");
	}

}
