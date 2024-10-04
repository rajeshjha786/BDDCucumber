package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(id = "user-name")
	WebElement user;
	@FindBy(id = "password")
	WebElement pass;

	@FindBy(id = "login-button")
	WebElement loginButtonElement;

	public void enterusername(String username) {
		user.sendKeys(username);
	}

	public void enterpassword(String password) {
		pass.sendKeys(password);
	}

	public void clicklogin() {
		loginButtonElement.click();
	}

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
