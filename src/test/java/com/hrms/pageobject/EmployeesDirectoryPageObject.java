package com.hrms.pageobject;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.PropertiesLoader;
import com.util.WebBasePage;

public class EmployeesDirectoryPageObject extends WebBasePage {

	public WebDriver driver;

	public EmployeesDirectoryPageObject(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	private final String FILE_NAME = System.getProperty("user.dir") + "/src/main/resources/testdata.properties";
	private Properties prop = new PropertiesLoader(FILE_NAME).load();

//Object repository of path of employee directory

	@FindBy(xpath = ("//p[contains(text(),'Employees')]"))
	private WebElement employees_Directory_Click;

// Object respository of employee directory page visibile

	@FindBy(xpath = "//div[@class='h-100 start-flex flex-column css-52ol0n']")
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

//object repository of first section -->"personal detail"  employee creation form field

	@FindBy(xpath = "//label[contains(text(),'Full Name')]")
	private WebElement Employee_Creation_Form_Full_Name_Input;

	@FindBy(xpath = "//label[contains(text(),'Gender')]")
	private WebElement Employee_Creation_Form_Gender_Dd;

	@FindBy(xpath = "//label[contains(text(),'Marital Status')]")
	private WebElement Employee_Creation_Form_Marital_Status_Dd;

	@FindBy(xpath = "//label[contains(text(),'Date Of Marriage')]")
	private WebElement Employee_Creation_Form_Date_Of_Marriage_calendar;

	@FindBy(xpath = "//label[contains(text(),'Date Of Birth')]")
	private WebElement Employee_Creation_Form_Date_Of_Birth_Calendar;

	@FindBy(xpath = "//label[contains(text(),'Nationality')]")
	private WebElement Employee_Creation_Form_Nationality_Dd;

	@FindBy(xpath = "//input[contains(@name,'MOBILE_NUMBER')]")
	private WebElement Employee_Creation_Form_MOBILE_NUMBER_Enter;

	@FindBy(xpath = "//label[contains(text(),'Personal Email ID')]")
	private WebElement Employee_Creation_Form_Personal_Email_ID_Enter;

	@FindBy(xpath = "//label[contains(text(),'Aadhar Card')]")
	private WebElement Employee_Creation_Form_Aadhar_Card_Enter;

	@FindBy(xpath = "//label[contains(text(),'Joining Date')]")
	private WebElement Employee_Creation_Form_Joining_Date_Calendar;

	@FindBy(xpath = "//label[contains(text(),'Blood Group')]")
	private WebElement Employee_Creation_Form_Blood_Group_Dd;

	@FindBy(xpath = "//label[contains(text(),'Branch')]")
	private WebElement Employee_Creation_Form_Branch_Dd;

//	object repository of second section -->"detail" employee creation form field

	@FindBy(xpath = "//label[contains(text(),'Branch')]")
	private WebElement Employee_Creation_Form_detail_Employee_Code_Input;

	@FindBy(xpath = "//label[contains(text(),'Leave Rule')]")
	private WebElement Employee_Creation_Form_detail_Leave_Rule_Dd;

	@FindBy(xpath = "//label[contains(text(),'Reporting Manager')]")
	private WebElement Employee_Creation_Form_detail_Reporting_Manager_Dd;

	@FindBy(xpath = "//label[contains(text(),'Shift')]")
	private WebElement Employee_Creation_Form_detail_Shift_Dd;

	@FindBy(xpath = "//label[contains(text(),'Department')]")
	private WebElement Employee_Creation_Form_detail_Department_Dd;

	@FindBy(xpath = "//label[contains(text(),'Designation')]")
	private WebElement Employee_Creation_Form_detail_Designation_Dd;

	@FindBy(xpath = "//label[contains(text(),'Employee Type')]")
	private WebElement Employee_Creation_Form_detail_Employee_Type_Dd;

	@FindBy(xpath = "//label[contains(text(),'Location')]")
	private WebElement Employee_Creation_Form_detail_Location_Dd;

	@FindBy(xpath = "//label[contains(text(),'Official Email ID')]")
	private WebElement Employee_Creation_Form_detail_Official_Email_ID_Input;

	@FindBy(xpath = "//label[contains(text(),'Employee Status')]")
	private WebElement Employee_Creation_Form_detail_Employee_Status_Dd;

//	object repository of third section -->"work experience" employee creation form field

	@FindBy(xpath = "//label[contains(text(),'Current Address1')]")
	private WebElement Employee_Creation_Form_work_exper_Current_Address1_Text;

	@FindBy(xpath = "//label[contains(text(),'Current Address2')]")
	private WebElement Employee_Creation_Form_work_exper_Current_Address2_Text;

	@FindBy(xpath = "(//label[contains(text(),'Country')])[1]")
	private WebElement Employee_Creation_Form_work_exper_Country_Dd;

	@FindBy(xpath = "(//label[contains(text(),'State')])[1]")
	private WebElement Employee_Creation_Form_work_exper_State_Dd;

	@FindBy(xpath = "(//label[contains(text(),'City')])[1]")
	private WebElement Employee_Creation_Form_work_exper_City_Dd;

	@FindBy(xpath = "(//label[contains(text(),'Zip')])[1]")
	private WebElement Employee_Creation_Form_work_exper_Zip_Input;

	// object repository of third section -->"work experience" employee creation
	// form field --> checklist of Same_As_Current

	@FindBy(xpath = "//input[@name='SAME_AS_CURRENT']")
	private WebElement Employee_Creation_Form_work_exper_Same_As_Current_Cb;

//	object repository of four section -->"Bank Name" employee creation form field  

	@FindBy(xpath = "//label[contains(text(),'Payment Type')]")
	private WebElement Employee_Creation_Form_Bank_Name_Payment_Type_Dd;

	@FindBy(xpath = "//label[contains(text(),\"Bank Name\")]")
	private WebElement Employee_Creation_Form_Bank_Name_Text;

	@FindBy(xpath = "//label[contains(text(),'Account No')]")
	private WebElement Employee_Creation_Form_Bank_Name_Account_No_Text;

	@FindBy(xpath = "//label[contains(text(),'IFSC code')]")
	private WebElement Employee_Creation_Form_Bank_Name_IFSC_code_Text;

	@FindBy(xpath = "//label[contains(text(),'Account Holder Name')]")
	private WebElement Employee_Creation_Form_Bank_Name_Account_Holder_Name_Text;

//	object repository of five section -->"Emergency Detail" employee creation form field  

	@FindBy(xpath = "//label[contains(text(),'Name')]")
	private WebElement Employee_Creation_Form_Emergency_Name_Text;

	@FindBy(xpath = "//label[contains(text(),'Relationship')]")
	private WebElement Employee_Creation_Form_Emergency_Relationship_Text;

	@FindBy(xpath = "//label[contains(text(),'Address')]")
	private WebElement Employee_Creation_Form_Emergency_Address_Text;

	@FindBy(xpath = "//label[contains(text(),'Email')]")
	private WebElement Employee_Creation_Form_Emergency_Email_Text;

	@FindBy(xpath = "//label[contains(text(),'Mobile No.')]")
	private WebElement Employee_Creation_Form_Emergency_Mobile_No_Text;

//	object repository of six section -->"Qualification" employee creation form field 

	@FindBy(xpath = "//label[contains(text(),'Diploma/Degree Name')]")
	private WebElement Employee_Creation_Form_Qualification_Diploma_Name_Dd;

	@FindBy(xpath = "//label[contains(text(),'Institution Name')]")
	private WebElement Employee_Creation_Form_Qualification_Institution_Name_Text;

	@FindBy(xpath = "//label[contains(text(),'Passing Year')]")
	private WebElement Employee_Creation_Form_Qualification_Passing_Year_Text;

	@FindBy(xpath = "//label[contains(text(),'Percentage')]")
	private WebElement Employee_Creation_Form_Qualification_Percentage_Text;

//	object repository of seven section -->"Work Experience" employee creation form field 

	@FindBy(xpath = "//label[contains(text(),'Previous Company Name')]")
	private WebElement Employee_Creation_Form_WE_Previous_Company_Name_Txt;

	@FindBy(xpath = "//label[contains(text(),'Job Title')]")
	private WebElement Employee_Creation_Form_WE_Job_Title_Txt;

	@FindBy(xpath = "//label[contains(text(),'From Date')]")
	private WebElement Employee_Creation_Form_WE_From_Date_Calendar;

	@FindBy(xpath = "//label[contains(text(),'To Date')]")
	private WebElement Employee_Creation_Form_WE_TO_Date_Calendar;

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
		getCurrentUrl(prop.getProperty("get_current_url"), "get_current_url");
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

//Action repository of first section -->"personal detail"  employee creation form field

	public void employeeCreationFormFullNameInput() {
		enter(Employee_Creation_Form_Full_Name_Input, prop.getProperty("Full_Name_Input"),
				"Employee_Creation_Form_Full_Name_Input", 60);

	}

	public void employeeCreationFormGenderDd() {
		enter(Employee_Creation_Form_Gender_Dd, prop.getProperty("Gender_Dd"), "Employee_Creation_Form_Gender_Dd", 40);
	}

	public void employeeCreationFormMaritalStatusDd() {
		enter(Employee_Creation_Form_Marital_Status_Dd, prop.getProperty("Marital_Status_Dd"),
				"Employee_Creation_Form_Marital_Status_Dd", 40);
	}

	public void employeeCreationFormDateOfMarriagecalendar() {
		enter(Employee_Creation_Form_Date_Of_Marriage_calendar, prop.getProperty("Date_Of_Marriage_calendar"),
				"Employee_Creation_Form_Date_Of_Marriage_calendar", 40);
	}

	public void employeeCreationFormDateOfBirthCalendar() {
		enter(Employee_Creation_Form_Date_Of_Birth_Calendar, prop.getProperty("Date_Of_Birth_Calendar"),
				"Employee_Creation_Form_Date_Of_Birth_Calendar", 40);
	}

	public void employeeCreationFormNationalityDd() {
		enter(Employee_Creation_Form_Nationality_Dd, prop.getProperty("Nationality_Dd"),
				"Employee_Creation_Form_Nationality_Dd", 40);
	}

	public void employeeCreationFormMOBILENUMBEREnter() {
		enter(Employee_Creation_Form_MOBILE_NUMBER_Enter, prop.getProperty("MOBILE_NUMBER_Enter"),
				"Employee_Creation_Form_MOBILE_NUMBER_Enter", 40);
	}

	public void employeeCreationFormPersonalEmailIDEnter() {
		enter(Employee_Creation_Form_Personal_Email_ID_Enter, prop.getProperty("Personal_Email_ID_Enter"),
				"Employee_Creation_Form_Personal_Email_ID_Enter", 40);
	}

	public void employeeCreationFormAadharCardEnter() {
		enter(Employee_Creation_Form_Aadhar_Card_Enter, prop.getProperty("Aadhar_Card_Enter"),
				"Employee_Creation_Form_Aadhar_Card_Enter", 40);
	}

	public void employeeCreationFormJoiningDateCalendar() {
		enter(Employee_Creation_Form_Joining_Date_Calendar, prop.getProperty("Joining_Date_Calendar"),
				"Employee_Creation_Form_Joining_Date_Calendar", 40);
	}

	public void employeeCreationFormBloodGroupDd() {
		enter(Employee_Creation_Form_Blood_Group_Dd, prop.getProperty("Blood_Group_Dd"),
				"Employee_Creation_Form_Blood_Group_Dd", 40);
	}

	public void Employee_Creation_Form_Branch_Dd() {
		enter(Employee_Creation_Form_Branch_Dd, prop.getProperty("Branch_Dd"), "Employee_Creation_Form_Branch_Dd", 40);
	}

//	Action  repository of second section -->"detail" employee creation form field

	public void employeeCreationFormdetailEmployeeCodeInput() {
		enter(Employee_Creation_Form_detail_Employee_Code_Input, prop.getProperty("Employee_Code_Input"),
				"Employee_Creation_Form_detail_Employee_Code_Input", 40);
	}

	public void employeeCreationFormdetailLeaveRuleDd() {
		enter(Employee_Creation_Form_detail_Leave_Rule_Dd, prop.getProperty("Leave_Rule_Dd"),
				"Employee_Creation_Form_detail_Leave_Rule_Dd", 40);
	}

	public void employeeCreationFormdetailReportingManagerDd() {
		enter(Employee_Creation_Form_detail_Reporting_Manager_Dd, prop.getProperty("Reporting_Manager_Dd"),
				"Employee_Creation_Form_detail_Reporting_Manager_Dd", 40);
	}

	public void employeeCreationFormdetailShiftDd() {
		enter(Employee_Creation_Form_detail_Shift_Dd, prop.getProperty("Shift_Dd"),
				"Employee_Creation_Form_detail_Shift_Dd", 40);
	}

	public void employeeCreationFormdetailDepartmentDd() {
		enter(Employee_Creation_Form_detail_Department_Dd, prop.getProperty("Department_Dd"),
				"Employee_Creation_Form_detail_Department_Dd", 40);
	}

	public void employeeCreationFormdetailDesignationDd() {
		enter(Employee_Creation_Form_detail_Designation_Dd, prop.getProperty("Designation_Dd"),
				"Employee_Creation_Form_detail_Designation_Dd", 40);
	}

	public void employeeCreationFormdetailEmployeeTypeDd() {
		enter(Employee_Creation_Form_detail_Employee_Type_Dd, prop.getProperty("Employee_Type_Dd"),
				"Employee_Creation_Form_detail_Employee_Type_Dd", 40);
	}

	public void employeeCreationFormdetailLocation_Dd() {
		enter(Employee_Creation_Form_detail_Location_Dd, prop.getProperty("Location_Dd"),
				"Employee_Creation_Form_detail_Location_Dd", 40);
	}

	public void employeeCreationFormdetailOfficial_Email_ID_Input() {
		enter(Employee_Creation_Form_detail_Official_Email_ID_Input, prop.getProperty("Official_Email_ID_Input"),
				"Employee_Creation_Form_detail_Official_Email_ID_Input", 40);
	}

	public void employeeCreationFormdetailEmployeeStatusDd() {
		enter(Employee_Creation_Form_detail_Employee_Status_Dd, prop.getProperty("Employee_Status_Dd"),
				"Employee_Creation_Form_detail_Employee_Status_Dd", 40);
	}

//	Action repository of third section -->"work experience" employee creation form field

	public void employeeCreationFormworkexperCurrentAddress1Text() {
		enter(Employee_Creation_Form_work_exper_Current_Address1_Text, prop.getProperty("Current_Address1_Text"),
				"Employee_Creation_Form_work_exper_Current_Address1_Text", 40);
	}

	public void employeeCreationFormworkexperCurrentAddress2Text() {
		enter(Employee_Creation_Form_work_exper_Current_Address2_Text, prop.getProperty("Current_Address2_Text"),
				"Employee_Creation_Form_work_exper_Current_Address2_Text", 40);
	}

	public void employeeCreationFormworkexperCountry_Dd() {
		enter(Employee_Creation_Form_work_exper_Country_Dd, prop.getProperty("work_exper_Country_Dd"),
				"Employee_Creation_Form_work_exper_Country_Dd", 40);
	}

	public void employeeCreationFormworkexperStateDd() {
		enter(Employee_Creation_Form_work_exper_State_Dd, prop.getProperty("work_exper_State_Dd"),
				"Employee_Creation_Form_work_exper_State_Dd", 40);
	}

	public void employeeCreationFormworkexperCityDd() {
		enter(Employee_Creation_Form_work_exper_City_Dd, prop.getProperty("work_exper_City_Dd"),
				"Employee_Creation_Form_work_exper_City_Dd", 40);
	}

	public void employeeCreationFormworkexperZipInput() {
		enter(Employee_Creation_Form_work_exper_Zip_Input, prop.getProperty("work_exper_Zip_Input"),
				"Employee_Creation_Form_work_exper_Zip_Input", 40);
	}

//	Action repository of third section -->"work experience" employee creation form field  --> checklist of Same_As_Current

	public void employeeCreationFormworkexperSameAsCurrentCb() {
		click(Employee_Creation_Form_work_exper_Same_As_Current_Cb,
				"Employee_Creation_Form_work_exper_Same_As_Current_Cb", 40);
	}

//	Action repository of four section -->"Bank Name" employee creation form field  

	public void employeeCreationFormBankNamePaymentTypeDd() {
		enter(Employee_Creation_Form_Bank_Name_Payment_Type_Dd, prop.getProperty("Bank_Name_Payment_Type_Dd"),
				"Employee_Creation_Form_Bank_Name_Payment_Type_Dd", 40);
	}

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
		enter(Employee_Creation_Form_Qualification_Diploma_Name_Dd, prop.getProperty("Qualification_Diploma_Name_Dd"),
				"Employee_Creation_Form_Qualification_Diploma_Name_Dd", 40);
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
		enter(Employee_Creation_Form_WE_From_Date_Calendar, prop.getProperty("WE_From_Date_Calendar"),
				"Employee_Creation_Form_WE_From_Date_Calendar", 40);
	}

	public void employeeCreationFormWETODateCalendar() {
		enter(Employee_Creation_Form_WE_TO_Date_Calendar, prop.getProperty("WE_TO_Date_Calendar"),
				"Employee_Creation_Form_WE_TO_Date_Calendar", 40);
	}
}
