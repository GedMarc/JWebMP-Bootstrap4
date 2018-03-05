package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.styles;

import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.BSCardButton;

/**
 * Constructs a new card button (a link behaving as a button)
 *
 * @author GedMarc
 * @since 3 March 2018
 */
public class BSCardButtonPrimary<J extends BSCardButtonPrimary<J>>
		extends BSCardButton<J>
{
	/**
	 * @author GedMarc
	 * @since 16 Feb 2017
	 */
	public BSCardButtonPrimary()
	{
		this(null);
	}

	/**
	 * a new card button
	 *
	 * @param text
	 */
	public BSCardButtonPrimary(String text)
	{
		super(text);
		addClass(BSButtonOptions.Btn_Primary);
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