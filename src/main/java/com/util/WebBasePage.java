package com.util;

import static com.reporting.ComplexReportFactory.getTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//get excel 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class WebBasePage extends WaitStatement {

	public WebDriver driver;
//	public static Logger logger;
	private String pageName;

	public WebBasePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
//		logger = Logger.getLogger(pageName);
	}

	public void open(String url) {
		driver.get(url);
		getTest().log(LogStatus.PASS, "Url opened - " + url);
//		logger.info("Url opened - " + url);
	}

//	simple enter
	public void enter(WebElement ele, String value, String name, int duration) {
		try {
			staticWait(1000);
			WebElement element = findElementVisibility(ele, duration);
			staticWait(800);
//			JavascriptExecutor js=(JavascriptExecutor) driver;       
//		    String	enterTestData= prop.getProperty("enterName");
//		    WebElement el = ele;
//			js.executeScript("document.getElement"+el+".value=enterTestData");  
//			js.executeScript("argument.[0].value="+enterTestData+","+el+"");  
//			jse.executeScript("arguments[0].scrollIntoView();", element);
			element.clear();
			element.click();
			element.sendKeys(value);
			getTest().log(LogStatus.PASS, name + " entered with value - " + value);
//			logger.info(name + " entered with value - " + value);
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL,
					pageName + name + " not entered with value - " + value + ", error exist - " + e);
//			logger.info(name + " not entered with value - " + value + ", error exist - " + e);

//			screenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail("" + e);

			e.printStackTrace();
		}
	}

//	enter force value
	public void enterForceValueDd(WebElement ele, String value, String name, int duration, int ClickArrowBtnTime) {
		try {
			WebElement element = findElementVisibility(ele, duration);
			staticWait(600);

			element.clear();

			Actions action = new Actions(driver);
			action.moveToElement(element).click();
			action.sendKeys(value);
			action.build().perform();
			for (int r = 0; r < ClickArrowBtnTime; ClickArrowBtnTime--) {
				staticWait(7000);
				element.sendKeys(Keys.ARROW_DOWN);
			}
			staticWait(500);
			element.sendKeys(Keys.ENTER);
			getTest().log(LogStatus.PASS, name + " entered with value - " + value);
//			logger.info(name + " entered with value - " + value);
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL,
					pageName + name + " not entered with value - " + value + ", error exist - " + e);
//			logger.info(name + " not entered with value - " + value + ", error exist - " + e);

//			screenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());
			Assert.fail("" + e);

			e.printStackTrace();
		}
	}

//	calendar setting config

	@FindBy(xpath = "(//button[@class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButtonBase-root MuiPickersToolbarButton-toolbarBtn css-qgn502-MuiButtonBase-root-MuiButton-root'])[1]")
	private WebElement Calendar_Year_Click;

	private static final String Calendar_year_Select = "//div[contains(text(),'%s')]";

	private static final String Calendar_Month_select = "//div[contains(text(),'%s')]";

	private static final String Calendar_Date_Select = "//p[contains(text(),'%s')]";

//	 calendar ok button
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/button[2]/span[1]")
	private WebElement Calendar_Ok_Btn;

//   calendar cancel button
	@FindBy(xpath = "(//button[@class=\"MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButtonBase-root css-qgn502-MuiButtonBase-root-MuiButton-root\"])[1]")
	private WebElement Calendar_Cancel_Btn;

	public void calendar(WebElement ele, String name, int duration, String enterYear, String enterMonth,
			String EnterDate, int okButtonClickPress0) {
		staticWait(600);
		try {
			WebElement element = findElementVisibility(ele, duration);
			staticWait(700);
//			calendar click
			element.click();

			staticWait(300);
//			year click
			WebElement yearclick = findElementClickable(Calendar_Year_Click, 40);
			yearclick.click();

			staticWait(300);
//			year select
			String year = String.format(Calendar_year_Select, enterYear);
			driver.findElement(By.xpath(year)).click();

			staticWait(300);
//          month select            
			String month = String.format(Calendar_Month_select, enterMonth);
			driver.findElement(By.xpath(month)).click();

			staticWait(300);
//			date select 
			String date = String.format(Calendar_Date_Select, EnterDate);
			driver.findElement(By.xpath(date)).click();

			staticWait(300);
			if (okButtonClickPress0 == 0) {
//			ok btn click
				WebElement okBtnClick = findElementClickable(Calendar_Ok_Btn, 10);
				okBtnClick.click();
			} else {
				WebElement cancelBtn = findElementClickable(Calendar_Cancel_Btn, 10);
				cancelBtn.click();
			}

			getTest().log(LogStatus.PASS, name + " entered with value" + " = " + " year- " + enterYear + " Month- "
					+ enterMonth + " Date- " + EnterDate);
//			logger.info(name + " entered with value - " + value);

		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, pageName + name + " not entered with value - " + ", error exist - " + e);
//			logger.info(name + " not entered with value - " + value + ", error exist - " + e);

//			screenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail("" + e);
		}
	}

//	click focus move according to click
	public void click(WebElement ele, String name, int timeout) {
		try {
			WebElement element = findElementVisibility(ele, timeout);
			staticWait(1000);
			if (element != null) {
				try {

					element.click();
					getTest().log(LogStatus.PASS, name + " clicked");
//					logger.info(name + " clicked ");
				} catch (Exception e) {
					getTest().log(LogStatus.FAIL, pageName + name + " not clicked " + e);
//					logger.info(name + " not clicked");

//				screenshot screen
					takeScreenshot(new Object() {
					}.getClass().getEnclosingMethod().getName());

					Assert.fail(name + " -  element not clickable");
				}
			} else {
				getTest().log(LogStatus.FAIL, pageName + name + " not clicked ");
//				logger.info(name + " not clicked");

//			takescreenshot function
				takeScreenshot(new Object() {
				}.getClass().getEnclosingMethod().getName());

				Assert.fail(name + " -  element not clikabke");
			}
		} catch (

		Exception e) {
			getTest().log(LogStatus.FAIL, "Error Occurred. " + e);
//			logger.info("Error Occurred. " + e);

//			takescreenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			e.printStackTrace();

			Assert.fail("" + e);
		}
	}

//	get current url
	public String getCurrentUrl(String url, String name) {
		staticWait(9000);
		String getUrl = driver.getCurrentUrl();
		if (getUrl.startsWith(url)) {
			getTest().log(LogStatus.PASS, name + " :-pass Url is ::" + getUrl);
//			logger.info(name + "Url is ::  - " + getUrl);
		} else {
			getTest().log(LogStatus.FAIL, name + " :-Fail Url is ::" + getUrl);
//			logger.info(name + "Url is ::  - " + getUrl);

//	 		takescreenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail(name + "Url not matched");
		}
		return url;
	}

	public void pageRefresh(String name) {
		staticWait(500);
		driver.navigate().refresh();
		String pageTitle = driver.getTitle();
		staticWait(3000);
//		logger.info(pageTitle + "Page is" + name);
	}

	public void pageNavigate(String pageUrl, String name) {
		driver.navigate().to(pageUrl);
//		logger.info("Page Url is :: " + pageUrl + name);
	}

//	dynamic xpath create
	public WebElement getTextByXpath(String xpathFormat, String xpathText, String name) {
		staticWait(1000);
		WebElement fullNameInput = null;
		try {
			String xpath = String.format(xpathFormat, xpathText);
			fullNameInput = driver.findElement(By.xpath(xpath));
			getTest().log(LogStatus.PASS, xpathText + " is successfully displayed");
		} catch (Exception e) {
			e.printStackTrace();
			getTest().log(LogStatus.FAIL, xpathText + "is not successfully displayed");
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());
//		logger.debug("Success message is not displayed");
			Assert.fail(name);
		}
		return fullNameInput;
	}

//  get text from xpath verify give message	
	public String verifySuccessMessage(WebElement ele, String messageToVerify, String name, int timeout) {
		staticWait(100);
		String updateSuccessMsg = null;
		try {
			WebElement element = findElementVisibility(ele, timeout);
//			 element = findElementsVisibility((by));
			updateSuccessMsg = getText(element, "message", 1000);

			staticWait(500);

			Actions action = new Actions(driver);
			action.moveToElement(element);

//			javascript action of 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);

			staticWait(800);
//			logger.debug("Validation message is :: " + updateSuccessMsg);
			if (updateSuccessMsg.equalsIgnoreCase(messageToVerify)) {
				getTest().log(LogStatus.PASS, name + " :--updateSucessmessage-->> " + updateSuccessMsg
						+ " :-- messageToVerify -->>  " + messageToVerify + "  is successfully displayed");
			} else {
				getTest().log(LogStatus.FAIL, name + " :--updateSucessmessage-->> " + updateSuccessMsg
						+ " :-- messageToVerify -->>  " + messageToVerify + " is not successfully displayed");

//				takescreenshot function
				takeScreenshot(new Object() {
				}.getClass().getEnclosingMethod().getName());
//				logger.debug("Success message is not displayed");
				Assert.fail("successMessage");

//				takescreenshot function

				updateSuccessMsg = "";
			}
		} catch (Exception e) {
			getTest().log(LogStatus.ERROR, "Success message is not successfully displayed");

//			takescreenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());
//				logger.debug("Success message is not displayed");

			Assert.fail("successMessage");
			e.printStackTrace();
//				takescreenshot function

		}
		return updateSuccessMsg;

	}

//	alert message handle
	public String AlertMessage(WebElement ele, String messageToVerify, String name, int timeout) {
		staticWait(100);
		String updateSuccessMsg = null;
		try {
			WebElement element = findElementVisibility(ele, timeout);
//			 element = findElementsVisibility((by));
			updateSuccessMsg = getText(element, "message", 1000);

			staticWait(500);

//			logger.debug("Validation message is :: " + updateSuccessMsg);
			if (updateSuccessMsg.equalsIgnoreCase(messageToVerify)) {
				getTest().log(LogStatus.PASS, name + " :--updateSucessmessage-->> " + updateSuccessMsg
						+ " :-- messageToVerify -->>  " + messageToVerify + "  is successfully displayed");
			} else {
				getTest().log(LogStatus.FAIL, name + " :--updateSucessmessage-->> " + updateSuccessMsg
						+ " :-- messageToVerify -->>  " + messageToVerify + " is not successfully displayed");

//				takescreenshot function
				takeScreenshot(new Object() {
				}.getClass().getEnclosingMethod().getName());
//				logger.debug("Success message is not displayed");
				Assert.fail("successMessage");

//				takescreenshot function

				updateSuccessMsg = "";
			}
		} catch (Exception e) {
			getTest().log(LogStatus.ERROR, "Success message is not successfully displayed");

//			takescreenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());
//				logger.debug("Success message is not displayed");

			Assert.fail("successMessage");
			e.printStackTrace();
//				takescreenshot function

		}
		return updateSuccessMsg;

	}

	public String getText(final WebElement ele, String name, int timeout) {
		try {
			WebElement element = findElementVisibility(ele, timeout);
			String getText = element.getText();
			getTest().log(LogStatus.PASS, " Text displayed is  - " + getText);
//			logger.info(" Text displayed is  = " + getText);
			return getText;
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, "Error Occurred. " + e);
//			logger.info("Error Occurred. " + e);

//			takescreenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail("" + e);
			return null;
		}
	}

	public String getCssValue(final WebElement ele, String CssValue, String expectedValue, int timeout, String name) {
		WebElement element = findElementVisibility(ele, timeout);
		String getCssValue = element.getCssValue(CssValue);
		if (getCssValue.equals(expectedValue)) {
			getTest().log(LogStatus.PASS, " Text displayed is  - " + getCssValue);
//			logger.info(" CSS value is  - " + getCssValue);
			return getCssValue;
		} else {
			getTest().log(LogStatus.FAIL, "Error Occurred. ");
			// ogger.info("\"Error while getting Css value");

//			takescreenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail("Error while getting Css value");

		}
		return null;
	}

	public void staticWait(long time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {

		}
	}

	public String getAtribute(final WebElement element, String tag, int time) {
		try {
			WebElement ele = findElementVisibility(element, time);
			String getText;
			getText = ele.getAttribute(tag);
			// logger.info(" get attribute value is - " + getText);
			return getText;
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, "Error Occurred. " + e);
//			logger.info("Error Occurred. " + e);

//			takescreenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());
			Assert.fail("" + e);
			return null;
		}
	}

	public void selectValueWithValue(final WebElement element, String value, String name, int time) {
		WebElement ele = findElementVisibility(element, time);
		if (ele != null) {
			Select se = new Select(ele);
			se.selectByValue(value);
			getTest().log(LogStatus.PASS, name + " selected with value - " + value);
		} else {
			getTest().log(LogStatus.FAIL, name + " not selected with value - " + value);
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());
		}
	}

	/*
	 * public void selectValueWithText(final By by, String value, String name, int
	 * time) { staticWait(200); WebElement ele = findElementPresence(by, time);
	 * JavascriptExecutor jse = (JavascriptExecutor) driver;
	 * jse.executeScript("arguments[0].scrollIntoView();", by); staticWait(200); if
	 * (by != null) { Select se = new Select((WebElement) by);
	 * se.selectByVisibleText(value); getTest().log(LogStatus.PASS, name +
	 * " selected with value - " + value); } else { getTest().log(LogStatus.FAIL,
	 * name + " not selected with value - " + value); // Assert.fail(name +
	 * " -  element not present"); } }
	 */

	public String getUrl() {
		return driver.getCurrentUrl();
	}

	public void takeScreenshot(String name) {

//		String imagePath = System.getProperty("user.dir") + "\\reports\\" + name + "_"
//				+ new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		String imagePath = System.getProperty("user.dir") + "/reports/" + name + "_"
				+ new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(imagePath + ".png"));
			System.out.println(imagePath + ".png");
		} catch (Exception e) { //
			getTest().log(LogStatus.FAIL, getTest().addScreenCapture(imagePath + ".png"));

			Assert.fail("Error while taking screenshot - " + e);

		}
		getTest().log(LogStatus.FAIL, getTest().addScreenCapture(imagePath + ".png"));

	}

	public void clickByJavascript(WebElement ele, String name, int time) {
		staticWait(2000);
		try {
			WebElement element = findElementVisibility(ele, time);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			getTest().log(LogStatus.PASS, name + " click by JS");
			// logger.info(name + " clicked ");
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, "Error Occurred. " + e);
			// logger.info("Error Occurred. " + e);

//			takescreenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());
		}
	}

	public void hover(final WebElement element, String name, int time) {
		staticWait(500);
		WebElement ele = findElementVisibility(element, time);
		try {
			if (ele != null) {
				Actions action = new Actions(driver);
				action.moveToElement(ele).perform();
				getTest().log(LogStatus.PASS, "Hover Is performed");

			} else {
				getTest().log(LogStatus.FAIL, "Hover not performed");
				takeScreenshot(new Object() {
				}.getClass().getEnclosingMethod().getName());

			}
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, "Hover not performed" + e);
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());
			Assert.fail("" + e);

		}

	}

	public boolean toCheckElementIsDisplayed(final WebElement element, int time, String name) {

		boolean isElementPresent = false;
		WebElement ele = findElementVisibility(element, time);

		try {
			isElementPresent = ele.isDisplayed();
			if (isElementPresent) {

				getTest().log(LogStatus.PASS, " is  " + name + "  Element Present?  - " + isElementPresent);
				// logger.info(" is" + name + "Element Present ? - " + isElementPresent);
			}
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, " is " + name + "  Element not Present ?  - " + isElementPresent);
			// logger.info(" is" + name + "Element Present ? - " + isElementPresent);
//			takeScreenshot("Element is not displayed");

//			screenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail("" + isElementPresent);
		}
		return isElementPresent;
	}

	public void xyz(WebElement ok) {
		WebElement truecheck = findElementVisibility(ok, 0);
		if (truecheck.isDisplayed()) {
			truecheck.click();
		} else {
			System.out.println("yurjr");
		}
	}

	public String gettextByJSexecuter(By by, String name, Duration time) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(by);
		jse.executeScript("return arguments[0].text", element);
		return element.getText();
	}

	public void verifyMultiSelectValues(By by, String messageToVerify, Duration time) {

		// Selecating the multi-select element by locating its id
		Select select = new Select(driver.findElement(by));

		// Get the list of all the options
		System.out.println("The dropdown options are -");

		List<WebElement> options = select.getOptions();

		for (WebElement option : options)
			System.out.println(option.getText());

		// Using isMultiple() method to verify if the element is multi-select, if yes go
		// onto next steps else eit
		if (select.isMultiple()) {

			// Selecting option as 'Opel'-- ByIndex
			System.out.println("Select option Opel by Index");
			select.selectByIndex(1);

			select.selectByIndex(2);

			// Get the list of selected options
			System.out.println("The selected values in the dropdown options are -");

			List<WebElement> selectedOptions = select.getAllSelectedOptions();

			for (WebElement selectedOption : selectedOptions)
				System.out.println(selectedOption.getText());

		}
	}

	public void verifyCharactersLength(int actualCharacters, int charactersToCheck, String name) {
		if (charactersToCheck == actualCharacters) {
			getTest().log(LogStatus.PASS, "Actual characters length is :: " + actualCharacters);
//			logger.info(name + "::" + actualCharacters);
		} else {
			getTest().log(LogStatus.FAIL, "characters to check is :: " + charactersToCheck);
//			logger.info(name + "::" + charactersToCheck);
			takeScreenshot("VerifyCharactersValidation");
			Assert.fail("VerifyCharactersValidation");
		}
	}

//	random name genarator

	public String nameGenerator() {
		staticWait(100);
		String givenName = "";
		// Date time formatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMddHHmmss");
		// Local Date
		LocalDateTime now = LocalDateTime.now();

		String today = dtf.format(now);
		String[] name = today.split("");

		String[] names = new String[10];
		for (int i = 0; i < name.length; i++) {
			switch (name[i]) {
			case "0":
				names[i] = "A";
				break;
			case "1":
				names[i] = "B";
				break;
			case "2":
				names[i] = "C";
				break;
			case "3":
				names[i] = "D";
				break;
			case "4":
				names[i] = "F";
				break;
			case "5":
				names[i] = "G";
				break;
			case "6":
				names[i] = "H";
				break;
			case "7":
				names[i] = "J";
				break;
			case "8":
				names[i] = "K";
				break;
			case "9":
				names[i] = "L";
				break;
			default:
				names[i] = "Z";
				break;
			}
		}
		givenName = String.join("", names);
//		logger.info("Name generated is " + givenName);
		return givenName;

	}

//	random number generator

	public String numberGenerator(int limit) {
		staticWait(100);

		Random random = new Random();
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < limit; i++) {
			int randomNumber;
			if (i == 0) {
				// Generate a random number between 1 and 9 for the first digit
				randomNumber = 1 + random.nextInt(9);
			} else {
				// Generate a random number between 0 and 9 for the remaining digits
				randomNumber = random.nextInt(10);
			}
			builder.append(randomNumber);
		}

		return builder.toString();
	}

//	list search 

	public void listSearch(WebElement ele, String name, String compareText, int duration, String xpathExpression) {
		try {
			WebElement element = findElementVisibility(ele, duration);
			staticWait(2000);

			List<WebElement> elementList = element.findElements(By.xpath(xpathExpression));

			staticWait(2000);
			for (WebElement elementget : elementList) {
				// assuming the value you want to compare is the element's text
				staticWait(500);
				String elementValue = elementget.getText();
				if (elementValue.equalsIgnoreCase(compareText)) {
					getTest().log(LogStatus.PASS,
							name + " :-- Equal value of compare- " + compareText + " :-- Search value " + elementValue);
				} else {
					getTest().log(LogStatus.PASS, name + " :-- Not Equal value of compare- " + compareText
							+ " :-- Search value " + elementValue);
				}
			}
//			logger.info(name + " entered with value - " + value);
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, pageName + name + " not entered with value - " + ", error exist - " + e);
//			logger.error(name + " not entered with value - " + value + ", error exist - " + e);

//			screenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail("" + e);
		}
	}

//  UNIQUE RECORD 
	public void uniqueRecord(WebElement ele, String name, String compareText, int duration, String xpathExpression) {
		try {
			int count = 0;
			WebElement element = findElementVisibility(ele, duration);
			staticWait(2000);

			List<WebElement> elementList = element.findElements(By.xpath(xpathExpression));

			staticWait(2000);
			for (WebElement elementget : elementList) {
				// assuming the value you want to compare is the element's text
				staticWait(500);
				String elementValue = elementget.getText();
				System.out.println(elementValue);

				if (elementValue.equalsIgnoreCase(compareText)) {
					if (count == 0) {
						getTest().log(LogStatus.PASS, name + " :-- Equal value of compare- " + compareText
								+ " :-- Search value " + elementValue);
					} else {
						getTest().log(LogStatus.FAIL,
								name + " :-- Mutiple create - " + compareText + " :-- Duplicate record" + elementValue);
//						screenshot function
						takeScreenshot(new Object() {
						}.getClass().getEnclosingMethod().getName());
					}
					count++;
				} else {
//					getTest().log(LogStatus.PASS, name + " :-- Not Equal value of compare- " + compareText
//							+ " :-- Search value " + elementValue);
				}
			}
//			logger.info(name + " entered with value - " + value);
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, pageName + name + " not entered with value - " + ", error exist - " + e);
//			logger.info(name + " not entered with value - " + value + ", error exist - " + e);

//			screenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail("" + e);
		}

	}

	public void ArrowBtnPageNavigate(WebElement ArrowBtnClick, int startRange, int endRange, int pageCount,
			String Component, int Timeout) {

		staticWait(1000);
		WebElement element = findElementVisibility(ArrowBtnClick, Timeout);

		// Variable of first split contains 1-25 of 278

		int currentPage = 1;
		try {
//		count number of employees 
			while (currentPage <= pageCount) {

				// Clicking on the arrow button to go to the next page
				if (element.isDisplayed() && element.isEnabled()) {

					int listsize;

//				variable of element in employee directory
					int list = 1;
					for (listsize = startRange; listsize <= endRange; listsize++) {

						WebElement componentxpath = getTextByXpath(Component, String.valueOf(list).toString(),
								Component);

//					javascript action of 
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("arguments[0].scrollIntoView();", componentxpath);
						findElementVisibility(componentxpath, Timeout);
						list++;
					}

					click(element, "Page Navigate Arrow click", 40);
					staticWait(500);
					getTest().log(LogStatus.PASS, "currentpage" + currentPage);

				} else {
					// Stop if the next button is not visible
					System.out.println("Breaked as no more next page----");
					break;
				}
				currentPage++;
			}
		} catch (Exception e) {

//	screenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail("" + e);

			e.printStackTrace();
		}
	}

	public void checkbox(String checkboxxpath, int isChecked) {
		List<WebElement> checkboxes = driver.findElements(By.xpath(checkboxxpath));
try {
		for (WebElement checkbox : checkboxes) {

			switch (isChecked) {
//			not check actions --> than check actions
			case 0: {
				if (!checkbox.isSelected()) {
					checkbox.click();
					getTest().log(LogStatus.PASS, "currentpage  :--" + checkboxxpath);

				} else {
					System.out.println("checkbox is already select");
					takeScreenshot(new Object() {
					}.getClass().getEnclosingMethod().getName());
				}
				break;
			}
//			check actions -- > uncheck action checkbox
			case 1: { 	
				if (checkbox.isSelected()) {
					checkbox.click();
					getTest().log(LogStatus.PASS, "currentpage :---" + checkboxxpath);

				} else {
					System.out.println("checkbox is already select");
					takeScreenshot(new Object() {
					}.getClass().getEnclosingMethod().getName());
				}
				break;
			}
			}
		}}catch(Exception e) {
			e.printStackTrace();
		}
	}
// excel files upload

	public void uploadExcelFiles(String xpath, String sourcefile) {
		try {
			WebElement upload_file = driver.findElement(By.xpath(xpath));
			upload_file.sendKeys(System.getProperty("user.dir") + sourcefile);
			getTest().log(LogStatus.PASS, sourcefile + " file upload sucessfully ::");

		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, sourcefile + " file upload FAIL ::" + e);
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail("" + e);
		}
	}

	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;

	public void writeDatafileClass(String excelpath, int sheet_index, int sheet_row, int cell_index,
			String setcell_value) {
		try {
			// Input excel file
			String path = System.getProperty("user.dir") + excelpath;
			File file = new File(path);

			if (!file.exists()) {
				throw new FileNotFoundException("Excel file not found: " + path);
			}

			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			int numberOfSheets = wb.getNumberOfSheets();
			if (sheet_index < 0 || sheet_index >= numberOfSheets) {
				throw new IllegalArgumentException("Invalid sheet index: " + sheet_index);
			}

			sheet = wb.getSheetAt(sheet_index);

			row = sheet.getRow(sheet_row);
			if (row == null) {
				row = sheet.createRow(sheet_row);
			}

			cell = row.getCell(cell_index);
			if (cell == null) {
				cell = row.createCell(cell_index);
			}

			cell.setCellValue(setcell_value);

			// Output excel file
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);

			fos.close();
			fis.close();
			wb.close();
			getTest().log(LogStatus.PASS, " --: Data while write in excel file ::");

		} catch (Exception e) {
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());
			getTest().log(LogStatus.FAIL, e + " --: Error while write in excel file ::");

		}

	}

	public void mutipleClick(WebElement ele, String testcasename, int timeout) {

		WebElement click = findElementVisibility(ele, timeout);

		int count = 0;
		try {
			while (click.isDisplayed()) {
				try {
					Actions action = new Actions(driver);
					action.moveToElement(click).build().perform();
					if (count == 0) {
						click.click();
						getTest().log(LogStatus.PASS, testcasename + " --: Btn is click only ::");
					} else if (count <= 5) {
						click.click();
						getTest().log(LogStatus.FAIL, testcasename + " --: Mutiple click on Btn ::");
//			take screenshot
						takeScreenshot(new Object() {
						}.getClass().getEnclosingMethod().getName());
					} else {
						break;
					}
				} catch (Exception e) {
//					getTest().log(LogStatus.FAIL, testcasename + " --: Element is not found::- " + e);
//			take screenshot
//					takeScreenshot(new Object() {
//					}.getClass().getEnclosingMethod().getName());
					break;
				}
				count++;
			}
		} catch (Exception e) {
			if (count == 0) {
				getTest().log(LogStatus.FAIL, testcasename + " --: Btn is not found for first time::- " + e);
				takeScreenshot(new Object() {
				}.getClass().getEnclosingMethod().getName());
			}
		}
	}

	public String split(String wordSpilt, String spiltSyntax, int lengthOfSplit, int text) {
		String[] sentence = wordSpilt.split(spiltSyntax);
		String test = "";
		if (sentence.length >= lengthOfSplit) {
			String first = sentence[text];
			test = first;
		}
		return test;
	}

}
