package msnPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class msn1 {
	WebDriver driver;  
	int var=1;
  @Test
  public void f() {
	  System.out.println("Hello TestNG");
	  driver.get("http://money.msn.com/");
      try {
    	  for (int i=0;i<5;i++){
    		  
    		  Thread.sleep(2000); 
    		 // "//*[@id='q']"
    		  driver.findElement(By.xpath("//*[@id='q']")).sendKeys(""+var);
    		  var++;
    	  }
          
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
	  
  }
  @BeforeSuite
  public void before(){
	  ProfilesIni allProfiles = new ProfilesIni();
      FirefoxProfile fProfile = allProfiles.getProfile("default");
      driver = new FirefoxDriver(fProfile);
	  
  }
  @AfterSuite
  public void afterSuite(){
      if (driver != null ) {
          driver.quit();
      }
  }
}
