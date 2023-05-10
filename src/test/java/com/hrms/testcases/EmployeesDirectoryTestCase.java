package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.actions.EmployeesDirectoryActions;
import com.hrms.actions.LoginAction;
import com.util.BrowserLaunch;

public class EmployeesDirectoryTestCase extends BrowserLaunch {

	private EmployeesDirectoryActions employeesdirectoryactions;

	@Test(priority = 0)
	public void employeeDirectoryPageVisible() {
		employeesdirectoryactions = new EmployeesDirectoryActions(driver);
		new LoginAction(driver).enterLoginCredential();
		employeesdirectoryactions.employeesDirectoryClick();
		employeesdirectoryactions.employeeDirectoryPageVisible();	
		employeesdirectoryactions.employeeDirectoryGetCurrentUrl();
		employeesdirectoryactions.createEmployeeManually();
		employeesdirectoryactions.formOfmanuallyEmployeeCreate();
	}



//	@Test(priority = 1,dependsOnMethods = "employeeDirectoryPageVisible")
//	public void createEmployeeManually() {
//		new LoginAction(driver).enterLoginCredential();
//		employeesdirectoryactions.employeesDirectoryClick();
//		employeesdirectoryactions.createEmployeeManually();
//		employeesdirectoryactions.formOfmanuallyEmployeeCreate();
//	}
}
