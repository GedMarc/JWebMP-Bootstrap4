import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import com.jwebmp.plugins.bootstrap4.implementations.Bootstrap4ModuleInclusion;

module com.jwebmp.plugins.bootstrap4 {
 
	requires transitive com.jwebmp.core;
	requires transitive com.jwebmp.core.angularjs;

	requires jakarta.validation;
	requires com.guicedee.logmaster;
	requires java.logging;
	requires com.google.common;

	requires com.guicedee.guicedinjection;

	exports com.jwebmp.plugins.bootstrap4;
	exports com.jwebmp.plugins.bootstrap4.accordion;
	exports com.jwebmp.plugins.bootstrap4.alerts.events;
	exports com.jwebmp.plugins.bootstrap4.alerts.styles;
	exports com.jwebmp.plugins.bootstrap4.alerts;
	exports com.jwebmp.plugins.bootstrap4.badge;
	exports com.jwebmp.plugins.bootstrap4.badge.styles;
	exports com.jwebmp.plugins.bootstrap4.breadcrumbs;
	exports com.jwebmp.plugins.bootstrap4.buttons;
	exports com.jwebmp.plugins.bootstrap4.buttons.checkbox.styles;
	exports com.jwebmp.plugins.bootstrap4.buttons.checkbox;
	exports com.jwebmp.plugins.bootstrap4.buttons.groups;
	exports com.jwebmp.plugins.bootstrap4.buttons.groups.interfaces;
	exports com.jwebmp.plugins.bootstrap4.buttons.groups.options;
	exports com.jwebmp.plugins.bootstrap4.buttons.radio.styles;
	exports com.jwebmp.plugins.bootstrap4.buttons.radio;
	exports com.jwebmp.plugins.bootstrap4.buttons.switches;
	exports com.jwebmp.plugins.bootstrap4.buttons.styles;
	exports com.jwebmp.plugins.bootstrap4.buttons.toolbars;
	exports com.jwebmp.plugins.bootstrap4.cards;
	exports com.jwebmp.plugins.bootstrap4.cards.layout;
	exports com.jwebmp.plugins.bootstrap4.cards.parts;
	exports com.jwebmp.plugins.bootstrap4.cards.parts.interfaces;
	exports com.jwebmp.plugins.bootstrap4.cards.parts.styles;
	exports com.jwebmp.plugins.bootstrap4.cards.prebuilt;
	exports com.jwebmp.plugins.bootstrap4.cards.themed;
	exports com.jwebmp.plugins.bootstrap4.carousel;
	exports com.jwebmp.plugins.bootstrap4.carousel.parts;
	exports com.jwebmp.plugins.bootstrap4.carousel.events;
	exports com.jwebmp.plugins.bootstrap4.carousel.features;
	exports com.jwebmp.plugins.bootstrap4.carousel.options;
	exports com.jwebmp.plugins.bootstrap4.close;
	exports com.jwebmp.plugins.bootstrap4.collapse;
	exports com.jwebmp.plugins.bootstrap4.collapse.events.hidden;
	exports com.jwebmp.plugins.bootstrap4.collapse.events.hide;
	exports com.jwebmp.plugins.bootstrap4.collapse.events.show;
	exports com.jwebmp.plugins.bootstrap4.collapse.events.shown;
	exports com.jwebmp.plugins.bootstrap4.collapse.features;
	exports com.jwebmp.plugins.bootstrap4.containers;
	exports com.jwebmp.plugins.bootstrap4.dropdown;
	exports com.jwebmp.plugins.bootstrap4.dropdown.parts;
	exports com.jwebmp.plugins.bootstrap4.dropdown.events.hidden;
	exports com.jwebmp.plugins.bootstrap4.dropdown.events.hide;
	exports com.jwebmp.plugins.bootstrap4.dropdown.events.show;
	exports com.jwebmp.plugins.bootstrap4.dropdown.events.shown;
	exports com.jwebmp.plugins.bootstrap4.dropdown.interfaces;
	exports com.jwebmp.plugins.bootstrap4.dropdown.options;
	//exports com.jwebmp.plugins.bootstrap4.enumerations;
	exports com.jwebmp.plugins.bootstrap4.figures;
	exports com.jwebmp.plugins.bootstrap4.forms;
	exports com.jwebmp.plugins.bootstrap4.forms.groups;
	exports com.jwebmp.plugins.bootstrap4.forms.groups.enumerations;
	exports com.jwebmp.plugins.bootstrap4.forms.groups.sets;
	exports com.jwebmp.plugins.bootstrap4.forms.groups.sets.parts;
	exports com.jwebmp.plugins.bootstrap4.forms.controls;
	exports com.jwebmp.plugins.bootstrap4.forms.interfaces;
	exports com.jwebmp.plugins.bootstrap4.images;
	exports com.jwebmp.plugins.bootstrap4.jumbotron;
	exports com.jwebmp.plugins.bootstrap4.jumbotron.interfaces;
	exports com.jwebmp.plugins.bootstrap4.listgroup;
	exports com.jwebmp.plugins.bootstrap4.listgroup.parts;
	exports com.jwebmp.plugins.bootstrap4.listgroup.tabs;
	exports com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.hiddenbstab;
	exports com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.hidebstab;
	exports com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.showbstab;
	exports com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.shownbstab;
	exports com.jwebmp.plugins.bootstrap4.media;
	exports com.jwebmp.plugins.bootstrap4.media.parts;
	exports com.jwebmp.plugins.bootstrap4.modal;
	exports com.jwebmp.plugins.bootstrap4.modal.events.hidden;
	exports com.jwebmp.plugins.bootstrap4.modal.events.hide;
	exports com.jwebmp.plugins.bootstrap4.modal.events.show;
	exports com.jwebmp.plugins.bootstrap4.modal.events.shown;
	exports com.jwebmp.plugins.bootstrap4.modal.parts;
	exports com.jwebmp.plugins.bootstrap4.modal.features;
	exports com.jwebmp.plugins.bootstrap4.navbar;
	exports com.jwebmp.plugins.bootstrap4.navbar.parts;
	exports com.jwebmp.plugins.bootstrap4.navbar.enumerations;
	exports com.jwebmp.plugins.bootstrap4.navbar.interfaces;
	exports com.jwebmp.plugins.bootstrap4.navbar.toggler;
	exports com.jwebmp.plugins.bootstrap4.navs;
	exports com.jwebmp.plugins.bootstrap4.navs.parts;
	exports com.jwebmp.plugins.bootstrap4.navs.interfaces;
	exports com.jwebmp.plugins.bootstrap4.options;
	exports com.jwebmp.plugins.bootstrap4.options.interfaces;
	exports com.jwebmp.plugins.bootstrap4.pagination;
	exports com.jwebmp.plugins.bootstrap4.pagination.parts;
	exports com.jwebmp.plugins.bootstrap4.pagination.options;
	exports com.jwebmp.plugins.bootstrap4.popovers;
	exports com.jwebmp.plugins.bootstrap4.popovers.interfaces;
	exports com.jwebmp.plugins.bootstrap4.progressbar;
	exports com.jwebmp.plugins.bootstrap4.progressbar.bar;
	exports com.jwebmp.plugins.bootstrap4.progressbar.interfaces;
	exports com.jwebmp.plugins.bootstrap4.select;
	exports com.jwebmp.plugins.bootstrap4.range;
	exports com.jwebmp.plugins.bootstrap4.tables;
	exports com.jwebmp.plugins.bootstrap4.toggle;
	exports com.jwebmp.plugins.bootstrap4.toasts;
	exports com.jwebmp.plugins.bootstrap4.toasts.features;
	exports com.jwebmp.plugins.bootstrap4.toasts.events;
	exports com.jwebmp.plugins.bootstrap4.tooltips;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bootstrap4.BootstrapPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bootstrap4.implementations.Bootstrap4ExclusionsModule;

	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.bootstrap4.collapse.events.show.BSCollapseShowDirective, com.jwebmp.plugins.bootstrap4.collapse.events.shown.BSCollapseShownDirective, com.jwebmp.plugins.bootstrap4.collapse.events.hide.BSCollapseHideDirective, com.jwebmp.plugins.bootstrap4.collapse.events.hidden.BSCollapseHiddenDirective, com.jwebmp.plugins.bootstrap4.dropdown.events.show.BSDropDownShowDirective, com.jwebmp.plugins.bootstrap4.dropdown.events.shown.BSDropDownShownDirective, com.jwebmp.plugins.bootstrap4.dropdown.events.hidden.BSDropDownHiddenDirective, com.jwebmp.plugins.bootstrap4.dropdown.events.hide.BSDropDownHideDirective, com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.hiddenbstab.HiddenBSTabDirective, com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.hidebstab.HideBSTabDirective, com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.showbstab.ShowBSTabDirective, com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.shownbstab.ShownBSTabDirective, com.jwebmp.plugins.bootstrap4.toasts.events.BSToastShowEventDirective, com.jwebmp.plugins.bootstrap4.toasts.events.BSToastHiddenEventDirective, com.jwebmp.plugins.bootstrap4.toasts.events.BSToastHideEventDirective, com.jwebmp.plugins.bootstrap4.toasts.events.BSToastShownEventDirective;
	
	provides IGuiceScanModuleInclusions with Bootstrap4ModuleInclusion;
	
	opens com.jwebmp.plugins.bootstrap4 to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.accordion to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.alerts.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.alerts.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.alerts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.badge to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.badge.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.breadcrumbs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.buttons to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.buttons.checkbox.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.buttons.checkbox to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.buttons.groups to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.buttons.groups.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.buttons.groups.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.buttons.radio.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.buttons.radio to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.buttons.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.buttons.toolbars to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.cards to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.cards.layout to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.cards.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.cards.parts.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.cards.parts.styles to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.cards.prebuilt to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.cards.themed to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.carousel to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.carousel.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.carousel.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.carousel.features to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.carousel.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.close to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.collapse to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.collapse.events.hidden to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.collapse.events.hide to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.collapse.events.show to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.collapse.events.shown to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.collapse.features to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.containers to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.dropdown to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.dropdown.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.dropdown.events.hidden to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.dropdown.events.hide to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.dropdown.events.show to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.dropdown.events.shown to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.dropdown.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.dropdown.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.figures to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.forms to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.forms.groups to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.forms.groups.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.forms.groups.sets to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.forms.groups.sets.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.forms.controls to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.forms.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.images to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.jumbotron to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.jumbotron.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.listgroup to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.listgroup.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.listgroup.tabs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.hiddenbstab to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.hidebstab to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.showbstab to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.shownbstab to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.media to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.media.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.modal to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.modal.events.hidden to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.modal.events.hide to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.modal.events.show to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.modal.events.shown to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.modal.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.modal.features to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.navbar to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.navbar.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.navbar.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.navbar.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.navbar.toggler to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.navs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.navs.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.navs.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.select to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.options.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.pagination to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.pagination.parts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.pagination.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.popovers to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.popovers.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.progressbar to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.progressbar.bar to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.progressbar.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.range to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.tables to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.toasts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.toasts.features to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.toasts.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.toggle to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap4.tooltips to com.fasterxml.jackson.databind, com.jwebmp.core;
}
