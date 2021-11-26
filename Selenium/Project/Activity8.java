package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	  }

	@Test
	  public void newPageLogin() {
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		
		WebElement firstPage = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/h1"));
		String board = firstPage.getText();
		
		String Title="Dashboard";
		
		if(board.equals(Title)) {
			System.out.println("Logged in successfully!");
			}
		else {
			System.out.println("Login failed!");
		}
	  }
	
	@AfterClass
	  public void afterClass() {
		driver.close();
	  }

}
