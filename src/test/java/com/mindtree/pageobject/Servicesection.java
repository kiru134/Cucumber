package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.ServicesectionUI;
import com.mindtree.utility.Logs;

public class Servicesection {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;
	public Servicesection() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}
	
	public void clickOn() {
		try {
			log = loggerUtil.createLog("Servicesection.java");
			helper.actionClick(ServicesectionUI.garage);
			log.debug("caseless Garage clicked");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}

	public void getheader() {
		
		String gname;
		try {
			gname = helper.getText(ServicesectionUI.head);
			if (gname.equals("Garage Details")) 
				log.debug("Garage Details found in header");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
}
