package com.EnhancedRegistration;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SelTestCase3 {
	
	WebDriver driver; //WevDriver is actually an interface 
	@BeforeMethod
	//@Parameters("browser")
	public void lunchBrowser(){
		//if(browser.equalsIgnoreCase("FF")){
		driver=new FirefoxDriver(); //we assign the driver object(which is FireFoxDriver object) to be the WebDriver interface property
		//}
		//else if (browser.equalsIgnoreCase("Chrome")){
		//System.setProperty("webdriver.chrome.driver","D:/ChromeDriver/chromedriver.exe");
		//IF WE WANT TO RUN IT ON CHROME(NEED CHROME DRIVER)
		//driver=new ChromeDriver();
		//}
		}
	
	@AfterMethod
	public void closeBrowser(ITestResult result) throws IOException{
		/*if(result.isSuccess()) {  //in case we want to take a screenshot with a condition(failed,passed)
		File imageFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String imageFileName =result.getMethod().getMethodName()+new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime())+".png";
		File imageFile1 = new File(imageFileName);	
		FileUtils.moveFile(imageFile,imageFile1);
		}*/
		driver.close();
		driver.quit();
		
}
}
