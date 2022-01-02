package com.mindtree.stepDefination;


import org.apache.log4j.Logger;

import com.mindtree.manager.PageObjectManager;
import com.mindtree.utility.Logs;
import com.mindtree.pageobject.Servicesection;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServiceStepDefination {
	
	PageObjectManager pageManager;
	Servicesection Servicesection;
	Logs loggerUtil;
	Logger log;

	@When("^Click on Caseless Garage$")
	public void click_on_caseless_garage() throws Throwable {
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test2");
		pageManager = new PageObjectManager();
		Servicesection = pageManager.getServicesection();
		Servicesection.clickOn();
	}

	@Then("^Verify if Caseless Garage present in new page opened$")
	public void verify_if_caseless_garage_present_in_new_page_opened() throws Throwable {
		Servicesection.getheader();
	}
}
