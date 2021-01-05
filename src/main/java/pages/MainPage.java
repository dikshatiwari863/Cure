package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	WebDriver driver;

	@FindBy(className = "go-btn")

	WebElement goButton;

	@FindBy(className = "quote-form")

	WebElement getQuoteFormBox;

	public MainPage(WebDriver driver) {

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

	// check if the form is displayed

	public boolean isFormDisplayed() {

		return getQuoteFormBox.isDisplayed();
	}

}
