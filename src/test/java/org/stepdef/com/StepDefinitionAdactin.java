package org.stepdef.com;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pojoclass.BaseClass;
import com.pojoclass.Login;
import com.pojoclass.SearchHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;




public class StepDefinitionAdactin extends BaseClass {
	
	@Given("User Should be a Adactin Homepage with help of browser")
	public void user_should_be_a_adactin_homepage_with_help_of_browser() {
		
		getDriver();
		getUrl("http://adactinhotelapp.com/index.php");
		
	   
	}
	@Given("User should be a login the Adactin Hotel  {string}  {string}")
	public void user_should_be_a_login_the_adactin_hotel(String userName, String password) {
		
	Login log  = new Login();
	log.loginPage(userName, password);
	
		
	    
	}
	@Then("User should be verifying the username {string}")
	public void user_should_be_verifying_the_username(String expValue) {
		
		SearchHotel searchHtl = new SearchHotel();
		
		WebElement verifyUserName = searchHtl.getVerifyUserName();
		
		String attribute = verifyUserName.getAttribute("value");
		
		Assert.assertEquals("Name should be same", expValue, attribute);
		
		
		System.out.println(attribute);
		
		
		
		
		
	   
	}


}
