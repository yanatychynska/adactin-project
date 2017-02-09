package com.sqa.yt;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.*;
import org.testng.annotations.*;

import com.sqa.yt.adactin.*;

public class AdactinTest {

	private static String user = "yanatychynska";

	private static String pass = "yana2525";

	private static String baseUrl = "http://adactin.com/HotelAppBuild2/";

	private static WebDriver driver;

	@BeforeMethod
	public void setup() {
		// creating WebDrier object reference variable and set its value to a
		// new Firefox instance to drive the test
		driver = new FirefoxDriver();
		// Move the driver to the base URL
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() {
		// Quit current instance of driver, for only current window
		driver.quit();
	}

	@Test
	public void testLogIn() throws InterruptedException {
		System.out.println("Test");
		String expected = "AdactIn.com - Search Hotel";
		// Put the current thread to sleep
		Thread.sleep(5000);
		// Create a page object instance for login page
		AdactinLogin loginPage = new AdactinLogin(driver);
		// call the method to login
		loginPage.login(user, pass);
		// Assert that you have laded on the right page
		Assert.assertEquals(driver.getTitle(), expected,
				"Did not arrive on correct page.");
	}

	@Test
	private void loginToAdactin() throws InterruptedException {
		new AdactinLogin(driver).login(user, pass).chooseHotel("Hotel Creek");
		// // Create WebElement variable type and set value to finding element
		// by
		// // id strategy
		// WebElement loginField = driver.findElement(By.id("username"));
		// WebElement passwordField = driver.findElement(By.id("password"));
		// WebElement loginButton = driver.findElement(By.id("login"));
		// // clear login field of text
		// loginField.clear();
		// loginField.sendKeys(user);
		// // Clear login field of text
		// passwordField.clear();
		// passwordField.sendKeys(pass);
		// // click login button
		// loginButton.click();
		// // loginField.submit();
	}
}