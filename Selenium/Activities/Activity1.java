package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
//Create a Class with a main() method
	public static void main(String[] args) {
		//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver = new FirefoxDriver();
		
		//Open a browser with https://www.training-support.net
		driver.get("https://www.training-support.net");
		//Just for info to show page opened
		System.out.println("Webpage opened successfully");
		
		//Close the browser with driver.close()
		driver.close();
		System.out.println("Firefix was closed.");
		
	}

}