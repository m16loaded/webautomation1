package Mir;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;












import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class chromeDetailed {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		String Login="forcing.it";
//    	String Pass="a1b2c3qwertyu";
		String Pass="A1b2c3qwert";
		
//		String Login="salty.fur";
//    	String Pass="A1b2c3qwert";
    	File file=new File("C:/SeleniumCases/namesChrome2.txt");
    	String contentOfObject;
    //	final String file = "C:/SeleniumCases/namesChrome.txt" ;
    	int user=1;
    	int clicked=0;
    	int count=0;
    	int bigcount=0;
    	String name = null ;
    	String Switch = "allFree";    //low or mid will rotate, allFree will not
    	//search quarry
    	String low="http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=3&infofields=true";
    	String mid="http://my.mail.ru/my/search_people?&gender=2&agerange=16&family=3&infofields=true";
    	String allFree="http://my.mail.ru/my/search_people?&gender=2&family=5&infofields=true";
    	String allFreeM="http://m.my.mail.ru/my/search_people?&gender=2&family=5&infofields=true";
    	String allFemale = "https://my.mail.ru/my/search_people?&gender=2";
    	String AiresLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=1&infofields=true";
    	String TaurusLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=2&infofields=true";
    	String GminiLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=3&infofields=true";
    	String CancerLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=4&infofields=true";
    	String LeoLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=5&infofields=true";
    	String VirgoLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=6&infofields=true";
    	String LibraLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=7&infofields=true";
    	String ScorpioLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=8&infofields=true";
    	String SagittariusLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=9&infofields=true"; 
    	String CapricornLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=10&infofields=true";	
    	String AquariusLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=11&infofields=true";
    	String PiecesLow= "http://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&zodiac=12&infofields=true";
    	//https://my.mail.ru/my/search_people?q=&st=search&head=1
    	//http://my.mail.ru/my/search_people?q=&st=search&head=1&gender=2&agerange=15&family=5&zodiac=12&infofields=true
    	//http://my.mail.ru/my/search_people?&gender=2&agerange=16&family=5&birthdayday=23&birthdaymonth=5&children=2&infofields=true
    	
    	String birthday = "https://my.mail.ru/my/search_people?&gender=2&agerange=15&birthdayday=22&birthdaymonth=4";
    	
    	
    	String alreadyVoted = "//*[contains(.,'�� ��� ���������� �� ��� ����')][contains(@class,'b-photo__marks-error_marked font-additional')]" ;

    	int math=0;
    	int smallLoppSize=50;
    	int month = 4;
    	int day = 22;
    	int ageRange = 15;
    	int photoNumber = 1;
    	
    	String subbmitButton = "/html/body/div[1]/div[2]/div[1]/div[1]/div/form/div[4]/input"; 
    	String subbmitButton2 ="//*[contains(@type,'submit')]";
    	String subbmitButton3   = "//*[@id='login_page']/div[1]/div[2]/form/fieldset/div[4]/input";
    	String subbmitButton4= "//*[@id='wrap']/div[2]/div/div/form/div[3]/input";
    	String subbmitButton5 = "//input[@type='submit']";
    	String closeButton = "//*[contains(@id,'b-photo-close')]" ;
    	String voteFive ="//*[contains(@data-vote-mark,'5')]" ;
    	String voteFive2 ="//span[@data-vote-mark='5']" ;
    	String voteFive3= "http://html/body/div[1]/div[2]/div[7]/div[1]/div[2]/div/div[4]/span[2]";
    	String voteFive4 = "//span[contains(@data-vote-mark,'5')]";
    	String getNameInsidePhoto ="//*[contains(@class,'booster-sc b-photo__content-author-name')]";
    	String afterVote = "//*[contains(text(),'���� ������') or contains(text(),'�� ��� ���������� �� ��� ����')]";
    	 
    	 
    	//random
 
    	
	    
	    
//    FirefoxProfile profile = new FirefoxProfile();
    	
    	 
    	
	    //Tweaks
	    
	
	    
	    
	    //attempt to add a russian proxy
//	    profile.setPreference("network.proxy.type", 1);
//	    profile.setPreference("network.proxy.http", "213.85.92.10");
//	    profile.setPreference("network.proxy.http_port", 80);
//	    profile.setPreference("network.proxy.ssl", "213.85.92.10");
//	    profile.setPreference("network.proxy.ssl_port", 80);
	    
//	    profile.setPreference("browser.migration.version", 9001); //in order for all of this to work you have to use an older version
////	    profile.setPreference("permissions.default.stylesheet", 2);
////	    profile.setPreference("permissions.default.image", 2);
//	    profile.setPreference("xpinstall.signatures.required", false);  //in order to remove the annoying FF popup at the start
//	    profile.setPreference("browser.startup.homepage", "about:blank");
//	    profile.setPreference("startup.homepage_welcome_url", "about:blank");
//	    profile.setPreference("startup.homepage_welcome_url.additional", "about:blank");
////	  //TWEAKS
////	 // Try to use less memory
//	    profile.setPreference("browser.sessionhistory.max_entries", 10);
//	    profile.setPreference("browser.sessionhistory.max_total_viewers", 4);
//	    profile.setPreference("browser.sessionstore.max_tabs_undo", 4);
//	    profile.setPreference("browser.sessionstore.interval", 1800000);
//	    
////	 // Speed up firefox by pipelining requests on a single connection
//	    profile.setPreference("network.http.keep-alive", true);
//	    profile.setPreference("network.http.pipelining", true);
//	    profile.setPreference("network.http.proxy.pipelining", true);
//	    profile.setPreference("network.http.pipelining.maxrequests", 8);
//	    
////	 // misc confs to avoid useless updates
//	    profile.setPreference("browser.search.update", false);
//	    profile.setPreference("browser.bookmarks.restore_default_bookmarks", false);
//	    
////	 // prevent FF from giving health reports
//	    profile.setPreference("datareporting.policy.dataSubmissionEnabled", false);
//	    profile.setPreference("datareporting.healthreport.uploadEnabled", false);
//	    profile.setPreference("datareporting.healthreport.service.firstRun", false);
//	    profile.setPreference("datareporting.healthreport.service.enabled", false);
//	    profile.setPreference("datareporting.healthreport.logging.consoleEnabled", false);
	    

   	 
    	//FirefoxProfile profile = defaultProfile.getProfile("iwwvv4h4.default");
//    	File file = new File("C:/hola_firefox_ext_1.9.354_www.xpi"); //attempt to add hola 
//	    File file2 = new File("C:/Users/Igor/AppData/Roaming/Hola/firefox_profile/extensions/jid1-4P0kohSJxU1qGg@jetpack"); //attempt to add hola
	    
//    	profile.addExtension(file);
	    
	 //   profile.setPreference("extensions.hola.currentVersion", "1.9.354");
    	
//    	ProfilesIni myprofile = new ProfilesIni();
//    	 
//    	FirefoxProfile profile = myprofile.getProfile("Selenium");
    	 
    	//WebDriver driver = new FirefoxDriver(myprofile);
    	
//	    WebDriver driver = new FirefoxDriver(profile);

//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //this should affect all driver commands
    	
    	System.setProperty("webdriver.chrome.driver", "C:/SeleniumCases/chromedriver_win32/chromedriver.exe");

    	WebDriver driver = new ChromeDriver();
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    driver.get(allFree);
	    
	    driver.manage().window().maximize();
//	    Thread.sleep(6000);
	    driver.findElement(By.name("Login")).sendKeys(Login);
	    driver.findElement(By.name("Password")).sendKeys(Pass);
//	    if(!driver.findElements(By.xpath(subbmitButton)).isEmpty()){
//	    driver.findElement(By.xpath(subbmitButton4)).click();
//	    }
	    driver.findElement(By.xpath(subbmitButton5)).click();
//	    driver.get(allFree);
//	    Thread.sleep(3000);
	    
//	    Thread.sleep(3000);


	    
			  
	   for(int Bigloop=0;Bigloop<10000;Bigloop++){
	    	//random zodiac
		   
//	    	String zodiac=null;
//	    	String zodiac=allFemale;
	    	String zodiac=birthday;
//	    	String choice=allFemale;
		   if(zodiac.equals(allFemale)){ //check what to run
	       		smallLoppSize=500;
	       	}
	       	else if(zodiac.equals(birthday)){ //generate birth date
//	       		month = (int)Math.floor(1+(Math.random()*12 +1));   //1 - min 12 - max
	       		month = (int)Math.floor((Math.random()*11 +1));   // 0 - min 11 - max //for some reason the url increments the month by 1
	       		day = (int)Math.floor(1+(Math.random()*31 +1));  //1 - min 30 - max
	       		ageRange = (int)Math.floor(Math.random() * ((16-15)+1) + 15);  //15 - min 16 - max
	       		
	       		//https://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&birthdayday=22&birthdaymonth=5&children=2&infofields=true
//	       		if(!zodiac.equals("https://my.mail.ru/my/search_people?&gender=2&agerange=15&family=5&birthdayday=8&birthdaymonth=6&children=2&infofields=true")){
	       		if(month != 6&&day !=8){
	       		//	https://my.mail.ru/my/search_people?&gender=2&agerange=15&birthdayday=22&birthdaymonth=5&children=2&infofields=true
	       			zodiac = "https://my.mail.ru/my/search_people?&gender=2&agerange="+ageRange+"&family=5&birthdayday="+day+"&birthdaymonth="+month+"&children=2&infofields=true";
		       		smallLoppSize=500;
		       		System.out.println(zodiac);
		    	}
	       		else{
	       			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! NO VOTING THAT DATE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	       		}
	       		
	       		
	       	}
	       	else if(zodiac.equals(null)){ //run zodiacs
			math=(int)Math.floor(1+(Math.random()*12 +1));   //1 - min 12 - max
	    	
			
			switch (math) {
			  case 1:
				  zodiac=AiresLow; 
			        break;
			  case 2: 
				  zodiac=TaurusLow; 
			        break;
			  case 3:
				  zodiac=GminiLow; 
			        break;
			  case 4: 
				  zodiac=CancerLow;
			        break;
			  case 5:
				  zodiac=LeoLow; 
			        break;
			  case 6: 
				  zodiac=VirgoLow; 
			        break;
			  case 7:
				  zodiac=LibraLow; 
			        break;
			  case 8: 
				  zodiac=ScorpioLow; 
			        break;
			  case 9:
				  zodiac=SagittariusLow;
			        break;
			  case 10: 
				  zodiac=CapricornLow; 
			        break;
			  case 11:
				  zodiac=AquariusLow; 
			        break;
			  case 12: 
				  zodiac=PiecesLow; 
			        break;

			}
	       	}
	       	
	      
	       	
			driver.get(zodiac);
			user=1;
//			Thread.sleep(1000);
			
	    for(int loop=0;loop<smallLoppSize;loop++){
	    	
	    	photoNumber = (int)Math.floor((Math.random()*4 +1)); //change photo each iteration

	  try{ 
		  Thread.sleep(500);
//		  contentOfObject = FileUtils.readFileToString(file, "CP1251");
//		  List<WebElement> usrURL =  driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div["+user+"]/div[2]/div[2]/a[1]")) ;
//		 String text = ((WebElement) usrURL).getText();
//		 System.out.println(text);
//		  if(!usrURL.isEmpty()&&!contentOfObject.contains(text)){
	 if(!driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div["+user+"]/div[2]/div[2]/a["+ photoNumber +"]")).isEmpty()){ //if is not found, go to the end of the loop
	    WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div["+user+"]/div[2]/div[2]/a["+ photoNumber +"]"));
	 // /html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[2]/div[2]/a[1]    third
	    
	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element); //scroll to the object so the object is on top of the page
	  element.sendKeys(Keys.ARROW_UP); // get one up so it be visible
	  
	  Thread.sleep(500); 


	  element.click();
	  Thread.sleep(2000);
	  java.util.Date date= new java.util.Date();
	  System.out.println(new Timestamp(date.getTime())+"  Waiting for voteFive element");
//	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(voteFive4)));  //trying wait
//	  driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	  
	    if(!driver.findElements(By.xpath(voteFive)).isEmpty()||!driver.findElements(By.xpath(voteFive2)).isEmpty()||!driver.findElements(By.xpath(voteFive4)).isEmpty()){ //try to make a counter for this, to end the loop
//	  if(!(driver.findElement(By.xpath(voteFive4)).size() > 0)){
//	  if(!driver.findElements(By.xpath(voteFive4)).isEmpty()){
		   date= new java.util.Date();
	    	System.out.println(new Timestamp(date.getTime())+"  Found the vote element");
//	    	WebElement element2 = driver.findElement(By.xpath(voteFive2));  //trying javascript for faster votes
//	    	JavascriptExecutor executor = (JavascriptExecutor)driver;
//	    	executor.executeScript("arguments[0].click();", element2);
	    	driver.findElement(By.xpath(voteFive2)).click();
	    	date= new java.util.Date();
	    	System.out.println(new Timestamp(date.getTime())+"  Clicked the vote element");
	    	
	    	Thread.sleep(2000);
	    	
	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(afterVote))); //trying to capture the text of "voted"
//	    	if(!driver.findElements(By.xpath(getNameInsidePhoto)).isEmpty()){
//	    	 name = driver.findElement(By.xpath(getNameInsidePhoto)).getText();
//	    	 System.out.println(name);
//	    	}
	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(getNameInsidePhoto)));  //trying wait
	    	name = driver.findElement(By.xpath(getNameInsidePhoto)).getText();
	    	System.out.println(name);
	    	System.out.println("smallLoopNumberIs:" + loop);
	    	System.out.println("photoNumber is:" + photoNumber);
	    	 
	    	
//	    	if(!driver.findElement(By.xpath(alreadyVoted)).isDisplayed()){ //doesn't work for some reason. Always finds the object
//		    	 
//		    	 System.out.println("ALREADY VOTED");
//		    	}
	    	
	    	
	    	 String str = driver.getCurrentUrl();
	 	    System.out.println("The current URL is " + str);
	 	   PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
	    	 out.println(name+ " " + str + " " + " Small Loop Number " + loop + " " + new Timestamp(date.getTime()));
	    	 out.close();
	    	 
	    }

	    if(!driver.findElements(By.xpath(closeButton)).isEmpty()){
	    driver.findElement(By.xpath(closeButton)).click();
	    }

	    Thread.sleep(500);
	    
	       }
	  }
	 catch(ElementNotVisibleException ignore){ // ignore users not found issues
		 System.out.println("ElementNotVisibleException");
		 System.out.println("breaking the small loop");
		 break;
	 }
	  catch(org.openqa.selenium.NoSuchElementException ignore){ //ignore voteFive issues
			 System.out.println("org.openqa.selenium.NoSuchElementException");
			 System.out.println("breaking the small loop");
			 break;
			 
		 }
	  catch(org.openqa.selenium.WebDriverException ignore){ //ignore Element is not clickable at point
			 System.out.println("org.openqa.selenium.WebDriverException");
			 System.out.println("breaking the small loop");
			 break;
			 
		 }
	  
	    
	    user++;
	    count++;
	    System.out.println(count);
	    
	    
	    }
	    //replaced by zodiac
	    
//		   if(Switch.equals("low")){
//			   Switch="mid";
//			   user=1;
//		       driver.get(mid); //get to another range after
//		       Thread.sleep(700);
//		   }
//		   else if(Switch.equals("mid")) {
//			   Switch="low";
//			   user=1;			   
//			   driver.get(low);
//			   Thread.sleep(700);
//		     }
	    
	 
	    
	    
	    bigcount++;
	    System.out.println("BIG LOOP NUMBER "+ bigcount);
	       
	}
	   String str = driver.getCurrentUrl();
	    System.out.println("The current URL is " + str);
	    Thread.sleep(6000);
//	    driver.close();
	    driver.quit();
	   
	}
	public static void readFile(){
		Boolean b=true;
		String name=null;
		String content;
		File file=new File("C:/SeleniumCases/namesChrome2.txt");
		
		try{
			 Scanner scanner = null;
			scanner=new Scanner((Readable) new BufferedReader(new FileReader(file)));
			StringBuffer stringBuffer = new StringBuffer();
			//content = FileUtils.readFileToString(file, "UTF-8");
			content = FileUtils.readFileToString(file, "CP1251"); //CP1251 encoding type
			if(content.contains(name)){
				System.out.println("Yes");
			}
			while (scanner.hasNextLine()) {
				//	System.out.println("start scan");
				    String nextToken = scanner.next();
				   // content = FileUtils.readFileToString(file);
				//    content= FileUtils.readFileToString(new File("D:/JavaProjects/names1.txt"));
				    
				    
				   // stringBuffer.append(nextToken);
				   // i++;
			//	    System.out.println(i);
				    //if (nextToken.equalsIgnoreCase("Bobo")){
				//    if (nextToken.equalsIgnoreCase("Tatiana Shevchenko")){
				    nextToken.toString().trim();
				    name.trim();
				    
				 //   if (nextToken.equalsIgnoreCase(name)){	
				   // if (stringBuffer.toString().equals("")){
				    if (name.equalsIgnoreCase(nextToken)){	
				        b=false;
				    	System.out.println("this user is in the file");
				    	break;
				    }
				}
		}
			catch(Exception error)
			{
				System.out.println(error + "FileReaderError");
			}
	}
	
//	public static void mid(){
//		driver.get(low);
//		
//    }

	
	

}


// xpaths

//ctrl+7
//$x("//*[@title='���� ���������'][@href='/mail/goacora/']")
//$x("//*[@title='���� ���������'][contains(@href, '/mail/goacora/')]")
//$x("//*[contains(@href, '/mail/goacora/')]")
// /html/body/div[1]/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/div/a
// /html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[2]/a[1]   press on secondary pic
//$x("//*[contains(@style, 'content.foto.my.mail.ru/mail')]")
//$x("//*[contains(@id,'b-photo-close')]")  close photo button
//$x("//*[contains(@style, 'content.foto.my.mail.ru/mail')][last()-6]")
//$x("//*[contains(@type,'photolayer')]")
//$x("//*[contains(@type,'photolayer')][contains(@style,'content.foto.my.mail.ru/mail')]")
//$x("//*[contains(@class,'b-search__users__item__field b-search__users__item__name   ')]")

// /html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/a[1]  first photo - a[x] is the number of user's photo
// /html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[2]/a[1]   second  
// /html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[2]/div[2]/a[1]    third

// $x("//*[contains(@class,'b-photo__marks-item-5')]")    vote 5
// $x("//*[contains(@data-vote-mark,'5')]")   vote 5
// /html/body/div[1]/div[2]/div[8]/div[1]/div[2]/div/div[4]/span[2]  vote 5
//$x("//*[contains(@class,'booster-sc b-photo__content-author-name')]")  user name inside the photo
//$x("//*[contains(@type,'submit')]")  //alt submit button
//$x("//*[@id='login_page']/div[1]/div[2]/form/fieldset/div[4]/input")  //alt submit button
// driver.findElement(By.xpath(//E1[@id=I1] | //E2[@id=I2]))  example of OR
// $x("//*[contains(@class,'b-photo__marks-error_marked font-additional')]") // already voted object
//$x("//*[contains(.,'�� ��� ���������� �� ��� ����')][contains(@class,'b-photo__marks-error_marked font-additional')]") // already voted object
//$x("//*[contains(text(),'���� ������')]") //after vote
//$x("//*[contains(text(),'���� ������') or contains(text(),'�� ��� ���������� �� ��� ����')]") after vote







//unused code

//WebElement mapObject = driver.findElement(By.xpath("//*[contains(@style, 'content.foto.my.mail.ru/mail')]"));
//
//((JavascriptExecutor) driver).executeScript("arguments[1].click();", mapObject);
// 
//driver.findElement(By.xpath(closeButton)).click();



//((JavascriptExecutor) driver).executeScript("arguments[1].click();", mapObject);
//driver.findElement(By.xpath("//*[contains(@id,'b-photo-close')]")).click();
//((JavascriptExecutor) driver).executeScript("arguments[2].click();", mapObject);



//jsx.executeScript("window.scrollBy(0,900)", "");
//jsx.executeScript("window.scrollBy(0,900)", "");
//for (Iterator i = a.iterator(); i.hasNext(); ) {
//a.get(1).click(); //opens chat window for some reason ,doesn't work




//List<WebElement> a=driver.findElements(By.xpath("//*[contains(@type,'photolayer')][contains(@style,'content.foto.my.mail.ru/mail')]")) ;
//System.out.println(a.size());
//for(WebElement ele:a)
//{
//          
//  ele.click();
// driver.findElement(By.xpath(closeButton)).click();
//
//}


//WebElement element = driver.findElement(By.id("something"));
//JavascriptExecutor executor = (JavascriptExecutor)driver;
//executor.executeScript("arguments[0].click();", element);





//for(int loop=0;loop<100;loop++){
//if(!driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div["+user+"]/div[2]/div[2]/a[1]")).isEmpty()){
//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div["+user+"]/div[2]/div[2]/a[1]")).click();
//}
//else{
//	JavascriptExecutor jsx = (JavascriptExecutor)driver;
//	jsx.executeScript("window.scrollBy(0,200)", "");
//	if(!driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div["+user+"]/div[2]/div[2]/a[1]")).isEmpty()){
//	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div["+user+"]/div[2]/div[2]/a[1]")).click();
//	    }
//}
//if(!driver.findElements(By.xpath(voteFive)).isEmpty()){
//	driver.findElement(By.xpath(voteFive)).click();   	
//   clicked ++ ;
//	
//}
//driver.findElement(By.xpath(closeButton)).click();
//user++;
//if (clicked>=3){  //if more than 4 clicked scroll the page down
//	JavascriptExecutor jsx = (JavascriptExecutor)driver;
//	jsx.executeScript("window.scrollBy(0,200)", "");
//}
//}



//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//Thread.sleep(500); 




//Actions actions = new Actions(driver);
//actions.moveToElement(element);



//by.linkText


//List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]")); //look for text on page
//Assert.assertTrue("Text not found!", list.size() > 0);



//public static int randInt() {
//
//    // NOTE: This will (intentionally) not run as written so that folks
//    // copy-pasting have to think about how to initialize their
//    // Random instance.  Initialization of the Random instance is outside
//    // the main scope of the question, but some decent options are to have
//    // a field that is initialized once and then re-used as needed or to
//    // use ThreadLocalRandom (if using at least Java 1.7).
//    Random rand = null;
//
//    // nextInt is normally exclusive of the top value,
//    // so add 1 to make it inclusive
//    int randomNum = rand.nextInt((12 - 1) + 1) + 1;
//
//    return randomNum;
//}


// ElementNotVisibleException
// NoSuchElementException


//Assume driver is a valid WebDriver instance that
//has been properly instantiated elsewhere.
//WebElement element = driver.findElement(By.id("gbqfd"));
//JavascriptExecutor executor = (JavascriptExecutor)driver;
//executor.executeScript("arguments[0].click();", element);



//driver.set_page_load_timeout(30)



//public static WebElement waitForElementPresent(WebDriver driver, final By by, int timeOutInSeconds) {
//
//    WebElement element; 
//
//    try{
//        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //nullify implicitlyWait() 
//
//        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds); 
//        element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //reset implicitlyWait
//        return element; //return the element
//    } catch (Exception e) {
//        e.printStackTrace();
//    } 
//    return null; 
//}


// [contains(text(), "Second")]
