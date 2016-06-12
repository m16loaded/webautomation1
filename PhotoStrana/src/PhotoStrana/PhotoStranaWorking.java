package PhotoStrana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PhotoStranaWorking {
	WebDriver driver;
	
	PhotoStranaWorking(WebDriver driver){
		this.driver=driver;
	}
public PhotoStranaWorking testSite(){
	String URL="http://fotostrana.ru/signup/";
		driver.get(URL);
		return this;
	}
public PhotoStranaWorking login(){
if(driver.findElement(By.cssSelector("*[class='link-text fl-r trebuchet signup-link-login']")) != null){
	driver.findElement(By.cssSelector("*[class='link-text fl-r trebuchet signup-link-login']")).click();
	if(driver.findElement(By.id("user_email")) != null){
		driver.findElement(By.id("user_email")).sendKeys("SelTest12@yandex.com");
		driver.findElement(By.id("user_password")).sendKeys("up7pf2");
		driver.findElement(By.id("loginPopupSubmitButton")).click();
		return this;
			}
	return this;
	}
return this;
}
public PhotoStranaWorking vstrechi(){
	WebDriverWait wait1 = new WebDriverWait(driver, 60);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='interest-item-1-1011']/a/span")));
	if(driver.findElement(By.xpath("//*[@id='interest-item-1-1011']/a/span")) !=null){
		driver.findElement(By.xpath("//*[@id='interest-item-1-1011']/a/span")).click();
		return this;
	}
	return this;
}
public PhotoStranaWorking vote(){
	if(driver.findElement(By.xpath("//*[@id='meeting-js-rateblock']/div/span[6]"))!=null){
		driver.findElement(By.xpath("//*[@id='meeting-js-rateblock']/div/span[6]")).click();
		
	}
	if(driver.findElement(By.cssSelector("*[class='meeting-btn-bc meeting-btn-bc-yes btn btn-big btn-big-yes']"))!=null){
		driver.findElement(By.cssSelector("*[class='meeting-btn-bc meeting-btn-bc-yes btn btn-big btn-big-yes']")).click();
		return this;
}
	return this;
	}


}

