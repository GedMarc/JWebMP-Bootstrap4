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
package com.jwebmp.plugins.bootstrap.buttons;

import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.guicedee.services.jsonrepresentation.json.StaticStrings;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 */
public enum BSButtonAttributes
		implements AttributeDefinitions
{
	/**
	 * Button tags
	 * <p>
	 * <p>
	 * The .btn classes are designed to be used with the &lt;button&gt; element. However, you can also use these classes on &lt;a&gt; or
	 * &lt;input&gt; elements (though some browsers may apply a
	 * slightly different rendering).
	 * <p>
	 * When using button classes on &lt;a&gt; elements that are used to trigger in-page functionality (like collapsing content), rather
	 * than
	 * linking to new pages or sections within the current page,
	 * these links should be given a role="button" to appropriately convey their purpose to assistive technologies such as screen readers.
	 */
	Role,
	/**
	 * Disabled state
	 * <p>
	 * Make buttons look inactive by adding the disabled boolean attribute to any button element.
	 * <p>
	 * Heads up! IE9 and below render disabled buttons with gray, shadowed text that we can’t override.
	 * <p>
	 */
	Disabled(true),
	/**
	 * if it toggles something
	 */
	Data_Toggle,
	Data_Dismiss,
	Visibility;

	private boolean isKeyword;

	BSButtonAttributes()
	{
	}

	BSButtonAttributes(boolean isKeyword)
	{
		this.isKeyword = isKeyword;
	}

	@Override
	public boolean isKeyword()
	{
		return isKeyword;
	}

	/**
	 * Returns the attribute name replacing all underscores with dashes and all dollar signs to empty
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH)
		             .replace("$", "");
	}
}
