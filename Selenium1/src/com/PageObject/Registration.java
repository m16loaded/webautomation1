package com.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	private WebDriver driver;
	
	public Registration(WebDriver driver){
		this.driver=driver;
	}
	public accountCreation RegisterNewUser(){ //we set this method to return accountCreation object(basically a new class with a constructor)
	//public void RegisterNewUser(){
		
	    driver.findElement(By.name("firstName")).sendKeys("bobo");
	    driver.findElement(By.name("lastName")).sendKeys("hoho");
	    driver.findElement(By.name("phone")).sendKeys("123123");
	    driver.findElement(By.name("userName")).sendKeys("bobo@yahoo.com");
	    driver.findElement(By.name("email")).sendKeys("jojo");
	    driver.findElement(By.name("password")).sendKeys("222333");
	    driver.findElement(By.name("confirmPassword")).sendKeys("222333");
	    //Select=driver.findElement(By.name("country")).selectByVisibleText("");
		   new Select(driver.findElement(By.name("country"))).selectByVisibleText("ISRAEL");
	    driver.findElement(By.name("register")).click();
	    
	   
	    assert driver.findElement(By.tagName("Body")).getText().contains("Thank you for");
	    return new accountCreation(driver);//this can be used to return the driver to the new class that represents a new page
	//}
	}
}
