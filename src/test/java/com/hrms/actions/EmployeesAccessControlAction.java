package com.hrms.actions;

import org.openqa.selenium.WebDriver;

import com.hrms.pageobject.EmployeesAccessControlPageObject;

public class EmployeesAccessControlAction {

	public WebDriver driver;
	public EmployeesAccessControlPageObject employeesAccessControlPageObject;

	public EmployeesAccessControlAction(WebDriver driver) {
		this.driver = driver;
		this.employeesAccessControlPageObject = new EmployeesAccessControlPageObject(driver);

	}

	public void empRolespermission() {
		employeesAccessControlPageObject.employeesDirectoryClick();
		employeesAccessControlPageObject.empRolesPermissionBtnClick();
	}

	public void emprolesPermissionPageVisibilty() {
		employeesAccessControlPageObject.empRolesPermissionPageVisibilty();
	}

	public void empRolesPermissionPageNavigate() {
		employeesAccessControlPageObject.empRolesPermissionPageNavigate();
	}

	public void empRolesPermissionSearchBox() {
		employeesAccessControlPageObject.empRolesPermissionSearchBox();
	}

	public void empRolesPermissionCheckboxCheck() {
		employeesAccessControlPageObject.empRolesPermissionSearchBox();
		employeesAccessControlPageObject.empRolesPermissionCoreHrmsCheckBoxUnCheck();
		
//		employeesAccessControlPageObject.empRolesPermissionSearchBox();
//		employeesAccessControlPageObject.empRolesPermissionEmployeeCheckboxUnCheck();
		
		employeesAccessControlPageObject.empRolesPermissionSearchBox();
		employeesAccessControlPageObject.empRolesPermissionPayrollCheckBoxUnCheck();
		
		employeesAccessControlPageObject.empRolesPermissionSearchBox();
		employeesAccessControlPageObject.empRolesPermissionMobileAppCheckBoxUnCheck();
		
		employeesAccessControlPageObject.empRolesPermissionSearchBox();
		employeesAccessControlPageObject.empRolesPermissionNotAtsCheckBoxUnCheck();
	}
	
	public void empRolesPermissionCheckboxUncheck() {
		employeesAccessControlPageObject.empRolesPermissionSearchBox();
		employeesAccessControlPageObject.empRolesPermissionCoreHrmsSelectChk();
		
		employeesAccessControlPageObject.empRolesPermissionSearchBox();
		employeesAccessControlPageObject.empRolesPermissionPayrollSelectChk();
		
		employeesAccessControlPageObject.empRolesPermissionSearchBox();
		employeesAccessControlPageObject.empRolesPermissionMobileelectChk();
	}
	


}
