package com.hrms.pageobject;

import static com.reporting.ComplexReportFactory.getTest;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
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

	@FindBy(xpath = "//div[contains(text(),'Success')]//child::div")
	private WebElement Login_Assert_Login_Sucessfully;

	public void loginEmailTxtField() {
		enter(login_Email_Txt_Field, prop.getProperty("LoginEmail"), "Email", 40);
	}

	public void loginPasswordTxtField() {
		enter(Login_Password_Txt_Field, prop.getProperty("LoginPassword"), "Password", 40);
	}

	public void loginBtnClick() {
		click(Login_Btn_Click, "Login Btn", 40);
	}

	public void getCurrentUrlAdminSide() {
		staticWait(60);
		getCurrentUrl(prop.getProperty("get_current_url_Login_Page_Admin"), "get_current_url_Login_Page_Admin");
	}
}
