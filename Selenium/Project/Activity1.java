package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	  }

	@Test
	  public void title() {
		String BrowserTitle = driver.getTitle();
		System.out.println("Title of the browser is: "+ BrowserTitle);	
		String expectedtitle = "Alchemy Jobs – Job Board Application";	
		if (BrowserTitle.contentEquals(expectedtitle)) {
			System.out.println("The title of the browser is matching with the expected one");
	  }
		else {
			System.out.println("The title of the browser is not matching with the expected one");
		}
		}
	
		@AfterClass
		  public void afterClass() {
			driver.close();
		  }
	
	  }
	


