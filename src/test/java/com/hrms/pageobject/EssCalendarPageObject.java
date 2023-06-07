package com.hrms.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.WebBasePage;

public class EssCalendarPageObject extends WebBasePage {

	public WebDriver driver;

	public EssCalendarPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	object respository
	@FindBy(xpath = "(//a[@class='app-tab cursor-pointer'])[1]")
	private WebElement Ess_Click_Btn;

//	Actions respository

	public void essBtnClick() {
		click(Ess_Click_Btn, "Ess_Click_Btn", 60);
		switchTab();
	}
}
