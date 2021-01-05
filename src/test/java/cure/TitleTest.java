package cure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.MainPage;

public class TitleTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://www.cure.com/";
		String expectedTitle = "CURE | Auto Insurance for New Jersey and Pennsylvania Drivers";
		String actualTitle = "";

		MainPage mainPage = new MainPage(driver);

		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = mainPage.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			// click on go button
			mainPage.clickGoButton();
			if (mainPage.isFormDisplayed()) {

				System.out.println("Test Passed! Get Quote Form is getting displayed");
			}
		} else {
			System.out.println("Test Failed");
		}

		driver.close();

	}
}
