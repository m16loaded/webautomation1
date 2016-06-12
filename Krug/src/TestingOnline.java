import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//@Test
public class TestingOnline  {
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
