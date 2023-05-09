package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.actions.EmployeesDirectoryActions;
import com.hrms.actions.LoginAction;
import com.util.BrowserLaunch;

public class EmployeesDirectoryTestCase extends BrowserLaunch{

	private EmployeesDirectoryActions employeesdirectoryactions;
	
	public EmployeesDirectoryTestCase() {
		employeesdirectoryactions = new EmployeesDirectoryActions(driver);

	}
	
	@Test(priority=0)
	public void login() {
		new LoginAction(driver).enterLoginCredential();
		employeesdirectoryactions.employeeDirectoryGetCurrentUrl();

		employeesdirectoryactions.employeeDirectoryPageVisible();
	}
	
//	@Test(priority=1)
//	public void employeeDirectoryPageVisible() {
//		employeesdirectoryactions.employeeDirectoryPageVisible();
//	}
//	
//	@Test(priority=2)
//	public void createEmployeeManually() {
//		employeesdirectoryactions.employeeDirectoryGetCurrentUrl();
//	}
}
