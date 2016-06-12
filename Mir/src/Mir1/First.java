package Mir1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class First {


	    public static void main(String[] args) throws InterruptedException {
	    	String Login="forcing.it";
	    	String Pass="a1b2c3qwerty";

	       //Create a new instance of Firefox Browser
	       WebDriver driver = new FirefoxDriver();
//	    	WebDriver driver = new HtmlUnitDriver(true);
	       WebDriverWait wait = new WebDriverWait(driver, 30);

	       //Open the URL in firefox browser
	       driver.get("http://my.mail.ru/cgi-bin/my/sm-photo");
	       driver.findElement(By.name("Login")).sendKeys(Login);
	       driver.findElement(By.name("Password")).sendKeys(Pass);	       
	       driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div[2]/form/fieldset/div[4]/input")).click();
	       Thread.sleep(6000);
//	       driver.findElement(By.xpath("//*[@class='moderation_marks-item moderator_marks-item-5']//*")).click(); should work
	       for (int z=10000;z>0;z--){
	           for(int i=200;i>0;i--){
	    	   System.out.println(i);
	           // driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div[3]/div[3]/div[5]/span")).click();
	    	   Thread.sleep(1000);
	    	   driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div[3]/div[3]/div[5]/i")).click();
//	    	   Thread.sleep(200);
//	            if(!driver.findElements(By.xpath("//*[@class='moderation_annotation_title'][text()='Изображения для оценивания отсутствуют']")).isEmpty()){ //is found all the time
	    	   String pageText = driver.findElement(By.tagName("body")).getText();
	    	   if(pageText.contains("Изображения для оценивания отсутствуют")||pageText.contains("Произошла ошибка на сервере")){
	            	Thread.sleep(1000);
	            	System.out.println("FOUND POPUP");
//	            	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div[3]/div[3]/div[5]/i")).click();
//	            	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div[3]/div[3]/div[5]/i")).click();
	            break;
	            }
	          Thread.sleep(1000);
//	           !driver.findElements(By.id("...")).isEmpty();        
	       
	       }
	           
//	           driver.findElement(By.xpath("//*[@class='l-button']")).click();
	            
//	       driver.get("http://my.mail.ru/cgi-bin/my/sm-photo");
	           driver.navigate().refresh();
	       }
//	       driver.findElement((By.className("moderation_marks-item moderator_marks-item-5"))).click();
//	       driver.findElement((By.name("Отлично"))).click();
	       
//	       wait.until(ExpectedConditions.elementToBeClickable(By.className("moderation_marks-item moderator_marks-item-5")));
	       System.out.println("bobo");
//	       driver.findElement(By.className("moderation_marks-item moderator_marks-item-5")).click();
//	       driver.findElement(By.name("password"));
//	       driver.find
//	       password
	       //Maximize the Browser window
//         driver.manage().window().maximize();

	       //Get the current page URL and store the value in variable 'str'
	       String str = driver.getCurrentUrl();

	       //Print the value of variable in the console
	       System.out.println("The current URL is " + str);
	       
	       driver.close();
	   }
	}
	


//xpaths
//$x("//*[@class='moderation_annotation_title']")
//$x("//*[@class='moderation_annotation_title'][text()='Изображения для оценивания отсутствуют']")
//l-button
//Произошла ошибка на сервере

//Css for popup - html.window-loaded body.browser-type-Firefox.browser-type-Firefox-4.enable-fourth-column.mm-disable-friends.filed-images.banners-fast div.body-wrapper div#boosterCanvas div#centerColumn.body-center div.body-center__inner.ui-simple-block div.moderation_main div.moderation_alert div.moderation_alert_photo-over.sm-alert_opened div.moderation_vpositioned div.moderation_alert-padds div.moderation_annotation div.moderation_annotation_title
