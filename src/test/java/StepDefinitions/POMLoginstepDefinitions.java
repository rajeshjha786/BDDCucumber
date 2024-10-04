package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LoginPage;

public class POMLoginstepDefinitions {

	static WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;

	@Given("user enters the url")
	public void user_enters_the_url() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/v1/");
	}

	@When("user enters the valid {string} and {string}")
	public void user_enters_the_valid_username_and_password(String username, String password) {

		loginPage = new LoginPage(driver);
		loginPage.enterusername(username);
		loginPage.enterpassword(password);

	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clicklogin();
	}

	@Then("user is navigated to the homePage")
	public void user_is_navigated_to_the_home_page() {

		homePage = new HomePage(driver);
		homePage.applogoPresent();
	}

	@And("user closes the browser")
	public void user_closes_the_browser() {
		String title = driver.getTitle();
		System.out.println(title);
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
}
