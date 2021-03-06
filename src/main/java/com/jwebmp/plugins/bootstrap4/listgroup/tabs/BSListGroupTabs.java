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

package com.jwebmp.plugins.bootstrap4.listgroup.tabs;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.containers.BSColumn;
import com.jwebmp.plugins.bootstrap4.containers.BSRow;
import com.jwebmp.plugins.bootstrap4.listgroup.BSListGroup;
import com.jwebmp.plugins.bootstrap4.options.BSColumnOptions;

import jakarta.validation.constraints.NotNull;
import java.util.LinkedHashSet;
import java.util.Set;

public class BSListGroupTabs<J extends BSListGroupTabs<J>>
		extends BSRow<J>
		implements IBSListGroupTabs<J>
{
	private final Set<BSTabContainer<?>> tabs;

	private BSListGroup<?> listGroup;

	private BSColumn<?> leftSidePane;
	private BSColumn<?> rightSidePane;

	private BSColumn<?> tabContentHolder;

	/**
	 * A vertical list group controlling the display of content on the left
	 */
	public BSListGroupTabs()
	{
		listGroup = new BSListGroup<>();
		listGroup.setTag("div");
		listGroup.addAttribute("role", "tablist");

		leftSidePane = new BSColumn<>(BSColumnOptions.Col_4);
		rightSidePane = new BSColumn<>(BSColumnOptions.Col_8);

		tabContentHolder = new BSColumn<>();
		tabContentHolder.addClass("tab-content");

		tabs = new LinkedHashSet<>();
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			add(leftSidePane);
			leftSidePane.add(listGroup);
			add(rightSidePane);
			rightSidePane.add(tabContentHolder);
			tabs.forEach(a ->
			             {
				             a.configure();
				             listGroup.add(a.getButtonItem());
				             tabContentHolder.add(a.getTabPane());
			             });
		}
		super.preConfigure();
	}

	/**
	 * A better smaller neater view
	 *
	 * @return
	 */
	public IBSListGroupTabs<J> asMe()
	{
		return this;
	}

	/**
	 * Sets the columns to ocuppy for the list group
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setLeftSidePaneOptions(BSColumnOptions columnOptions)
	{
		leftSidePane.addClass(columnOptions);
		return (J) this;
	}

	/**
	 * Sets the columns to ocuppy for the content
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setRightSidePaneOptions(BSColumnOptions columnOptions)
	{
		rightSidePane.addClass(columnOptions);
		return (J) this;
	}

	/**
	 * Adds a tab the container, it gets built on configure.
	 *
	 * @param label
	 * @param content
	 * @param active
	 *
	 * @return
	 */
	@Override
	public BSTabContainer<?> addTab(String label, IComponentHierarchyBase<?,?> content, boolean active)
	{
		BSTabContainer<?> tab = new BSTabContainer<>(active, content, label);
		getTabs().add(tab);
		return tab;
	}
	
	public BSListGroup<?> getListGroup()
	{
		return listGroup;
	}
	
	public BSListGroupTabs<J> setListGroup(BSListGroup<?> listGroup)
	{
		this.listGroup = listGroup;
		return this;
	}
	
	public BSColumn<?> getLeftSidePane()
	{
		return leftSidePane;
	}
	
	public BSListGroupTabs<J> setLeftSidePane(BSColumn<?> leftSidePane)
	{
		this.leftSidePane = leftSidePane;
		return this;
	}
	
	public BSColumn<?> getRightSidePane()
	{
		return rightSidePane;
	}
	
	public BSListGroupTabs<J> setRightSidePane(BSColumn<?> rightSidePane)
	{
		this.rightSidePane = rightSidePane;
		return this;
	}
	
	public BSColumn<?> getTabContentHolder()
	{
		return tabContentHolder;
	}
	
	public BSListGroupTabs<J> setTabContentHolder(BSColumn<?> tabContentHolder)
	{
		this.tabContentHolder = tabContentHolder;
		return this;
	}
	
	/**
	 * Returns the set of tabs currently registered
	 *
	 * @return
	 */
	@Override
	@NotNull
	public Set<BSTabContainer<?>> getTabs()
	{
		return tabs;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
