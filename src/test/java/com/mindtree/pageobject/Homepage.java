package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.HomePageUI;
import com.mindtree.utility.Logs;

public class Homepage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;
	public Homepage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void clickSearchicon() {
		try {
			log = loggerUtil.createLog("Homepage.java");
			helper.actionClick(HomePageUI.searchicon);
			log.debug("Search icon clicked");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}	
	}

	
	public  void enterItem() {
		try {
			String string = helper.properties.getProperty("Item");
			helper.sendText(HomePageUI.searchbox, string);
			log.debug("Entered item "+string+" in search box");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
		
	}
	
	public void clickSearchbutton() {
		try {
			helper.clickButton(HomePageUI.searchbutton);
			log.debug("Search button clicked");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		};
		
	}


	
}



