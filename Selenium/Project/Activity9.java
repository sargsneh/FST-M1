package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
	  }
	
	@Test
	  public void jobPublish() {
		WebElement firstPage = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/h1"));
		String board = firstPage.getText();
		
		String Title="Dashboard";
		
		if(board.equals(Title)) {
			System.out.println("Logged in successfully!");
			}
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[7]/a/div[3]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/div/div[1]/button")).click();
		
		driver.findElement(By.id("post-title-0")).sendKeys("Testing");
		
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/button[2]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button"))
				.click();
		
	    WebElement publish=driver.findElement(By.xpath("//*[@id=\"post-title-0\"]"));
		
	    String Publish= publish.getText();
		System.out.println(Publish);
		
		String test="Testing";
		
		if(Publish.equals(test)) {
			System.out.println("Job was published successfully!");
		}
		else {
			System.out.println("Job was not published successfully!");
		}
	  }

	 @AfterClass
	  public void afterClass() {
		 driver.close();
	  }


}
