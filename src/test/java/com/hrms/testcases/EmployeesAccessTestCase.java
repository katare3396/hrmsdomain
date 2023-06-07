package com.hrms.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.actions.EmployeesAccessControlAction;
import com.hrms.actions.LoginAction;
import com.util.BrowserLaunch;

public class EmployeesAccessTestCase  extends BrowserLaunch{

	public EmployeesAccessControlAction employeesAccessControlAction;

@Test(priority = 0)
public void rolePermiPageVisibilty() {
	employeesAccessControlAction = new EmployeesAccessControlAction(driver);

//	login credential
	new LoginAction(driver).enterLoginCredential();

//click on roles and permission page	
	employeesAccessControlAction.empRolespermission();

//	page visible 
	employeesAccessControlAction.emprolesPermissionPageVisibilty();
	
}

//@Test(priority = 1)
//public void rolePermisPageNavigate() {
//
//	employeesAccessControlAction.empRolesPermissionPageNavigate();
//}
@Test(priority = 1, dependsOnMethods = "rolePermiPageVisibilty")
public void rolePermisAllRoleAssignedToSingleEmployee() {

	employeesAccessControlAction.empRolesPermissionCheckboxCheck();
	
	
	
	
	
}

//@Test(priority = 2,dependsOnMethods = "rolePermisAllRoleAssignedToSingleEmployee")
//public void rolePermisAllRolesRemoveToSingleEmployee() {
//	employeesAccessControlAction.empRolesPermissionCheckboxUncheck();
//	
//}




}
