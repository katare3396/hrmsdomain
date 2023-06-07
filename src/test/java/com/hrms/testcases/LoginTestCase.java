package com.hrms.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.actions.LoginAction;
import com.util.BrowserLaunch;

public class LoginTestCase extends BrowserLaunch {

	private LoginAction loginAction;

	@Test(priority = 0)
	public void VisibityLoginPage() {
		loginAction = new LoginAction(driver);
		loginAction.loginPageVisibity();
	}

	@Test(priority = 1, dependsOnMethods = "VisibityLoginPage")
	public void adminSideLogin() {
		loginAction = new LoginAction(driver);
		loginAction.enterLoginCredential();
	}

}
