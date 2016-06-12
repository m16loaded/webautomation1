package PhotoStrana;

import java.io.IOException;

import org.testng.annotations.Test;

public class PhotoStranaClean extends BeforeAfter {
	@Test
	public void workingClean1() throws InterruptedException, IOException{
		
		PhotoStranaWorking work1=new PhotoStranaWorking(driver);
		work1.testSite();
		work1.login();
		work1.vstrechi();
		for(int i=0;i<1000;i++){
			Thread.sleep(1000);
		work1.vote();
		Thread.sleep(1000);
		}
	}
	

}
