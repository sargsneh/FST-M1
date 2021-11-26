package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is: " + pageTitle);
		
		//Use findElement() with name() to find the text fields - firstname and lastname.
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lasttName = driver.findElement(By.id("lastName"));
		
		//Use WebElement.sendKeys() to type in those text fields.
		firstName.sendKeys("Sneha");
		lasttName.sendKeys("S");
		
		//find and type into the email and contact number fields.
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ss048b@att.com");
		driver.findElement(By.id("number")).sendKeys("9911223344");
		
		Thread.sleep(1000);
		
		//Submit the form by clicking submit
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		
		driver.close();

	}

}