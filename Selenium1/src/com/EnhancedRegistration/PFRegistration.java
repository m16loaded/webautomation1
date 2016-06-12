package com.EnhancedRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


	
	public class PFRegistration {
		private WebDriver driver;
		
		public PFRegistration(WebDriver driver){
			this.driver=driver;
		}
		@CacheLookup
		@FindBy(name="firstName")
		WebElement firstNameTextbox;
		
		@CacheLookup
		@FindBy(name="lastName")
		WebElement lastNameTextbox;
		
		@CacheLookup
		@FindBy(name="phone")
		WebElement phoneTextbox;
		
		@CacheLookup
		@FindBy(name="country")
		WebElement countryDropdown;
		
		
		@CacheLookup
		@FindBy(name="email")
		WebElement emailTextbox;
		
		@CacheLookup
		@FindBy(name="userName")
		WebElement userNameTextbox;
		
		@CacheLookup
		@FindBy(name="password")
		WebElement passwordTextbox;
		
		@CacheLookup
		@FindBy(name="confirmPassword")
		WebElement confirmPasswordTextbox;
		
		@CacheLookup
		@FindBy(name="register")
		WebElement registerButton;
		
		
		
		
		
	public PFRegistration enterFirstName(String firstName){ //variable name and object that is found by "name" are matching in this case
		firstNameTextbox.sendKeys(firstName);
		return this;
	}
	public PFRegistration enterLastName(String lastName){
		lastNameTextbox.sendKeys(lastName);
		return this;
	}
	public PFRegistration enterPhone(String phone){
		phoneTextbox.sendKeys(phone);
		return this;
	}
	public PFRegistration enterUserName(String userName){
		userNameTextbox.sendKeys(userName);
		return this;
	}
	public PFRegistration enterCountry(String country){
		new Select(countryDropdown).selectByVisibleText(country);//dropdown list
		return this;
	}

	public PFRegistration enterEmail(String email){
		emailTextbox.sendKeys(email);
		return this;
	}
	public PFRegistration enterPassword(String password){
		passwordTextbox.sendKeys(password);
		return this;
	}
	public PFRegistration enterConfirmPassword(String password){
		confirmPasswordTextbox.sendKeys(password);
		return this;
	}
	public accountCreation3 clickRegister(){
		registerButton.click();
		//return new accountCreation3(driver); //return to the new class that represents a new page
		return PageFactory.initElements(driver, accountCreation3.class); //using Page Factory
	}

	public accountCreation3 registerNewUser(RegistrationData3 registrationData){
		return enterFirstName(registrationData.getFirstName()).enterLastName(registrationData.getLastName()).
		enterPhone(registrationData.getPhone()).enterUserName(registrationData.getUserName()).enterCountry(registrationData.getCountry()).
		enterEmail(registrationData.getEmail()).enterPassword(registrationData.getPassword()).enterConfirmPassword(registrationData.getConfirmPassword()).
		clickRegister();
	}
	
	
	
	
	}	













