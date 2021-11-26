package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver Driver;
	WebDriverWait wait;
	
	@Given("^User is on Google Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		Driver = new FirefoxDriver();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get("http://www.google.com");
	}

	@When("^User types in Cheese and hits ENTER$")
	public void search_cheese() throws Throwable {
		Driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
	}

	@Then("^Show how many search results were shown$")
	public void search_results() throws Throwable {
		wait = new WebDriverWait(Driver, 30);
		String resultStats = Driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of results found: " + resultStats);
	}
	
	@And("^Close the browser$")
	public void close_browser() throws Throwable {
		Driver.close();
	}

}
