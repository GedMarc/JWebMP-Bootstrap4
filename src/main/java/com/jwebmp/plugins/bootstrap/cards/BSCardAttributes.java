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
package com.jwebmp.plugins.bootstrap.cards;

import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.guicedee.services.jsonrepresentation.json.StaticStrings;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Cards
 * <p>
 * A card is a flexible and extensible content container. It includes options for headers and footers, a wide variety of content, contextual
 * background colors, and powerful display options.
 * <p>
 * If you’re familiar with Bootstrap 3, cards replace our old panels, wells, and thumbnails. Similar functionality to those components is
 * available as modifier classes for cards.
 *
 * @author GedMarc
 */
public enum BSCardAttributes
		implements AttributeDefinitions
{
	Visibility;

	private boolean isKeyword;

	BSCardAttributes()
	{
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
