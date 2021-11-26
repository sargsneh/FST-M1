package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Print the Heading of the 1st iframe.
		driver.switchTo().frame(0);
        WebElement iframeHeading1 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(iframeHeading1.getText());
		
		//Print the Button Text and color of the button in that frame.
        WebElement button1 = driver.findElement(By.cssSelector("button"));
        System.out.println("Text of the button is: " + button1.getText());
        System.out.println("Colour of the button is: " + button1.getCssValue("background-color"));
		
		//Click th button in that frame.
        button1.click();
		
		//Print the new Button Text and color of the button.
        System.out.println("Text of the new button is: " + button1.getText());
        System.out.println("Colour of the new button is: " +  button1.getCssValue("background-color"));
		
		//Repeat Steps 3-6 with the 2nd iframe.
        driver.switchTo().frame(1);
        WebElement iframeHeading2 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(iframeHeading2.getText());
        WebElement button2 = driver.findElement(By.cssSelector("button"));
        System.out.println("Text of the button is: " + button2.getText());
        System.out.println("Colour of the button is: " + button2.getCssValue("background-color"));
        button2.click();
        System.out.println("Text of the new button is: " + button2.getText());
        System.out.println("Colour of the new button is: " +  button2.getCssValue("background-color"));
		
		
		driver.close();

	}

}
