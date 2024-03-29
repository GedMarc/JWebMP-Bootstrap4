package com.jwebmp.plugins.bootstrap.media.parts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap.media.BSComponentMediaOptions;
import com.jwebmp.plugins.bootstrap.media.BSMediaChildren;

public class BSMediaBody<J extends BSMediaBody<J>>
		extends DivSimple<J>
		implements BSMediaChildren
{
	/**
	 * The media image logo
	 */
	public BSMediaBody()
	{
		this(null);
	}

	/**
	 * Construct a new Image
	 *
	 * @param image
	 */
	public BSMediaBody(String image)
	{
		super(image);
		addClass(BSComponentMediaOptions.Media_Body);
	}

}
