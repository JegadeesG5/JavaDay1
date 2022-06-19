package com.pojoclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmation extends BaseClass{
	@FindBy(id ="order_no")
	private WebElement orderId;
	
	@FindBy(xpath = "//a[text()= 'Booked Itinerary']")
	private WebElement bookItinary;

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getBookItinary() {
		return bookItinary;
	}
	
	public void bookingconfimation (String sheetname, int rowno, int cellno) throws IOException, InterruptedException{
		
		Thread.sleep(4000);
		
		String orderid = getAttributevalue(getOrderId());
		System.out.println(orderid);
		
		
	}

}
