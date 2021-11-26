package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//find username field and enter username as admin
		driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
		
		//find password field and enter the word password
		driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");
		
		//click on login button
		driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
		
		//Wait for login message to appear and print the login message to the console
		String loginmsg = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println(loginmsg);
		
		driver.close();

	}

}