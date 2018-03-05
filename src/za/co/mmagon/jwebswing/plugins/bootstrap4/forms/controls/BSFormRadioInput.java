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
package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.controls;

import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.InputTypes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroupOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSFormCheckInput;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 18 Jan 2017
 */
public class BSFormRadioInput<J extends BSFormRadioInput<J>>
		extends BSFormCheckInput<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new Radio Input
	 *
	 * @param groupName
	 */
	public BSFormRadioInput(String groupName)
	{
		super(InputTypes.Radio);
		addClass(BSFormGroupOptions.Form_Check_Input);
		addAttribute(GlobalAttributes.Name, groupName);
		removeClass(BSFormGroupOptions.Form_Control);
	}

	/**
	 * Sets this radio item as checked
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setChecked()
	{
		addAttribute("checked", null);
		return (J) this;
	}

	/**
	 * Sets this radio item disabled
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled()
	{
		addAttribute("disabled", null);
		return (J) this;
	}
}
