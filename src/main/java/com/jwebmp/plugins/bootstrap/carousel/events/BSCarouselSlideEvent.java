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
package com.jwebmp.plugins.bootstrap.carousel.events;

import com.guicedee.logger.*;
import com.jwebmp.core.*;
import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.base.html.interfaces.events.*;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.*;
import com.jwebmp.plugins.bootstrap.carousel.*;

import java.util.logging.*;

/**
 * Handles all events. Over-ride methods.
 *
 * @author GedMarc
 */
public abstract class BSCarouselSlideEvent<J extends BSCarouselSlideEvent<J>>
		extends Event<GlobalFeatures, J>
		implements GlobalEvents<J>, BSCarouselEvents<J>
{
	/**
	 * Logger for the Component
	 */
	private static final Logger LOG = LogFactory.getInstance()
	                                            .getLogger("BSCarouselSlideEvent");
	
	/**
	 * Performs a click
	 *
	 * @param component The component this click is going to be acting on
	 */
	public BSCarouselSlideEvent(Component component)
	{
		super(EventTypes.undefined, component);
	}
	
	@Override
	public void fireEvent(AjaxCall<?> call, AjaxResponse<?> response)
	{
		try
		{
			onSlide(call, response);
		}
		catch (Exception e)
		{
			BSCarouselSlideEvent.LOG.log(Level.SEVERE, "Error In Firing Event", e);
		}
	}
	
	/**
	 * Sets JQuery and Angular enabled, adds the directive to angular, and the attribute to the component
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getComponent().asAttributeBase()
			              .addAttribute("slideClassName", getClass().getCanonicalName());
		}
		
		super.preConfigure();
	}
	
	/**
	 * Triggers on Click
	 * <p>
	 *
	 * @param call     The physical AJAX call
	 * @param response The physical Ajax Receiver
	 */
	public abstract void onSlide(AjaxCall<?> call, AjaxResponse<?> response);
}