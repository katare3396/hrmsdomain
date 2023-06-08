package com.hrms.pageobject;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.PropertiesLoader;
import com.util.WebBasePage;

public class LoginPageObject extends WebBasePage {

	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private final String FILE_NAME = System.getProperty("user.dir") + "/src/main/resources/testdata.properties";
	private Properties prop = new PropertiesLoader(FILE_NAME).load();

//	 Object Respository

	@FindBy(xpath = "//input[@name='username' and @placeholder='Email or Mobile number']")
	private WebElement login_Email_Txt_Field;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement Login_Password_Txt_Field;

	@FindBy(xpath = "//span[contains(text(),'Login')]")
	private WebElement Login_Btn_Click;

	public void loginCredential(String LoginEmail, String LoginPassword) {
		enter(login_Email_Txt_Field, LoginEmail, "Email", 40);
		enter(Login_Password_Txt_Field, LoginPassword, "Password", 40);
	}

	public void loginBtnClick() {
		mutipleClick(Login_Btn_Click, "Login Btn", 40);
	}

	public void getCurrentUrlAdminSide() {
		staticWait(500);
		String currenturl = driver.getCurrentUrl();
		if (currenturl.equalsIgnoreCase(prop.getProperty("get_current_url_Login_Page_Admin"))) {
			getCurrentUrl(prop.getProperty("get_current_url_Login_Page_Admin"), "get_current_url_Login_Page_Admin");
		}else if(currenturl.equalsIgnoreCase(prop.getProperty(""))) {
			
		}
	}

	public void visibiltyLoginPage() {
		toCheckElementIsDisplayed(Login_Btn_Click, 100, "Visibilty of Login Page");
	}

}
