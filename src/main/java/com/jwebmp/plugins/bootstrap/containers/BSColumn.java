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
package com.jwebmp.plugins.bootstrap.containers;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSAlignmentCapable;

import static com.jwebmp.plugins.bootstrap.options.BSColumnOptions.*;

/**
 * Shortcut for writing column Div's and spans for bootstrap
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 10, 2016
 */
public class BSColumn<J extends BSColumn<J>>
		extends DivSimple<J>
	implements IBSAlignmentCapable<J>,BSRowChildren
{


	/**
	 * Supply a list of column options for this div
	 *
	 * @param columnOptions
	 */
	public BSColumn(IBSComponentOptions... columnOptions)
	{
		addClass(Col);
		if (columnOptions != null)
		{
			for (IBSComponentOptions columnOption : columnOptions)
			{
				if (!("W_100".equalsIgnoreCase(columnOption.name()) || "col".equalsIgnoreCase(columnOption.name())))
				{
					removeClass(Col);
				}
				addClass(columnOption.toString());
			}
		}
	}

	/**
	 * Constructs a new instance with the given column options
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	public static BSColumn<?> newInstance(IBSComponentOptions... columnOptions)
	{
		return new BSColumn(columnOptions);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return false;
	}
}
