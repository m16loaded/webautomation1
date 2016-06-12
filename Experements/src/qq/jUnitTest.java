package qq;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jUnitTest {

	WebDriver driver ;
	@Before
	public void before(){
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D://Chromedriver2//chromedriver.exe");
		  driver=new ChromeDriver();
		
	}
	@After
	public void after(){
		driver.close();
		driver.quit();
	}
	@Test
	public void working(){
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
}
