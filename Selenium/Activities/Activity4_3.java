package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/target-practice");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Find the third header on the page
		String thirdHeader = driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
		System.out.println("The third header in the page is: " + thirdHeader);
		
		//Find the fifth header on the page and get it's 'colour' CSS Property
		String fifthHeader = driver.findElement(By.xpath("//h5")).getCssValue("color");
		System.out.println("The colour of fifth header in the page is: " + fifthHeader);
		
		//Find the violet button on the page and print all the class attribute values
		String violetbutton = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
		System.out.println("The class attribute values of violet button: " + violetbutton);
		
		//Find the grey button on the page with Absolute XPath
		String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("The name of the grey button is: " + greyButton);
		
		driver.close();

	}

}