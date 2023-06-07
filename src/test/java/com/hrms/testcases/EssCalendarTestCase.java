package com.hrms.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.actions.EssCalendarAction;
import com.hrms.actions.LoginAction;
import com.util.BrowserLaunch;

public class EssCalendarTestCase extends BrowserLaunch{

	
	private  EssCalendarAction essCalendarAction;
	

	
	@Test
	public void essPageDisplay() {
		new LoginAction(driver).enterLoginCredential();

		essCalendarAction=new EssCalendarAction(driver);

		essCalendarAction.essSideDisplay();
		
	}
}
