package facebookSearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Blunt {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
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
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D://Chromedriver2//chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
		driver.quit();
  }

}


//objects  
//$x("//*[@id='q']")  Search field
//email   Email id
//pass  Password id
//loginbutton  id
//js_4   selection list id
//"html/body/div[4]/div/div/div/div/ul/li[2]/a/span[2]"  selection xpath
// /html/body/div[4]/div/div/div/div/ul/li[2]/a/span[2]




