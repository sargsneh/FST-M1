package Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	  }

	@Test
	  public void newPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title of the original page is: " + driver.getTitle());
		
		WebElement linkElement = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]"));
		linkElement.click();
		
		System.out.println("Title of the new page is: "+driver.getTitle());
		
		String JobTitle= driver.getTitle();
		String title="Jobs – Alchemy Jobs";
		if (JobTitle.contentEquals(title)) {
			System.out.println("The title of the new page is matching with the expected one");
		}
		else {
			System.out.println("The title of the new page is not matching with the expected one");
		}
	  }
	
	@AfterClass
	  public void afterClass() {
		driver.close();
	  }

}
