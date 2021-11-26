package Activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
	WebDriver driver;
	
	//In the @BeforeClass method, create the a driver instance for FirefoxDriver
	  @BeforeClass(alwaysRun = true)
	  public void beforeClass() {
		  driver = new FirefoxDriver();
		  driver.get("https://www.training-support.net/selenium/login-form");
	  }
	
  @Test
  @Parameters({"username", "password"})
  public void loginTestCase(String username, String password) {
	//Pass "username" and "password" as the parameters.	
      WebElement usernameField = driver.findElement(By.id("username"));	
      WebElement passwordField = driver.findElement(By.id("password"));
      usernameField.sendKeys(username);	
      passwordField.sendKeys(password);
	
      //click() the login button.	
      driver.findElement(By.cssSelector("button[type='submit']")).click();

      //Assert Message	
      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();	
      Assert.assertEquals(loginMessage, "Welcome Back, admin");	
  }
  
  //In the @AfterClass method, use close() to close the browser once the test is done.
  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  driver.close();
  }

}
