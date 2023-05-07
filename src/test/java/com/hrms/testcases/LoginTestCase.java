package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.actions.LoginAction;
import com.util.BrowserLaunch;

public class LoginTestCase extends BrowserLaunch {

	private LoginAction loginAction;

	@Test
	public void adminSideLogin() {
		loginAction = new LoginAction(driver);
		loginAction.enterLoginCredential();
	}
}
