package com.hrms.testcases;

import org.testng.annotations.Test;
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

//		employee directory get current 
		employeesdirectoryactions.employeeDirectoryGetCurrentUrl();

//   random name generating		
		employeesdirectoryactions.randomNameGeneration();
	}

//      manually employee create

	@Test(priority = 1, dependsOnMethods = "employeeDirectoryPageVisible")
	public void employeeDirectorycreateEmployeeManually() {

//		refresh page
		employeesdirectoryactions.employeeDirectoryRefreshpage();

//		emp create
		employeesdirectoryactions.createEmployeeManually();

//		manually form filled
		employeesdirectoryactions.formOfmanuallyEmployeeCreate();

//		save 
		employeesdirectoryactions.EmployeeDirectoryCreateSaveBtnMutipleClick();

//		check empl directory page display
		employeesdirectoryactions.checkEmpDirectoryPageShouldNotDisplay();

//		url match
		employeesdirectoryactions.employeeDirectoryGetCurrentUrl();

	}

//	employee profile compare

	@Test(priority = 2, dependsOnMethods = "employeeDirectorycreateEmployeeManually")
	public void employeeDirectoryProfileClick() {
//   		refresh page
		employeesdirectoryactions.employeeDirectoryRefreshpage();

//   		search employee
		employeesdirectoryactions.employeeDirectorySearchBoxText();

//         profile click		
		employeesdirectoryactions.employeeDirectoryProfileClick();

//   		employees directory get text
		employeesdirectoryactions.EmployeeDirectoryGetText();
	}

//   	search employee by employee name

	@Test(priority = 3)
	public void employeeDirectorySearchBox() {

		employeesdirectoryactions.employeeDirectoryRefreshpage();

		employeesdirectoryactions.employeeDirectorySearchBoxText();

		employeesdirectoryactions.employeeDirectoryEmployeeList();
	}

//      first section mandatory filed is fill

	@Test(priority = 4, dependsOnMethods = "employeeDirectorySearchBox")
	public void employeeDirectoryFirstSectionMandatoryFieldIsNotFillThanThrowError() {

//		refresh page
		employeesdirectoryactions.employeeDirectoryRefreshpage();

//		not filled first sections
		employeesdirectoryactions.employeeDirectoryEmployeeNotFillFirstSectionMandatoryFieldThanItShouldGetError();

//		check empl directory page display
		employeesdirectoryactions.checkEmpDirectoryPageShouldNotDisplay();

//		employee directory get current 
		employeesdirectoryactions.employeeDirectoryGetCurrentUrl();

//		check empl directory page display
		employeesdirectoryactions.checkEmpDirectoryPageShouldNotDisplay();

	}

//  employee create without joining date 

	@Test(priority = 5)
	public void employeeDirectoryNotFilledMandatoryFieldOfJoiningDateThanThrowError() {

		employeesdirectoryactions.employeeDirectoryRefreshpage();

		employeesdirectoryactions.createEmployeeManually();

		employeesdirectoryactions.employeeDirectoryEmployeeNotFillMandatoryFieldOfJoiningDateThanItShouldGetError();

//		check empl directory page display
		employeesdirectoryactions.checkEmpDirectoryPageShouldNotDisplay();

	}

//	employeeDirectory page navigate

	@Test(priority = 6)
	public void employeeDiectoyPageNavigateArrowBthClick() {

		employeesdirectoryactions.employeeDirectoryRefreshpage();

		employeesdirectoryactions.employeeDiectoyarrowBthClick();
	}

	@Test(priority = 7)
	public void employeeDirectoryEmpCodeDuplicateNotCreate() {

		employeesdirectoryactions.employeeDirectoryRefreshpage();

		employeesdirectoryactions.createEmployeeManually();

//		manually form filled
		employeesdirectoryactions.formOfmanuallyEmployeeCreate();

//		single click save button
		employeesdirectoryactions.EmployeeDirectoryCreateSaveBtnSingleClick();

		employeesdirectoryactions.employeeCodeAlreadyExist();

//		check empl directory page display
		employeesdirectoryactions.checkEmpDirectoryPageShouldNotDisplay();

	}

	@Test(priority = 8)
	public void bulkCreationEmployeeDirectoryWriteDataExcelFiles() {

		employeesdirectoryactions.employeeDirectoryRefreshpage();

		employeesdirectoryactions.excelFileWrite();
	}

	@Test(priority = 9)
	public void bulkCreationEmployeeDirectoryFileUpload() {

		employeesdirectoryactions.employeeDirectoryRefreshpage();

		employeesdirectoryactions.fileUploadBulkCreation();
	}

	@Test(priority = 10)
	public void findEmpCodeShouldNotDuplicateList() {
		employeesdirectoryactions.empCodeFindAnyDuplicate();
	}
}
