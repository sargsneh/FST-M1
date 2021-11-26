package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
	WebDriver Driver;
	WebDriverWait wait;
	
	@Given("^User is on Login page$")
	public void user_is_on_login_Page() throws Throwable {
		Driver = new FirefoxDriver();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get(" https://www.training-support.net/selenium/login-form");
		
	}

	@When("^User enters username and password$")
	public void username_password() throws Throwable {
		Driver.findElement(By.id("username")).sendKeys("admin");
		Driver.findElement(By.id("password")).sendKeys("password");
		Driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
    @When("^User enters \"(.*)\" and \"(.*)\"$")	
    public void user_enters_and(String username, String password) throws Throwable {
    	//Enter username and password from Feature file of 2_4	
    	Driver.findElement(By.id("username")).sendKeys(username);
        Driver.findElement(By.id("password")).sendKeys(password);
        Driver.findElement(By.xpath("//button[@type='submit']")).click();
	
    }

	@Then("^Read the page title and confirmation message$")
	public void pagetitle_message() throws Throwable {
		String pageTitle = Driver.getTitle();
		String confirmMsg = Driver.findElement(By.id("action-confirmation")).getText();
		
		System.out.println("The title of the page is: " + pageTitle);
		System.out.println("The confirmation message is: " + confirmMsg);
		
        if(confirmMsg.contains("admin")) {
            Assert.assertEquals(confirmMsg, "Welcome Back, admin");	
        } else {	
            Assert.assertEquals(confirmMsg, "Invalid Credentials");	
        }
		
	}
	
	@And("^Close the Browser$")
	public void close_browser() throws Throwable {
		Driver.close();
	}
}
