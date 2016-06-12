package First;

import io.selendroid.SelendroidCapabilities;
import io.selendroid.SelendroidConfiguration;
import io.selendroid.SelendroidDriver;
import io.selendroid.SelendroidLauncher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class third {

	private SelendroidLauncher selendroidServer = null;
  private WebDriver driver = null;

  @Test
  public void shouldSearchWithEbay() {
	  WebDriverWait wait = new WebDriverWait(driver, 60);
    // And now use this to visit ebay
  //  driver.get("http://vkrugudruzei.ru/");
	 
	//  https://www.google.co.il
    // Find the text input element by its id
    //"//*[@id='gbqfq']"
    //"//*[@id="mib"]"  for mobile
	  //lst
	  //"//*[@title='Google Search']"
	  //"//*[@class='srchBtnLg']"
	  
	 //"//*[@class='b-tab']"  lenta ru
	/*  driver.get("http://m.ebay.com/");
    WebElement element = driver.findElement(By.id("kw"));

    // Enter something to search for
   
    element.sendKeys("Nexus 5");
    driver.findElement(By.xpath("//*[@class='srchBtnLg']")).click();
    System.out.println("Page title is: " + driver.getTitle());
*/
    
	  
	  // Now submit the form. WebDriver will find the form for us from the element
    //element.submit();
    
   /* driver.findElement(By.id("email")).sendKeys("Forcing.it@mail.ru");
	driver.findElement(By.id("password")).sendKeys("a1b2c3");
	driver.findElement(By.cssSelector("html body div#main-content div.registration div.header div.authorization ul.inline li.inline button")).click();*/

    // Check the title of the page
	  for(int i=0;i<5;i++){
	  driver.get("http://m.lenta.ru/");
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='b-tab']")));
	//  waitForPageToLoad();
	    WebElement element = driver.findElement(By.xpath("//*[@class='b-tab']"));
	   // element.sendKeys("Nexus 5");
	    element.click();
	   // driver.findElement(By.xpath("//*[@class='srchBtnLg']")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='b-tab']")));
	    System.out.println("Page title is: " + driver.getTitle());
	  }
    driver.quit();
	  
  }

  @BeforeMethod
  public void startSelendroidServer() throws Exception {
    if (selendroidServer != null) {
      selendroidServer.stopSelendroid();
    }
    SelendroidConfiguration config = new SelendroidConfiguration();

    selendroidServer = new SelendroidLauncher(config);
    selendroidServer.launchSelendroid();

    DesiredCapabilities caps = SelendroidCapabilities.android();

    driver = new SelendroidDriver(caps);
  }

  @AfterMethod
  public void stopSelendroidServer() {
    if (driver != null) {
      driver.quit();
    }
    if (selendroidServer != null) {
      selendroidServer.stopSelendroid();
    }
  }
}



