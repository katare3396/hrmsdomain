package com.hrms.actions;

import org.openqa.selenium.WebDriver;

import com.hrms.pageobject.LoginPageObject;

public class LoginAction {

	private LoginPageObject loginpageobject;

	public LoginAction(WebDriver driver) {
		this.loginpageobject = new LoginPageObject(driver);
	}

	public void enterLoginCredential() {

		loginpageobject.loginEmailTxtField();
		loginpageobject.loginPasswordTxtField();
		loginpageobject.loginBtnClick();
		loginpageobject.loginAssertLoginSucessfully();
	}
}
