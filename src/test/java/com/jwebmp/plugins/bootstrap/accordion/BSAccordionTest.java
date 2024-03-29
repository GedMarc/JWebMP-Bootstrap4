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
package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import org.junit.jupiter.api.*;

/**
 * @author GedMarc
 */
public class BSAccordionTest

{

    public BSAccordionTest()
    {
    }

    @Test
    public void testHtml()
    {
        BSAccordion accordion = new BSAccordion();
        accordion.setID("test");

        accordion.addPanel("static-1", new BSAccordionPanelHeader<>().addTitle(new Button<>("Title 1")),
                new BSAccordionPanelContent<>().add("Content 1"), true);

        System.out.println(accordion.toString(true));
    }

}
