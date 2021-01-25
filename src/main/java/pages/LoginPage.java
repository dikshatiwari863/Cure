package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id="ctl00_MainContent_A1")

	WebElement goButton;

	@FindBy(xpath = "//a[.='SIGN IN']")

	WebElement signInLink;

	@FindBy(id = "txtEmailAddress_MultiLogin")

	WebElement userNameBox;

	@FindBy(id = "txtPassword_MultiLogin")

	WebElement passwordBox;

	@FindBy(xpath = "//a[.='Login']")

	WebElement loginButton;

	@FindBy(xpath = "//button[.='Logout']")

	WebElement logoutButton;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// get the title of the page

	public String getTitle() {

		return driver.getTitle();
	}

	// click on go button

	public void clickGoButton() {
		goButton.click();
	}

	// click on sign in

	public void clickSignIn() {
		signInLink.click();
	}

	// enter user name

	public void enterUserName(String userName) {
	
		userNameBox.sendKeys(userName);
	}

	// enter password
	public void enterPassword(String password) {
		
		passwordBox.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public void clickLogoutButton() {
		logoutButton.click();
	}

}
