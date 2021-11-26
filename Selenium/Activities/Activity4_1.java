package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//Use findElement() with xpath() to find and click the "About Us" link on the page.
		driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
		
		//Print the title of the new page that open when the link is clicked.
		System.out.println("The title of the new opened page is: " + driver.getTitle());
		
		driver.close();

	}

}