package com.mindtree.manager;

import com.mindtree.pageobject.Homepage;
import com.mindtree.pageobject.Servicesection;
import com.mindtree.pageobject.corporatemission;
import com.mindtree.pageobject.searchcarpage;


/** This class is to manage the objects of different pages
 
 *
 */
public class PageObjectManager extends WebDriverManager{
	private Homepage homePage;
	private corporatemission corporatemission;
	private searchcarpage searchcarpage;
	private Servicesection Servicesection;

	

	public Homepage getHomePage() {
		return(homePage==null) ? homePage = new Homepage():homePage;
	}
	public corporatemission getcorporatemission() {
		return(corporatemission==null) ? corporatemission = new corporatemission():corporatemission;
	}
	public searchcarpage getsearchcarpage() {
		return(searchcarpage==null) ? searchcarpage = new searchcarpage():searchcarpage;
	}
	public Servicesection getServicesection() {
		return(Servicesection==null) ? Servicesection = new Servicesection():Servicesection;
	}

}
