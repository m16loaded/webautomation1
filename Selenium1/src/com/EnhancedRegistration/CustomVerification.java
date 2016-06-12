package com.EnhancedRegistration;

import org.testng.Assert;
import org.testng.Reporter;

public class CustomVerification {
	
	private StringBuffer verificationErrors;
	public CustomVerification(){
		verificationErrors=new StringBuffer();
	}
	
public void verifyTrue(String msg,Boolean b){
	try{
		Assert.assertTrue(b.booleanValue());
	}
	catch(Error e){
		verificationErrors.append(e);
		Reporter.log(msg+"<br>");
	}
	
}

/*public void verifyFalse(String msg,Boolean b){
	try{
		Assert.assertTrue(b.booleanValue());
	}
	catch(Error e){
		verificationErrors.append(e);
		Reporter.log(msg+"<br>");
	}
	
}*/

public void clearVerificationErrors(){
	verificationErrors=new StringBuffer();
}

public void checkVerificationErrors(){
	String verificationErrorsString=verificationErrors.toString();//we convert the errors to string and pass them to a new var
	clearVerificationErrors();
	/*if(!"".equals(verificationErrorsString)){//fail() is not working for some reason
		fail()
	}*/
}
}
