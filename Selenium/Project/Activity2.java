package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	  }
	
	 @Test
	  public void heading() {
		 WebElement element = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/h1"));
			
			String webpageHeading = element.getText();
			System.out.println("The webpage heading is: " + webpageHeading);
			
			String heading="Welcome to Alchemy Jobs";
			
			if(webpageHeading.contentEquals(heading)) {
				System.out.println("The webpage heading is matching with the expected heading");				
			}
			else {
				System.out.println("The webpage heading is not matching with the expected heading");	
			}
		 
	  }

	 @AfterClass
	  public void afterClass() {
		 driver.close();
	  }

}
