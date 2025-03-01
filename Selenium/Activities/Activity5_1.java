package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Use findElement() to find the checkbox input element
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		//Use the isDisplayed() method to check if it is visible on the page.
		System.out.println("The checkbox Input is displayed: " + checkBox.isDisplayed());

		//Click the "Remove Checkbox"
		driver.findElement(By.id("toggleCheckbox")).click();
		
		//Print the result of the isDisplayed() method again
		System.out.println("The checkbox Input is displayed: " + checkBox.isDisplayed());
		
		driver.close();
	}

}