package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {
	WebDriver driver;
	
	@Given("the user is in the index page")
	public void theUserIsInIndexPage() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	@When("the user enter dresses in the search bar")
	public void theUserEnterDressesInBarSearch() {
		driver.findElement(By.id("search_query_top")).sendKeys("dresses");
		
	}
	
	@When("the user clicks the search button")
	public void theUserClicksTheSearchButton() {
		driver.findElement(By.name("submit_search")).click();
	}
	
	@Then("the dresses page appears")
	public void dressesPage() {
		Assert.assertEquals(driver.findElement(By.className("lighter")).getText(), "\"DRESSES\"");
		System.out.println("OK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		driver.close();
	}
}


















