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

public class Activity7 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	  }

	@Test
	  public void jobPosting() {
		WebElement postjob = driver.findElement(By.xpath("//*[@id=\"menu-item-26\"]/a"));
		postjob.click();
		
		driver.findElement(By.id("create_account_email")).sendKeys("sarg2@ibm.com");
		String jobposting="Testing Job";
		driver.findElement(By.id("job_title")).sendKeys("Testing Job");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("job_description_ifr")).sendKeys("Automation Testing");
		driver.findElement(By.id("application")).sendKeys("https://ibm.jobs.com");
		driver.findElement(By.id("company_name")).sendKeys("IBM");
		driver.findElement(By.name("submit_job")).click();
		
		driver.findElement(By.id("job_preview_submit_button")).click();
		
		WebElement JobsLink = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]"));
		JobsLink.click();
		
		WebElement searchJob = driver.findElement(By.id("search_keywords"));
		searchJob.sendKeys("testing");
		searchJob.sendKeys(Keys.ENTER);
		
		WebElement testing= driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[1]/a/div[1]/h3"));
		System.out.println(testing.getText());
		
		String testing1 = testing.getText();
		
		if(testing1.equals(jobposting)) {
			System.out.println("Job posting is done successfully!");
		}
		else {
			System.out.println("Job posting is not done successfully!");
		}
	  }
	
	@AfterClass
	  public void afterClass() {
		driver.close();
	  }
	}


