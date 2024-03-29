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
package com.jwebmp.plugins.bootstrap.buttons.groups;

import com.jwebmp.plugins.bootstrap.buttons.groups.options.BSButtonGroupSizeOptions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSButtonGroupTest
{

	public BSButtonGroupTest()
	{
	}

	@Test
	public void testSetAriaLabel()
	{
		BSButtonGroup group = new BSButtonGroup();
		group.setAriaLabel("Aria Aria ");

		System.out.println(group.toString(true));
	}

	@Test
	public void testSetSize()
	{
		BSButtonGroup group = new BSButtonGroup();
		group.setSize(BSButtonGroupSizeOptions.Btn_Group_Lg);

		System.out.println(group.toString(true));
	}

	@Test
	public void testStuff()
	{
		BSButtonGroup group = new BSButtonGroup();
		System.out.println(group.toString(true));
	}

	@Test
	public void testVertical()
	{
		BSButtonGroup group = new BSButtonGroupVertical();
		System.out.println(group.toString(true));
	}
}
