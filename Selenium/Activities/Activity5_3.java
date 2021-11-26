package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Use findElement() to find the text field.
		WebElement textField = driver.findElement(By.id("input-text"));
		
		//Use the isEnabled() method to check if the text field is enabled.
		System.out.println("The Text field is enabled: " + textField.isEnabled());
		
		//Click the "Enable Input" button to enable the input field.
		driver.findElement(By.id("toggleInput")).click();
		
		//Use the isEnabled() method again and print the result
		System.out.println("The Text field is enabled: " + textField.isEnabled());
		
		driver.close();

	}

}