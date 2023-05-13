package com.hrms.pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;
import com.util.PropertiesLoader;
import com.util.WebBasePage;

public class EmployeesDirectoryPageObject extends WebBasePage {

	public WebDriver driver;

	public EmployeesDirectoryPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private final String FILE_NAME = System.getProperty("user.dir") + "/src/main/resources/testdata.properties";
	private Properties prop = new PropertiesLoader(FILE_NAME).load();

//Object repository of path of employee directory

	@FindBy(xpath = ("//p[contains(text(),'Employees')]"))
	private WebElement employees_Directory_Click;

// Object respository of employee directory page visibile

	@FindBy(xpath = "//div[@class='MuiTableContainer-root table-container table-container-shadow css-rorn0c-MuiTableContainer-root']")
	private WebElement Employee_Directory_page_Visible;

//	object repository of "employee dierctory page --> create new btn"

	@FindBy(xpath = "//span[contains(text(),'Create New')]")
	private WebElement create_NewBtn_Click;

	@FindBy(xpath = "//span[contains(text(),\"Add Manually\")]")
	private WebElement add_Manually_Click;

//	object repository of employee creation form select entity

	@FindBy(xpath = "//label[contains(text(),'Select Entity')]")
	private WebElement select_Entity_Employee_Creation_Form_Dd;

//	object repository of employee creation form process btn

	@FindBy(xpath = "//span[contains(text(),'Proceed')]")
	private WebElement Process_Btn_Employee_Creation_Form_Dd;

//	object repository of employee creation form save btn

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement Save_Btn_Employee_Creation_Form_Dd;

//	object repository of employee create success

	@FindBy(xpath = "//div[@class='MuiTypography-root MuiTypography-body1 MuiTypography-gutterBottom MuiAlertTitle-root css-yn1raf-MuiTypography-root-MuiAlertTitle-root']")
	private WebElement Employee_Creation_Suceess_Message;

//   object respository of employee search

	@FindBy(xpath = "//input[@placeholder=\"Search\" and @name=\"searchText\"]")
	private WebElement Employee_Directory_Search_Box_Text;

//	object respository of employee list

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 custom-table-body1 css-1f2vyg0-MuiTypography-root']")
	private WebElement Employee_Directory_Employeee_List;

//object repository of first section -->"personal detail"  employee creation form field

	@FindBy(xpath = "//input[@id='outlined-required' and @name='FIRST_NAME']")
	private WebElement Employee_Creation_Form_Full_Name_Input;

	@FindBy(xpath = "//input[@name='GENDER' and @class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input' ]")
	private WebElement Employee_Creation_Form_Gender_Dd;

	@FindBy(xpath = "//input[@name='MARITIAL_STATUS'  and @class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_Marital_Status_Dd;

	@FindBy(xpath = "//input[@name='MARRIAGE_DATE']/following-sibling::div//button")
	private WebElement Employee_Creation_Form_Date_Of_Marriage_calendar;

	@FindBy(xpath = "//input[@name='DATE_OF_BIRTH']/following-sibling::div//button")
	private WebElement Employee_Creation_Form_Date_Of_Birth_Calendar;

	@FindBy(xpath = "//input[@name='NATIONALITY'  and @class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_Nationality_Dd;

	@FindBy(xpath = "//input[@name='MOBILE_NUMBER'  and @class='MuiOutlinedInput-input MuiInputBase-input css-weuz2y-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_MOBILE_NUMBER_Enter;

	@FindBy(xpath = "//input[@name='PERSONAL_EMAIL'  and @class='MuiOutlinedInput-input MuiInputBase-input css-weuz2y-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_Personal_Email_ID_Enter;

	@FindBy(xpath = "//input[@name='AADHAR_CARD'  and @class='MuiOutlinedInput-input MuiInputBase-input css-weuz2y-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_Aadhar_Card_Enter;

	@FindBy(xpath = "//input[@name='JOINING_DATE']/following-sibling::div//button")
	private WebElement Employee_Creation_Form_Joining_Date_Calendar_Icon_Click;

	@FindBy(xpath = "//input[@name='BLOOD_GROUP']")
	private WebElement Employee_Creation_Form_Blood_Group_Dd;

//	object repository of second section -->"detail" employee creation form field

	@FindBy(xpath = "//input[@name='EMPLOYEE_CODE']")
	private WebElement Employee_Creation_Form_detail_Employee_Code_Input;

	@FindBy(xpath = "//input[@name='LEAVE_TEMPLATE']")
	private WebElement Employee_Creation_Form_detail_Leave_Rule_Dd;

	@FindBy(xpath = "(//input[@class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input'])[2]")
	private WebElement Employee_Creation_Form_detail_Reporting_Manager_Dd;

	@FindBy(xpath = "//input[@name='EMPLOYEE_SHIFT' and @class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_detail_Shift_Dd;

	@FindBy(xpath = "//input[@name='DEPARTMENT_NAME' and @class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_detail_Department_Dd;

	@FindBy(xpath = "//input[@name='DESIGNATION_ID' and @class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_detail_Designation_Dd;

	@FindBy(xpath = "//input[@name='EMPLOYEE_TYPE' and @class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_detail_Employee_Type_Dd;

	@FindBy(xpath = "//input[@name='LOCATION_ID' and @class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_detail_Location_Dd;

	@FindBy(xpath = "//input[@name='OFFICE_EMAIL' and @class='MuiOutlinedInput-input MuiInputBase-input css-weuz2y-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_detail_Official_Email_ID_Input;

	@FindBy(xpath = "//input[@name='EMPLOYEE_STATUS' and @class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_detail_Employee_Status_Dd;

	@FindBy(xpath = "//input[@name='COMPANY_ID' and @class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input']")
	private WebElement Employee_Creation_Form_Detail_Company_Dd;

//	object repository of third section -->"Address" employee creation form field

	@FindBy(xpath = "//input[@name='CURRENT_ADDRESS_1']")
	private WebElement Employee_Creation_Form_Address_Current_Address1_Text;

	@FindBy(xpath = "//input[@name='CURRENT_ADDRESS_2']")
	private WebElement Employee_Creation_Form_Address_Current_Address2_Text;

	@FindBy(xpath = "//input[@name='COUNTRY_ID']")
	private WebElement Employee_Creation_Form_Address_Country_Dd;

	@FindBy(xpath = "//input[@name='STATE_ID']")
	private WebElement Employee_Creation_Form_Address_State_Dd;

	@FindBy(xpath = "(//input[@class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused MuiAutocomplete-input MuiAutocomplete-inputFocused css-d2rydc-MuiInputBase-input-MuiOutlinedInput-input' ])[3]")
	private WebElement Employee_Creation_Form_Address_City_Dd;

	@FindBy(xpath = "//input[@name='CURRENT_ZIP_CODE']")
	private WebElement Employee_Creation_Form_Address_Zip_Input;

	// object repository of third section -->"Address" employee creation
	// form field --> checklist of Same_As_Current

	@FindBy(xpath = "//span[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorSecondary MuiIconButton-sizeMedium MuiCheckbox-root MuiCheckbox-colorSecondary PrivateSwitchBase-root css-wp8naz-MuiButtonBase-root-MuiIconButton-root-MuiCheckbox-root']")
	private WebElement Employee_Creation_Form_Address_Same_As_Current_Cb;

//	object repository of four section -->"Bank Name" employee creation form field  

	@FindBy(xpath = "//input[@name='BANK_NAME']")
	private WebElement Employee_Creation_Form_Bank_Name_Text;

	@FindBy(xpath = "//input[@name='ACCOUNT_NUMBER' and @id='outlined-required' ]")
	private WebElement Employee_Creation_Form_Bank_Name_Account_No_Text;

	@FindBy(xpath = "//input[@name='IFSC_CODE']")
	private WebElement Employee_Creation_Form_Bank_Name_IFSC_code_Text;

	@FindBy(xpath = "//input[@name='ACC_HOLDER_NAME']")
	private WebElement Employee_Creation_Form_Bank_Name_Account_Holder_Name_Text;

//	object repository of five section -->"Emergency Detail" employee creation form field  

	@FindBy(xpath = "//input[@name='EMERGENCY_NAME']")
	private WebElement Employee_Creation_Form_Emergency_Name_Text;

	@FindBy(xpath = "//input[@name='EMEGENCY_RELATION']")
	private WebElement Employee_Creation_Form_Emergency_Relationship_Text;

	@FindBy(xpath = "//input[@name='EMEGENCY_ADDRES']")
	private WebElement Employee_Creation_Form_Emergency_Address_Text;

	@FindBy(xpath = "//input[@name='EMEGENCY_EMAIL']")
	private WebElement Employee_Creation_Form_Emergency_Email_Text;

	@FindBy(xpath = "//input[@name='EMEGENCY_MOBILE']")
	private WebElement Employee_Creation_Form_Emergency_Mobile_No_Text;

//	object repository of six section -->"Qualification" employee creation form field 

	@FindBy(xpath = "//input[@name='DEGREE_NAME']")
	private WebElement Employee_Creation_Form_Qualification_Diploma_Name_Dd;

	@FindBy(xpath = "//input[@name='INSTITUTION_NAME']")
	private WebElement Employee_Creation_Form_Qualification_Institution_Name_Text;

	@FindBy(xpath = "//input[@name='PASSING_YEAR']")
	private WebElement Employee_Creation_Form_Qualification_Passing_Year_Text;

	@FindBy(xpath = "//input[@name='PERCENTAGE']")
	private WebElement Employee_Creation_Form_Qualification_Percentage_Text;

//	object repository of seven section -->"Work Experience" employee creation form field 

	@FindBy(xpath = "//input[@name='PREV_COMPANY_NAME']")
	private WebElement Employee_Creation_Form_WE_Previous_Company_Name_Txt;

	@FindBy(xpath = "//input[@name='JOB_TITLE']")
	private WebElement Employee_Creation_Form_WE_Job_Title_Txt;

	@FindBy(xpath = "//input[@name='FROM_DATE']/following-sibling::div//button")
	private WebElement Employee_Creation_Form_WE_From_Date_Calendar;

	@FindBy(xpath = "//input[@name='TO_DATE']/following-sibling::div//button")
	private WebElement Employee_Creation_Form_WE_TO_Date_Calendar;

//	object get error message

	@FindBy(xpath = "//p[text()='Enter the Full name']")
	private WebElement Error_Message_Enter_FullName;

//	cancel Btn while create employee

	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-disableElevation MuiButtonBase-root css-rtd20k-MuiButtonBase-root-MuiButton-root']")
	private WebElement Employee_Directory_Cancel_Btn_Click;

//	Joining date is not filled it show pop up

	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonBase-root css-54i7hh-MuiButtonBase-root-MuiButton-root']")
	private WebElement Employee_Directory_joining_Date_Is_Not_Fill_Show_popup_of_Process;

//	employee profile click

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 custom-table-body1 css-1f2vyg0-MuiTypography-root'])[1]")
	private WebElement Employee_Directory_Profie_Click;

//	get text 

	private static final String Employee_Directory_Get_Text = "//span[text()='%s']/ancestor::label//div[@class='round-input']";

//	get text

	private static final String Employee_Directory_Get_Text_side = "//span[text()='%s']/following::p[@class='MuiTypography-root MuiTypography-body1 css-1v7sfwy-MuiTypography-root']";

//	object respository Employee directory view click cross Btn

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement Employee_Directory_View_Click_Cross_Btn;

//	-------------------------------------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------------------------------------

//Action repository of path of employee directory	

	public void employeesDirectoryClick() {
		click(employees_Directory_Click, "employeesDirectoryClick", 40);
	}

// Action  respository of employee directory page visibile

	public void employeeDirectorypageVisible() {
		hover(Employee_Directory_page_Visible, "Employee_Directory_page_Visible", 40);
	}

//	Action respository of get current url

	public void getCurrentUrlToCrossVerify() {
		getCurrentUrl(prop.getProperty("get_current_url_employee_Directory"), "get_current_url_employee_Directory");
	}

//	Action repository of "employee dierctory page --> create new btn"
	public void createNewBtnClick() {
		click(create_NewBtn_Click, "create_NewBtn_Click", 40);
	}

	public void addManuallyClick() {
		click(add_Manually_Click, "addManuallyClick", 40);
	}

//	Action repository of employee creation form select entity

	public void selectEntityEmployeeCreationFormDd() {
		click(select_Entity_Employee_Creation_Form_Dd, "select Entity_Employee_Creation_Form_Dd", 40);
	}

//	Action repository of employee creation form process btn
	public void processBtnEmployeeCreationFormDd() {
		click(Process_Btn_Employee_Creation_Form_Dd, "Process_Btn_Employee_Creation_Form_Dd", 40);
	}

//	Action repository of employee creation form save btn

	public void saveBtnEmployeeCreationFormDd() {
		click(Save_Btn_Employee_Creation_Form_Dd, "Save_Btn_Employee_Creation_Form_Dd", 40);
	}

//	Action respository of employee create sucess

	public void employeeCreationSuceessMessage() {
		verifySuccessMessage(Employee_Creation_Suceess_Message, "Success", 80);
	}

//  Action respository of employee search

	public void employeeDirectorySearchBoxText() {
		enter(Employee_Directory_Search_Box_Text, prop.getProperty("Full_Name"), "Employee_Directory_Search_Box_Text",
				40);
	}

//	Action respository of employee list

	public void employeeDirectoryEmployeeeList() {

//		verifyMultiSelectValues((By.xpath="//p[@class='MuiTypography-root MuiTypography-body1 custom-table-body1 css-1f2vyg0-MuiTypography-root']"), "Employee_Directory_Employeee_List", 40);
	}

//	Refresh page Of employee Directory
	public void employeeDirectoryRefreshPage() {
		pageRefresh("Zimyo | Account");
	}

//Action repository of first section -->"personal detail"  employee creation form field

	public void employeeCreationFormFullNameInput() {
		String getEmpName = prop.getProperty("Full_Name");

		enter(Employee_Creation_Form_Full_Name_Input, getEmpName, "Employee_Creation_Form_Full_Name_Input", 60);
	}

	public void employeeCreationFormGenderDd() {
		enterForceValueDd(Employee_Creation_Form_Gender_Dd, prop.getProperty("Gender"),
				"Employee_Creation_Form_Gender_Dd", 40, 0);
	}

	public void employeeCreationFormMaritalStatusDd() {

		enterForceValueDd(Employee_Creation_Form_Marital_Status_Dd, prop.getProperty("Marital_Status"),
				"Employee_Creation_Form_Marital_Status_Dd", 60, 0);
	}

	public void employeeCreationFormDateOfMarriagecalendar() {

		calendar(Employee_Creation_Form_Date_Of_Marriage_calendar, "Employee_Creation_Form_Date_Of_Marriage_calendar",
				40, prop.getProperty("year_marriage"), prop.getProperty("month_marriage"),
				prop.getProperty("Date_marriage"));
	}

	public void employeeCreationFormDateOfBirthCalendar() {
		calendar(Employee_Creation_Form_Date_Of_Birth_Calendar, "Employee_Creation_Form_Date_Of_Birth_Calendar", 40,
				prop.getProperty("year_DOB"), prop.getProperty("month_DOB"), prop.getProperty("Date_DOB"));
	}

	public void employeeCreationFormNationalityDd() {
		enterForceValueDd(Employee_Creation_Form_Nationality_Dd, prop.getProperty("Nationality"),
				"Employee_Creation_Form_Nationality_Dd", 40, 0);
	}

	public void employeeCreationFormMOBILENUMBEREnter() {
		enter(Employee_Creation_Form_MOBILE_NUMBER_Enter, prop.getProperty("MOBILE_NUMBER"),
				"Employee_Creation_Form_MOBILE_NUMBER_Enter", 40);
	}

	public void employeeCreationFormPersonalEmailIDEnter() {
		String personalEmailId = nameGenerator() + prop.getProperty("Personal_Email_ID");
		enter(Employee_Creation_Form_Personal_Email_ID_Enter, personalEmailId,
				"Employee_Creation_Form_Personal_Email_ID_Enter", 40);
	}

	public void employeeCreationFormAadharCardEnter() {
		enter(Employee_Creation_Form_Aadhar_Card_Enter, prop.getProperty("Aadhar_Card"),
				"Employee_Creation_Form_Aadhar_Card_Enter", 40);
	}

	public void employeeCreationFormJoiningDateCalendar() {

		calendar(Employee_Creation_Form_Joining_Date_Calendar_Icon_Click,
				"Employee_Creation_Form_Joining_Date_Calendar_Icon_Click", 40, prop.getProperty("year_Joining"),
				prop.getProperty("month_Joining"), prop.getProperty("Date_Joining"));

	}

	public void employeeCreationFormBloodGroupDd() {
		enterForceValueDd(Employee_Creation_Form_Blood_Group_Dd, prop.getProperty("Blood_Group"),
				"Employee_Creation_Form_Blood_Group_Dd", 40, 1);
	}

//	Action  repository of second section -->"detail" employee creation form field

	public void employeeCreationFormdetailEmployeeCodeInput() {
		String getEmpCode = nameGenerator() + prop.getProperty("Employee_Code_Input");
		enter(Employee_Creation_Form_detail_Employee_Code_Input, getEmpCode,
				"Employee_Creation_Form_detail_Employee_Code_Input", 40);
	}

	public void employeeCreationFormdetailLeaveRuleDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Leave_Rule_Dd, prop.getProperty("Leave_Rule"),
				"Employee_Creation_Form_detail_Leave_Rule_Dd", 40, 0);
	}

	public void employeeCreationFormdetailReportingManagerDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Reporting_Manager_Dd, prop.getProperty("Reporting_Manager"),
				"Employee_Creation_Form_detail_Reporting_Manager_Dd", 40, 1);
	}

	public void employeeCreationFormdetailShiftDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Shift_Dd, prop.getProperty("Shift"),
				"Employee_Creation_Form_detail_Shift_Dd", 40, 0);
	}

	public void employeeCreationFormdetailDepartmentDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Department_Dd, prop.getProperty("Department"),
				"Employee_Creation_Form_detail_Department_Dd", 40, 0);
	}

	public void employeeCreationFormdetailDesignationDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Designation_Dd, prop.getProperty("Designation"),
				"Employee_Creation_Form_detail_Designation_Dd", 40, 0);
	}

	public void employeeCreationFormdetailEmployeeTypeDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Employee_Type_Dd, prop.getProperty("Employee_Type"),
				"Employee_Creation_Form_detail_Employee_Type_Dd", 40, 0);
	}

	public void employeeCreationFormdetailLocation_Dd() {
		enterForceValueDd(Employee_Creation_Form_detail_Location_Dd, prop.getProperty("Location"),
				"Employee_Creation_Form_detail_Location_Dd", 40, 0);
	}

	public void employeeCreationFormdetailOfficial_Email_ID_Input() {
		String OfficialEmailId = nameGenerator() + prop.getProperty("Official_Email_ID");
		enter(Employee_Creation_Form_detail_Official_Email_ID_Input, OfficialEmailId,
				"Employee_Creation_Form_detail_Official_Email_ID_Input", 40);
	}

	public void employeeCreationFormdetailEmployeeStatusDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Employee_Status_Dd, prop.getProperty("Employee_Status"),
				"Employee_Creation_Form_detail_Employee_Status_Dd", 40, 0);
	}

	public void employeeCreationFormDetailCompanyDd() {
		enterForceValueDd(Employee_Creation_Form_Detail_Company_Dd, prop.getProperty("Company"),
				"Employee_Creation_Form_Detail_Company_Dd", 40, 0);
	}

//	Action repository of third section -->"Address" employee creation form field

	public void employeeCreationFormAddressCurrentAddress1Text() {
		enter(Employee_Creation_Form_Address_Current_Address1_Text, prop.getProperty("Current_Address1"),
				"Employee_Creation_Form_Address_Current_Address1_Text", 40);
	}

	public void employeeCreationFormAddressCurrentAddress2Text() {
		enter(Employee_Creation_Form_Address_Current_Address2_Text, prop.getProperty("Current_Address2"),
				"Employee_Creation_Form_Address_Current_Address2_Text", 40);
	}

	public void employeeCreationFormAddressCountryDd() {

		enterForceValueDd(Employee_Creation_Form_Address_Country_Dd, prop.getProperty("work_exper_Country"),
				"Employee_Creation_Form_Address_Country_Dd", 40, 1);
	}

	public void employeeCreationFormAddressStateDd() {
		enterForceValueDd(Employee_Creation_Form_Address_State_Dd, prop.getProperty("work_exper_State"),
				"Employee_Creation_Form_Address_State_Dd", 40, 0);
	}

	public void employeeCreationFormAddressCityDd() {
		enterForceValueDd(Employee_Creation_Form_Address_City_Dd, prop.getProperty("work_exper_City"),
				"Employee_Creation_Form_Address_City_Dd", 40, 1);
	}

	public void employeeCreationFormAddressZipInput() {
		enter(Employee_Creation_Form_Address_Zip_Input, prop.getProperty("work_exper_Zip"),
				"Employee_Creation_Form_Address_Zip_Input", 40);
	}

//	Action repository of third section -->"work experience" employee creation form field  --> checklist of Same_As_Current

	public void employeeCreationFormAddressSameAsCurrentCb() {
		click(Employee_Creation_Form_Address_Same_As_Current_Cb, "Employee_Creation_Form_Address_Same_As_Current_Cb",
				40);
	}

//	Action repository of four section -->"Bank Name" employee creation form field  

	public void employeeCreationFormBankNameText() {
		enter(Employee_Creation_Form_Bank_Name_Text, prop.getProperty("Bank_Name_Text"),
				"Employee_Creation_Form_Bank_Name_Text", 40);
	}

	public void employeeCreationFormBankNameAccountNoText() {
		enter(Employee_Creation_Form_Bank_Name_Account_No_Text, prop.getProperty("Bank_Name_Account_No_Text"),
				"Employee_Creation_Form_Bank_Name_Account_No_Text", 40);
	}

	public void employeeCreationFormBankNameIFSCcodeText() {
		enter(Employee_Creation_Form_Bank_Name_IFSC_code_Text, prop.getProperty("Bank_Name_IFSC_code_Text"),
				"Employee_Creation_Form_Bank_Name_IFSC_code_Text", 40);
	}

	public void employeeCreationFormBankNameAccountHolderNameText() {
		enter(Employee_Creation_Form_Bank_Name_Account_Holder_Name_Text,
				prop.getProperty("Bank_Name_Account_Holder_Name_Text"),
				"Employee_Creation_Form_Bank_Name_Account_Holder_Name_Text", 40);
	}

	// Action repository of five section -->"Emergency Detail" employee creation
	// form field

	public void employeeCreationFormEmergencyNameText() {
		enter(Employee_Creation_Form_Emergency_Name_Text, prop.getProperty("Emergency_Name_Text"),
				"Employee_Creation_Form_Emergency_Name_Text", 40);
	}

	public void employeeCreationFormEmergencyRelationshipText() {
		enter(Employee_Creation_Form_Emergency_Relationship_Text, prop.getProperty("Emergency_Relationship_Text"),
				"Employee_Creation_Form_Emergency_Relationship_Text", 40);
	}

	public void employeeCreationFormEmergencyAddressText() {
		enter(Employee_Creation_Form_Emergency_Address_Text, prop.getProperty("Emergency_Address_Text"), "", 40);
	}

	public void employeeCreationFormEmergencyEmailText() {
		enter(Employee_Creation_Form_Emergency_Email_Text, prop.getProperty("Emergency_Email_Text"),
				"Employee_Creation_Form_Emergency_Email_Text", 40);
	}

	public void employeeCreationFormEmergencyMobileNoText() {
		enter(Employee_Creation_Form_Emergency_Mobile_No_Text, prop.getProperty("Emergency_Mobile_No_Text"),
				"Employee_Creation_Form_Emergency_Mobile_No_Text", 40);
	}

//	Action repository of six section -->"Qualification" employee creation form field 

	public void employeeCreationFormQualificationDiplomaNameDd() {
		enterForceValueDd(Employee_Creation_Form_Qualification_Diploma_Name_Dd,
				prop.getProperty("Qualification_Diploma_Name_Dd"),
				"Employee_Creation_Form_Qualification_Diploma_Name_Dd", 40, 0);
	}

	public void employeeCreationFormQualificationInstitutionNameText() {
		enter(Employee_Creation_Form_Qualification_Institution_Name_Text,
				prop.getProperty("Qualification_Institution_Name_Text"),
				"Employee_Creation_Form_Qualification_Institution_Name_Text", 40);
	}

	public void employeeCreationFormQualificationPassingYearText() {
		enter(Employee_Creation_Form_Qualification_Passing_Year_Text,
				prop.getProperty("Qualification_Passing_Year_Text"),
				"Employee_Creation_Form_Qualification_Passing_Year_Text", 40);
	}

	public void employeeCreationFormQualificationPercentageText() {
		enter(Employee_Creation_Form_Qualification_Percentage_Text, prop.getProperty("Qualification_Percentage_Text"),
				"Employee_Creation_Form_Qualification_Percentage_Text", 40);
	}

//	Action repository of seven section -->"Work Experience" employee creation form field 

	public void employeeCreationFormWEPreviousCompanyNameTxt() {
		enter(Employee_Creation_Form_WE_Previous_Company_Name_Txt, prop.getProperty("WE_Previous_Company_Name_Txt"),
				"Employee_Creation_Form_WE_Previous_Company_Name_Txt", 40);
	}

	public void employeeCreationFormWEJobTitleTxt() {
		enter(Employee_Creation_Form_WE_Job_Title_Txt, prop.getProperty("WE_Job_Title_Txt"),
				"Employee_Creation_Form_WE_Job_Title_Txt", 40);
	}

	public void employeeCreationFormWEFromDateCalendar() {
		calendar(Employee_Creation_Form_WE_From_Date_Calendar, "Employee_Creation_Form_WE_From_Date_Calendar", 40,
				"2020", "Mar", "25");
	}

	public void employeeCreationFormWETODateCalendar() {
		calendar(Employee_Creation_Form_WE_TO_Date_Calendar, "Employee_Creation_Form_WE_TO_Date_Calendar", 40, "2023",
				"Jan", "20");
	}

//	Actions get error message 

	public void errorMessageEnterFullName() {
		verifySuccessMessage(Error_Message_Enter_FullName, "Enter the Full name", 40);
	}

//	Actions respository cancel Btn 

	public void employeeDirectoryCancelBtnClick() {
		click(Employee_Directory_Cancel_Btn_Click, "Employee_Directory_Cancel_Btn_Click", 40);
	}

//	Actions respository Joining date is not filled it show pop up
	public void Employee_Directory_joining_Date_Is_Not_Fill_Show_popup_of_Process_Btn() {
		click(Employee_Directory_joining_Date_Is_Not_Fill_Show_popup_of_Process,
				"Employee_Directory_Create manually joining_Date_Is_Not_Fill_Show_popup_[Joining_Date_is_missing]_of_Process",
				40);
	}

//	Actions respository employee profile click

	public void employeeDirectoryProfieClick() {
		click(Employee_Directory_Profie_Click, "Employee_Directory_Profie_Click", 40);
	}

//	Action respository get text field

	public void employeeDirectoryGetTextFullName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Full Name", "Full Name");
		verifySuccessMessage(ele, prop.getProperty("Full_Name"), 40);
	}

	public void employeeDirectoryGetTextGender() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Mobile No.", "Mobile No.");
		verifySuccessMessage(ele, prop.getProperty("MOBILE_NUMBER"), 40);
	}

	public void employeeDirectoryGetTextMaritalStatus() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Marital Status", "Marital_Status");
		verifySuccessMessage(ele, prop.getProperty("Marital_Status"), 40);

	}

	public void employeeDirectoryGetTextNationality() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Nationality", "Nationality");
		verifySuccessMessage(ele, prop.getProperty("Nationality"), 40);
	}

	public void employeeDirectoryGetTextMOBILENUMBER() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Gender", "Gender");
		verifySuccessMessage(ele, prop.getProperty("Gender"), 40);
	}

	public void employeeDirectoryGetTextPersonalEmailID() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Personal Email ID", "Personal_Email_ID");
		verifySuccessMessage(ele, prop.getProperty("Personal_Email_ID"), 40);
	}

	public void employeeDirectoryGetTextAadharCard() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Aadhar Card", "Aadhar_Card");
		verifySuccessMessage(ele, prop.getProperty("Aadhar_Card"), 40);
	}

	public void employeeDirectoryGetTextBloodGroup() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Blood Group", "Blood_Group");
		verifySuccessMessage(ele, prop.getProperty("Blood_Group"), 40);
	}

	public void employeeDirectoryGetTextLeaveRule() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Leave Rule", "Leave_Rule");
		verifySuccessMessage(ele, prop.getProperty("Leave_Rule"), 40);
	}

	public void employeeDirectoryGetTextReportingManager() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Reporting Manager", "Reporting_Manager");
		verifySuccessMessage(ele, prop.getProperty("Reporting_Manager"), 40);
	}

	public void employeeDirectoryGetTextShift() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Shift", "Shift");
		verifySuccessMessage(ele, prop.getProperty("Shift"), 40);
	}

	public void employeeDirectoryGetTextDepartment() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Department", "Department");
		verifySuccessMessage(ele, prop.getProperty("Department"), 40);
	}

	public void employeeDirectoryGetTextDesignation() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Designation", "Designation");
		verifySuccessMessage(ele, prop.getProperty("Designation"), 40);
	}

	public void employeeDirectoryGetTextEmployeeType() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Employee Type", "Employee_Type");
		verifySuccessMessage(ele, prop.getProperty("Employee_Type"), 40);
	}

	public void employeeDirectoryGetTextLocation() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Location", "Location");
		verifySuccessMessage(ele, prop.getProperty("Location"), 40);
	}

	public void employeeDirectoryGetTextOfficialEmailID() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Official Email ID", "Official_Email_ID");
		verifySuccessMessage(ele, prop.getProperty("Official_Email_ID"), 40);
	}

	public void employeeDirectoryGetTextEmployeeStatus() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Employee Status", "Employee_Status");
		verifySuccessMessage(ele, prop.getProperty("Employee_Status"), 40);
	}

	public void employeeDirectoryGetTextCompany() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Company", "Company");
		verifySuccessMessage(ele, prop.getProperty("Company"), 40);
	}

	public void employeeDirectoryGetTextCurrentAddress1() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Current Address1", "Current_Address1");
		verifySuccessMessage(ele, prop.getProperty("Current_Address1"), 40);
	}

	public void employeeDirectoryGetTextCurrentAddress2() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Current Address2", "Current_Address2");
		verifySuccessMessage(ele, prop.getProperty("Current_Address2"), 40);
	}

	public void employeeDirectoryGetTextCountry() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Country", "work_exper_Country");
		verifySuccessMessage(ele, prop.getProperty("work_exper_Country"), 40);
	}

	public void employeeDirectoryGetTextState() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "State", "work_exper_State");
		verifySuccessMessage(ele, prop.getProperty("work_exper_State"), 40);
	}

	public void employeeDirectoryGetTextCity() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "City", "work_exper_City");
		verifySuccessMessage(ele, prop.getProperty("work_exper_City"), 40);
	}

	public void employeeDirectoryGetTextZip() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Zip", "work_exper_Zip");
		verifySuccessMessage(ele, prop.getProperty("work_exper_Zip"), 40);
	}

	public void employeeDirectoryGetTextBankName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Bank Name", "Bank_Name_Text");
		verifySuccessMessage(ele, prop.getProperty("Bank_Name_Text"), 40);
	}

	public void employeeDirectoryGetTextAccountNo() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Account No", "Bank_Name_Account_No_Text");
		verifySuccessMessage(ele, prop.getProperty("Bank_Name_Account_No_Text"), 40);
	}

	public void employeeDirectoryGetTextIFSCcode() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "IFSC code", "Bank_Name_IFSC_code_Text");
		verifySuccessMessage(ele, prop.getProperty("Bank_Name_IFSC_code_Text"), 40);
	}

	public void employeeDirectoryGetTextAccountHolderName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Account Holder Name",
				"Bank_Name_Account_Holder_Name_Text");
		verifySuccessMessage(ele, prop.getProperty("Bank_Name_Account_Holder_Name_Text"), 40);
	}

	public void employeeDirectoryGetTextName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Name", "Emergency_Name_Text");
		verifySuccessMessage(ele, prop.getProperty("Emergency_Name_Text"), 40);
	}

	public void employeeDirectoryGetTextRelationship() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Relationship", "Emergency_Relationship_Text");
		verifySuccessMessage(ele, prop.getProperty("Emergency_Relationship_Text"), 40);
	}

	public void employeeDirectoryGetTextAddress() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Address", "Emergency_Address_Text");
		verifySuccessMessage(ele, prop.getProperty("Emergency_Address_Text"), 40);
	}

	public void employeeDirectoryGetTextEmail() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Email", "Emergency_Address_Text");
		verifySuccessMessage(ele, prop.getProperty("Emergency_Email_Text"), 40);
	}

	public void employeeDirectoryGetTextMobileNo() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Mobile No.", "Emergency_Mobile_No_Text");
		verifySuccessMessage(ele, prop.getProperty("Emergency_Mobile_No_Text"), 40);
	}

	public void employeeDirectoryGetTextDiplomaDegreeName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Diploma/Degree Name",
				"Qualification_Diploma_Name_Dd");
		verifySuccessMessage(ele, prop.getProperty("Qualification_Diploma_Name_Dd"), 40);
	}

	public void employeeDirectoryGetTextInstitutionName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Institution Name",
				"Qualification_Institution_Name_Text");
		verifySuccessMessage(ele, prop.getProperty("Qualification_Institution_Name_Text"), 40);
	}

	public void employeeDirectoryGetTextPassingYear() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Passing Year", "Qualification_Passing_Year_Text");
		verifySuccessMessage(ele, prop.getProperty("Qualification_Passing_Year_Text"), 40);
	}

	public void employeeDirectoryGetTextPercentage() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Percentage", "Qualification_Percentage_Text");
		verifySuccessMessage(ele, prop.getProperty("Qualification_Percentage_Text"), 40);
	}

	public void employeeDirectoryGetTextPreviousCompanyName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Previous Company Name",
				"WE_Previous_Company_Name_Txt");
		verifySuccessMessage(ele, prop.getProperty("WE_Previous_Company_Name_Txt"), 40);
	}

	public void employeeDirectoryGetTextJobTitle() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Job Title", "WE_Job_Title_Txt");
		verifySuccessMessage(ele, prop.getProperty("WE_Job_Title_Txt"), 40);
	}

	public void employeeDirectoryGetTextsideReportingManager() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text_side, "Reporting Manager", "Reporting_Manager");
		verifySuccessMessage(ele, prop.getProperty("Reporting_Manager"), 40);
	}

//	object respository Employee directory view click cross Btn

	public void employeeDirectoryViewClickCrossBtn() {
		click(Employee_Directory_View_Click_Cross_Btn, "Employee_Directory_View_Click_Cross_Btn", 40);
	}

}
