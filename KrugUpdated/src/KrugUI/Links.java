package KrugUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Links {
	
	
	@Test
	
	public void link1(){
		try{
			
	WebDriver driver;
	
	Mouse mouse1;
	String URL="http://vkrugudruzei.ru/"  ;
	
	    int math;
	    int math1;
	    String tem;
	   // mouse1 = Webdriver.ActionChains(driver)  ;
		driver=new FirefoxDriver();
		driver.get(URL);
		Actions action = new Actions(driver);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.findElement(By.id("email")).sendKeys("Forcing.it@mail.ru");
		driver.findElement(By.id("password")).sendKeys("a1b2c3");
		driver.findElement(By.cssSelector("html body div#main-content div.registration div.header div.authorization ul.inline li.inline button")).click();
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='el']")));
		for(int i=0;i<20;i++){
			math1=(int)Math.floor(Math.random()*10 +1);
		driver.get("http://vkrugudruzei.ru/x/online/");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sticky-wrapper-header")));
		//$x("//*[@class='sticky-wrapper-header']")
		//"//*[@id='haqc_1-users-factory-5-user']"
		//"//*[@id='haqc_1-users-factory-"+math1+"-photoCount']"
		//$x("//*[@class='album-photo'][@*]")
		//"/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/div[3]/table[2]/tbody/tr/td/div[1]/div[1]/a/img"
		//"//*[@title='Пятерка']"
		
		
		
		math=(int)Math.floor(18+(Math.random()*18 +1));
		new Select(driver.findElement(By.id("haqc_1-filter-isFemale"))).selectByVisibleText("Женщин");
		driver.findElement(By.id("haqc_1-filter-userLowAge")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"18");
		driver.findElement(By.id("haqc_1-filter-userHighAge")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),""+math);
		driver.findElement(By.id("haqc_1-filter-refresh")).click();
		Thread.sleep(4000);
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(1000);
		jsx.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(1000);
		jsx.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(1000);
		jsx.executeScript("window.scrollBy(0,900)", "");
		if(!driver.findElements(By.id("haqc_1-users-factory-1-user")).isEmpty()){
			if(!driver.findElements(By.id("haqc_1-users-factory-"+math1+"-photoCount")).isEmpty()){
				driver.findElement(By.id("haqc_1-users-factory-"+math1+"-photoCount")).click();
				Thread.sleep(4000);
				System.out.println("BOBOBOBOBOBO");
				/*WebElement abc = driver.findElement(By.xpath("//*[@id='haqc_1-users-factory-"+math1+"-user']/div[2]/div/a"));
				String bobo=abc.getText();
				System.out.println(bobo);*/
				//driver.findElement(By.xpath("//*[@class='album-photo']")).click();
				
				//driver.findElement(By.id("album-photo")).click();
				Thread.sleep(4000);
			
			   // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/div[3]/table[2]/tbody/tr/td/div[1]/div[1]/a/img")));
				
			    if(!driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/div[3]/table[2]/tbody/tr/td/div[1]/div[1]/a/img")).isEmpty()){
			    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/div[3]/table[2]/tbody/tr/td/div[1]/div[1]/a/img")).click();
			    }
			    Thread.sleep(4000);
				/*if(!driver.findElements(By.cssSelector("*[class='p5 add']")).isEmpty()){
					driver.findElement(By.cssSelector("*[class='p5 add']")).click();*/
				/*if(!driver.findElements(By.xpath("//*[@title='Пятерка']")).isEmpty()){
					driver.findElement(By.xpath("//*[@title='Пятерка']")).click();*/
				
				if(!driver.findElements(By.xpath("/html/body/div[6]/div/div/div/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")).isEmpty()){
					driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")).click();
					//new Select(driver.findElement(By.xpath("//*[@title='Пятерка']"))).selectByVisibleText("Пятерка"); //try hard
				
					if(!driver.findElements(By.xpath("//*[@title='Пятерка']")).isEmpty()){
						//driver.findElement(By.xpath("//*[@title='Пятерка']")).click();
						WebElement abc = driver.findElement(By.xpath("//*[@title='Пятерка']"));
						//String bobo=abc.getText();
						//action.moveToElement(abc).moveToElement(driver.findElement(By.xpath("//*[@title='Пятерка']"))).click().build().perform();
						executor.executeScript("arguments[0].click();", abc);
						Thread.sleep(2000);
						String url1 = driver.getCurrentUrl();
						System.out.println(url1);
					}
					}  
			}
			 }
			}
		//}
		
		driver.close();
		driver.quit();
	}
	
		catch(Exception e) {
			System.out.println(e);
		     // This will catch any exception, because they are all descended from Exception
		}
		
	
	
	
	
		
	}
	}
//the give five gives an error upon click 

