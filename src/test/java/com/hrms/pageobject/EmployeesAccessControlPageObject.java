package com.hrms.pageobject;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.PropertiesLoader;
import com.util.WebBasePage;

public class EmployeesAccessControlPageObject extends WebBasePage {

	public WebDriver driver;
	public String EmployeeName = "AGCCBGBABF19021";

	public EmployeesAccessControlPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private final String FILE_NAME = System.getProperty("user.dir") + "/src/main/resources/testdata.properties";
	private Properties prop = new PropertiesLoader(FILE_NAME).load();

//	object respository 

	@FindBy(xpath = ("//p[contains(text(),'Employees')]"))
	private WebElement employees_Directory_Click;

	@FindBy(xpath = "//h3[text() = ' Roles and Permission ']")
	private WebElement Emp_rolespermission_btn_click;

	@FindBy(xpath = "//div[@class=\"MuiTableContainer-root css-rorn0c-MuiTableContainer-root\"]")
	private WebElement Emp_rolespermission_Page_Visibilty;

//	page navigate
	private static final String Role_Permission_Arrow_Btn = "(//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root'])[%s]";

	@FindBy(xpath = "//button[@aria-label='Go to next page']")
	private WebElement Role_Permission_arrow_Bth_Click;

//	employee name 
	private static final String Employee_name_Roles_Permission = "(//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-1odadhr-MuiAvatar-root\"])//following::p[contains(text(),\"%s\")]";

//	search box
	@FindBy(xpath = "//input[@class=\"input-search\"]")
	private WebElement Employee_Directory_Search_Box;

//	not check checkbox

//	@FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[4]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[not(@checked)]")
//	private WebElement UnCheck_CheckBox_Core_Hrms;

	String UnCheck_CheckBox_Core_Hrms = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[4]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[not(@checked)]";

//	@FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[5]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[not(@checked)]")
//	private WebElement UnCheck_CheckBox_Employee;

	String UnCheck_CheckBox_Employee = "\"//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[5]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[not(@checked)]";

//	@FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[6]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[not(@checked)]")
//	private WebElement UnCheck_CheckBox_Payroll;

	String UnCheck_CheckBox_Payroll = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[6]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[not(@checked)]";

//	@FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[7]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[not(@checked)]")
//	private WebElement UnCheck_CheckBox_Mobile_App;

	String UnCheck_CheckBox_Mobile_App = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[7]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[not(@checked)]";

//	@FindBy(xpath = "//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-pxo100b-MuiTableCell-root' and div/span[@class='MuiButtonBase-root Mui-disabled MuiIconButton-root Mui-disabled MuiIconButton-colorSecondary MuiIconButton-sizeMedium MuiCheckbox-root MuiCheckbox-colorSecondary PrivateSwitchBase-root Mui-disabled css-1roqmyy-MuiButtonBase-root-MuiIconButton-root-MuiCheckbox-root']]")
//	private WebElement UnCheck_Check_Box_Ats;

	String UnCheck_Check_Box_Ats = "//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-pxo100b-MuiTableCell-root' and div/span[@class='MuiButtonBase-root Mui-disabled MuiIconButton-root Mui-disabled MuiIconButton-colorSecondary MuiIconButton-sizeMedium MuiCheckbox-root MuiCheckbox-colorSecondary PrivateSwitchBase-root Mui-disabled css-1roqmyy-MuiButtonBase-root-MuiIconButton-root-MuiCheckbox-root']]";

//	checkbox check 

//	@FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[4]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[(@checked)]")
//	private WebElement Select_Check_Box_Core_Hrms;

	String Select_Check_Box_Core_Hrms = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[4]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[(@checked)]";

//	@FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[5]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[(@checked)]")
//	private WebElement select_Check_Box_Employee;

	String select_Check_Box_Employee = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[5]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[(@checked)]";

//	@FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[6]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[(@checked)]")
//	private WebElement select_Check_Box_Payroll;

	String select_Check_Box_Payroll = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[6]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[(@checked)]";

//	@FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[7]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[(@checked)]")
//	private WebElement select_Check_Box_Mobile_App;

	String select_Check_Box_Mobile_App = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[7]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[(@checked)]";

//	@FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[8]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[(@checked)]")
//	private WebElement select_Check_Box_Ats;

	String select_Check_Box_Ats = "//tr[@class='MuiTableRow-root MuiTableRow-hover column-content css-yv5l9w-MuiTableRow-root']/td[8]/descendant::span[contains(@class, 'MuiIconButton-label')]/child::input[(@checked)]";

//	revoke xpath

	@FindBy(xpath = "(//span[@class=\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-bomoch-MuiTypography-root\"])[1]")
	private WebElement Revoke_Sub_Admin;
	
//	---------------------------------------------------------------
//	----------------------------------------------------------

//	Action respository 

	public void employeesDirectoryClick() {
		click(employees_Directory_Click, "employeesDirectoryClick", 100);

	}

	public void empRolesPermissionPageVisibilty() {
		hover(Emp_rolespermission_Page_Visibilty, "Emp_rolespermission_Page_Visibilty", 100);
	}

	public void empRolesPermissionBtnClick() {
		staticWait(2000);
		click(Emp_rolespermission_btn_click, "Emp_rolespermission_btn_click", 100);
	}

//	page navigate

	public void empRolesPermissionPageNavigate() {
//		ArrowBtnPageNavigate(Role_Permission_arrow_Bth_Click, Role_Permission_Arrow_Btn, 100);
	}

//	employee search
	public void empRolesPermissionEmployeeName() {
		getTextByXpath(Employee_name_Roles_Permission, EmployeeName, "Employee_name_Search_Roles_Permission");
	}

//	refresh page before search employee name

	public void empRolesPermissionSearchBox() {
//		refresh method
		refreshPage();
//		search method
		enter(Employee_Directory_Search_Box, EmployeeName, "Employee_Directory_Search_Box", 100);
		staticWait(1000);
	}

//	not select checkbox

	public void empRolesPermissionCoreHrmsCheckBoxUnCheck() {
		checkbox(UnCheck_CheckBox_Core_Hrms,0);
	}

	public void empRolesPermissionEmployeeCheckboxUnCheck() {
		checkbox(UnCheck_CheckBox_Employee,0);
	}

	public void empRolesPermissionPayrollCheckBoxUnCheck() {
		checkbox(UnCheck_CheckBox_Payroll,0);
	}

	public void empRolesPermissionMobileAppCheckBoxUnCheck() {
		checkbox(UnCheck_CheckBox_Mobile_App,0);

	}

	public void empRolesPermissionNotAtsCheckBoxUnCheck() {
		checkbox(UnCheck_Check_Box_Ats,0);
	}

//	revoke sub admin 
	public void revokeSubAdmin() {
		Actions action = new Actions(driver);
		action.moveToElement(Revoke_Sub_Admin).build().perform();
		action.click().build().perform();
	}

//	select check box

	public void empRolesPermissionCoreHrmsSelectChk() {
		checkbox(Select_Check_Box_Core_Hrms,1);
	}

	public void empRolesPermissionPayrollSelectChk() {
		checkbox(select_Check_Box_Payroll,1);
	}

	public void empRolesPermissionMobileelectChk() {
		checkbox(select_Check_Box_Mobile_App,1);
	}

//	refresh page
	
	public void refreshPage() {
		pageRefresh("Employee Roles & permission Refresh page");
	}


	
	
}
