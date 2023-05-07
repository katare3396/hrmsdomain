package com.hrms.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hrms.pageobject.EmployeesDirectoryPageObject;

public class EmployeesDirectoryActions {

	private WebDriver driver;
	private EmployeesDirectoryPageObject employeesdirectorypageObject;
	
	public EmployeesDirectoryActions(WebDriver driver) {
		this.driver=driver;
		this.employeesdirectorypageObject = new EmployeesDirectoryPageObject(driver);
	}
	
	public void employeeDirectoryPageVisible() {
		employeesdirectorypageObject.employeesDirectoryClick();
		employeesdirectorypageObject.employeeDirectorypageVisible();
	}
	
	public void employeeDirectoryGetCurrentUrl() {
		employeesdirectorypageObject.getCurrentUrlToCrossVerify();
	}
	
	
	
}
