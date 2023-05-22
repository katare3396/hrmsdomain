package com.hrms.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hrms.pageobject.EmployeesDirectoryPageObject;

public class EmployeesDirectoryActions {

	private static EmployeesDirectoryActions INSTANCE;
	private WebDriver driver;
	private EmployeesDirectoryPageObject employeesdirectorypageObject;

	private EmployeesDirectoryActions(WebDriver driver) {
		this.driver = driver;
		this.employeesdirectorypageObject = new EmployeesDirectoryPageObject(driver);
	}

	// Singleton Design Pattern for single Instance
	public static EmployeesDirectoryActions getInstance(WebDriver driver) {
		if (INSTANCE == null) {
			INSTANCE = new EmployeesDirectoryActions(driver);
		}

		return INSTANCE;
	}

//	page visible

	public void employeeDirectoryPageVisible() {
		employeesdirectorypageObject.employeeDirectorypageVisible();
	}

//	Employee directory clcik

	public void employeesDirectoryClick() {
		employeesdirectorypageObject.employeesDirectoryClick();
	}

//	employee directory current url

	public void employeeDirectoryGetCurrentUrl() {
		employeesdirectorypageObject.getCurrentUrlToCrossVerify();
	}

//	create employee manually

	public void createEmployeeManually() {
		employeesdirectorypageObject.createNewBtnClick();
		employeesdirectorypageObject.addManuallyClick();
	}

//	save btn while create employee

	public void EmployeeDirectoryCreateSaveBtnClick() {
		employeesdirectorypageObject.saveBtnEmployeeCreationFormDd();
	}

//	success message that employee is create 

	public void sucessMessageCreateEmployee() {

//		success message that employee is create 
		employeesdirectorypageObject.employeeCreationSuceessMessage();
	}

//	  refresh page

	public void employeeDirectoryRefreshpage() {

//      refresh page of employee directory
		employeesdirectorypageObject.employeeDirectoryRefreshPage();
	}

//	search employee

	public void employeeDirectorySearchBoxText() {
		employeesdirectorypageObject.employeeDirectorySearchBoxText();

	}

//	 list employee
	public void employeeDirectoryEmployeeList() {
		employeesdirectorypageObject.employeeDirectoryEmployeeeList();
	}

//	first section -->"personal detail"  employee creation form field

	public void employeeCreationFirstSectionFormPersonalDetail() {

//		name generation
		employeesdirectorypageObject.employeeCreationFormFullNameInput();

		employeesdirectorypageObject.employeeCreationFormGenderDd();

		employeesdirectorypageObject.employeeCreationFormJoiningDateCalendar();

		employeesdirectorypageObject.employeeCreationFormMaritalStatusDd();

		employeesdirectorypageObject.employeeCreationFormDateOfMarriagecalendar();

		employeesdirectorypageObject.employeeCreationFormDateOfBirthCalendar();

		employeesdirectorypageObject.employeeCreationFormNationalityDd();
//		mobile generation
		employeesdirectorypageObject.employeeCreationFormMOBILENUMBEREnter();
//		personal generating
		employeesdirectorypageObject.employeeCreationFormPersonalEmailIDEnter();
//		adhaar generating 
		employeesdirectorypageObject.employeeCreationFormAadharCardEnter();

		employeesdirectorypageObject.employeeCreationFormBloodGroupDd();

	}

//	mandatory first section(employee name , joining date ,DOB, Mrriage is not fill) -->"personal detail"  employee creation form field

	public void employeeCreationFirstSectionMandatoryFormPersonalDetail() {

		// mandatory field of employee name not fill
		employeesdirectorypageObject.employeeCreationFormMandatoryFullNameInput();

		employeesdirectorypageObject.employeeCreationFormGenderDd();

		// mandatory field joining name not fill
		employeesdirectorypageObject.employeeCreationFormmandatoryJoiningDateCalendar();
		employeesdirectorypageObject.employeeCreationFormMaritalStatusDd();

		// mandatory filed marriage Date not fill
		employeesdirectorypageObject.employeeCreationFormMandatoryDateOfMarriagecalendar();

		// mandatory field DOB not fill
		employeesdirectorypageObject.employeeCreationFormMandatoryDateOfBirthCalendar();

		employeesdirectorypageObject.employeeCreationFormNationalityDd();

		employeesdirectorypageObject.employeeCreationFormMOBILENUMBEREnter();

		employeesdirectorypageObject.employeeCreationFormPersonalEmailIDEnter();

		employeesdirectorypageObject.employeeCreationFormManadatoryAadharCardEnter();
		employeesdirectorypageObject.employeeCreationFormBloodGroupDd();

	}

//	mandatory first section (where joining date,Dob,Marriage date is not filled) -->"personal detail"  employee creation form field

	public void employeeCreationFirstSectionMandatoryJoiningDateNotFillFormPersonalDetail() {

		// generated employee name
		employeesdirectorypageObject.employeeCreationFormFullNameInput();

		employeesdirectorypageObject.employeeCreationFormGenderDd();

		// mandatory field joining name not fill
		employeesdirectorypageObject.employeeCreationFormmandatoryJoiningDateCalendar();
		employeesdirectorypageObject.employeeCreationFormMaritalStatusDd();

		// mandatory filed marriage Date not fill
		employeesdirectorypageObject.employeeCreationFormMandatoryDateOfMarriagecalendar();

		// mandatory field DOB not fill
		employeesdirectorypageObject.employeeCreationFormMandatoryDateOfBirthCalendar();

		employeesdirectorypageObject.employeeCreationFormNationalityDd();

		employeesdirectorypageObject.employeeCreationFormMOBILENUMBEREnter();

		employeesdirectorypageObject.employeeCreationFormPersonalEmailIDEnter();

		employeesdirectorypageObject.employeeCreationFormAadharCardEnter();
		
		employeesdirectorypageObject.employeeCreationFormBloodGroupDd();

	}

//	second section -->"detail" employee creation form field

	public void employeeCreationSecondSectionFormWorkDetail() {

//		empcode generating
		employeesdirectorypageObject.employeeCreationFormdetailEmployeeCodeInputString();
		employeesdirectorypageObject.employeeCreationFormdetailEmployeeCodeInput();

		employeesdirectorypageObject.employeeCreationFormdetailLeaveRuleDd();

		employeesdirectorypageObject.employeeCreationFormdetailReportingManagerDd();

		employeesdirectorypageObject.employeeCreationFormdetailShiftDd();

		employeesdirectorypageObject.employeeCreationFormdetailDepartmentDd();

		employeesdirectorypageObject.employeeCreationFormdetailDesignationDd();

		employeesdirectorypageObject.employeeCreationFormdetailEmployeeTypeDd();

		employeesdirectorypageObject.employeeCreationFormdetailLocation_Dd();
//  mandatory filed
		employeesdirectorypageObject.employeeCreationFormdetailOfficialEmailIDInputString();
		employeesdirectorypageObject.employeeCreationFormdetailOfficialEmailIDInput();

		employeesdirectorypageObject.employeeCreationFormdetailEmployeeStatusDd();

		employeesdirectorypageObject.employeeCreationFormDetailCompanyDd();

	}
//	mandatory second section -->"detail" employee creation form field

	public void employeeCreationSecondSectionMandatoryFormWorkDetail() {
		employeesdirectorypageObject.employeeCreationFormdetailEmployeeCodeInput();
		
		employeesdirectorypageObject.employeeCreationFormdetailLeaveRuleDd();
		
		employeesdirectorypageObject.employeeCreationFormdetailReportingManagerDd();
		
		employeesdirectorypageObject.employeeCreationFormdetailShiftDd();
		
		employeesdirectorypageObject.employeeCreationFormdetailDepartmentDd();
		
		employeesdirectorypageObject.employeeCreationFormdetailDesignationDd();
		
		employeesdirectorypageObject.employeeCreationFormdetailEmployeeTypeDd();
		
		employeesdirectorypageObject.employeeCreationFormdetailLocation_Dd();
		
		employeesdirectorypageObject.employeeCreationFormdetailOfficialEmailIDInputString();
		
		employeesdirectorypageObject.employeeCreationFormdetailOfficialEmailIDInput();
		
		employeesdirectorypageObject.employeeCreationFormdetailEmployeeStatusDd();
		
		employeesdirectorypageObject.employeeCreationFormMandatoryDetailCompanyDd();

	}

//	 third section -->"Address" employee creation form field

	public void employeeCreationThreeSectionFormAddress() {

//		generating 
//		employeesdirectorypageObject.employeeCreationFormAddressCurrentAddress1TextString();
		employeesdirectorypageObject.employeeCreationFormAddressCurrentAddress1Text();
//		generating
//		employeesdirectorypageObject.employeeCreationFormAddressCurrentAddress2TextString();
		employeesdirectorypageObject.employeeCreationFormAddressCurrentAddress2Text();

		employeesdirectorypageObject.employeeCreationFormAddressCountryDd();

		employeesdirectorypageObject.employeeCreationFormAddressStateDd();

		employeesdirectorypageObject.employeeCreationFormAddressCityDd();
//      Generating
		employeesdirectorypageObject.employeeCreationFormAddressZipInput();

		employeesdirectorypageObject.employeeCreationFormAddressSameAsCurrentCb();

	}

//	four section -->"Bank Name" employee creation form field 

	public void employeeCreationFourSectionFormBankDetail() {

		employeesdirectorypageObject.employeeCreationFormBankNameText();

		employeesdirectorypageObject.employeeCreationFormBankNameAccountNoText();

		employeesdirectorypageObject.employeeCreationFormBankNameIFSCcodeText();

		employeesdirectorypageObject.employeeCreationFormBankNameAccountHolderNameText();

	}

//	five section -->"Emergency Detail" employee creation form field

	public void employeeCreationFiveSectionFormemergencyDetail() {

		employeesdirectorypageObject.employeeCreationFormEmergencyNameText();

		employeesdirectorypageObject.employeeCreationFormEmergencyRelationshipText();

		employeesdirectorypageObject.employeeCreationFormEmergencyAddressText();

		employeesdirectorypageObject.employeeCreationFormEmergencyEmailText();

		employeesdirectorypageObject.employeeCreationFormEmergencyMobileNoText();

	}

//	six section -->"Qualification" employee creation form field 

	public void employeeCreationSixSectionFormQualification() {

		employeesdirectorypageObject.employeeCreationFormQualificationDiplomaNameDd();

		employeesdirectorypageObject.employeeCreationFormQualificationInstitutionNameText();

		employeesdirectorypageObject.employeeCreationFormQualificationPassingYearText();

		employeesdirectorypageObject.employeeCreationFormQualificationPercentageText();

	}

//	seven section -->"Work Experience" employee creation form field 

	public void employeeCreationSevenSectionFormWorkExperience() {

		employeesdirectorypageObject.employeeCreationFormWEPreviousCompanyNameTxt();

		employeesdirectorypageObject.employeeCreationFormWEJobTitleTxt();

		employeesdirectorypageObject.employeeCreationFormWEFromDateCalendar();

		employeesdirectorypageObject.employeeCreationFormWETODateCalendar();

	}

//	employee create manually

	public void formOfmanuallyEmployeeCreate() {

//		employeesdirectorypageObject.selectEntityEmployeeCreationFormDd();

		employeeCreationFirstSectionFormPersonalDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationSecondSectionFormWorkDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationThreeSectionFormAddress();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationFourSectionFormBankDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationFiveSectionFormemergencyDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationSixSectionFormQualification();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

		employeeCreationSevenSectionFormWorkExperience();

//		 save btn while create employee

		EmployeeDirectoryCreateSaveBtnClick();
	}

//	employee not filled first section (full name , dob , marriage date & joining date is not fill)  mandatory filled it should get error

	public void employeeDirectoryEmployeeNotFillFirstSectionMandatoryFieldThanItShouldGetError() {

		createEmployeeManually();

		employeeCreationFirstSectionMandatoryFormPersonalDetail();

		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		error message of enter full name 
		employeesdirectorypageObject.errorMessageDisplayEnterFullNameMandatoryFullName();

//		error  message of Enter 12 Digital Adhaar Name
		employeesdirectorypageObject.errorMessgeEnter12DigitalAdhaarNameManadatoryAdhaar();

//		cancel btn
		employeesdirectorypageObject.employeeDirectoryCancelBtnClick();
	}

//	employee (not filled joining date)   mandatory filled it should get error

	public void employeeDirectoryEmployeeNotFillMandatoryFieldOfJoiningDateThanItShouldGetError() {

//		manually employee create form 

//		employeesdirectorypageObject.selectEntityEmployeeCreationFormDd();

//		first section mandatory filed are (joining date is not filled)
		employeeCreationFirstSectionMandatoryJoiningDateNotFillFormPersonalDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		second section mandatory filed ar not filled
		employeeCreationSecondSectionMandatoryFormWorkDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		three section mandatory filed ar not filled
		employeeCreationThreeSectionFormAddress();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		four section mandatory filed ar not filled
		employeeCreationFourSectionFormBankDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		five section mandatory filed ar not filled
		employeeCreationFiveSectionFormemergencyDetail();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		six section mandatory filed ar not filled
		employeeCreationSixSectionFormQualification();
		employeesdirectorypageObject.processBtnEmployeeCreationFormDd();

//		seven section mandatory filed ar not filled
		employeeCreationSevenSectionFormWorkExperience();

//		 save btn while create employee

		EmployeeDirectoryCreateSaveBtnClick();

//		pop of joining date is missing 
		employeesdirectorypageObject.Employee_Directory_joining_Date_Is_Not_Fill_Show_popup_of_Process_Btn();

//      sucess message 
		sucessMessageCreateEmployee();

	}

//	click on employee profile

	public void employeeDirectoryProfileClick() {
		employeesdirectorypageObject.employeeDirectoryProfieClick();

	}

//	get text

	public void EmployeeDirectoryGetText() {

//		first section get text

		employeesdirectorypageObject.employeeDirectoryGetTextFullName();
		employeesdirectorypageObject.employeeDirectoryGetTextGender();
		employeesdirectorypageObject.employeeDirectoryGetTextMaritalStatus();
		employeesdirectorypageObject.employeeDirectoryGetTextNationality();
		employeesdirectorypageObject.employeeDirectoryGetTextMOBILENUMBER();
		employeesdirectorypageObject.employeeDirectoryGetTextPersonalEmailID();
		employeesdirectorypageObject.employeeDirectoryGetTextAadharCard();
		employeesdirectorypageObject.employeeDirectoryGetTextBloodGroup();

//		second section get text
		employeesdirectorypageObject.employeeDirectoryGetTextLeaveRule();
		employeesdirectorypageObject.employeeDirectoryGetTextReportingManager();
		employeesdirectorypageObject.employeeDirectoryGetTextShift();
		employeesdirectorypageObject.employeeDirectoryGetTextDepartment();
		employeesdirectorypageObject.employeeDirectoryGetTextDesignation();
		employeesdirectorypageObject.employeeDirectoryGetTextEmployeeType();
		employeesdirectorypageObject.employeeDirectoryGetTextLocation();
		employeesdirectorypageObject.employeeDirectoryGetTextOfficialEmailID();
		employeesdirectorypageObject.employeeDirectoryGetTextEmployeeStatus();
		employeesdirectorypageObject.employeeDirectoryGetTextCompany();

//		three section get text
		employeesdirectorypageObject.employeeDirectoryGetTextCurrentAddress1();
		employeesdirectorypageObject.employeeDirectoryGetTextCurrentAddress2();
		employeesdirectorypageObject.employeeDirectoryGetTextCountry();
		employeesdirectorypageObject.employeeDirectoryGetTextState();
		employeesdirectorypageObject.employeeDirectoryGetTextCity();
		employeesdirectorypageObject.employeeDirectoryGetTextZip();

//		four section get text
		employeesdirectorypageObject.employeeDirectoryGetTextBankName();
		employeesdirectorypageObject.employeeDirectoryGetTextAccountNo();
		employeesdirectorypageObject.employeeDirectoryGetTextIFSCcode();
		employeesdirectorypageObject.employeeDirectoryGetTextAccountHolderName();

//		five section get text
		employeesdirectorypageObject.employeeDirectoryGetTextName();
		employeesdirectorypageObject.employeeDirectoryGetTextRelationship();
		employeesdirectorypageObject.employeeDirectoryGetTextAddress();
		employeesdirectorypageObject.employeeDirectoryGetTextEmail();
//		employeesdirectorypageObject.employeeDirectoryGetTextMobileNo();

//		six section get text
		employeesdirectorypageObject.employeeDirectoryGetTextDiplomaDegreeName();
		employeesdirectorypageObject.employeeDirectoryGetTextInstitutionName();
		employeesdirectorypageObject.employeeDirectoryGetTextPassingYear();
		employeesdirectorypageObject.employeeDirectoryGetTextPercentage();

//		seven section get text
		employeesdirectorypageObject.employeeDirectoryGetTextPreviousCompanyName();
		employeesdirectorypageObject.employeeDirectoryGetTextJobTitle();

//		employeesdirectorypageObject.employeeDirectoryGetTextsideReportingManager();

		employeesdirectorypageObject.employeeDirectoryViewClickCrossBtn();
	}

	public void employeeDiectoyarrowBthClick() {
		employeesdirectorypageObject.employeeDiectoyarrowBthClick();
	}
	
	
}
