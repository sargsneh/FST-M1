package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	  }
	
    @Test
	
    public void loginTest() {	
        //Find the login input fields - username and password	
        WebElement username = driver.findElement(By.id("username"));	
        WebElement password = driver.findElement(By.id("password"));
	
        //Enter the credentials - admin and password - and click the "Log in" button.
        username.sendKeys("admin");	
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
	
        //Read the confirmation message	
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        
        //make and assertion to check if the correct message has been printed.	
        Assert.assertEquals("Welcome Back, admin", loginMessage);
	
    }

	
	 //In the @AfterClass method, use close() to close the browser once the test is done.
	 @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

}
