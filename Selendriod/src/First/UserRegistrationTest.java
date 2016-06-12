package First;

import java.net.MalformedURLException;
import java.net.URL;

import io.selendroid.SelendroidCapabilities;
import io.selendroid.SelendroidDriver;












import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
* Base Test to demonstrate how to test native android apps with Selendroid.
* App under test is: src/main/resources/selendroid-test-app-0.5.1.apk
*
* @author ddary
*/
public class UserRegistrationTest {
  //static final java.net.URL URL = "http://localhost:5555/wd/hub";
private WebDriver driver = null;

  @BeforeMethod
  /*public void setup() throws Exception{
      String kk="http://localhost:5555/wd/hub";
      URL myURL = new URL("http://localhost:5555/wd/hub");
	  DesiredCapabilities caps = SelendroidCapabilities.device("io.selendroid.testapp:0.5.1");
    //  SelendroidCapabilities caps = SelendroidCapabilities.device("io.selendroid.testapp:0.5.1");
	  SelendroidDriver driver = new SelendroidDriver(myURL,caps);
  }*/
  
  
  public void setup() throws Exception {
	    driver = new SelendroidDriver(new SelendroidCapabilities("io.selendroid.testapp:0.10.0"));
	  }



  @Test
  public void assertUserAccountCanRegistered() throws Exception {
    // Initialize test data
    UserDO user = new UserDO("u$erNAme", "me@myserver.com", "mySecret", "John Doe", "Python");

    registerUser(user);
    verifyUser(user);
  }

  private void registerUser(UserDO user) throws Exception {
    driver.get("and-activity://io.selendroid.testapp.RegisterUserActivity");

    WebElement username = driver.findElement(By.id("inputUsername"));
    username.sendKeys(user.username);

    driver.findElement(By.id("inputEmail")).sendKeys(user.email);
    driver.findElement(By.id("inputPassword")).sendKeys(user.password);

    WebElement nameInput = driver.findElement(By.id("inputName"));
    Assert.assertEquals(nameInput.getText(), "Mr. Burns");
    nameInput.clear();
    nameInput.sendKeys(user.name);

    driver.findElement(By.id("input_preferedProgrammingLanguage")).click();
    driver.findElement(By.linkText(user.programmingLanguage)).click();

    driver.findElement(By.id("input_adds")).click();

    driver.findElement(By.id("btnRegisterUser")).click();
    Assert.assertEquals(driver.getCurrentUrl(), "and-activity://VerifyUserActivity");
  }

  private void verifyUser(UserDO user) throws Exception {
    Assert.assertEquals(driver.findElement(By.id("label_username_data")).getText(), user.username);
    Assert.assertEquals(driver.findElement(By.id("label_email_data")).getText(), user.email);
    Assert.assertEquals(driver.findElement(By.id("label_password_data")).getText(), user.password);
    Assert.assertEquals(driver.findElement(By.id("label_name_data")).getText(), user.name);
    Assert.assertEquals(driver.findElement(By.id("label_preferedProgrammingLanguage_data"))
        .getText(), user.programmingLanguage);
    Assert.assertEquals(driver.findElement(By.id("label_acceptAdds_data")).getText(), "true");
  }

  @AfterMethod
  public void teardown() {
    driver.quit();
  }
}