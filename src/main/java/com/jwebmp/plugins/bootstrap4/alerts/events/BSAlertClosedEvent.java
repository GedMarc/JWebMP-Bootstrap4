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
package com.jwebmp.plugins.bootstrap4.alerts.events;

import com.guicedee.logger.LogFactory;
import com.jwebmp.core.Component;
import com.jwebmp.core.Event;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.EventTypes;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.guicedee.guicedinjection.json.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Handles all events. Over-ride methods.
 *
 * @author GedMarc
 */
public abstract class BSAlertClosedEvent<J extends BSAlertClosedEvent<J>>
		extends Event<GlobalFeatures, J>
		implements GlobalEvents, BSAlertEvents
{
	
	/**
	 * Logger for the Component
	 */
	private static final Logger LOG = LogFactory.getInstance()
	                                            .getLogger("BSAlertClosedEvent");
	
	private BSAlertCloseEventDirective directive;
	
	/**
	 * Performs a click
	 *
	 * @param component The component this click is going to be acting on
	 */
	public BSAlertClosedEvent(Component component)
	{
		super(EventTypes.undefined, component);
		setComponent(component);
	}
	
	@Override
	public void fireEvent(AjaxCall<?> call, AjaxResponse<?> response)
	{
		try
		{
			onClosed(call, response);
		}
		catch (Exception e)
		{
			BSAlertClosedEvent.LOG.log(Level.SEVERE, "Error In Firing Event", e);
		}
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getDirective());
	}
	
	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
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
			              .addAttribute("ng-bs-alert-closed-directive",
			                            com.jwebmp.core.utilities.StaticStrings.STRING_ANGULAR_EVENT_START_SHORT +
					                            renderVariables() + STRING_CLOSING_BRACKET_SEMICOLON);
		}
		super.preConfigure();
	}
	
	/**
	 * Returns the angular directive associated with the right click event
	 *
	 * @return
	 */
	public BSAlertCloseEventDirective getDirective()
	{
		if (directive == null)
		{
			directive = new BSAlertCloseEventDirective();
		}
		return directive;
	}
	
	/**
	 * Sets the right click angular event
	 *
	 * @param directive
	 */
	public void setDirective(BSAlertCloseEventDirective directive)
	{
		this.directive = directive;
	}
	
	/**
	 * Triggers on Click
	 * <p>
	 *
	 * @param call     The physical AJAX call
	 * @param response The physical Ajax Receiver
	 */
	public abstract void onClosed(AjaxCall<?> call, AjaxResponse<?> response);
}
