package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.PizzaHutHomePage;

public class PizzaHutTest {
	private WebDriver driver;
	private PizzaHutHomePage homePage;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/yisha/chromedriver.exe");
		driver = new ChromeDriver();
		homePage = new PizzaHutHomePage(driver);
	}

	@Test
	public void testPizzaHutHomePage() {
		homePage.open();
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
