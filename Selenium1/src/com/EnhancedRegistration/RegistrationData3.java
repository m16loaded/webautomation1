package com.EnhancedRegistration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class RegistrationData3 {
	private String firstName;
	private String lastName;
	private String phone;
	private String userName;
	private String country;
	private String email;
	private String password;
	private String confirmPassword;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	//@DataProvider(name="regData")
	public static Object[][] getRegistrationData(){
		return new Object[][]{
				{"firstname1","lastname1","123123","user1","ISRAEL","test1@yahoo.com","222333","222333"},
				{"firstname2","lastname2","345345","user2","INDIA","test2@yahoo.com","333222","333222"}
		};
	}
	
/*	@DataProvider(name="regCSVData")
	public static Object[][] getCsvData() throws IOException{
		CSVReader csvReader=new CSVReader(new FileReader(RegistrationData3.class.getResource("/regdata.csv").getPath()));
		
	}*/
	
	
	@DataProvider(name = "regCSVdata") 
    public static Object[][] getlogindata() throws IOException { 
            
            int i=0; 
            File file = new File("D:/JavaProjects/regCSV.csv"); 
            
    //CSVReader reader new CSVReader(new FileReader (WellbeingData.class.getResource("/regdata.csv").getPath())); 
            
            BufferedReader bufrder = new BufferedReader(new FileReader(file)); 
            String line = null; 
            
            List<RegistrationData3> reglist = new ArrayList<RegistrationData3>(); 
            
            while((line = bufrder.readLine()) != null) { 
                    StringTokenizer st = new StringTokenizer(line,","); 
                            
                    while(st.hasMoreTokens()) { 
                            
                    	//RegistrationData3 data = new RegistrationData3(); 
                            
                            /*data.setFirstName(st.nextToken()); 
                            data.setLastName(st.nextToken()); 
                            data.setPhone(st.nextToken());*/
                    	RegistrationData3 registrationData=new RegistrationData3();
                		registrationData.setFirstName(st.nextToken());
                		registrationData.setLastName(st.nextToken());
                		registrationData.setPhone(st.nextToken());
                		registrationData.setUserName(st.nextToken());
                		registrationData.setCountry(st.nextToken());
                		registrationData.setEmail(st.nextToken());
                		registrationData.setPassword(st.nextToken());
                		registrationData.setConfirmPassword(st.nextToken());
                            reglist.add(registrationData); 
                            i++; 
                    } 
            } 
            Object[][] data1 = new Object[i][1]; 
            for(int j=0; j<data1.length; j++) { 
                    for(int k=0; k<data1[j].length; k++) { 
                            data1[j][k] = reglist.get(j); 
                           // Reporter.log((String) data1[j][k]);
                            System.out.println(data1[j][k].toString()); 
                    } 
            } 
            bufrder.close(); 
            return(data1); 
    }
	
	
	
}
	


