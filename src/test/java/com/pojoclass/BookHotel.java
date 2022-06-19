package com.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotel extends BaseClass {

	
	@FindBy(id = "first_name")
	private WebElement frstName;
	
	@FindBy(id = "last_name")
	private WebElement lstName;
	
	@FindBy(id = "address")
	private WebElement adrs;
	
	@FindBy(id = "cc_num")
	private WebElement creditCard;
	
	@FindBy(id = "cc_type")
	private WebElement ccType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cardCVV;
	
	@FindBy(id = "book_now")
	private WebElement bkNow;

	public WebElement getFrstName() {
		return frstName;
	}

	public WebElement getLstName() {
		return lstName;
	}

	public WebElement getAdrs() {
		return adrs;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCardCVV() {
		return cardCVV;
	}

	public WebElement getBkNow() {
		return bkNow;
	}
	
	
	public void bookHotel(String Firstname, String Lastname, String Address, String CcNo, 
			String CcType, String ExpMonth, String ExpYear, String CVV) {
		
		type(getFrstName(), Firstname);
		type(getLstName(), Lastname);
		type(getAdrs(), Address);
		type(getCreditCard(), CcNo);
		selectOptionText(getCcType(), CcType);
		selectOptionText(getExpMonth(), ExpMonth);
		selectOptionText(getExpYear(), ExpYear);
		type(getCardCVV(), CVV);
		click(getBkNow());	
		
	}
	
	
	
	
	

}
