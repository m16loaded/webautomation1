package com.SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SelTestCase {
	WebDriver driver; //WevDriver is actually an interface 
	@BeforeMethod()
	@Parameters("browser")
	public void lunchBrowser(String browser){
		if(browser.equalsIgnoreCase("FF")){
		driver=new FirefoxDriver(); //we assign the driver object(which is FireFoxDriver object) to be the WebDriver interface property
		}
		else if (browser.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver","D:/ChromeDriver/chromedriver.exe");
		//IF WE WANT TO RUN IT ON CHROME(NEED CHROME DRIVER)
		driver=new ChromeDriver();
		}
		}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
		driver.quit();
		
	}

}
