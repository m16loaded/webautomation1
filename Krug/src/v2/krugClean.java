package v2;
//import KrugWorkingSection;
//import TestingOnline;

import java.io.IOException;

import org.testng.annotations.Test;

//@Test
public class krugClean extends TestingOnline {
	@Test
	public void workingClean() throws InterruptedException, IOException{
		//int b=0;
		//driver.get("http://vkrugudruzei.ru/");
		KrugWorkingSection work =new KrugWorkingSection(driver);
		work.testSite();
		
		//Thread.sleep(4000);
		try{
			
		work.login();
		work.mainPage();
		
		for(int i=0;i<2500;i++){
			//Thread.sleep(1000);
			work.onlinePage();
			work.scrollDown1000();
			Thread.sleep(1000);
			work.scrollDown1000();
			Thread.sleep(1000);
			work.scrollDown1000();
			Thread.sleep(1000);
			work.scrollDown1000();
			Thread.sleep(1000);
			work.scrollDown1000();
			/*Thread.sleep(1000);
			work.scrollDown1000();*/
			//work.scrollingWithKeys();
		    
			work.chooseUser();
			Thread.sleep(2000);
			work.profilePic();
			Thread.sleep(2000);
			//work.scrollingWithKeys();
			
			work.vote();
			Thread.sleep(1000);
		//	work.restart();
		//	work.onlinePage2();
		}
		}
		catch(Exception e) {
			System.out.println(e);
		     // This will catch any exception, because they are all descended from Exception
		}
		
	}

}
