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
package com.jwebmp.plugins.bootstrap4.accordion;

import com.jwebmp.BaseTestClass;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardBody;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSAccordionTest
		extends BaseTestClass
{

	public BSAccordionTest()
	{
	}

	@Test
	public void testHtml()
	{
		BSAccordion accordion = new BSAccordion();
		accordion.setID("test");
		accordion.addCard("Accordion Header", new BSCardBody<>(), true);


		System.out.println(accordion.toString(true));
	}

}
