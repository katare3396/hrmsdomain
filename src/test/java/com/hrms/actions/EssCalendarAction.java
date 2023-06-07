package com.hrms.actions;

import org.openqa.selenium.WebDriver;

import com.hrms.pageobject.EssCalendarPageObject;

public class EssCalendarAction {

	private EssCalendarPageObject essCalendarPageObject;
	

	public EssCalendarAction(WebDriver driver) {
		this.essCalendarPageObject = new EssCalendarPageObject(driver);
	}
	

	
	
	public void essSideDisplay() {
		essCalendarPageObject.essBtnClick();
	}
}
