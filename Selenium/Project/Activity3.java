package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	  }
	
	@Test
	  public void imageURL() {
		WebElement imageURL = driver.findElement(By.xpath("//*[@id=\"post-16\"]/header/div/img"));		
		System.out.println("The url of the header image is: " + imageURL.getAttribute("src"));
	  }
	
	@AfterClass
	  public void afterClass() {
		driver.close();
	  }
}
