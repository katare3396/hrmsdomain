package com.hrms.pageobject;

import static com.reporting.ComplexReportFactory.getTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

//	random generation field

	public String getEmpName;
	public String mobileNumber;
	public String personalEmailId;
	public String AdharCard;
	public String getEmpCode;
	public String OfficialEmailId;
	public String CurrentAddress1Text;
	public String CurrentAddress2Text;
	public String addressZip;
	public String Bank_Name_Text;
	public String Bank_Name_Account_No_Text;
	public String Bank_Name_IFSC_code_Text;
	public String Bank_Name_Account_Holder_Name_Text;
	public String Emergency_Name_Text;
	public String Emergency_Relationship_Text;
	public String Emergency_Address_Text;
	public String Emergency_Email_Text;
	public String Emergency_Mobile_No_Text;
	public String Qualification_Institution_Name_Text;
	public String Qualification_Passing_Year_Text;
	public String Qualification_Percentage_Text;
	public String WE_Previous_Company_Name_Txt;
	public String WE_Job_Title_Txt;

//	random generation field of mandatory 
	public String MandatoryAdharCard;
	public String MandatoryGetEmpCode;

//	 excel files random name genarating
	public String excelGetEmpName;
	public String excelGetEmpCode;
	public String excelOfficialEmailId;
	public String excelFilesDOB;
	public String excelcurrentDate;

//Object repository of path of employee directory

	@FindBy(xpath = ("//p[contains(text(),'Employees')]"))
	private WebElement employees_Directory_Click;

// Object respository of employee directory page visibile

	@FindBy(xpath = "//div[@class='w-100 flex-column flex-start-end css-1a8w37c']")
	private WebElement Employee_Directory_page_Visible;

//	object repository of "employee dierctory page --> take Action new btn"

	@FindBy(xpath = "//button[@class=\"MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-disableElevation MuiButtonBase-root css-1yj7gpk-MuiButtonBase-root-MuiButton-root\"]")
	private WebElement Take_Action_NewBtn_Click;

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

//   object respository of employee searchzzzzzzz

	@FindBy(xpath = "//input[@placeholder=\"Search\" and @name=\"searchText\"]")
	private WebElement Employee_Directory_Search_Box_Text;

//	object respository of employee list

	@FindBy(xpath = "//div[@class='table-row-text']")
	private WebElement Employee_Directory_Employeee_List;

	private String employeeListXpath = "//div[@class='table-row-text']";

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

	@FindBy(xpath = "//p[contains(text(),'Enter the Aadhar card of 12 digit')]")
	private WebElement error_Messge_Enter_12_Digital_Adhaar_Name;

//	cancel Btn while create employee

	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-disableElevation MuiButtonBase-root css-rtd20k-MuiButtonBase-root-MuiButton-root']")
	private WebElement Employee_Directory_Cancel_Btn_Click;

//	Joining date is not filled it show pop up

	@FindBy(xpath = "//button[@class='MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonBase-root css-54i7hh-MuiButtonBase-root-MuiButton-root']")
	private WebElement Employee_Directory_joining_Date_Is_Not_Fill_Show_popup_of_Process;

//	employee profile click

	@FindBy(xpath = "(//div[@class='cursor-pointer css-1a8w37c'])[1]")
	private WebElement Employee_Directory_Profie_Click;

//	get text 

	private static final String Employee_Directory_Get_Text = "//span[text()='%s']/ancestor::label//div[@class='round-input']";

//	get text

	private static final String Employee_Directory_Get_Text_side = "//span[text()='%s']/following::p[@class='MuiTypography-root MuiTypography-body1 css-1v7sfwy-MuiTypography-root']";

//	object respository Employee directory view click cross Btn

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement Employee_Directory_View_Click_Cross_Btn;

//	employee code already exist

	@FindBy(xpath = "MuiTypography-root MuiTypography-body1 MuiTypography-gutterBottom MuiAlertTitle-root css-yn1raf-MuiTypography-root-MuiAlertTitle-root")
	private WebElement Employee_Directory_Employee_code_Already_Exist;

//	employee directory bulk creation click
	@FindBy(xpath = "(//span[@class=\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-bomoch-MuiTypography-root\"])[1]")
	private WebElement Employee_Directory_Bulk_Creation;

// bulk create excel file upload

	String Employee_Directory_File_Upload = "//input[@accept='.csv, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/vnd.ms-excel']";

//	success message of file upload

	@FindBy(xpath = "//div[@class='MuiTypography-root MuiTypography-body1 MuiTypography-gutterBottom MuiAlertTitle-root css-yn1raf-MuiTypography-root-MuiAlertTitle-root']")
	private WebElement Sucess_Message_Bulk_Upload;

//	list of employee code

	@FindBy(xpath = "//td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-paddingNone MuiTableCell-sizeSmall p-10px last-cell-shadow fixed-column fixed-table-cell css-xo0jrd-MuiTableCell-root\"]/child::div")
	private WebElement List_Emp_Code;

	String xpath_List_Emp_Code = "//td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-paddingNone MuiTableCell-sizeSmall p-10px last-cell-shadow fixed-column fixed-table-cell css-xo0jrd-MuiTableCell-root\"]/child::div";

//	-------------------------------------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------------------------------------
//	-------------------------------------------------------------------------------------------------------------------------------------------

//Action repository of path of employee directory	

	public void employeesDirectoryClick() {
		click(employees_Directory_Click, "employeesDirectoryClick", 100);
	}

// Action  respository of employee directory page visibile

	public void employeeDirectorypageVisible() {
		hover(Employee_Directory_page_Visible, "Employee_Directory_page_Visible", 100);

	}

//	Action respository of get current url

	public void getCurrentUrlToCrossVerify() {
		getCurrentUrl(prop.getProperty("get_current_url_employee_Directory"), "get_current_url_employee_Directory");
	}

//	Action repository of "employee dierctory page --> create new btn"
	public void takeActionsNewBtnClick() {
		click(Take_Action_NewBtn_Click, "Take_Action_NewBtn_Click", 100);
	}

	public void addManuallyClick() {
		click(add_Manually_Click, "addManuallyClick", 100);
	}

//	Action repository of employee creation form select entity

	public void selectEntityEmployeeCreationFormDd() {
		click(select_Entity_Employee_Creation_Form_Dd, "select Entity_Employee_Creation_Form_Dd", 100);
	}

//	Action repository of employee creation form process btn
	public void processBtnEmployeeCreationFormDd() {
		click(Process_Btn_Employee_Creation_Form_Dd, "Process_Btn_Employee_Creation_Form_Dd", 100);
		staticWait(1000);
	}

//	Action repository of employee creation form mutiple click save btn

	public void saveBtnMutipleClickEmployeeCreationFormDd() {
		mutipleClick(Save_Btn_Employee_Creation_Form_Dd, "Save_Btn_Employee_Creation_Form_Dd", 100);
		staticWait(500);
	}

//	Action repository of employee creation form single click save btn

	public void saveBtnSingleClickEmployeeCreationFormDd() {
		click(Save_Btn_Employee_Creation_Form_Dd, "Save_Btn_Employee_Creation_Form_Dd", 100);
		staticWait(500);
	}

//	Action respository of employee create success

	public void employeeCreationSuceessMessage() {
		AlertMessage(Employee_Creation_Suceess_Message, "Success", "employeeCreationSuceessMessage", 100);
	}

//  Action respository of employee search

	public void employeeDirectorySearchBoxText() {
		enter(Employee_Directory_Search_Box_Text, getEmpName, "Employee_Directory_Search_Box_Text", 100);
	}

//	Action respository of employee list

	public void employeeDirectoryEmployeeeList() {
		try {
			WebElement element = findElementVisibility(Employee_Directory_Employeee_List, 100);
//			list employeee

			List<WebElement> elements = element.findElements(By.xpath(employeeListXpath));

			for (WebElement elementget : elements) {
				String actualValue = elementget.getText();

				String first = split(actualValue, "[\\s+]", 3, 0);
				String second = split(actualValue, "[\\s+]", 3, 1);

				String empName = first + " " + second;
				if (empName.equalsIgnoreCase(getEmpName)) {
					getTest().log(LogStatus.PASS, "--:CompareValue  : --" + empName + "--:ActualValue:--" + getEmpName);
				} else {
					getTest().log(LogStatus.FAIL,
							"--:CompareValue:--" + empName + "--:Not Equal to ActualValue:--" + getEmpName);
				}
			}
		} catch (Exception e) {
			getTest().log(LogStatus.ERROR, "Error" + e);
		}
	}

	
//	dashboard click
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorInherit tab-header css-1fk22ep-MuiButtonBase-root-MuiTab-root' and @id='Employees Master']")
			private WebElement Dashboard_Click;
	
//	Refresh page Of employee Directory
	
	public void employeeDirectoryRefreshPage() {
		click(Dashboard_Click, "change page so that previous data search box get blank ", 100);
		employeesDirectoryClick();
		pageRefresh("Zimyo | Account");
		
	}

//Action repository of first section -->"personal detail"  employee creation form field

	// emp name generating
	public String employeeCreationFormFullNameInputGenerator() {
		getEmpName = nameGenerator() + " " + nameGenerator();
		return getEmpName;
	}

	public void employeeCreationFormFullNameInput() {
		enter(Employee_Creation_Form_Full_Name_Input, getEmpName, "Employee_Creation_Form_Full_Name_Input", 100);
	}

	public void employeeCreationFormGenderDd() {
		enterForceValueDd(Employee_Creation_Form_Gender_Dd, prop.getProperty("Gender"),
				"Employee_Creation_Form_Gender_Dd", 100, 0);
	}

	public void employeeCreationFormMaritalStatusDd() {
		enterForceValueDd(Employee_Creation_Form_Marital_Status_Dd, prop.getProperty("Marital_Status"),
				"Employee_Creation_Form_Marital_Status_Dd", 100, 0);
	}

	public void employeeCreationFormDateOfMarriagecalendar() {
		calendar(Employee_Creation_Form_Date_Of_Marriage_calendar, "Employee_Creation_Form_Date_Of_Marriage_calendar",
				100, prop.getProperty("year_marriage"), prop.getProperty("month_marriage"),
				prop.getProperty("Date_marriage"), 0);
	}

	public void employeeCreationFormDateOfBirthCalendar() {
		calendar(Employee_Creation_Form_Date_Of_Birth_Calendar, "Employee_Creation_Form_Date_Of_Birth_Calendar", 100,
				prop.getProperty("year_DOB"), prop.getProperty("month_DOB"), prop.getProperty("Date_DOB"), 0);
	}

	public void employeeCreationFormNationalityDd() {
		enterForceValueDd(Employee_Creation_Form_Nationality_Dd, prop.getProperty("Nationality"),
				"Employee_Creation_Form_Nationality_Dd", 100, 0);
	}

// mobile number random generation
	public String employeeCreationFormMOBILENUMBEREnterGeneration() {
		mobileNumber = numberGenerator(10);
		return mobileNumber;
	}

	public void employeeCreationFormMOBILENUMBEREnter() {
		enter(Employee_Creation_Form_MOBILE_NUMBER_Enter, mobileNumber, "Employee_Creation_Form_MOBILE_NUMBER_Enter",
				100);
	}

// personal email random generation
	public String employeeCreationFormPersonalEmailIDEnterGeneration() {
		personalEmailId = nameGenerator() + "@yopmail.com";
		return personalEmailId;
	}

	public void employeeCreationFormPersonalEmailIDEnter() {
		enter(Employee_Creation_Form_Personal_Email_ID_Enter, personalEmailId,
				"Employee_Creation_Form_Personal_Email_ID_Enter", 100);
	}

// aadhar card random generation
	public String employeeCreationFormAadharCardEnterGeneration() {
		AdharCard = numberGenerator(12);
		return AdharCard;
	}

	public void employeeCreationFormAadharCardEnter() {
		enter(Employee_Creation_Form_Aadhar_Card_Enter, AdharCard, "Employee_Creation_Form_Aadhar_Card_Enter", 100);
	}

	public void employeeCreationFormJoiningDateCalendar() {
		calendar(Employee_Creation_Form_Joining_Date_Calendar_Icon_Click,
				"Employee_Creation_Form_Joining_Date_Calendar_Icon_Click", 100, prop.getProperty("year_Joining"),
				prop.getProperty("month_Joining"), prop.getProperty("Date_Joining"), 0);
	}

	public void employeeCreationFormBloodGroupDd() {
		enterForceValueDd(Employee_Creation_Form_Blood_Group_Dd, prop.getProperty("Blood_Group"),
				"Employee_Creation_Form_Blood_Group_Dd", 100, 1);
	}

//	Action  repository of second section -->"detail" employee creation form field

	public String employeeCreationFormdetailEmployeeCodeInputGeneration() {
		getEmpCode = nameGenerator() + numberGenerator(5);
		return getEmpCode;
	}

	public void employeeCreationFormdetailEmployeeCodeInput() {
		enter(Employee_Creation_Form_detail_Employee_Code_Input, getEmpCode,
				"Employee_Creation_Form_detail_Employee_Code_Input", 100);
	}

	public void employeeCreationFormdetailLeaveRuleDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Leave_Rule_Dd, prop.getProperty("Leave_Rule"),
				"Employee_Creation_Form_detail_Leave_Rule_Dd", 100, 0);
	}

	public void employeeCreationFormdetailReportingManagerDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Reporting_Manager_Dd, prop.getProperty("Reporting_Manager"),
				"Employee_Creation_Form_detail_Reporting_Manager_Dd", 100, 1);
	}

	public void employeeCreationFormdetailShiftDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Shift_Dd, prop.getProperty("Shift"),
				"Employee_Creation_Form_detail_Shift_Dd", 100, 0);
	}

	public void employeeCreationFormdetailDepartmentDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Department_Dd, prop.getProperty("Department"),
				"Employee_Creation_Form_detail_Department_Dd", 100, 0);
	}

	public void employeeCreationFormdetailDesignationDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Designation_Dd, prop.getProperty("Designation"),
				"Employee_Creation_Form_detail_Designation_Dd", 100, 0);
	}

	public void employeeCreationFormdetailEmployeeTypeDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Employee_Type_Dd, prop.getProperty("Employee_Type"),
				"Employee_Creation_Form_detail_Employee_Type_Dd", 100, 0);
	}

	public void employeeCreationFormdetailLocation_Dd() {
		enterForceValueDd(Employee_Creation_Form_detail_Location_Dd, prop.getProperty("Location"),
				"Employee_Creation_Form_detail_Location_Dd", 100, 0);
	}
// official email id

	public String employeeCreationFormdetailOfficialEmailIDInputString() {
		OfficialEmailId = nameGenerator() + "@yopmail.com";
		return OfficialEmailId;
	}

	public void employeeCreationFormdetailOfficialEmailIDInput() {
		enter(Employee_Creation_Form_detail_Official_Email_ID_Input, OfficialEmailId,
				"Employee_Creation_Form_detail_Official_Email_ID_Input", 100);
	}

	public void employeeCreationFormdetailEmployeeStatusDd() {
		enterForceValueDd(Employee_Creation_Form_detail_Employee_Status_Dd, prop.getProperty("Employee_Status"),
				"Employee_Creation_Form_detail_Employee_Status_Dd", 100, 0);
	}

	public void employeeCreationFormDetailCompanyDd() {
		enterForceValueDd(Employee_Creation_Form_Detail_Company_Dd, prop.getProperty("Company"),
				"Employee_Creation_Form_Detail_Company_Dd", 100, 0);
	}

//	Action repository of third section -->"Address" employee creation form field

//	address random  generator 
	public String employeeCreationFormAddressCurrentAddress1TextGeneration() {
		CurrentAddress1Text = nameGenerator() + " "
				+ "Shivaji Nagar Gate no 3, Madh jetty ,Ganga Bawadi,madhisland malad west " + nameGenerator();
		return CurrentAddress1Text;
	}

	public void employeeCreationFormAddressCurrentAddress1Text() {
		enter(Employee_Creation_Form_Address_Current_Address1_Text, CurrentAddress1Text,
				"Employee_Creation_Form_Address_Current_Address1_Text", 100);
	}

//	address random  generator 
	public String employeeCreationFormAddressCurrentAddress2TextGneration() {
		CurrentAddress2Text = nameGenerator() + " "
				+ "C O DIBYAJYOTI SAIKIA RAJAMOIDAM GAJPURIA ROAD JORHAT EAST JORHAT ASSAM 785001" + " "
				+ nameGenerator();
		return CurrentAddress2Text;

	}

	public void employeeCreationFormAddressCurrentAddress2Text() {

		enter(Employee_Creation_Form_Address_Current_Address2_Text, CurrentAddress2Text,
				"Employee_Creation_Form_Address_Current_Address2_Text", 100);

	}

	public void employeeCreationFormAddressCountryDd() {
		staticWait(500);
		enterForceValueDd(Employee_Creation_Form_Address_Country_Dd, prop.getProperty("work_exper_Country"),
				"Employee_Creation_Form_Address_Country_Dd", 100, 1);
	}

	public void employeeCreationFormAddressStateDd() {
		enterForceValueDd(Employee_Creation_Form_Address_State_Dd, prop.getProperty("work_exper_State"),
				"Employee_Creation_Form_Address_State_Dd", 100, 0);
	}

	public void employeeCreationFormAddressCityDd() {
		enterForceValueDd(Employee_Creation_Form_Address_City_Dd, prop.getProperty("work_exper_City"),
				"Employee_Creation_Form_Address_City_Dd", 100, 1);
	}

//	 generated adress zip number

	public String employeeCreationFormAddressZipInputGeneration() {
		addressZip = numberGenerator(6);
		return addressZip;
	}

	public void employeeCreationFormAddressZipInput() {
		enter(Employee_Creation_Form_Address_Zip_Input, addressZip, "Employee_Creation_Form_Address_Zip_Input", 100);
	}

//	Action repository of third section -->"work experience" employee creation form field  --> checklist of Same_As_Current

	public void employeeCreationFormAddressSameAsCurrentCb() {
		click(Employee_Creation_Form_Address_Same_As_Current_Cb, "Employee_Creation_Form_Address_Same_As_Current_Cb",
				100);
	}

//	Action repository of four section -->"Bank Name" employee creation form field (generating) 
//bank name random generation
	public String employeeCreationFormBankNameTextGeneration() {
		Bank_Name_Text = nameGenerator() + " " + nameGenerator();
		return Bank_Name_Text;
	}

	public void employeeCreationFormBankNameText() {
		enter(Employee_Creation_Form_Bank_Name_Text, Bank_Name_Text, "Employee_Creation_Form_Bank_Name_Text", 100);
	}

//bank account random generation
	public String employeeCreationFormBankNameAccountNoTextGeneration() {
		Bank_Name_Account_No_Text = numberGenerator(10);
		return Bank_Name_Account_No_Text;
	}

	public void employeeCreationFormBankNameAccountNoText() {
		enter(Employee_Creation_Form_Bank_Name_Account_No_Text, Bank_Name_Account_No_Text,
				"Employee_Creation_Form_Bank_Name_Account_No_Text", 100);
	}

// Ifsc code random generation
	public String employeeCreationFormBankNameIFSCcodeTextGeneration() {
		Bank_Name_IFSC_code_Text = nameGenerator() + numberGenerator(10);
		return Bank_Name_IFSC_code_Text;
	}

	public void employeeCreationFormBankNameIFSCcodeText() {
		enter(Employee_Creation_Form_Bank_Name_IFSC_code_Text, Bank_Name_IFSC_code_Text,
				"Employee_Creation_Form_Bank_Name_IFSC_code_Text", 100);
	}

//name account holder random generation
	public String employeeCreationFormBankNameAccountHolderNameTextGeneration() {
		Bank_Name_Account_Holder_Name_Text = nameGenerator() + " " + nameGenerator();
		return Bank_Name_Account_Holder_Name_Text;
	}

	public void employeeCreationFormBankNameAccountHolderNameText() {
		enter(Employee_Creation_Form_Bank_Name_Account_Holder_Name_Text, Bank_Name_Account_Holder_Name_Text,
				"Employee_Creation_Form_Bank_Name_Account_Holder_Name_Text", 100);
	}

	// Action repository of five section -->"Emergency Detail" employee creation
	// form field (generating)

	public String employeeCreationFormEmergencyNameTextGeneration() {
		Emergency_Name_Text = nameGenerator();
		return Emergency_Name_Text;

	}

	public void employeeCreationFormEmergencyNameText() {
		enter(Employee_Creation_Form_Emergency_Name_Text, Emergency_Name_Text,
				"Employee_Creation_Form_Emergency_Name_Text", 100);
	}

//emergency relationship random generation
	public String employeeCreationFormEmergencyRelationshipTextGeneration() {
		Emergency_Relationship_Text = "Brother" + " " + nameGenerator();
		return Emergency_Relationship_Text;

	}

	public void employeeCreationFormEmergencyRelationshipText() {
		enter(Employee_Creation_Form_Emergency_Relationship_Text, Emergency_Relationship_Text,
				"Employee_Creation_Form_Emergency_Relationship_Text", 100);
	}

// address random generation
	public String employeeCreationFormEmergencyAddressTextGeneration() {
		Emergency_Address_Text = nameGenerator() + " " + nameGenerator() + " " + nameGenerator();
		return Emergency_Address_Text;

	}

	public void employeeCreationFormEmergencyAddressText() {
		enter(Employee_Creation_Form_Emergency_Address_Text, Emergency_Address_Text, "", 100);
	}

//  emergency email random generation
	public String employeeCreationFormEmergencyEmailTextGeneration() {
		Emergency_Email_Text = nameGenerator() + "@yopmail.com";
		return Emergency_Email_Text;

	}

	public void employeeCreationFormEmergencyEmailText() {
		enter(Employee_Creation_Form_Emergency_Email_Text, Emergency_Email_Text,
				"Employee_Creation_Form_Emergency_Email_Text", 100);
	}

// emergency mobile no random generation
	public String employeeCreationFormEmergencyMobileNoTextGeneration() {
		Emergency_Mobile_No_Text = numberGenerator(10);
		return Emergency_Mobile_No_Text;
	}

	public void employeeCreationFormEmergencyMobileNoText() {
		enter(Employee_Creation_Form_Emergency_Mobile_No_Text, Emergency_Mobile_No_Text,
				"Employee_Creation_Form_Emergency_Mobile_No_Text", 100);
	}

//	Action repository of six section -->"Qualification" employee creation form field 

	public void employeeCreationFormQualificationDiplomaNameDd() {
		enterForceValueDd(Employee_Creation_Form_Qualification_Diploma_Name_Dd,
				prop.getProperty("Qualification_Diploma_Name_Dd"),
				"Employee_Creation_Form_Qualification_Diploma_Name_Dd", 100, 0);
	}

// qualification text generation
	public String employeeCreationFormQualificationInstitutionNameTextGeneration() {
		Qualification_Institution_Name_Text = nameGenerator();
		return Qualification_Institution_Name_Text;
	}

	public void employeeCreationFormQualificationInstitutionNameText() {
		enter(Employee_Creation_Form_Qualification_Institution_Name_Text, Qualification_Institution_Name_Text,
				"Employee_Creation_Form_Qualification_Institution_Name_Text", 100);
	}

//year random generation
	public String employeeCreationFormQualificationPassingYearTextGeneration() {
		Qualification_Passing_Year_Text = numberGenerator(4);
		return Qualification_Passing_Year_Text;
	}

	public void employeeCreationFormQualificationPassingYearText() {
		enter(Employee_Creation_Form_Qualification_Passing_Year_Text, Qualification_Passing_Year_Text,
				"Employee_Creation_Form_Qualification_Passing_Year_Text", 100);
	}

// percentage random generation
	public String employeeCreationFormQualificationPercentageTextGeneration() {
		Qualification_Percentage_Text = numberGenerator(2);
		return Qualification_Percentage_Text;
	}

	public void employeeCreationFormQualificationPercentageText() {
		enter(Employee_Creation_Form_Qualification_Percentage_Text, Qualification_Percentage_Text,
				"Employee_Creation_Form_Qualification_Percentage_Text", 100);
	}

//	Action repository of seven section -->"Work Experience" employee creation form field 
//company name random generation
	public String employeeCreationFormWEPreviousCompanyNameTxtGeneration() {
		WE_Previous_Company_Name_Txt = nameGenerator() + "BIGSHAREONLINE.COM";
		return WE_Previous_Company_Name_Txt;
	}

	public void employeeCreationFormWEPreviousCompanyNameTxt() {
		enter(Employee_Creation_Form_WE_Previous_Company_Name_Txt, WE_Previous_Company_Name_Txt,
				"Employee_Creation_Form_WE_Previous_Company_Name_Txt", 100);
	}

//job title random generation
	public String employeeCreationFormWEJobTitleTxtGeneration() {
		WE_Job_Title_Txt = nameGenerator();
		return WE_Job_Title_Txt;
	}

	public void employeeCreationFormWEJobTitleTxt() {
		enter(Employee_Creation_Form_WE_Job_Title_Txt, WE_Job_Title_Txt, "Employee_Creation_Form_WE_Job_Title_Txt",
				100);
	}

	public void employeeCreationFormWEFromDateCalendar() {
		calendar(Employee_Creation_Form_WE_From_Date_Calendar, "Employee_Creation_Form_WE_From_Date_Calendar", 100,
				"2020", "Mar", "25", 0);
	}

	public void employeeCreationFormWETODateCalendar() {
		calendar(Employee_Creation_Form_WE_TO_Date_Calendar, "Employee_Creation_Form_WE_TO_Date_Calendar", 100, "2023",
				"Jan", "20", 0);
	}

//	Actions get error message 

	public void errorMessageDisplayEnterFullNameMandatoryFullName() {
		verifySuccessMessage(Error_Message_Enter_FullName, "Enter the Full name",
				"Error_Message_Enter_FullName_Mandatory_Full_Name", 100);
	}

	public void errorMessgeEnter12DigitalAdhaarNameManadatoryAdhaar() {
		verifySuccessMessage(error_Messge_Enter_12_Digital_Adhaar_Name, "Enter the Aadhar card of 12 digit",
				"error_Messge_Enter_12_Digital_Adhaar_Name_Manadatory_Adhaar", 100);
	}

//	Actions respository cancel Btn 

	public void employeeDirectoryCancelBtnClick() {
		staticWait(200);
		click(Employee_Directory_Cancel_Btn_Click, "Employee_Directory_Cancel_Btn_Click", 100);
	}

//	Actions respository Joining date is not filled it show pop up
	public void Employee_Directory_joining_Date_Is_Not_Fill_Show_popup_of_Process_Btn() {
		mutipleClick(Employee_Directory_joining_Date_Is_Not_Fill_Show_popup_of_Process,
				"Employee_Directory_Create manually joining_Date_Is_Not_Fill_Show_popup_[Joining_Date_is_missing]_of_Process",
				100);
	}

//	Actions respository employee profile click

	public void employeeDirectoryProfieClick() {
		staticWait(2000);
		click(Employee_Directory_Profie_Click, "Employee_Directory_Profie_Click", 200);
		staticWait(2000);

	}

//	Action respository get text field

	public void employeeDirectoryGetTextFullName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Full Name", "Full Name");
		verifySuccessMessage(ele, getEmpName, "employeeDirectoryGetTextFullName", 100);
	}

	public void employeeDirectoryGetTextGender() {

		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Gender", "Gender");
		verifySuccessMessage(ele, prop.getProperty("Gender"), "employeeDirectoryGetTextGender", 100);

	}

	public void employeeDirectoryGetTextMaritalStatus() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Marital Status", "Marital_Status");
		verifySuccessMessage(ele, prop.getProperty("Marital_Status"), "employeeDirectoryGetTextMaritalStatus", 100);

	}

	public void employeeDirectoryGetTextNationality() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Nationality", "Nationality");
		verifySuccessMessage(ele, prop.getProperty("Nationality"), "employeeDirectoryGetTextNationality", 100);
	}

	public void employeeDirectoryGetTextMOBILENUMBER() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Mobile No.", "Mobile No.");
		verifySuccessMessage(ele, mobileNumber, "employeeDirectoryGetTextMOBILENUMBER", 100);
	}

	public void employeeDirectoryGetTextPersonalEmailID() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Personal Email ID", "Personal_Email_ID");
		verifySuccessMessage(ele, personalEmailId, "employeeDirectoryGetTextPersonalEmailID", 100);
	}

	public void employeeDirectoryGetTextAadharCard() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Aadhar Card", "Aadhar_Card");
		verifySuccessMessage(ele, AdharCard, "employeeDirectoryGetTextAadharCard", 100);
	}

	public void employeeDirectoryGetTextBloodGroup() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Blood Group", "Blood_Group");
		verifySuccessMessage(ele, prop.getProperty("Blood_Group"), "employeeDirectoryGetTextBloodGroup", 100);
	}

	public void employeeDirectoryGetTextLeaveRule() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Leave Rule", "Leave_Rule");
		verifySuccessMessage(ele, prop.getProperty("Leave_Rule"), "employeeDirectoryGetTextLeaveRule", 100);
	}

	public void employeeDirectoryGetTextReportingManager() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Reporting Manager", "Reporting_Manager");
		verifySuccessMessage(ele, prop.getProperty("Reporting_Manager"), "employeeDirectoryGetTextReportingManager",
				100);
	}

	public void employeeDirectoryGetTextShift() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Shift", "Shift");
		verifySuccessMessage(ele, prop.getProperty("Shift"), "employeeDirectoryGetTextShift", 100);
	}

	public void employeeDirectoryGetTextDepartment() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Department", "Department");
		verifySuccessMessage(ele, prop.getProperty("Department"), "employeeDirectoryGetTextDepartment", 100);
	}

	public void employeeDirectoryGetTextDesignation() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Designation", "Designation");
		verifySuccessMessage(ele, prop.getProperty("Designation"), "employeeDirectoryGetTextDesignation", 100);
	}

	public void employeeDirectoryGetTextEmployeeType() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Employee Type", "Employee_Type");
		verifySuccessMessage(ele, prop.getProperty("Employee_Type"), "employeeDirectoryGetTextEmployeeType", 100);
	}

	public void employeeDirectoryGetTextLocation() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Location", "Location");
		verifySuccessMessage(ele, prop.getProperty("Location"), "employeeDirectoryGetTextLocation", 100);
	}

	public void employeeDirectoryGetTextOfficialEmailID() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Official Email ID", "Official_Email_ID");
		verifySuccessMessage(ele, OfficialEmailId, "employeeDirectoryGetTextOfficialEmailID", 100);
	}

	public void employeeDirectoryGetTextEmployeeStatus() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Employee Status", "Employee_Status");
		verifySuccessMessage(ele, prop.getProperty("Employee_Status"), "employeeDirectoryGetTextEmployeeStatus", 100);
	}

	public void employeeDirectoryGetTextCompany() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Company", "Company");
		verifySuccessMessage(ele, prop.getProperty("Company"), "employeeDirectoryGetTextCompany", 100);
	}

	public void employeeDirectoryGetTextCurrentAddress1() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Current Address1", "Current_Address1");
		verifySuccessMessage(ele, CurrentAddress1Text, "employeeDirectoryGetTextCurrentAddress1", 100);
	}

	public void employeeDirectoryGetTextCurrentAddress2() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Current Address2", "Current_Address2");
		verifySuccessMessage(ele, CurrentAddress2Text, "employeeDirectoryGetTextCurrentAddress2", 100);
	}

	public void employeeDirectoryGetTextCountry() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Country", "work_exper_Country");
		verifySuccessMessage(ele, prop.getProperty("work_exper_Country"), "employeeDirectoryGetTextCountry", 100);
	}

	public void employeeDirectoryGetTextState() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "State", "work_exper_State");
		verifySuccessMessage(ele, prop.getProperty("work_exper_State"), "employeeDirectoryGetTextState", 100);
	}

	public void employeeDirectoryGetTextCity() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "City", "work_exper_City");
		verifySuccessMessage(ele, prop.getProperty("work_exper_City"), "employeeDirectoryGetTextCity", 100);
	}

	public void employeeDirectoryGetTextZip() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Zip", "work_exper_Zip");
		verifySuccessMessage(ele, addressZip, "employeeDirectoryGetTextZip", 100);
	}

	public void employeeDirectoryGetTextBankName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Bank Name", "Bank_Name_Text");
		verifySuccessMessage(ele, Bank_Name_Text, "employeeDirectoryGetTextBankName", 100);
	}

	public void employeeDirectoryGetTextAccountNo() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Account No", "Bank_Name_Account_No_Text");
		verifySuccessMessage(ele, Bank_Name_Account_No_Text, "employeeDirectoryGetTextAccountNo", 100);
	}

	public void employeeDirectoryGetTextIFSCcode() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "IFSC code", "Bank_Name_IFSC_code_Text");
		verifySuccessMessage(ele, Bank_Name_IFSC_code_Text, "employeeDirectoryGetTextIFSCcode", 100);
	}

	public void employeeDirectoryGetTextAccountHolderName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Account Holder Name",
				"Bank_Name_Account_Holder_Name_Text");
		verifySuccessMessage(ele, Bank_Name_Account_Holder_Name_Text, "employeeDirectoryGetTextAccountHolderName", 100);
	}

	public void employeeDirectoryGetTextName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Name", "Emergency_Name_Text");
		verifySuccessMessage(ele, Emergency_Name_Text, "employeeDirectoryGetTextName", 100);
	}

	public void employeeDirectoryGetTextRelationship() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Relationship", "Emergency_Relationship_Text");
		verifySuccessMessage(ele, Emergency_Relationship_Text, "employeeDirectoryGetTextRelationship", 100);
	}

	public void employeeDirectoryGetTextAddress() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Address", "Emergency_Address_Text");
		verifySuccessMessage(ele, Emergency_Address_Text, "employeeDirectoryGetTextAddress", 100);
	}

	public void employeeDirectoryGetTextEmail() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Email", "Emergency_Address_Text");
		verifySuccessMessage(ele, Emergency_Email_Text, "employeeDirectoryGetTextEmail", 100);
	}

	public void employeeDirectoryGetTextMobileNo() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Mobile No.", "Emergency_Mobile_No_Text");
		verifySuccessMessage(ele, Emergency_Mobile_No_Text, "employeeDirectoryGetTextMobileNo", 100);
	}

	public void employeeDirectoryGetTextDiplomaDegreeName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Diploma/Degree Name",
				"Qualification_Diploma_Name_Dd");
		verifySuccessMessage(ele, prop.getProperty("Qualification_Diploma_Name_Dd"),
				"employeeDirectoryGetTextDiplomaDegreeName", 100);
	}

	public void employeeDirectoryGetTextInstitutionName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Institution Name",
				"Qualification_Institution_Name_Text");
		verifySuccessMessage(ele, Qualification_Institution_Name_Text, "employeeDirectoryGetTextInstitutionName", 100);
	}

	public void employeeDirectoryGetTextPassingYear() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Passing Year", "Qualification_Passing_Year_Text");
		verifySuccessMessage(ele, Qualification_Passing_Year_Text, "employeeDirectoryGetTextPassingYear", 100);
	}

	public void employeeDirectoryGetTextPercentage() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Percentage", "Qualification_Percentage_Text");
		verifySuccessMessage(ele, Qualification_Percentage_Text, "employeeDirectoryGetTextPercentage", 100);
	}

	public void employeeDirectoryGetTextPreviousCompanyName() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Previous Company Name",
				"WE_Previous_Company_Name_Txt");
		verifySuccessMessage(ele, WE_Previous_Company_Name_Txt, "employeeDirectoryGetTextPreviousCompanyName", 100);
	}

	public void employeeDirectoryGetTextJobTitle() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text, "Job Title", "WE_Job_Title_Txt");
		verifySuccessMessage(ele, WE_Job_Title_Txt, "employeeDirectoryGetTextJobTitle", 100);
	}

	public void employeeDirectoryGetTextsideReportingManager() {
		WebElement ele = getTextByXpath(Employee_Directory_Get_Text_side, "Reporting Manager", "Reporting_Manager");
		verifySuccessMessage(ele, prop.getProperty("Reporting_Manager"), "employeeDirectoryGetTextsideReportingManager",
				100);
	}

//	object respository Employee directory view click cross Btn

	public void employeeDirectoryViewClickCrossBtn() {
		click(Employee_Directory_View_Click_Cross_Btn, "Employee_Directory_View_Click_Cross_Btn", 100);
	}

//	manadatory field xpath

	public void employeeCreationFormmandatoryJoiningDateCalendar() {

		calendar(Employee_Creation_Form_Joining_Date_Calendar_Icon_Click,
				"Employee_Creation_Form_Joining_Date_Calendar_Icon_Click", 100, prop.getProperty("year_Joining"),
				prop.getProperty("month_Joining"), prop.getProperty("Date_Joining"), 1);

	}

	public void employeeCreationFormMandatoryDateOfMarriagecalendar() {

		calendar(Employee_Creation_Form_Date_Of_Marriage_calendar, "Employee_Creation_Form_Date_Of_Marriage_calendar",
				100, prop.getProperty("year_marriage"), prop.getProperty("month_marriage"),
				prop.getProperty("Date_marriage"), 0);
	}

	public void employeeCreationFormMandatoryDateOfBirthCalendar() {
		calendar(Employee_Creation_Form_Date_Of_Birth_Calendar, "Employee_Creation_Form_Date_Of_Birth_Calendar", 100,
				prop.getProperty("year_DOB"), prop.getProperty("month_DOB"), prop.getProperty("Date_DOB"), 0);
	}

	public void employeeCreationFormMandatoryDetailCompanyDd() {
		enterForceValueDd(Employee_Creation_Form_Detail_Company_Dd, "", "Employee_Creation_Form_Detail_Company_Dd", 100,
				0);
	}

	public void employeeCreationFormMandatoryFullNameInput() {
		enter(Employee_Creation_Form_Full_Name_Input, "", "Employee_Creation_Form_Full_Name_Input", 100);
	}

	public String employeeCreationFormManadatoryAadharCardEnter() {
		MandatoryAdharCard = numberGenerator(10);
		enter(Employee_Creation_Form_Aadhar_Card_Enter, MandatoryAdharCard, "Employee_Creation_Form_Aadhar_Card_Enter",
				100);
		return MandatoryAdharCard;
	}

	public String employeeCreationFormdetailNewEmployeeCodeInput() {
		MandatoryGetEmpCode = nameGenerator() + "nojoiningdate";
		enter(Employee_Creation_Form_detail_Employee_Code_Input, MandatoryGetEmpCode,
				"Employee_Creation_Form_detail_Employee_Code_Input", 100);
		return MandatoryGetEmpCode;
	}

	public void employeeDirectoryEmployeecodealreadyExist() {
		AlertMessage(Employee_Directory_Employee_code_Already_Exist, "Error",
				"Employee_Directory_Employee_code_Already_Exist", 100);
	}

//	page naviagate 

	@FindBy(xpath = "//div[@class='MuiSelect-select MuiTablePagination-select MuiSelect-standard MuiInputBase-input css-1cccqvr']")
	private WebElement rows_Per_Page_Click;

	private static final String RowPerPage = "//li[@data-value='%s']";

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk' and @aria-label='next page'] ")
	private WebElement Employee_Diectoy_arrow_Bth_Click;

	private static final String component = "//tr[@class='MuiTableRow-root table-list-row css-fz5lae'][%s]";

	@FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-1eyfm8t']")
	private WebElement Employee_directory_Page_Number;

	public void employeeDiectoyarrowBthClick() {
		int StartRange = 0;
		int endRange = 0;
		int Total = 0;
		try {
			rows_Per_Page_Click.click();
			String rows = String.format(RowPerPage, prop.getProperty("rows_per_page"));
			driver.findElement(By.xpath(rows)).click();

			String pagenumber = Employee_directory_Page_Number.getText();

			String pageRange = split(pagenumber, "[\\s+]", 3, 0);
			String total = split(pagenumber, "[\\s+]", 3, 2);

			String Startrange = split(pageRange, "–", 1, 0);
			String endrange = split(pageRange, "–", 1, 1);

			StartRange = Integer.parseInt(Startrange);
			endRange = Integer.parseInt(endrange);
			Total = Integer.parseInt(total);
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, "Arrow function error" + e);
		}
		int per_page = Integer.parseInt(prop.getProperty("rows_per_page"));
		int pageCount = Total / per_page;
		ArrowBtnPageNavigate(Employee_Diectoy_arrow_Bth_Click, StartRange, endRange, pageCount, component, 40);
	}

//	Bulk creation

	public void employeeDirectorBulkCreation() {
		click(Employee_Directory_Bulk_Creation, "Employee_Directory_Bulk_Creation", 40);
	}

//	file upload bulk creation
	public void employeeDirectoryFileUpload() {
		uploadExcelFiles(Employee_Directory_File_Upload, "/src/test/resources/BulkEmployee.xlsx");
	}

//	 excel file write-- bulk creation
	public void excelFilesWriteBulkCreate() {
//		emp name generating random
		excelFilesEmployeeNameRandom();
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 11, excelGetEmpName);
//		emp code generating random
		excelFilesEmployeeCode();
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 0, excelGetEmpCode);
//		Official email generating 
		excelFilesOfficialEmailIDInput();
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 9, excelOfficialEmailId);
//		joining date
		excelfilesJoiningDate();
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 15, excelcurrentDate);
//   leave rule
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 1, prop.getProperty("Leave_Rule"));
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 2, prop.getProperty("Reporting_Manager"));
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 3, prop.getProperty("Shift"));
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 4, prop.getProperty("Department"));
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 5, prop.getProperty("Designation"));
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 6, prop.getProperty("Employee_Type"));
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 7, prop.getProperty("Company"));
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 8, prop.getProperty("Location"));
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 10, prop.getProperty("Employee_Status"));
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 12, prop.getProperty("Gender"));
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 14, prop.getProperty("Marital_Status"));
		writeDatafileClass("/src/test/resources/BulkEmployee.xlsx", 0, 2, 16, personalEmailId);

	}

//random name generating 
	public String excelFilesEmployeeNameRandom() {
		excelGetEmpName = nameGenerator() + " " + "ExcelEmpCreate";
		return excelGetEmpName;
	}

	public String excelFilesEmployeeCode() {
		excelGetEmpCode = nameGenerator() + numberGenerator(6);
		return excelGetEmpCode;
	}

	public String excelFilesOfficialEmailIDInput() {
		excelOfficialEmailId = nameGenerator() + "Excel@yopmail.com";
		return excelOfficialEmailId;
	}

	public String excelfilesJoiningDate() {
		LocalDate currentDate = LocalDate.now();
		excelcurrentDate = currentDate.toString();
		return excelcurrentDate;
	}

//success message of bulk upload

	public void sucessMessageBulkUpload() {
		AlertMessage(Sucess_Message_Bulk_Upload, "Success", "Sucess_Message_Bulk_Upload_Of Bulk creation", 100);
	}

//	find any duplicate emp code

	public void uniqueListEmpCode() {
		try {
			WebElement element = findElementVisibility(Employee_Directory_Employeee_List, 100);
//			list employeee
			List<WebElement> elements = element.findElements(By.xpath(employeeListXpath));
			int count = 0;
			for (WebElement elementget : elements) {
				String actualValue = elementget.getText();
// Split method webpage
				String empCodeSpilt = split(actualValue, "[\\s+]", 3, 2);
//	spilt 	
				String empCode = empCodeSpilt.replaceAll("[()]", "");
				if (empCode.equalsIgnoreCase(getEmpCode)) {
					if (count == 0) {
						getTest().log(LogStatus.PASS, empCode + " :-- Equal value of compare- " + getEmpCode);
					} else {
						getTest().log(LogStatus.FAIL,
								empCode + " :-- Mutiple create - " + getEmpCode + " :-- Duplicate record" + getEmpCode);
//					screenshot function
						takeScreenshot(new Object() {
						}.getClass().getEnclosingMethod().getName());
					}
					count++;
				} else {
//					getTest().log(LogStatus.FAIL,
//							"empCode CompareValue ::-- " + empCode + "--:Not Equal to ActualValue:---" + getEmpCode);
				}
			}
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, getEmpCode + " ---:element is not visibilty :--" + ", error exist - " + e);
//			logger.info(name + " not entered with value - " + value + ", error exist - " + e);

//			screenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail("" + e);
		}
	}

	public void checkEmpDirectoryPageClose() {
		String currentUrl = driver.getCurrentUrl();
		String compareUrl = prop.getProperty("get_current_url_employee_Directory");
		staticWait(1000);
		try {
			if (currentUrl.equalsIgnoreCase(compareUrl)) {

			} else {
				employeeDirectoryCancelBtnClick();
				getTest().log(LogStatus.FAIL, currentUrl + " --: save Btn is click one but page page is not change::- " + compareUrl);
				takeScreenshot(new Object() {
				}.getClass().getEnclosingMethod().getName());
			}
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, " is " + e + "  Element not Present ?  - ");

		}
	}

}
