package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.actions.EmployeesDirectoryActions;
import com.hrms.actions.LoginAction;
import com.util.BrowserLaunch;

public class EmployeesDirectoryTestCase extends BrowserLaunch {

	private EmployeesDirectoryActions employeesdirectoryactions;

	

//	    page visiblity

	@Test(priority = 0)
	public void employeeDirectoryPageVisible() {
		employeesdirectoryactions = EmployeesDirectoryActions.getInstance(driver);

//		login credential
		new LoginAction(driver).enterLoginCredential();

//		employee directory click
		employeesdirectoryactions.employeesDirectoryClick();

//		employee directory page visible
		employeesdirectoryactions.employeeDirectoryPageVisible();

//		employee directory get current rl
		employeesdirectoryactions.employeeDirectoryGetCurrentUrl();
	}

//      manually employee create

//	@Test(priority = 1, dependsOnMethods = "employeeDirectoryPageVisible")
//	public void employeeDirectorycreateEmployeeManually() {
//
////		refresh page
//		employeesdirectoryactions.employeeDirectoryRefreshpage();
//
////		emp create
//		employeesdirectoryactions.createEmployeeManually();
//
////		manually form filled
//		employeesdirectoryactions.formOfmanuallyEmployeeCreate();
//
////		url match
//		employeesdirectoryactions.employeeDirectoryGetCurrentUrl();
//
//	}
//
//	@Test(priority = 2, dependsOnMethods = "employeeDirectorycreateEmployeeManually")
//	public void employeeDirectoryProfileClick() {
////   		refresh page
//		employeesdirectoryactions.employeeDirectoryRefreshpage();
//
////   		search emplo
//		employeesdirectoryactions.employeeDirectorySearchBoxText();
//
////         profile click		
//		employeesdirectoryactions.employeeDirectoryProfileClick();
//
////   		employees directory get text
//		employeesdirectoryactions.EmployeeDirectoryGetText();
//	}

//     	search employeee by employeename

//	@Test(priority = 1, dependsOnMethods = "employeeDirectoryPageVisible")
//	public void employeeDirectorySearchBox() {
//
//		employeesdirectoryactions.employeeDirectoryRefreshpage();
//
//		employeesdirectoryactions.employeeDirectorySearchBoxText();
//		
//		employeesdirectoryactions.employeeDirectoryEmployeeList();
//	}

//       first section mandatory filed is fill

//	@Test(priority = 4, dependsOnMethods = "employeeDirectoryPageVisible")
//	public void employeeDirectoryFirstSectionMandatoryFieldIsNotFillThanThrowError() {
//
////		refresh page
//		employeesdirectoryactions.employeeDirectoryRefreshpage();
//
////		not filled first sections
//		employeesdirectoryactions.employeeDirectoryEmployeeNotFillFirstSectionMandatoryFieldThanItShouldGetError();
//	}

//	 employee create without joining date 

//	@Test(priority = 5, dependsOnMethods = "employeeDirectoryFirstSectionMandatoryFieldIsNotFillThanThrowError")
//	public void employeeDirctoryNotFilledMandatoryFieldOfJoiningDateIsNotFillThanThrowError() {
//
//		employeesdirectoryactions.employeeDirectoryRefreshpage();
//
//		employeesdirectoryactions.createEmployeeManually();
//
//		employeesdirectoryactions.employeeDirectoryEmployeeNotFillMandatoryFieldOfJoiningDateThanItShouldGetError();
//
//		employeesdirectoryactions.sucessMessageCreateEmployee();
//	}

//	employeeDirectory page navigate
	@Test(priority=1)
	public void employeeDiectoyarrowBthClick() {
		employeesdirectoryactions.employeeDiectoyarrowBthClick();
	}
	
}
