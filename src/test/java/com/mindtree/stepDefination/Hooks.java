package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.manager.WebDriverManager;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.HomePageUI;
import com.mindtree.utility.Logs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends WebDriverManager {
	WebDriverManager driverManager;
	WebDriverHelper Helper;
	Logs loggerUtil;
	Logger log;
	@Before
	public void startUp() {

		loggerUtil = new Logs();
		log = loggerUtil.createLog("Hooks.class");
		log.debug("Opening driver");
		driverManager = new WebDriverManager();
		driverManager.getDriver();
		log.info("Driver opened");
		driver.get(properties.getProperty("url"));
		log.debug("Opening URL");
		try {
			Helper = new WebDriverHelper();
			Helper.actionClick(HomePageUI.faq);
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
	@After
	public void tearDown() {
		log.info("Driver closed");
		driver.close();
	}

}
