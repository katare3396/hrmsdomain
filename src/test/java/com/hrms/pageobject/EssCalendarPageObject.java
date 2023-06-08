package com.hrms.pageobject;


import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.PropertiesLoader;
import com.util.WebBasePage;

public class EssCalendarPageObject extends WebBasePage {

	public WebDriver driver;

	public EssCalendarPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	private final String FILE_NAME = System.getProperty("user.dir") + "/src/main/resources/testdata.properties";
	private Properties prop = new PropertiesLoader(FILE_NAME).load();

	
//	object respository
	@FindBy(xpath = "(//a[@class='app-tab cursor-pointer'])[1]")
	private WebElement Ess_Click_Btn;

//	Actions respository

	public void essBtnClick() {
		click(Ess_Click_Btn, "Ess_Click_Btn", 60);
		switchTab(prop.getProperty("get_current_url_Ess"),true);

        staticWait(10000000);
//		switchTab(prop.getProperty("get_current_url_Ess"),false);

	}
}
//b7 - c d8-p