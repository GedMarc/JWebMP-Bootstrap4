package com.jwebmp.plugins.bootstrap.carousel.events;

import com.jwebmp.core.base.angular.modules.services.*;
import com.jwebmp.core.base.angular.modules.services.angular.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.services.annotations.functions.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

import java.util.*;

@NgDirective(selector = "[slideClassName]")
@NgImportReference(name = "ElementRef", reference = "@angular/core")
@NgImportReference(name = "Input", reference = "@angular/core")
@NgImportReference(name = "HostListener", reference = "@angular/core")
@NgImportReference(name = "RouterModule, ParamMap,Router", reference = "@angular/router")
@NgComponentReference(SocketClientService.class)
@NgImportReference(name = "NgbCarousel, NgbSlideEvent, NgbSlideEventSource", reference = "@ng-bootstrap/ng-bootstrap")
@NgOnInit
public class OnSlidListenerDirective implements INgDirective<OnSlidListenerDirective>
{
	public OnSlidListenerDirective()
	{
	}
	
	@Override
	public List<String> constructorParameters()
	{
		return List.of("private elementRef: ElementRef");
	}
	
	@Override
	public List<String> fields()
	{
		return List.of("@Input() slideClassName: string ='';");
	}
	
	@Override
	public List<String> methods()
	{
		return List.of("ngOnInit() {}\n",
				"@HostListener('slide', ['$event'])\n" +
				"onSlide(slideEvent: NgbSlideEvent) {\n" +
				"  this.socketClientService.send('ajax',{eventClass : this.slideClassName},'onSlide',slideEvent,this.elementRef);\n" +
				"}\n");
	}
	
}
