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

import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSButtonTest

{

	public BSButtonTest()
	{
	}

	@Test
	public void testPreConfigure()
	{
		BSButton button = new BSButton();
		button.setTag("a");

		System.out.println(button.toString(true));

		button = new BSButton();
		button.setTag("a");
		button.setDisabled(true);

		System.out.println(button.toString(true));
	}

	@Test
	public void testSetSize()
	{
		BSButton button = new BSButton();
		button.setSize(BSButtonSizeOptions.Btn_Lg)
		      .setDangerOutline(true);

		System.out.println(button.toString(true));
	}

	@Test
	public void testSetPressed()
	{
		BSButton button = new BSButton();
		button.setPressed(true);

		System.out.println(button.toString(true));
		button.setPressed(false);

		System.out.println(button.toString(true));
	}

	@Test
	public void testSetDisabled()
	{
		BSButton button = new BSButton();
		button.setDisabled(true);

		System.out.println(button.toString(true));
		button.setDisabled(false);

		System.out.println(button.toString(true));
	}

	@Test
	public void testSetPrimary()
	{
		BSButton button = new BSButton();
		button.setPrimary(true);

		System.out.println(button.toString(true));
		button.setPrimary(false);

		System.out.println(button.toString(true));
	}

	@Test
	public void testSetSecondary()
	{
		BSButton button = new BSButton();
		button.setSecondary(true);

		System.out.println(button.toString(true));
		button.setSecondary(false);

		System.out.println(button.toString(true));
	}

}
