package com.EnhancedRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



public class WebDriverTest3 extends SelTestCase3 {
/*	public void testRegistration(){  //previous method 
		Registration3 registration=new Registration3(driver);
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=34bf4cfe5be3ab8edc58faa8694fbccd");
		registration.registerNewUser();
		assert driver.findElement(By.tagName("body")).getText().contains("Thank you for");
		
		
	}*/
/*	@Test(dataProvider="regCSVdata",dataProviderClass=RegistrationData3.class)
	//@Test(dataProvider="regData",dataProviderClass=RegistrationData3.class/*,dependsOnMethods="some method",alwaysRun=true)//dependency is very useful in case the method that depended on is failed other tests will not be executed(unless we add alwaysRun =true)
	//dependsOnGroups(instead of dependsOnMethods) feature with @Test(groups='name')  will execute the all the marked groups fist and only then the testRegistrationNew method.
	public void testRegistrationNew(String firstName,String lastName,String phone,String userName,String country,String email,
			String password,String confirmPassword){
		RegistrationData3 registrationData=new RegistrationData3();
		registrationData.setFirstName(firstName);
		registrationData.setLastName(lastName);
		registrationData.setPhone(phone);
		registrationData.setUserName(userName);
		registrationData.setCountry(country);
		registrationData.setEmail(email);
		registrationData.setPassword(password);
		registrationData.setConfirmPassword(confirmPassword);
		
		
		//Registration3 registration=new Registration3(driver);//refers to Registration3 class
		PFRegistration registration=PageFactory.initElements(driver, PFRegistration.class); //replacing with a new registration class that uses Page Factory.
		//this is how the Elements are initialized
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=34bf4cfe5be3ab8edc58faa8694fbccd");
		registration.registerNewUser(registrationData);
		assert driver.findElement(By.tagName("body")).getText().contains("Thank you for");
		
	}*/
	//@Test
	public void hardAssertion(){//will only test until the first assertion fails.
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=34bf4cfe5be3ab8edc58faa8694fbccd");
		//Assert.assertTrue("last name is missing",driver.findElements(By.name("firstName")).size()==1);
		Assert.assertTrue(driver.findElements(By.name("firstName")).size()==1,"first name is missing");
		
		Assert.assertTrue(driver.findElements(By.name("wrongname")).size()==1,"last name is missing");
		Assert.assertTrue(driver.findElements(By.name("wrongphone")).size()==1,"phone is missing");
	}
	//@Test
	public void softAssertion(){//WORKING .This allows us to run all the assertions(that are in CustomVerification class) even if one of them fails.
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=34bf4cfe5be3ab8edc58faa8694fbccd");
		CustomVerification customVerification=new CustomVerification(); //is another class that contains stringbuffer and assertion wrapped into try-catch functions.
		customVerification.verifyTrue("first name is missing", driver.findElements(By.name("firstName")).size()==1);
		customVerification.verifyTrue("last name is missing", driver.findElements(By.name("wrongname")).size()==1);
		customVerification.verifyTrue("phone is missing", driver.findElements(By.name("wrongphone")).size()==1);
		customVerification.checkVerificationErrors();
	}
//@Test
	public void testJSExecution() throws InterruptedException {
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=34bf4cfe5be3ab8edc58faa8694fbccd");
		((JavascriptExecutor)driver).executeScript("document.getElementsByName('firstName')[0].value='bobo'");
	}
	
	//@Test(dataProvider="regCSVdata",dataProviderClass=RegistrationData3.class)
	@Test(dataProvider="regCSVdata",dataProviderClass=RegistrationData3.class)
	//@Test(dataProvider="regData",dataProviderClass=RegistrationData3.class/*,dependsOnMethods="some method"*//*,alwaysRun=true*/)//dependency is very useful in case the method that depended on is failed other tests will not be executed(unless we add alwaysRun =true)
	//dependsOnGroups(instead of dependsOnMethods) feature with @Test(groups='name')  will execute the all the marked groups fist and only then the testRegistrationNew method.
	public void testRegistrationNew(RegistrationData3 registrationData ){
	/*public void testRegistrationNew(String firstName,String lastName,String phone,String userName,String country,String email,
			String password,String confirmPassword ){*/
	/*	RegistrationData3 registrationData=new RegistrationData3();
		registrationData.setFirstName(firstName);
		registrationData.setLastName(lastName);
		registrationData.setPhone(phone);
		registrationData.setUserName(userName);
		registrationData.setCountry(country);
		registrationData.setEmail(email);
		registrationData.setPassword(password);
		registrationData.setConfirmPassword(confirmPassword);*/
		
		
		//Registration3 registration=new Registration3(driver);//refers to Registration3 class
		PFRegistration registration=PageFactory.initElements(driver, PFRegistration.class); //replacing with a new registration class that uses Page Factory.
		//this is how the Elements are initialized
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=34bf4cfe5be3ab8edc58faa8694fbccd");
		registration.registerNewUser(registrationData);
		assert driver.findElement(By.tagName("body")).getText().contains("Thank you for");
		
	}
	
}
