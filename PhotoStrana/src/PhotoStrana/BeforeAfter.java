package PhotoStrana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeAfter {
	
		WebDriver driver;
		//String URL="http://fotostrana.ru/signup/";
		@BeforeMethod
		public void Online1(){
			driver=new FirefoxDriver();
			//driver.get(URL);
				

		}
		@AfterMethod
		public void closeBrowser1(){
			driver.close();
			driver.quit();
		}
		
	}


