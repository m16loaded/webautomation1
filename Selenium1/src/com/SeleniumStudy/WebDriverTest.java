package com.SeleniumStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class WebDriverTest extends SelTestCase {

	//public static void main(String[] args) {
	public void TestWiki(){
		//WebDriver driver=new FirefoxDriver(); //creating a firefox driver  ////don't need it here.We inherit it
		//FirefoxDriver driver=new FirefoxDriver(); can also be done like that but then it will only be used by firefox.
		driver.get("http://www.wikipedia.org/");
		driver.findElement(By.id("searchInput")).sendKeys("Selenium software");;//passing the text to the search textbox
		driver.findElement(By.name("go")).click();//clicking on Go button
		driver.findElement(By.cssSelector(".mw-search-results li:nth-of-type(1) a")).click();;//selecting the ONLY the title.
		//we can also use Xpath but it is slower.
		//we should use Xpath when we need to navigate BACK to parent
		
		Assert.assertTrue(driver.findElement(By.cssSelector("img[src='//upload.wikimedia.org/wikipedia/en/5/5c/Seleniumlogo.png']")).isDisplayed());
		
		//driver.close();  //don't need it here.We inherit it 
		//driver.quit();
		Reporter.log("my test passed");//will add up to the report (index.hmtl)
		//**We don't have it in JUnit
	}
}
