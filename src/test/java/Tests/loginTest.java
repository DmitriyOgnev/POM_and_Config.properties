package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.homePage;
import Pages.loginPage;
import Utilities.ConfigLoader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	WebDriver driver;
	ConfigLoader configLoader;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		configLoader = new ConfigLoader();

		String URL = configLoader.getMyValue("URL");
		driver.get(URL);

	}

	@Test
	public void loginTest() throws InterruptedException {

		homePage hmPage = new homePage(driver);
		Thread.sleep(1000);
		hmPage.signinButton.click();

		loginPage lgnPage = new loginPage(driver);

		String user = configLoader.getMyValue("User");
		String pass = configLoader.getMyValue("Password");

		lgnPage.login(user, pass);

	}

}
