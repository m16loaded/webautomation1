package qq;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bobo {
	WebDriver driver ;

	@Before
	public void setUp() throws Exception {
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D://Chromedriver2//chromedriver.exe");
		  driver=new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new FileReader("D:/JavaProjects/names.txt"));
		  String line;
		  String geturl;
		  String url="http://www.facebook.com";
		  driver.get(url);
		  Thread.sleep(4000);
		  driver.findElement(By.id("email")).sendKeys("Forcing.it@mail.ru");
		  driver.findElement(By.id("pass")).sendKeys("a1b2c3");
		  driver.findElement(By.id("loginbutton")).click();
		  int i=0;
		  while ((line = br.readLine()) != null) {
		     // process the line.
		  
		  
		 // url="http://www.facebook.com";
		  driver.get(url);
		 
		  Thread.sleep(4000);
		 /* driver.findElement(By.id("email")).sendKeys("Forcing.it@mail.ru");
		  driver.findElement(By.id("pass")).sendKeys("a1b2c3");
		  driver.findElement(By.id("loginbutton")).click();*/
		  
		  Thread.sleep(2000);
		  WebElement gogo=driver.findElement(By.id("q"));
		  gogo.sendKeys(line);
		  Thread.sleep(5000);
		 // driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/ul/li[2]/a/span[2]")).click();
		  gogo.submit();
		  Thread.sleep(5000);
		  geturl=driver.getCurrentUrl();
		  PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("D:/JavaProjects/facebook.txt", true)));
		    out.println(geturl);
		    out.close();
		    i++;
		    if(i==1){
		    	break;
		    }
		  }
		  br.close();
	  }
	}


