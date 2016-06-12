package q;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.thoughtworks.selenium.SeleneseTestBase;

public class google2 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com/?gws_rd=cr&ei=O6aXUvCqJOeQ4ASR_oCAAg#q=asd");
	 List< WebElement> bobo=driver.findElements(By.xpath("//*[@class='_Ed']"));
	 // List< WebElement> bobo=driver.findElements(By.tagName("em"));
	for(WebElement gogo:bobo){
	
		 //String post=bobo.get(i).findElement(By.tagName("em")).getText();
		 //System.out.println(post); 
		 
		// System.out.println(bobo.get(i).toString());
		 System.out.println(gogo.getText());
		// verifyEquals(gogo.getText(), "verify command syntax selenium - Google Search");
		 if(gogo.getText().contains("www.asdonline.com/")){
			 System.out.println("YES");
			 
		 }
		 
	}
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new FirefoxDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
