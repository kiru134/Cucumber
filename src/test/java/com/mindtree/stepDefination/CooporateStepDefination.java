package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.corporatemission;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CooporateStepDefination {

	PageObjectManager pageManager;
	corporatemission corporatemission;
	Logs loggerUtil;
	Logger log;

	@When("^Mouse hover to About Us$")
	public void mouse_hover_to_about_us() throws Throwable {
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test1");
		pageManager = new PageObjectManager();
		corporatemission = pageManager.getcorporatemission();
		corporatemission.tohover();
	}

	@And("^Click on Corporate Mission$")
	public void click_on_corporate_mission() throws Throwable {
		corporatemission.toclick();
	}

	@Then("^Verify if Corporate Mission present in new page opened$")
	public void verify_if_corporate_mission_present_in_new_page_opened() throws Throwable {
		corporatemission.validate();
	}
}
