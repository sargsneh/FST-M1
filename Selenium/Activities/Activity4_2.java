package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Use findElement() with xpath() to find all the input fields on the page.
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"number\"]"));
		
		//Fill in the details in the fields using the sendKeys() method.
		firstName.sendKeys("Sneha");
		lastName.sendKeys("S");
		email.sendKeys("test@att.com");
		contact.sendKeys("9988770066");
		
		//Click the submit button at the end of the form to submit the form
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();
		
	
	}

}
