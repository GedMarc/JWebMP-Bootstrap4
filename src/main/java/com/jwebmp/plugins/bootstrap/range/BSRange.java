package com.jwebmp.plugins.bootstrap.range;

import com.jwebmp.core.base.html.inputs.InputRangeType;

public class BSRange<J extends BSRange<J>>
		extends InputRangeType<J>
{
	public BSRange()
	{
		addClass("custom-range");
	}
}
