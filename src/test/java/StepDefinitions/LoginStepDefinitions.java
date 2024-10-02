package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

	static WebDriver driver;

	@Given("user enters the url")
	public void user_enters_the_url() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://www.odoo.com/app/crm");
	}

	@When("user enters the valid {string} and {string}")
	public void user_enters_the_valid_username_and_password(String username,String password) {
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(password);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).click().build().perform();
		

	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		// Write code here that turns the phrase above into concrete actions
		System.out.println("After login");
	}

	@Then("user is navigated to the homePage")
	public void user_is_navigated_to_the_home_page() {

		// Write code here that turns the phrase above into concrete actions
		System.out.println("user logged in");
	}

	@And("user closes the browser")
	public void user_closes_the_browser() {
		String title = driver.getTitle();
		System.out.println(title);
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

}
