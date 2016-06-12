import org.testng.annotations.Test;

//@Test
public class krugClean extends TestingOnline {
	@Test
	public void workingClean() throws InterruptedException{
		int b=0;
		//driver.get("http://vkrugudruzei.ru/");
		KrugWorkingSection work =new KrugWorkingSection(driver);
		//work.testSite();
		
		Thread.sleep(4000);
		work.login();
		work.mainPage();
		work.onlinePage();
		for(int i=0;i<2;i++){
			
			work.scrollDown1000();
			work.chooseUser();
			work.vote();
			work.restart();
		
		}
	}

}
