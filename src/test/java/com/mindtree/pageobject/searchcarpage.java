package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.SearchcarpageUI;
import com.mindtree.utility.Logs;


public class searchcarpage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;
	public searchcarpage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void getName() {
		String name;
		try {
			log = loggerUtil.createLog("Searchcarpage.java");
			name = helper.getText(SearchcarpageUI.Name);
			if (name.contains("Car"))
				log.debug("Product name :\n " + name);
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}

	}
}
