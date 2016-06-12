package KrugUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeAfter {
	WebDriver driver;
	String URL="http://vkrugudruzei.ru/";
	@BeforeMethod
	public void Online(){
		driver=new FirefoxDriver();
		//driver.get(URL);
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
		driver.quit();
	}
}
