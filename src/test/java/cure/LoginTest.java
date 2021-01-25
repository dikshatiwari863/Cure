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
		String expectedErrorMsg = "Invalid email address or password. Are you just trying to make a payment? CLICK HERE";

		MainPage mainPage = new MainPage(driver);

		driver.get(baseUrl);

		try {

			if (mainPage.getTitle().contentEquals(expectedTitle)) {

				System.out.println("Login Page is dispalyed");

				// click on go button
				mainPage.clickGoButton();
				if (mainPage.isFormDisplayed()) {

					System.out.println("Test Passed! Get Quote Form is getting displayed");

					// click on sign in
					mainPage.clickSignIn();
					// Checking valid login
					// enter username
					mainPage.enterUserName("kalijewicz@cure.com");
					// enter password
					mainPage.enterPassword("Test123");
					// click on login
					mainPage.clickLoginButton();

					if (mainPage.getTitle().contentEquals(expectedLoginPageTitle)) {

						System.out.println("Test passed! User is able to login");
						mainPage.clickLogoutButton();
					}

				} else {
					System.out.println("Test Failed");
				}
			}
			// click on sign in
			mainPage.clickSignIn();
			// checking invalid login
			// enter username
			mainPage.enterUserName("invalidemail@cure.com");
			// enter password
			mainPage.enterPassword("invalid@123");
			// click on login
			mainPage.clickLoginButton();

			if (expectedErrorMsg.equalsIgnoreCase(mainPage.getText())) {

				System.out.println(
						"User has entered Invalid Credentials and getting error message as " + mainPage.getText());

			} else {
				System.out.println("Error message is not displayed");
			}
			driver.close();

		} catch (

		Exception e) {
			System.out.println("Test Failed=" + e.getMessage());

		}

	}

}
