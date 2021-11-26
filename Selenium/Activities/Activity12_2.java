package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Traverse into the iframe that is on the page.
		driver.switchTo().frame(0);
		
		//Traverse into the first iframe in that frame.
		driver.switchTo().frame(0);
		
		//Print the heading of that frame.
        WebElement frameHeading1 = driver.findElement(By.cssSelector("div.content"));
        System.out.println("Heading of 1st iframe is :" + frameHeading1.getText());
		
		//Navigate to the second iframe in that frame.
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        WebElement frameHeading2 = driver.findElement(By.cssSelector("div.content"));
    	
      //Print the heading of that frame.
        System.out.println("Heading of 2nd iframe is :" + frameHeading2.getText());
		
        driver.close();
		

	}

}
