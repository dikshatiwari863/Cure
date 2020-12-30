package cure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://www.cure.com/";
		String expectedTitle = "CURE | Auto Insurance for New Jersey and Pennsylvania Drivers";
		String actualTitle = "";

		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();

	}
}
