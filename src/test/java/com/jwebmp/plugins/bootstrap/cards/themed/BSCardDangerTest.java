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

package com.jwebmp.plugins.bootstrap.cards.themed;

import com.jwebmp.plugins.bootstrap.cards.BSCard;
import org.junit.jupiter.api.Test;

public class BSCardDangerTest

{
	@Test
	public void testPrimary()
	{
		BSCard card = new BSCardPrimary();
		System.out.println(card.toString(0));
	}

	@Test
	public void testSecondary()
	{
		BSCard card = new BSCardSecondary();
		System.out.println(card.toString(0));
	}

	@Test
	public void testWarning()
	{
		BSCard card = new BSCardWarning();
		System.out.println(card.toString(0));
	}

	@Test
	public void testDanger()
	{
		BSCard card = new BSCardDanger();
		System.out.println(card.toString(0));
	}

	@Test
	public void testInfo()
	{
		BSCard card = new BSCardInfo();
		System.out.println(card.toString(0));
	}

	@Test
	public void testLight()
	{
		BSCard card = new BSCardLight();
		System.out.println(card.toString(0));
	}

	@Test
	public void testDark()
	{
		BSCard card = new BSCardDark();
		System.out.println(card.toString(0));
	}

	@Test
	public void testPrimaryOutline()
	{
		BSCard card = new BSCardPrimaryOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testSecondaryOutline()
	{
		BSCard card = new BSCardSecondaryOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testWarningOutline()
	{
		BSCard card = new BSCardWarningOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testDangerOutline()
	{
		BSCard card = new BSCardDangerOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testInfoOutline()
	{
		BSCard card = new BSCardInfoOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testLightOutline()
	{
		BSCard card = new BSCardLightOutline();
		System.out.println(card.toString(0));
	}

	@Test
	public void testDarkOutline()
	{
		BSCard card = new BSCardDarkOutline();
		System.out.println(card.toString(0));
	}

}
