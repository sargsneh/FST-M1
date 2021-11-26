package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//fill the sign up form 
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password");
		driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("password");
		driver.findElement(By.xpath("//input[starts-with(@class, 'email')]")).sendKeys("email@email.com");
		
		//click on Sign up button
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		
		//sign up success message
		String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        
        driver.close();

	}

}