package com.hrms.actions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.hrms.pageobject.LoginPageObject;
import com.util.PropertiesLoader;

public class LoginAction {

	private LoginPageObject loginpageobject;

	public LoginAction(WebDriver driver) {
		this.loginpageobject = new LoginPageObject(driver);
	}

	private final String FILE_NAME = System.getProperty("user.dir") + "/src/main/resources/testdata.properties";
	private Properties prop = new PropertiesLoader(FILE_NAME).load();

	public void enterLoginCredential() {
		loginpageobject.loginCredential(prop.getProperty("LoginEmail"), prop.getProperty("LoginPassword"));
		loginpageobject.loginBtnClick();
		loginpageobject.getCurrentUrlAdminSide();
	}

	public void loginPageVisibity() {
		loginpageobject.visibiltyLoginPage();
	}
}
