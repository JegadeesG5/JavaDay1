package com.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel extends BaseClass {
	@FindBy(id = "radiobutton_0")
	private WebElement radioBtn;
	
	@FindBy(id = "continue")
	private WebElement cont;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getCont() {
		return cont;
	}
	
	public void selectHotel() {
		
	  click(getRadioBtn());
		click(getCont());
	}

}
