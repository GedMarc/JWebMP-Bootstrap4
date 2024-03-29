package com.jwebmp.plugins.bootstrap.tables;

import com.jwebmp.plugins.bootstrap.options.BSBackgroundOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRowDarkWarning<J extends BSTableRowDarkWarning<J>>
		extends BSTableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 */
	public BSTableRowDarkWarning()
	{
		super(BSBackgroundOptions.Bg_Warning);
	}
}
