package com.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "location")
	private WebElement scltLocation;
	   
	@FindBy(id = "hotels")
	private WebElement scltHotels;

	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(id = "room_nos")
	private WebElement roomNos;
	
	@FindBy(id = "datepick_in")
	private WebElement dateCheckIn;
	
	@FindBy(id = "datepick_out")
	private WebElement dateCheckOut;
	
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	
	@FindBy(id = "child_room")
	private WebElement childrenRoom;
	
	@FindBy(id = "Submit")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//input[@id = 'username_show']")
	private WebElement verifyUserName;
	

	public WebElement getScltLocation() {
		return scltLocation;
	}

	public WebElement getVerifyUserName() {
		return verifyUserName;
	}

	public WebElement getScltHotels() {
		return scltHotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getDateCheckIn() {
		return dateCheckIn;
	}

	public WebElement getDateCheckOut() {
		return dateCheckOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildrenRoom() {
		return childrenRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
	
	public void searchHotel(String Location, String Hotel, String RoomType, String RoomNo, 
			String DateCheckIn, String DateCheckOut, String AdultRoom, String ChildRoom) {
		
		selectOptionText(getScltLocation(), Location);
		selectOptionText(getScltHotels(), Hotel);
		selectOptionText(getRoomType(), RoomType);
		selectOptionText(getRoomNos(), RoomNo);
		selectOptionText(getDateCheckIn(), DateCheckIn);
		
		selectOptionText(getDateCheckOut(), DateCheckOut);
		selectOptionText(getAdultRoom(), AdultRoom);
		selectOptionText(getChildrenRoom(), ChildRoom);
		click(btnSubmit);
		
		

	}


}
