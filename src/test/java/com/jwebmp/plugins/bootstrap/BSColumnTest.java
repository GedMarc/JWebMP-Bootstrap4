/*
 * Copyright (C) 2016 GedMarc
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
package com.jwebmp.plugins.bootstrap;

import com.jwebmp.plugins.bootstrap.containers.BSColumn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSColumnTest

{

	public BSColumnTest()
	{
	}

	@Test
	public void testNewInstance()
	{
		BSColumn column = BSColumn.newInstance();
		column.setID("id");
		System.out.println(column.toString(true));
		Assertions.assertEquals("<div class=\"col\" id=\"id\"></div>", column.toString(true));
	}

}
