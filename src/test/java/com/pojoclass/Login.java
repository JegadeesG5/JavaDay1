package com.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	public Login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement txtUserName ;
	
	@FindBy(id = "password")
	private WebElement txtUserPassword ;
	
	@FindBy(id = "login")
	private WebElement btnLogin ;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtUserPassword() {
		return txtUserPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
   public void loginPage(String username, String password) {
	   type(getTxtUserName(), username);
	   
	   type(getTxtUserPassword(), password);
	   
	   click(btnLogin);

   }
}
