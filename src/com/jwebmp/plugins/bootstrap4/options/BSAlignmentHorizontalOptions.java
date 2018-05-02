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
package com.jwebmp.plugins.bootstrap4.options;

import com.fasterxml.jackson.annotation.JsonValue;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * Vertical alignment
 * <p>
 * Change the alignment of elements with the vertical-alignment utilities.
 * <p>
 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
 * <p>
 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSAlignmentHorizontalOptions
		implements IBSComponentOptions
{
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Around("justify-content-around"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Between("justify-content-between"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Left("justify-content-start"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Center("justify-content-center"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Right("justify-content-end");

	private String bootstrap4Version;

	BSAlignmentHorizontalOptions(String bootstrap4Version)
	{
		//Nothing needed
		this.bootstrap4Version = bootstrap4Version;
	}

	@JsonValue
	@Override
	public String toString()
	{
		return bootstrap4Version.toLowerCase()
		                        .replaceAll("\\$", STRING_SPACE)
		                        .replace(CHAR_UNDERSCORE, CHAR_DASH);

	}
}