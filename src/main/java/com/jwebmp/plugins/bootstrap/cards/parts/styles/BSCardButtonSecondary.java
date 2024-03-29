package com.jwebmp.plugins.bootstrap.cards.parts.styles;

import com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap.cards.parts.BSCardButton;

/**
 * Constructs a new card button (a link behaving as a button)
 *
 * @author GedMarc
 * @since 3 March 2018
 */
public class BSCardButtonSecondary<J extends BSCardButtonSecondary<J>>
		extends BSCardButton<J>
{
	/**
	 * @author GedMarc
	 * @since 16 Feb 2017
	 */
	public BSCardButtonSecondary()
	{
		this(null);
	}

	/**
	 * a new card button
	 *
	 * @param text
	 */
	public BSCardButtonSecondary(String text)
	{
		super(text);
		addClass(BSButtonOptions.Btn_Secondary);
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
