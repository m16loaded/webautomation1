package qa;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class owner {
	WebDriver driver ;

	@Before
	public void setUp() throws Exception {
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D://Chromedriver2//chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void test() throws IOException, InterruptedException {
		
		
		String status;
		  
		  String urlMain="https://mdm-qa.cellrox.com/root/users/sign_in";
		  String urlOwners="https://mdm-qa.cellrox.com/uitesting/owners";
		  int math;
		  
		  driver.get(urlMain);
		  //Thread.sleep(4000);
		  driver.findElement(By.id("username")).sendKeys("ibilkevich@cellrox.com");
		  driver.findElement(By.id("password")).sendKeys("A1b2c3qwert");
		  
		  driver.findElement(By.className("btn")).click();
		  
		  Thread.sleep(4000);
		  for(int i=0;i<3;i++){
		  math=(int)Math.floor(18+(Math.random()*1000000 +1));
		  driver.get(urlOwners);
		  //Thread.sleep(4000);
		  //Thread.sleep(4000);
		  driver.findElement(By.id("add-btn")).click();
		  driver.findElement(By.id("name")).sendKeys("test"+math); //name
		  driver.findElement(By.id("email")).sendKeys(math+"@"+math+".com");//email
		  driver.findElement(By.id("phone")).sendKeys("abc"+math);//phone
		  //btn
		  driver.findElement(By.id("title")).sendKeys("abc"+math);//title
		  driver.findElement(By.id("department")).sendKeys("abc"+math);//department
		 // Thread.sleep(4000);
		 // Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@type='submit']")).click();//create button
		  Thread.sleep(4000);
		  Thread.sleep(4000);
		  status=driver.findElement(By.xpath("html/body/header/ng-include/div/div/div[4]/div/div/div/span")).getText();
		  System.out.println(status);
		  System.out.println("DONE");
		  Thread.sleep(4000);
		  //Thread.sleep(4000);
		  }
	  
	
	}
	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

}
//URLS:
//https://mdm-qa.cellrox.com/uitesting/devices
//https://mdm-qa.cellrox.com/uitesting/owners
//Ids:

//$x("//*[@type='submit']")
//"html/body/header/ng-include/div/div/div[4]/div/div/div/span"