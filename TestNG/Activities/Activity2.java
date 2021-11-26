package Activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		//In the @BeforeClass method, create the a driver instance for FirefoxDriver
		driver = new FirefoxDriver();
		
		//use the get() method to open the browser 
		driver.get("https://www.training-support.net/selenium/target-practice");
	  }
	
//Add 4 @Test methods.
  @Test
  public void test1() {
	  //use getTitle() to get and assert the title of the page
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Target Practice");
	  
  }
  
  @Test
  public void test2() {
	  //use findElement() to look for the black button. 
	  //Make an incorrect assertion. (This test case is meant to throw an error)
	  WebElement blackbutton = driver.findElement(By.cssSelector("button.black"));
	  Assert.assertEquals(blackbutton.getText(), "black");
	  
  }
  
//The third method will be skipped, but will not be shown as skipped.
  @Test(enabled = false)
  public void test3() {
	  //adding same method as test2 as it will be skipped
	  WebElement blackbutton = driver.findElement(By.cssSelector("button.black"));
	  Assert.assertEquals(blackbutton.getText(), "black");
	  	  
  }
  
  @Test
  public void test4() {
	  //skip it by throwing a SkipException inside the method.
	  //fourth method will be skipped and it will be shown as skipped.
	  throw new SkipException("Skipped the 4th test case");
  }
  

  @AfterClass
  public void afterClass() {
	  //In the @AfterClass method, use close() to close the browser once the test is done.
	  driver.close();
  }

}
