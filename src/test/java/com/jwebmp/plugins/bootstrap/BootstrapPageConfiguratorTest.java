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
package com.jwebmp.plugins.bootstrap;

import com.jwebmp.core.Page;

/**
 * @author GedMarc
 */
public class BootstrapPageConfiguratorTest

{
	public BootstrapPageConfiguratorTest()
	{
	}

	@org.junit.jupiter.api.Test
	public void testPageConfigurationBS4()
	{
		Page<?> p = new Page();
	
		BootstrapPageConfigurator bpc = new BootstrapPageConfigurator();
		bpc.configure(p);
		System.out.println(p.toString(true));
	}
}
