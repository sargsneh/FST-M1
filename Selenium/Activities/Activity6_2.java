package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/ajax");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Find and click the "Change content" button on the page
		driver.findElement(By.xpath("//button[contains(@class,'violet')]")).click();
		
		//Wait for the text to say "HELLO!". Print the message that appears on the page.
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));	
		System.out.println("The 1st text is: " + driver.findElement(By.id("ajax-content")).getText());
				
		//Wait for the text to change to contain "I'm late!". Print the new message on the page.
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));	
		System.out.println("The 2nd text is: " + driver.findElement(By.id("ajax-content")).getText());
		

		
		driver.close();

	}

}