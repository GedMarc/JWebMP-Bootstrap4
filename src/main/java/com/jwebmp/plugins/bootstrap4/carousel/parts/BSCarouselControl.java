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
package com.jwebmp.plugins.bootstrap4.carousel.parts;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.carousel.BSCarousel;
import com.jwebmp.plugins.bootstrap4.carousel.BSCarouselChildren;

import java.util.Objects;

/**
 * Defines a control for the bootstrap carousel
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCarouselControl<J extends BSCarouselControl<J>>
		extends Link<J>
		implements BSCarouselChildren<IComponentHierarchyBase, J>
{


	/**
	 * The actual carousel
	 */
	private BSCarousel carousel;
	/**
	 * If this is a previous control, as opposed to next
	 */
	private boolean previous;
	/**
	 * The icon for this control, automatically gets next and previous added on
	 */
	private Span icon;

	/**
	 * Constructs with a carousel and a previous
	 *
	 * @param carousel
	 * @param previous
	 */
	public BSCarouselControl(BSCarousel carousel, boolean previous)
	{
		this.carousel = carousel;

		addAttribute("role", "button");

		if (previous)
		{
			addAttribute("data-slide", "prev");
		}
		else
		{
			addAttribute("data-slide", "next");
		}
		if (carousel != null)
		{
			addAttribute(LinkAttributes.HRef, carousel.getID(true));
		}
	}

	/**
	 * Returns the carousel
	 *
	 * @return
	 */
	public BSCarousel getCarousel()
	{
		if (carousel == null)
		{
			setCarousel(new BSCarousel());
		}
		return carousel;
	}

	/**
	 * Set carousel
	 *
	 * @param carousel
	 *
	 * @return
	 */
	public BSCarouselControl setCarousel(BSCarousel carousel)
	{
		this.carousel = carousel;
		return this;
	}

	/**
	 * Returns if this is a previous or next item
	 *
	 * @return
	 */
	public boolean isPrevious()
	{
		return previous;
	}

	/**
	 * Sets if this is a previous or next control
	 *
	 * @param previous
	 *
	 * @return
	 */
	public BSCarouselControl setPrevious(boolean previous)
	{
		this.previous = previous;
		return this;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getIcon());
	}

	@Override
	public boolean equals(Object obj)
	{
		return false;
	}

	/**
	 * Returns the span for the icon, auto generated if need be
	 *
	 * @return
	 */
	public Span getIcon()
	{
		return icon;
	}

	/**
	 * Sets the icon to the given item
	 *
	 * @param icon
	 *
	 * @return
	 */
	public BSCarouselControl setIcon(Span icon)
	{
		this.icon = icon;

		return this;
	}
}
