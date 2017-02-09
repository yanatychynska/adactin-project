/**
 * File Name: SearchHotel.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 1, 2017
 */
package com.sqa.yt.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

/**
 * SearchHotel //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class SearchHotel {
	// location hotels room_type room_nos datepick_in datepick_out adult_room
	// child_room Submit Reset

	@FindBy(id = "location")
	private WebElement locationField;

	@FindBy(id = "hotels")
	private WebElement hotelsField;

	@FindBy(id = "room_type")
	private WebElement roomTypeField;

	@FindBy(id = "room_nos")
	private WebElement numberOfRoomsField;

	@FindBy(id = "datepick_in")
	private WebElement checkInDateField;

	@FindBy(id = "adult_room")
	private WebElement adultsPerRoomField;

	@FindBy(id = "child_room")
	private WebElement childrenPerRoomField;

	@FindBy(id = "Submit")
	private WebElement submitButton;

	@FindBy(id = "Reset")
	private WebElement resetButton;

	private WebDriver driver;

	public SearchHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void chooseHotel(String hotelName) throws InterruptedException {
		Select hotelsSelect = new Select(this.hotelsField);
		hotelsSelect.selectByVisibleText(hotelName);
		Thread.sleep(5000);
	}
}
