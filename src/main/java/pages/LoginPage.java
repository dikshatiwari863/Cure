package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(className = "go-btn")

	WebElement goButton;

	@FindBy(xpath = "//a[.='SIGN IN']")

	WebElement signInLink;
	
	@FindBy(id="txtEmailAddress_MultiLogin")

	WebElement userNameBox;
	
	@FindBy(id="txtPassword_MultiLogin")

	WebElement passwordBox;
	
	@FindBy(xpath = "//a[.='Login']")

	WebElement loginButton;
	

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
	
	//enter user name
	
	public void enterUserName() {
		userNameBox.sendKeys("kalijewicz@cure.com");
	}
	
	//enter password
	public void enterPassword() {
		passwordBox.sendKeys("Test123");
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	
}
