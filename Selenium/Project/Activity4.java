package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	  }
	
	 @Test
	  public void headingsecond() {
		 WebElement Title2 = driver.findElement(By.xpath("//*[@id=\"post-16\"]/div/h2"));
			String secondHeading = Title2.getText();
			System.out.println("The 2nd heading in the page is: "+ secondHeading);

			String expectedtitle = "Quia quis non";
			
			if(secondHeading.contentEquals(expectedtitle)) {
				System.out.println("The 2nd title of the browser is matching with the expected one");							
			}
			else {
				System.out.println("The 2nd title of the browser is not matching with the expected one");
			}
	  }

	 @AfterClass
	  public void afterClass() {
		 driver.close();
	  }		

	}


