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
package com.jwebmp.plugins.bootstrap4;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.client.Browsers;
import com.jwebmp.core.base.client.InternetExplorerCompatibilityMode;
import com.jwebmp.core.base.html.Meta;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.MetaAttributes;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
 * <p>
 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via
 * file://
 */
@PluginInformation(pluginName = "Bootstrap",
		pluginDescription = "Bootstrap is the most popular HTML, CSS, and JS framework for developing responsive, mobile first projects " +
		                    "on the web",
		pluginUniqueName = "bootstrap",
		pluginVersion = "4.5.3",
		pluginCategories = "bootstrap,ui,web ui, framework",
		pluginSubtitle = "Bootstrap makes front-end web development faster and easier.",
		pluginSourceUrl = "http://getbootstrap.com/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://getbootstrap.com/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.bootstrap/jwebmp-bootstrap",
		pluginGroupId = "com.jwebmp.plugins.bootstrap",
		pluginArtifactId = "jwebmp-bootstrap",
		pluginModuleName = "com.jwebmp.plugins.bootstrap4",
		pluginStatus = PluginStatus.Released
)
public class BootstrapPageConfigurator
		implements IPageConfigurator<BootstrapPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
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
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return BootstrapPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		BootstrapPageConfigurator.enabled = mustEnable;
	}

	/**
	 * If bootstrap 4 must include the reboot css class
	 *
	 * @return
	 */
	public static boolean isBootstrap4Reboot()
	{
		return BootstrapPageConfigurator.bootstrap4Reboot;
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
	@NotNull
	@Override
	public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{

			JQueryPageConfigurator.setRequired(true);
			Meta charMeta = new Meta();
			charMeta.addAttribute(MetaAttributes.Charset, "utf-16");
			Meta viewportMeta = new Meta(Meta.MetadataFields.ViewPort,"width=device-width, initial-scale=1, shrink-to-fit=no, maximum-scale=1,user-scalable=no");
			page.getOptions().setCompatibilityMode(InternetExplorerCompatibilityMode.Edge);

			page.getHead()
			    .add(charMeta);
			page.getHead()
			    .add(viewportMeta);

			page.getBody()
			    .addJavaScriptReference(BootstrapReferencePool.Bootstrap4PopperReference.getJavaScriptReference());
			page.getBody()
			    .addJavaScriptReference(BootstrapReferencePool.Bootstrap4CoreReference.getJavaScriptReference());
			page.getBody()
			    .addCssReference(BootstrapReferencePool.Bootstrap4CoreReference.getCssReference());

			if (BootstrapPageConfigurator.bootstrap4Reboot)
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

	@Override
	public boolean enabled()
	{
		return BootstrapPageConfigurator.enabled;
	}

}
