package com.EnhancedRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration3 {
	private WebDriver driver;
	
	public Registration3(WebDriver driver){
		this.driver=driver;
	}
public Registration3 enterFirstName(String firstName){ //variable name and object that is found by "name" are matching in this case
	driver.findElement(By.name("firstName")).sendKeys(firstName);
	return this;
}
public Registration3 enterLastName(String lastName){
	driver.findElement(By.name("lastName")).sendKeys(lastName);
	return this;
}
public Registration3 enterPhone(String phone){
	driver.findElement(By.name("phone")).sendKeys(phone);
	return this;
}
public Registration3 enterUserName(String userName){
	driver.findElement(By.name("userName")).sendKeys(userName);
	return this;
}
public Registration3 enterCountry(String country){
	new Select(driver.findElement(By.name("country"))).selectByVisibleText(country);//dropdown list
	return this;
}

public Registration3 enterEmail(String email){
	driver.findElement(By.name("email")).sendKeys(email);
	return this;
}
public Registration3 enterPassword(String password){
	driver.findElement(By.name("password")).sendKeys(password);
	return this;
}
public Registration3 enterConfirmPassword(String password){
	driver.findElement(By.name("confirmPassword")).sendKeys(password);
	return this;
}
public accountCreation3 clickRegister(){
	driver.findElement(By.name("register")).click();
	return new accountCreation3(driver); //return to the new class that represents a new page
	
}

public accountCreation3 registerNewUser(RegistrationData3 registrationData){
	return enterFirstName(registrationData.getFirstName()).enterLastName(registrationData.getLastName()).
	enterPhone(registrationData.getPhone()).enterUserName(registrationData.getUserName()).enterCountry(registrationData.getCountry()).
	enterEmail(registrationData.getEmail()).enterPassword(registrationData.getPassword()).enterConfirmPassword(registrationData.getConfirmPassword()).
	clickRegister();
}
}	










