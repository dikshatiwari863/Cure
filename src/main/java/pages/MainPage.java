package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends LoginPage {

	@FindBy(className = "quote-form")

	WebElement getQuoteFormBox;

	public MainPage(WebDriver driver) {
		super(driver);
	}

	// check if the form is displayed

	public boolean isFormDisplayed() {

		return getQuoteFormBox.isDisplayed();
	}



}
