package com.jwebmp.plugins.bootstrap.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class BootstrapModuleInclusion implements IGuiceScanModuleInclusions<BootstrapModuleInclusion>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.bootstrap");
		return set;
	}
}
