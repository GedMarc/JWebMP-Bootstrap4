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

package com.jwebmp.plugins.bootstrap4.jumbotron.interfaces;

import com.jwebmp.base.html.H1;
import com.jwebmp.base.html.HorizontalRule;
import com.jwebmp.base.html.Paragraph;
import com.jwebmp.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap4.jumbotron.BSJumbotron;

import javax.validation.constraints.NotNull;

public interface IBSJumbotron<J extends BSJumbotron<J>>
		extends ICssStructure<J>
{
	H1<?> addJumboText(String text);

	Paragraph<?> addLead(String text);

	HorizontalRule<?> addHorizontalRule();

	@SuppressWarnings("unchecked")
	@NotNull
	J setFluid();
}
