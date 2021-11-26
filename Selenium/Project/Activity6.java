package Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	  }
	
	@Test
	  public void jobApply() {
		WebElement JobsLink = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]"));
		JobsLink.click();
		
		WebElement searchJob = driver.findElement(By.id("search_keywords"));
		searchJob.sendKeys("testing");
		searchJob.sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[1]/a/div[1]/h3")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[2]/input")).click();
		
		WebElement emailID = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[2]/div/p/a"));
		System.out.println(emailID.getText());
	  }

	@AfterClass
	  public void afterClass() {
		driver.close();
	  }

}
