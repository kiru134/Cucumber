package com.mindtree.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mindtree.manager.WebDriverManager;

/**This util class is to take screenshots
 *@since 29/12/2021
 */
public class SnapShots {
	WebDriver driver = WebDriverManager.driver;
	
	/** This method is to click screenshot
	 * @return path for screenshot
	 */
	public String takeSnapShot(){
		TakesScreenshot scrnshot = (TakesScreenshot)driver;
		File src = scrnshot.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String date = sdf.format(d);
		String timeStamp = System.getProperty("user.dir")+"/screenShots/"+date.replace(":", "_").replace("/", "_")+".png";
		File dest = new File(timeStamp);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return timeStamp;	
	}

}
