package cure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

public class LoginTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String baseUrl = "http://www.cure.com/";
		String expectedTitle = "CURE | Auto Insurance for New Jersey and Pennsylvania Drivers";
		String expectedLoginPageTitle = "CURE | Manage CURE Account";

		MainPage mainPage = new MainPage(driver);

		driver.get(baseUrl);

		if (mainPage.getTitle().contentEquals(expectedTitle)) {
			// click on go button
			mainPage.clickGoButton();

			if (mainPage.isFormDisplayed()) {

				System.out.println("Test Passed! Get Quote Form is getting displayed");
				// click on sign in
				mainPage.clickSignIn();
				// enter username
				mainPage.enterUserName();
				// enter password
				mainPage.enterPassword();
				// click on login
				mainPage.clickLoginButton();
				if (mainPage.getTitle().contentEquals(expectedLoginPageTitle)) {

					System.out.println("Test passed! User is able to login");
				}
			}
		} else {
			System.out.println("Test Failed");
		}

		driver.close();

	}

}
