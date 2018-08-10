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
package com.jwebmp.plugins.bootstrap4.modal;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.buttons.BSButton;
import com.jwebmp.plugins.bootstrap4.modal.features.BSModalHideFeature;
import com.jwebmp.plugins.bootstrap4.modal.features.BSModalShowFeature;
import com.jwebmp.plugins.bootstrap4.modal.features.BSModalToggleFeature;
import com.jwebmp.plugins.bootstrap4.modal.parts.BSModalBody;
import com.jwebmp.plugins.bootstrap4.modal.parts.BSModalFooter;
import com.jwebmp.plugins.bootstrap4.modal.parts.BSModalHeader;
import com.jwebmp.plugins.bootstrap4.navbar.interfaces.BSNavBarChildren;
import com.jwebmp.plugins.bootstrap4.options.BSDefaultOptions;

import javax.validation.constraints.NotNull;

/**
 * Modal Modals are streamlined, but flexible dialog prompts powered by JavaScript. They support a number of use cases from user
 * notification to completely custom content and feature a handful of
 * helpful subcomponents, sizes, and more.
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 9 Nov 2016
 */
@ComponentInformation(name = "Bootstrap Modals",
		description = "Modal\n" +
		              "Use Bootstrap’s JavaScript modal plugin to add dialogs to your site for" +
		              " lightboxes, user " +
		              "notifications, or " +
		              "completely " +
		              "custom " +
		              "" +
		              "content.",
		url = "https://getbootstrap.com/docs/4.0/components/modal/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSModal<J extends BSModal<J>>
		extends Div<BSModalChildren, BSModalAttributes, BSModalFeatures, BSModalEvents, J>
		implements BSNavBarChildren, IBSModal<J>
{

	private static final long serialVersionUID = 1L;
	private BSModalFeature feature;
	/**
	 * The modal dialog
	 */
	private Div<GlobalChildren, ?, ?, ?, ?> modalDialog;
	/**
	 * The modal content
	 */
	private Div<GlobalChildren, ?, ?, ?, ?> modalContent;

	/**
	 * Modal Modals are streamlined, but flexible dialog prompts powered by JavaScript. They support a number of use cases from user
	 * notification to completely custom content and feature a handful of
	 * helpful subcomponents, sizes, and more.
	 */
	public BSModal()
	{
		addFeature(getFeature());
		addClass(BSModalOptions.Modal);
		addAttribute(BSModalAttributes.Role, "dialog");
		addAttribute(BSModalAttributes.TabIndex, "-1");
	}

	public final BSModalFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BSModalFeature(this);
		}
		return feature;
	}

	/**
	 * Adds the modal header to the content of the modal
	 *
	 * @return
	 */
	@Override
	public BSModalHeader<?> addModalHeader(boolean dismissButton)
	{
		BSModalHeader<?> modalHeader = new BSModalHeader<>();
		if (dismissButton)
		{
			modalHeader.addDissmissIcon();
		}
		getModalContent().add(modalHeader);
		return modalHeader;
	}

	/**
	 * Gets the modal content pane
	 *
	 * @return
	 */

	public Div<GlobalChildren, ?, ?, ?, ?> getModalContent()
	{
		if (modalContent == null)
		{
			setModalContent(new Div());
		}
		return modalContent;
	}

	public Div<GlobalChildren, ?, ?, ?, ?> getModalDialog()
	{
		if (modalDialog == null)
		{
			setModalDialog(new Div());
		}
		return modalDialog;
	}

	/**
	 * Sets the overall dialog of the modal
	 *
	 * @param modalDialog
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setModalDialog(Div modalDialog)
	{
		getChildren().remove(this.modalDialog);
		this.modalDialog = modalDialog;
		if (this.modalDialog != null)
		{
			getChildren().add(modalDialog);
			modalDialog.addClass(BSModalOptions.Modal_Dialog);
			modalDialog.addAttribute(BSModalAttributes.Role, "document");
		}
		return (J) this;
	}

	/**
	 * Sets the modal content pane
	 *
	 * @param modalContent
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setModalContent(Div modalContent)
	{
		getModalDialog().remove(this.modalContent);
		this.modalContent = modalContent;
		if (this.modalContent != null)
		{
			this.modalContent.addClass(BSModalOptions.Modal_Content);
			getModalDialog().add(this.modalContent);
		}
		return (J) this;
	}

	/**
	 * Adds the modal header to the content of the modal
	 *
	 * @return
	 */
	@Override
	public BSModalBody<?> addModalBody()
	{
		BSModalBody<?> modalBody = new BSModalBody<>();
		getModalContent().add(modalBody);
		return modalBody;
	}

	/**
	 * Adds the modal header to the content of the modal
	 *
	 * @return
	 */
	@Override
	public BSModalFooter<?> addModalFooter()
	{
		BSModalFooter<?> modalFooter = new BSModalFooter<>();
		getModalContent().add(modalFooter);
		return modalFooter;
	}

	@Override
	public BSButton<?> createDismissButton()
	{
		BSButton<?> button = new BSButton<>();
		return createDismissButton(button);
	}

	/**
	 * Adds the dismiss button to the modal
	 *
	 * @return
	 */
	@Override
	public <T extends ComponentHierarchyBase> T createDismissButton(T component)
	{
		component.addAttribute("data-dismiss", BSModalOptions.Modal.toString());
		component.addAttribute(ButtonAttributes.Data_Toggle.toString(), BSModalOptions.Modal.toString());
		component.setTag(ComponentTypes.Button.getComponentTag());
		component.addAttribute("type", ComponentTypes.Button.getComponentTag());
		return component;
	}

	/**
	 * Adds a button that will open up the modal
	 *
	 * @param button
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addOpenButton(Button button)
	{
		return addOpenButton((ComponentHierarchyBase) button);
	}

	/**
	 * Sets the size to render for the modal. By default medium. false sets small
	 *
	 * @param large
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setModalDialogSize(boolean large)
	{
		if (large)
		{
			getModalDialog().removeClass(BSModalOptions.Modal_Sm);
			getModalDialog().addClass(BSModalOptions.Modal_Lg);
		}
		else
		{
			getModalDialog().addClass(BSModalOptions.Modal_Sm);
			getModalDialog().removeClass(BSModalOptions.Modal_Lg);
		}
		return (J) this;
	}

	/**
	 * Includes a modal-backdrop element. Alternatively, specify static for a backdrop which doesn't close the modal on click.
	 *
	 * @param backdrop
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBackdrop(boolean backdrop)
	{
		addAttribute(BSModalAttributes.Data_Backdrop, backdrop);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFade()
	{
		addClass(BSDefaultOptions.Fade);
		return (J) this;
	}

	/**
	 * Puts the focus on the modal when initialized.
	 *
	 * @param focus
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFocus(boolean focus)
	{
		addAttribute(BSModalAttributes.Data_Focus, focus);
		return (J) this;
	}

	/**
	 * Closes the modal when escape key is pressed
	 *
	 * @param keyboard
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setKeyboard(boolean keyboard)
	{
		addAttribute(BSModalAttributes.Data_Keyboard, keyboard);
		return (J) this;
	}

	/**
	 * Shows the modal when initialized.
	 *
	 * @param show
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShow(boolean show)
	{
		addAttribute(BSModalAttributes.Data_Show, show);
		return (J) this;
	}

	/**
	 * Sets the dialog content container
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	@Override
	public J setModalDialogCenter(boolean centered)
	{
		getModalDialog().addClass("model-dialog-centered");
		return (J) this;
	}

	/**
	 * Adds a button that will open up the modal
	 *
	 * @param button
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addOpenButton(ComponentHierarchyBase button)
	{
		return addOpenButton(button, true);
	}

	/**
	 * Adds a button that will open up the modal
	 *
	 * @param button
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addOpenButton(ComponentHierarchyBase button, boolean setButtonTag)
	{
		if (setButtonTag)
		{
			button.setTag("button");
		}
		button.addAttribute(ButtonAttributes.Data_Toggle.toString(), BSModalOptions.Modal.toString());
		button.addAttribute(ButtonAttributes.Data_Target.toString(), getID(true));
		return (J) this;
	}

	/**
	 * Creates a show event for the create show feature
	 *
	 * @return
	 */
	@Override
	public BSModalShowFeature createShowFeature()
	{
		return new BSModalShowFeature(this);
	}

	/**
	 * Creates the hide feature
	 *
	 * @return
	 */
	@Override
	public BSModalHideFeature createHideFeature()
	{
		return new BSModalHideFeature(this);
	}

	/**
	 * Creates the toggle feature
	 *
	 * @return
	 */
	@Override
	public BSModalToggleFeature createToggleFeature()
	{
		return new BSModalToggleFeature(this);
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	/**
	 * Returns this modal with only its methods
	 *
	 * @return
	 */
	public IBSModal asMe()
	{
		return this;
	}
}