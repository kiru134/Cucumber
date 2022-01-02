package com.mindtree.stepDefination;


import org.apache.log4j.Logger;

import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.Homepage;
import com.mindtree.pageobject.searchcarpage;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefination {
	PageObjectManager pageManager;
	Homepage homepage;
	searchcarpage searchcarpage;
	Logs loggerUtil;
	Logger log;

    @Given("^Go to Insurance Company Website Close FAQ popup$")
    public void go_to_insurance_company_website_close_faq_popup() throws Throwable {
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test1");
		pageManager = new PageObjectManager();
		homepage = pageManager.getHomePage();
		log.info("Website opened and FAQ closed");
    }

    @When("^I Click on search$")
    public void i_click_on_search() throws Throwable {
    	homepage.clickSearchicon();
    }
    @When("^Enter car in search box$")
    public void entere_car_in_search_box() throws Throwable {
    	homepage.enterItem();
    }

    @When("Click on Search button")
    public void click_on_search_button() {
    	homepage.clickSearchbutton();
    }

    @Then("Validate if Car present in first result")
    public void validate_if_car_present_in_first_result() {
    	searchcarpage = pageManager.getsearchcarpage();
		searchcarpage.getName();
    }
}
