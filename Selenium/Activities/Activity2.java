package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net");
		
		//Get the title of the page using driver.getTitle() and print out the title
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is: " + pageTitle);
		
		//Find About us using id and print it
		WebElement id = driver.findElement(By.id("about-link"));
		System.out.println("The element found using by id is:" + id);
		
		//Find About us using classname and print it
		WebElement className1 = driver.findElement(By.className("green"));
		System.out.println("The element found using by className is:" + className1);
		
		//Find About us using link text and print it
		WebElement link = driver.findElement(By.linkText("About Us"));
		System.out.println("The element found using by link text is:" + link);
		
		//Find About us using css selector and print it
		WebElement css = driver.findElement(By.cssSelector(".green"));
		System.out.println("The element found using by css selector is:" + css);
		
		driver.close();
	}

}