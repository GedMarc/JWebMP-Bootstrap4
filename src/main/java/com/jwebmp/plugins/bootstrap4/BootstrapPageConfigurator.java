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
package com.jwebmp.plugins.bootstrap4;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.client.Browsers;
import com.jwebmp.core.base.html.Meta;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.MetaAttributes;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
 * <p>
 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via
 * file://
 */
@PluginInformation(pluginName = "Bootstrap 4",
		pluginDescription = "Bootstrap is the most popular HTML, CSS, and JS framework for developing responsive, mobile first projects " +
		                    "on" +
		                    " the web.<br/> We are bootstrap 4 ready!",
		pluginUniqueName = "jwebswing-bootstrap",
		pluginVersion = "4.0",
		pluginCategories = "bootstrap,ui,web ui, framework",
		pluginSubtitle = "Bootstrap makes front-end web development faster and easier.",
		pluginSourceUrl = "http://getbootstrap.com/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin",
		pluginIconUrl = "bower_components/bootstrap/bootstrapicon.jpg",
		pluginIconImageUrl = "bower_components/bootstrap/bootstraplogo.jpg",
		pluginOriginalHomepage = "http://getbootstrap.com/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BootstrapPlugin.jar/download")
public class BootstrapPageConfigurator
		implements IPageConfigurator
{
	private static final long serialVersionUID = 1L;

	/**
	 * If bootstrap 4 must include the reboot css
	 */
	private static boolean bootstrap4Reboot;

	/**
	 * The default page configurator for bootstrap
	 */
	public BootstrapPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * If bootstrap 4 must include the reboot css class
	 *
	 * @return
	 */
	public static boolean isBootstrap4Reboot()
	{
		return bootstrap4Reboot;
	}

	/**
	 * If bootstrap 4 must include the reboot css class
	 *
	 * @param bootstrap4Reboot
	 */
	public static void setBootstrap4Reboot(boolean bootstrap4Reboot)
	{
		BootstrapPageConfigurator.bootstrap4Reboot = bootstrap4Reboot;
	}

	/**
	 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
	 * <p>
	 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page
	 * via file://
	 *
	 * @return
	 */
	@Override
	public Page configure(Page<?> page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			Meta charMeta = new Meta();
			charMeta.addAttribute(MetaAttributes.Charset, "utf-16");

			Meta viewportMeta = new Meta();
			viewportMeta.addAttribute(GlobalAttributes.Name, "viewport");
			viewportMeta.addAttribute(MetaAttributes.Content, "width=device-width, initial-scale=1, shrink-to-fit=no, maximum-scale=1,user-scalable=no");

			Meta compatMeta = new Meta();
			compatMeta.addAttribute(MetaAttributes.Http_Equiv, "X-UA-Compatible");
			compatMeta.addAttribute(MetaAttributes.Content, "IE=Edge");

			page.getHead()
			    .add(charMeta);
			page.getHead()
			    .add(compatMeta);
			page.getHead()
			    .add(viewportMeta);

			page.getBody()
			    .addJavaScriptReference(BootstrapReferencePool.Bootstrap4PopperReference.getJavaScriptReference());
			page.getBody()
			    .addJavaScriptReference(BootstrapReferencePool.Bootstrap4CoreReference.getJavaScriptReference());
			page.getBody()
			    .addCssReference(BootstrapReferencePool.Bootstrap4CoreReference.getCssReference());

			if (bootstrap4Reboot)
			{
				page.getBody()
				    .addCssReference(BootstrapReferencePool.Bootstrap4RebootReference.getCssReference());
			}
			if (page.getBrowser()
			        .compareTo(Browsers.InternetExplorer9) < 1)
			{
				page.getBody()
				    .addJavaScriptReference(new JavascriptReference("html5shim", 1.0, "https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js", RequirementsPriority.Fourth));
				page.getBody()
				    .addJavaScriptReference(new JavascriptReference("html5shimrespond", 1.0, "https://oss.maxcdn.com/respond/1.4.2/respond.min.js", RequirementsPriority.Fourth));
			}

		}
		return page;
	}

}