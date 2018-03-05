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
package za.co.mmagon.jwebswing.plugins.bootstrap4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap4.containers.BSColumn;

/**
 * @author GedMarc
 */
public class BSColumnTest
		extends BaseTestClass
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