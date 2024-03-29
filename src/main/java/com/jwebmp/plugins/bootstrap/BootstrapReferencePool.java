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

import com.jwebmp.core.base.references.*;
import com.jwebmp.core.base.servlets.enumarations.*;
import com.jwebmp.core.base.servlets.interfaces.*;

/**
 * @author GedMarc
 * @since 20 Apr 2016
 */
public enum BootstrapReferencePool
		implements ReferencePool
{
	
	Bootstrap4CoreReference(new JavascriptReference("BS5Core", 5.02, "node_modules/bootstrap/dist/js/bootstrap.min.js", 10),
			new CSSReference("BS5Core", 5.02, "node_modules/bootstrap/dist/css/bootstrap.min.css", 10)),
	
	Bootstrap5PopperReference(new JavascriptReference("BS5Popper", 5.02, "node_modules/@popperjs/core/dist/umd/popper.min.js", 9), null),
	Bootstrap4PopperReference(new JavascriptReference("BS4Popper", 5.02, "node_modules/popper.js/dist/umd/popper.min.js", 9), null),
	
	Bootstrap4RebootReference(null, new CSSReference("BS5Reboot", 5.02, "node_modules/bootstrap/dist/css/bootstrap-reboot.min.css", 9));
	
	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;
	
	BootstrapReferencePool()
	{
	}
	
	BootstrapReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
	{
		this.javaScriptReference = javaScriptReference;
		if (this.javaScriptReference != null)
		{
			this.javaScriptReference.setPriority(RequirementsPriority.Third);
		}
		this.cssReference = cssReference;
		if (this.cssReference != null)
		{
			this.cssReference.setPriority(RequirementsPriority.Third);
		}
	}
	
	@Override
	public CSSReference getCssReference()
	{
		return cssReference;
	}
	
	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
	}
	
	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}
	
	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}
}
