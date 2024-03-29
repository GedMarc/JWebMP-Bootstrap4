package com.jwebmp.plugins.bootstrap.forms.groups.sets;

import com.jwebmp.core.base.html.inputs.InputCheckBoxType;
import com.jwebmp.plugins.bootstrap.buttons.checkbox.BSCheckBox;
import com.jwebmp.plugins.bootstrap.dropdown.BSDropDown;
import com.jwebmp.plugins.bootstrap.forms.*;
import org.junit.jupiter.api.Test;

class BSFormInputGroupTest

{

	@Test
	void getInputGroupAddons()
	{
		BSForm<?> form = new BSForm<>("test",new FormDataServiceProvider());
		form.createTextInput("Binding", "Label", true)
		    .append("Appending")
		    .prepend("Prepending");

		System.out.println(form.toString(0));

		form.createTextInput("checkbox", "label", true)
		    .append(new BSCheckBox<>().setInput(new InputCheckBoxType<>()));
		
		BSDropDown<?> jbsDropDown = new BSDropDown<>();
		jbsDropDown.getDropDownMenu()
		           .addItem("Test Item");
		form.createTextInput("dropdowns?", "dropdowns", true)
		    .prepend(jbsDropDown);

		System.out.println(form.toString(0));

	}
}
