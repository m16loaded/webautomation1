import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//@Test
public class KrugTest extends TestingOnline {
	//WebDriver driver;
	@Test
	public void TestKrug() throws InterruptedException{
		
		
	//WebDriver driver=new FirefoxDriver();
	driver.get("http://vkrugudruzei.ru/");
	int b=0;
	if(driver.findElement(By.cssSelector("div.enter > span.title")) != null){
		//driver.findElement(By.id("email").sendKeys("Selenium software");//incorrect
		driver.findElement(By.id("email")).sendKeys("Forcing.it@mail.ru");
		driver.findElement(By.id("password")).sendKeys("a1b2c3");
		driver.findElement(By.xpath("//*[@class='green']")).click();
		//Thread.sleep(4000);
	}
		WebDriverWait wait = new WebDriverWait(driver, 7);
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.user")));
		driver.findElement(By.xpath("//*[@id='c']/div[2]/ul[2]/li[1]/a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='haqc_1-filter-upperBar']/div/div[2]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='haqc_1-filter-upperBar']/div/div[2]")));
		//driver.findElement(By.id("haqc_1-filter-isFemale"))).
		//new Select(driver.findElement(By.xpath("//*[@class='select info-years-study']"))).selectByVisibleText("1");
		//new Select(driver.findElement(By.xpath("//*[@class='select info-years-study']"))).selectByValue("1");
		//new Select(driver.findElement(By.cssSelector("#haqc_1-filter-isFemale"))).selectByValue("1");
		//driver.findElement(By.xpath("//*[@class='select info-years-study']")).click();
		new Select(driver.findElement(By.id("haqc_1-filter-isFemale"))).selectByVisibleText("Женский");//dropdown list
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id='haqc_1-filter-refresh']")).click();
		
		//driver.findElement(By.xpath("//*[contains(@id,'refresh')]")).click();
		for(int i=0;i<2;i++){
		jsx.executeScript("window.scrollBy(0,1000)", "");
		//Thread.sleep(2000);
		//jsx.executeScript("window.scrollBy(0,900)", "");
		//Thread.sleep(2000);
		int math;
		math=(int)Math.floor(Math.random()*25 +1);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='haqc_1-users-factory-25-user']/div[1]/div/a[2]/img")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='haqc_1-users-factory-"+math+"-user']/div[1]/div/a[2]/img")));//(?)//adding a var that contains random number of a user 
		/*jsx.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		jsx.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);*/
		//driver.findElement(By.xpath("//*[@id='haqc_1-users-factory-25-user']/div[1]/div/a[2]/img")).click();//select an user
		if(!driver.findElements(By.xpath("//*[@id='haqc_1-users-factory-"+math+"-user']/div[1]/div/a[2]/img")).isEmpty()){//check if there is such a user at all
		driver.findElement(By.xpath("//*[@id='haqc_1-users-factory-"+math+"-user']/div[1]/div/a[2]/img")).click();//select an user using variable with generated number
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cardAddFriend")));//wait till the 'add to friend' button appears
		driver.findElement(By.xpath("//*[@id='mycard']/tbody/tr/td[1]/div[1]/div/img")).click(); //click on the photo
		driver.findElement(By.xpath("//*[@id='mycard']/tbody/tr/td[1]/div[1]/div/img")).click();
		Thread.sleep(2000);
		if(!driver.findElements(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")).isEmpty()){
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")));//wait till '5' is visible
		driver.findElement(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")).click();//click on '5'
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[2]/ul/li[1]/span")).click();//click on 'like'
		Thread.sleep(4000);
		b++;
		System.out.println(b);//counter for fives
		}
		}
		driver.get("http://vkrugudruzei.ru/x/online/");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='haqc_1-filter-upperBar']/div/div[2]")));
		}
	//driver.close();
	//driver.quit();
	}
}
