package v2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;


public class KrugWorkingSection {
	/*private*/ WebDriver driver;
	static int i=0;
	String URL="http://vkrugudruzei.ru/";
	//WebDriverWait wait = new WebDriverWait(driver, 7);
	//JavascriptExecutor jsx = (JavascriptExecutor)driver;
	
	KrugWorkingSection(WebDriver driver){
		this.driver=driver;
	}
/*@BeforeMethod //try
	public void Online(){
		driver=new FirefoxDriver();
	}*/
	public KrugWorkingSection testSite(){
		
		driver.get(URL);
		return this;
	}
	public KrugWorkingSection login() /*throws InterruptedException*/{
		//driver.get("http://vkrugudruzei.ru/");
		//if(!driver.findElements(By.cssSelector("div.enter > span.title")).isEmpty()){//will only insert details if needed(old!!!)
	//	"//*[@id='email']"  //in progress
		//if(!driver.findElement(By.xpath("div.enter > span.title")).isEmpty())//in progress
		/*driver.findElement(By.id("email")).sendKeys("Forcing.it@mail.ru"); //old!!!
		driver.findElement(By.id("password")).sendKeys("a1b2c3");
		driver.findElement(By.xpath("//*[@class='green']")).click();*/
			driver.findElement(By.id("email")).sendKeys("Forcing.it@mail.ru");
			driver.findElement(By.id("password")).sendKeys("a1b2c3");
			driver.findElement(By.cssSelector("html body div#main-content div.registration div.header div.authorization ul.inline li.inline button")).click();
		return this;
	
	
	}
	public KrugWorkingSection mainPage(){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.user")));//verify user main page
		//"//*[@class='user']"
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='user']")));//verify user main page NEW
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Хотят общаться")));//verify user main page
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='c']/div[2]/ul[2]/li[1]/a"))); OLD
		//driver.findElement(By.xpath("//*[@id='c']/div[2]/ul[2]/li[1]/a")).click();//click on 'want to talk'
		//driver.findElement(By.linkText("Хотят общаться")).click();OLD
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='haqc_1-filter-upperBar']/div/div[2]")));//wait unti 'want to talk ' page is up
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("info-label")));
		/*try{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("info-label")));
		}
		catch(NoSuchElementException e){
			restart();
		}
		//wait.until(ExpectedConditions.elementToBeClickable(locator) OLD
		*/
		
		driver.get("http://vkrugudruzei.ru/x/online/");
		return this;
	}
	public KrugWorkingSection onlinePage(){
		int math;
		math=(int)Math.floor(18+(Math.random()*18 +1));
		driver.get("http://vkrugudruzei.ru/x/online/");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("haqc_1-filter-refresh")));OLD
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sticky-wrapper-header")));
		//if(!driver.findElements(By.className("sticky-wrapper-header")).isEmpty()){
		new Select(driver.findElement(By.id("haqc_1-filter-isFemale"))).selectByVisibleText("Женщин");//dropdown list
		driver.findElement(By.id("haqc_1-filter-userLowAge")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"18");
		driver.findElement(By.id("haqc_1-filter-userHighAge")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),""+math);
	//	driver.findElement(By.id("haqc_1-filter-userLowAge")).clear();
	//	driver.findElement(By.id("haqc_1-filter-userLowAge")).sendKeys("18");
		
		//driver.findElement(By.id("haqc_1-filter-userHighAge")).clear();
		//driver.findElement(By.id("haqc_1-filter-userHighAge")).sendKeys("38");
		//driver.findElement(By.id("haqc_1-filter-userHighAge")).sendKeys(""+math);
		//element.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"55");
		/*
		if(!driver.findElements(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/span")).isEmpty()){
			driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/span")).click();
			
		}
		if(!driver.findElements(By.xpath("//*[@id='haqc_1-filter-town-town-fieldClear']")).isEmpty()){
			driver.findElement(By.xpath("//*[@id='haqc_1-filter-town-town-fieldClear']")).click();
			
		}*/
		//driver.findElement(By.id("haqc_1-filter-town-town-text")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END)," ");OLD
		//driver.findElement(By.id("haqc_1-filter-town-town-text")).sendKeys("  ");
		
		driver.findElement(By.id("haqc_1-filter-refresh")).click();
		return this;
		
	}
	public KrugWorkingSection onlinePage2(){
        driver.findElement(By.id("haqc_1-filter-town-town-text")).sendKeys("  ");
	    driver.findElement(By.id("haqc_1-filter-refresh")).click();
		return this;
	}
	public KrugWorkingSection scrollDown1000(){
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,900)", "");
        //driver.findElement(By.id("ctl00_PlaceHolderMain_ctrlChangeBillingAddress_ctrlChangeBillingAddress_txtBillingAddress")).sendKeys(Keys.ARROW_DOWN);
		return this;
		
	}
	public KrugWorkingSection scrollingWithKeys(){
		driver.findElement(By.xpath("//*[@id='dayphoto']/div[3]/div[1]/input[1]")).sendKeys(Keys.ARROW_DOWN);
		return this;
	}
	public int randomNumber(){
		int math;
		math=(int)Math.floor(Math.random()*25 +1);
		return math;
		
	}
	public int randomNumber2(){
		int math;
		math=(int)Math.floor(18+(Math.random()*18 +1));
		return math;
		
	}
	public KrugWorkingSection chooseUser() throws IOException{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		Boolean b=true;
		File file=new File("D:/JavaProjects/names1.txt");
		String content;
		int i=0;
		int math1=(int)Math.floor(Math.random()*60 +1);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='haqc_1-users-factory-"+math1+"-user']/div[1]/div/a[2]/img")));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("haqc_1-users-factory-1-user")));
		if(!driver.findElements(By.id("haqc_1-users-factory-1-user")).isEmpty()){
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='haqc_1-users-factory-"+math1+"-user']/div[1]/div/a[2]/img")));
		if(!driver.findElements(By.xpath("//*[@id='haqc_1-users-factory-"+math1+"-user']/div[2]/div/a")).isEmpty()){
			//driver.findElements(By.xpath("//*[@id='haqc_1-users-factory-"+math1+"-user']/div[1]/div/a[2]/img")).get(index)
			WebElement abc = driver.findElement(By.xpath("//*[@id='haqc_1-users-factory-"+math1+"-user']/div[2]/div/a"));
			String bobo=abc.getText(); //(!!!)
			//String bobo="Оксана Деменева";
			System.out.println(bobo);
			
			/*Scanner scanner = new Scanner("D:/JavaProjects/names.txt");
			while (scanner.hasNextLine()) {
			//	System.out.println("start scan");
			    String nextToken = scanner.next();
			   // i++;
		//	    System.out.println(i);
			    if (nextToken.equalsIgnoreCase(bobo)){
			    	b=false;
			    	System.out.println("this user is in the file");
			    	break;
			    }
			}*/
			//try{
				content = FileUtils.readFileToString(file, "CP1251"); //CP1251 encoding type
				if(content.contains(bobo)){
					System.out.println("this user is in the file");
					//b=false;
					return this;
				}
		//	}
			/*catch(Exception error)
			{
				System.out.println(error);
			}*/
			
			    	//if(b=true){
			    		//"//*[@id='haqc_1-users-factory-22-user']/div[1]/div/a[2]/img"
			//driver.findElement(By.xpath("//*[@id='haqc_1-users-factory-"+math1+"-user']/div[2]/div/a")).click();
			driver.findElement(By.xpath("//*[@id='haqc_1-users-factory-"+math1+"-user']/div[1]/div/a[2]/img")).click();//test new DOM (click on the chosen user)
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cardAddFriend")));
			/*if(!driver.findElements(By.xpath("//*[@class='no-user-blocked clear']")).isEmpty()){
				return this;  
				}*/
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div[3]/div[1]/button")));//add user button
			
			/*if(!driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div[3]/div[2]")).isEmpty()){
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div[3]/div[2]")).click();  
			}*/
			
			//driver.findElement(By.xpath("//*[@id='mycard']/tbody/tr/td[1]/div[1]/div/img")).click();
			/*if(!driver.findElements(By.linkText("Скачать")).isEmpty()){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Скачать")));
			return this;
			}
			else{
				//restart();
				return this;
			}*/
		
		}
		}

		return this;
	}
	
	public KrugWorkingSection profilePic(){
		if(!driver.findElements(By.xpath("//*[@class='no-user-blocked clear']")).isEmpty()){
			return this;  
			}
		if(!driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div[3]/div[2]")).isEmpty()){
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div[3]/div[2]")).click();  
			}
		if(!driver.findElements(By.linkText("Скачать")).isEmpty()){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Скачать")));
			return this;
			}
			else{
				//restart();
				return this;
			}
			
	}
	public KrugWorkingSection vote() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 7);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Скачать")));//instead of hard coding sleeps
		/*if(driver.findElements(By.id("Скачать")).isEmpty()){// "rightphoto"
			return this;
		}
		else{*/
			
		//if(!driver.findElements(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")).isEmpty()){
		if(!driver.findElements(By.cssSelector("*[class='p5 add']")).isEmpty()){
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")));
			
			
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")));
			//Thread.sleep(5000);
			//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]
			//driver.findElement(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")).click();
			driver.findElement(By.cssSelector("*[class='p5 add']")).click();
			
			/*driver.findElement(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")).click();
			driver.findElement(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")).click();
			driver.findElement(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")).click();*/
			//driver.findElement(By.className("p5 add")).click();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.p5")));
			/*try {
				 
				String content = "This is the content to write into file";
	 
				File file = new File("D:/JavaProjects/names.txt");
	 
				// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}
	 
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.newLine();
				bw.write(content);
				
				bw.close();
	 
				System.out.println("Done");
	 
			} catch (IOException e) {
				e.printStackTrace();
			}*/
			WebElement abc2 = driver.findElement(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/a"));
			//String url1 = driver.getCurrentUrl();//works
			String name= abc2.getText();
			try {//works
			    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("D:/JavaProjects/names1.txt", true)));
			    out.println(name);
			    out.close();
			} catch (IOException e) {
			    //oh noes!
			}
			counter();
			return this;
		
		}
		return this;
	}
	public KrugWorkingSection restart(){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.get("http://vkrugudruzei.ru/x/online/");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("haqc_1-filter-refresh")));
		driver.findElement(By.id("haqc_1-filter-town-town-text")).sendKeys("  ");
	    driver.findElement(By.id("haqc_1-filter-refresh")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='haqc_1-filter-upperBar']/div/div[2]")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("info-label")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("haqc_1-filter-refresh")));
		return this;
	}
	public void counter(){
		i++;
		System.out.println(i);
	}
/*	@AfterMethod //try
	public void closeBrowser(){
		driver.close();
		driver.quit();
	}*/
	
}


//LINKS
// "//*[@class='profile-avatar']"  new dom for profile pic
// "/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div[3]/div[2]" new dom for profile pic long xpath
//"//*[@id='mycard']/tbody/tr/td[1]/div[1]/div/img"   old gui profile pic
// "//*[@class='no-user-blocked clear']"   private user object