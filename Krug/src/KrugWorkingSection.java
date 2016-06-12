import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class KrugWorkingSection {
	/*private*/ WebDriver driver;
	static int i=0;
	String URL="http://vkrugudruzei.ru/";
	WebDriverWait wait = new WebDriverWait(driver, 7);
	JavascriptExecutor jsx = (JavascriptExecutor)driver;
	
	KrugWorkingSection(WebDriver driver){
		this.driver=driver;
	}
/*@BeforeMethod //try
	public void Online(){
		driver=new FirefoxDriver();
	}*/
	public KrugWorkingSection testSite(){
		
		driver.get("http://vkrugudruzei.ru/");
		return (KrugWorkingSection) driver;
	}
	public KrugWorkingSection login() /*throws InterruptedException*/{
		//driver.get("http://vkrugudruzei.ru/");
		if(!driver.findElements(By.cssSelector("div.enter > span.title")).isEmpty()){//will only insert details if needed
		driver.findElement(By.id("email")).sendKeys("Forcing.it@mail.ru");
		driver.findElement(By.id("password")).sendKeys("a1b2c3");
		driver.findElement(By.xpath("//*[@class='green']")).click();
	
		}
		return (KrugWorkingSection) driver;
	}
	public void mainPage(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.user")));//verify user main page
		driver.findElement(By.xpath("//*[@id='c']/div[2]/ul[2]/li[1]/a")).click();//click on 'want to talk'
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='haqc_1-filter-upperBar']/div/div[2]")));//wait unti 'want to talk ' page is up
	}
	public void onlinePage(){
		new Select(driver.findElement(By.id("haqc_1-filter-isFemale"))).selectByVisibleText("Женский");//dropdown list
		
	}
	public void scrollDown1000(){
		jsx.executeScript("window.scrollBy(0,1000)", "");
		
	}
	public int randomNumber(){
		int math;
		math=(int)Math.floor(Math.random()*25 +1);
		return math;
		
	}
	public void chooseUser(){
		int math1=randomNumber();
		if(!driver.findElements(By.xpath("//*[@id='haqc_1-users-factory-"+math1+"-user']/div[1]/div/a[2]/img")).isEmpty()){
			driver.findElement(By.xpath("//*[@id='haqc_1-users-factory-"+math1+"-user']/div[1]/div/a[2]/img")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cardAddFriend")));
			driver.findElement(By.xpath("//*[@id='mycard']/tbody/tr/td[1]/div[1]/div/img")).click();
			driver.findElement(By.xpath("//*[@id='mycard']/tbody/tr/td[1]/div[1]/div/img")).click();
			counter();
			
		}
	}
	public void vote(){
		if(!driver.findElements(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")).isEmpty()){
			driver.findElement(By.xpath("//*[@id='photopopup']/div[1]/div[2]/div[2]/div/div/div[1]/div/span[2]")).click();
		}
	}
	public void restart(){
		driver.get("http://vkrugudruzei.ru/x/online/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='haqc_1-filter-upperBar']/div/div[2]")));
	}
	public void counter(){
		i++;
		System.out.println(i);
	}
/*	@AfterMethod //try
	public void closeBrowser(){
		driver.close();
		driver.quit();
	}*/
	
}
