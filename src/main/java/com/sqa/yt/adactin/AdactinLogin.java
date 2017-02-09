/**
 * File Name: AdactinLogin.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 1, 2017
 */
package com.sqa.yt.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/**
 * AdactinLogin //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class AdactinLogin {

	private WebDriver driver;

	@FindBy(id = "username")
	private WebElement usernameField;

	@FindBy(id = "login")
	private WebElement loginButton;

	@FindBy(how = How.ID, using = "password")
	private WebElement passwordField;

	public AdactinLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SearchHotel login(String username, String password) {
		// Create login field of text
		this.usernameField.clear();
		this.usernameField.sendKeys();
		// Clear password field of texy
		this.passwordField.clear();
		this.passwordField.sendKeys();
		this.loginButton.click();
		return new SearchHotel(this.driver);
		// // Create WebElement variable type and set value to finding element
		// by
		// // id strategy
		// WebElement loginField = this.driver.findElement(By.id("username"));
		// WebElement passwordField =
		// this.driver.findElement(By.id("password"));
		// WebElement loginButton = this.driver.findElement(By.id("login"));
		// // clear login field of text
		// loginField.clear();
		// loginField.sendKeys(username);
		// // Clear login field of text
		// passwordField.clear();
		// passwordField.sendKeys(password);
		// // click login button
		// loginButton.click();
		// // loginField.submit();
	}
}
