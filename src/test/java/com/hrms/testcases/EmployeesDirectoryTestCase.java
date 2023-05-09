package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.actions.EmployeesDirectoryActions;
import com.hrms.actions.LoginAction;
import com.util.BrowserLaunch;

public class EmployeesDirectoryTestCase extends BrowserLaunch {

	private EmployeesDirectoryActions employeesdirectoryactions;

	@Test(priority = 0)
	public void login() {
		employeesdirectoryactions = new EmployeesDirectoryActions(driver);
		new LoginAction(driver).enterLoginCredential();

	}

	@Test(priority = 1)
	public void employeeDirectoryPageVisible() {
		employeesdirectoryactions.employeeDirectoryPageVisible();
	}

	@Test(priority = 2)
	public void createEmployeeManually() {
		employeesdirectoryactions.employeeDirectoryGetCurrentUrl();
	}
}
