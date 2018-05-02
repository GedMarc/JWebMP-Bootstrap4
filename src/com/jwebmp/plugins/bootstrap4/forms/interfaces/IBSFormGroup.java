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

package com.jwebmp.plugins.bootstrap4.forms.interfaces;

import com.jwebmp.base.angular.forms.enumerations.InputErrorValidations;
import com.jwebmp.base.html.Input;
import com.jwebmp.base.html.SmallText;
import com.jwebmp.base.interfaces.ICssStructure;
import com.jwebmp.generics.TopOrBottom;
import com.jwebmp.plugins.bootstrap4.forms.BSForm;
import com.jwebmp.plugins.bootstrap4.forms.BSFormLabel;
import com.jwebmp.plugins.bootstrap4.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.enumerations.BSFormGroupSizes;
import com.jwebmp.plugins.bootstrap4.options.BSColumnOptions;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

public interface IBSFormGroup<J extends BSFormGroup<J, I>, I extends Input<?, ?>>
		extends ICssStructure<J>
{
	@NotNull
	@SuppressWarnings("unchecked")
	BSFormLabel<?> addLabel(String text);

	@NotNull
	@SuppressWarnings("unchecked")
	I setInput(@NotNull I inputComponent);

	/**
	 * Adds a success feedback configured with styled if it is set before it
	 * <p>
	 * make sure to style before this method
	 *
	 * @param feedback
	 * @param inline
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J addSuccessFeedback(String feedback, boolean inline);

	/**
	 * Returns the associated form
	 *
	 * @return
	 */
	BSForm<?> getForm();

	/**
	 * Sets the form
	 *
	 * @param form
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setForm(BSForm<?> form);

	/**
	 * Returns the input component associated
	 *
	 * @return
	 */
	@Nullable
	I getInput();

	@NotNull
	@SuppressWarnings("unchecked")
	SmallText<?> addHelpText(String text);

	@SuppressWarnings("unchecked")
	@NotNull
	J addMessage(@NotNull InputErrorValidations forError, String message, boolean inline);

	@SuppressWarnings("unchecked")
	@NotNull
	J addMessage(@NotNull InputErrorValidations forError, String message);

	/**
	 * Gets the position to place the angular messages in the component
	 *
	 * @return
	 */
	TopOrBottom getMessagePlacement();

	/**
	 * Sets the message placement
	 *
	 * @param messagePlacement
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setMessagePlacement(@NotNull TopOrBottom messagePlacement);

	/**
	 * Sets the size of the input controller
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setSize(BSFormGroupSizes size);

	/**
	 * Add the readonly boolean attribute on an input to prevent modification of the input’s value. Read-only inputs appear lighter (just
	 * like disabled inputs), but retain the standard cursor.
	 *
	 * @param readOnly
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setReadOnly(boolean readOnly);

	/**
	 * Readonly plain text
	 * If you want to have input readonly elements in your form styled as plain text, use the .form-control-plaintext class to remove the
	 * default form field styling and preserve the correct margin and padding.
	 *
	 * @param asPlainText
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setPlainText(boolean asPlainText);

	/**
	 * Horizontal form
	 * Create horizontal forms with the grid by adding the .row class to form groups and using the .col-*-* classes to specify the width of
	 * your labels and controls. Be sure to add .col-form-label to your labels as well so they’re vertically centered with their
	 * associated form controls.
	 * <p>
	 * At times, you maybe need to use margin or padding utilities to create that perfect alignment you need. For example, we’ve removed
	 * the
	 * padding-top on our stacked radio inputs label to better align the text baseline.
	 *
	 * @param labelSpan
	 * @param inputSpan
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J asHorizontalLayout(BSColumnOptions labelSpan, BSColumnOptions inputSpan);

	/**
	 * Returns the label associated
	 *
	 * @return
	 */
	@Nullable
	BSFormLabel<?> getLabel();

	/**
	 * Sets if the input update binding should occur and validate when the field is left
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J updateOnBlur();

	/**
	 * Sets to display if the field must display styled before action has occured
	 *
	 * @param validity
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setDisplayValidity(boolean validity);
}