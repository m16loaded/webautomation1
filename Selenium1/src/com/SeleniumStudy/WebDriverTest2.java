package com.SeleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.PageObject.Registration;


public class WebDriverTest2 extends SelTestCase2{
@Test
	public  void Merc() {
		//WebDriver Select;
		/*driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=34bf4cfe5be3ab8edc58faa8694fbccd");
	    driver.findElement(By.name("firstName")).sendKeys("bobo");
	    driver.findElement(By.name("lastName")).sendKeys("hoho");
	    driver.findElement(By.name("phone")).sendKeys("123123");
	    driver.findElement(By.name("userName")).sendKeys("bobo@yahoo.com");
	    driver.findElement(By.name("email")).sendKeys("jojo");
	    driver.findElement(By.name("password")).sendKeys("222333");
	    driver.findElement(By.name("confirmPassword")).sendKeys("222333");
	    //Select=driver.findElement(By.name("country")).selectByVisibleText("");
		   new Select(driver.findElement(By.name("country"))).selectByVisibleText("ISRAEL");
	    driver.findElement(By.name("register")).click();*/
	driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=34bf4cfe5be3ab8edc58faa8694fbccd");
	//we moved the above line from Registration class so that Registration will only deal with filling the details.
	//it is more maintainable that way,if we divide our code to individual pages.
	Registration reg=new Registration(driver);
        reg.RegisterNewUser();
	    
	    assert driver.findElement(By.tagName("Body")).getText().contains("Thank you for");
	    
	    
	
	
	
	}

}
