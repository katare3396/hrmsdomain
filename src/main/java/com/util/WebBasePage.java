package com.util;

import static com.reporting.ComplexReportFactory.getTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class WebBasePage extends WaitStatement {

	public WebDriver driver;
	public static Logger logger;
	private String pageName;

	private final static String FILE_NAME = System.getProperty("user.dir") + "/src/main/resources/testdata.properties";
	private static Properties prop = new PropertiesLoader(FILE_NAME).load();

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

	public void enter(WebElement ele, String value, String name, int duration) {
		try {
			WebElement element = findElementVisibility(ele, duration);
			staticWait(200);
//			JavascriptExecutor js=(JavascriptExecutor) driver;       
//		    String	enterTestData= prop.getProperty("enterName");
//		    WebElement el = ele;
//			js.executeScript("document.getElement"+el+".value=enterTestData");  
//			js.executeScript("argument.[0].value="+enterTestData+","+el+"");  
//			jse.executeScript("arguments[0].scrollIntoView();", element);
			element.clear();
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

	public void click(WebElement ele, String name, int timeout) {
		WebElement element = findElementVisibility(ele, timeout);
		staticWait(4000);
		if (element != null) {
			try {
				element.click();
				getTest().log(LogStatus.PASS, name + " clicked");
//				logger.info(name + " clicked ");
			} catch (Exception e) {
				getTest().log(LogStatus.FAIL, pageName + name + " not clicked ");
//				logger.info(name + " not clicked");

//				screenshot screen
				takeScreenshot(new Object() {
				}.getClass().getEnclosingMethod().getName());

				Assert.fail(name + " -  element not clickable");
			}
		} else {
			getTest().log(LogStatus.FAIL, pageName + name + " not clicked ");
//			logger.info(name + " not clicked");

//			takescreenshot function
//			takeScreenshot(new Object() {
//			}.getClass().getEnclosingMethod().getName());

			Assert.fail(name + " -  element not clikabke");
		}
	}

	public String getText(final WebElement ele, String name, int timeout) {
		try {
			WebElement element = findElementVisibility(ele, timeout);
			String getText = ele.getText();
			getTest().log(LogStatus.PASS, " Text displayed is  - " + getText);
//			logger.info(" Text displayed is  - " + getText);
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
			logger.info("\"Error while getting Css value");

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
			logger.info(" get attribute value is  - " + getText);
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

		String imagePath = System.getProperty("user.dir") + "\\reports\\" + name + "_"
				+ new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(imagePath + ".png"));
			System.out.println(imagePath + ".png");
		} catch (Exception e) { //
			Assert.fail("Error while taking screenshot - " + e);
		}
		getTest().log(LogStatus.INFO, getTest().addScreenCapture(imagePath + ".png"));

	}

	public void clickByJavascript(WebElement ele, String name, int time) {
		staticWait(2000);
		try {
			WebElement element = findElementVisibility(ele, time);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			getTest().log(LogStatus.PASS, name + " click by JS");
//			logger.info(name + " clicked ");
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, "Error Occurred. " + e);
//			logger.info("Error Occurred. " + e);

//			takescreenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());
		}
	}

	public void hover(final WebElement element, String name, int time) {
		WebElement ele = findElementVisibility(element, time);
		if (ele != null) {
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
		} else {
			getTest().log(LogStatus.FAIL, "Hover not performed");
		}
	}

	public boolean toCheckElementIsDisplayed(final WebElement element, int time, String name) {

		boolean isElementPresent = false;
		WebElement ele = findElementVisibility(element, time);

		try {
			isElementPresent = ele.isDisplayed();
			if (isElementPresent) {

				getTest().log(LogStatus.PASS, " is" + name + "Element Present?  - " + isElementPresent);
				logger.info(" is" + name + "Element Present ?  - " + isElementPresent);
			}
		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, " is" + name + "  Element not Present ?  - " + isElementPresent);
			logger.info(" is" + name + "Element Present ? - " + isElementPresent);
//			takeScreenshot("Element is not displayed");

//			screenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

//			Assert.fail("" + isElementPresent);
		}
		return isElementPresent;
	}

	public String gettextByJSexecuter(By by, String name, Duration time) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(by);
		jse.executeScript("return arguments[0].text", element);
		return element.getText();
	}

	public String getCurrentUrl(String url, String name) {
		staticWait(3000);
		String getUrl = driver.getCurrentUrl();
		System.out.println(getUrl);
		if (getUrl.startsWith(url)) {
			getTest().log(LogStatus.PASS, name + "Url is ::a" + getUrl);
//			logger.info(name + "Url is ::  - " + getUrl);
		} else {
			getTest().log(LogStatus.FAIL, name + "Url is ::" + getUrl);
//			logger.info(name + "Url is ::  - " + getUrl);

//	 		takescreenshot function
			takeScreenshot(new Object() {
			}.getClass().getEnclosingMethod().getName());

			Assert.fail(name + "Url not matched");
		}
		return url;
	}

	public void pageRefresh(String name) {
		driver.navigate().refresh();
		String pageTitle = driver.getTitle();
		logger.info(pageTitle + "Page is" + name);
	}

	public void pageNavigate(String pageUrl, String name) {
		driver.navigate().to(pageUrl);
		logger.info("Page Url is :: " + pageUrl + name);
	}

	public String verifySuccessMessage(WebElement element, String messageToVerify, int timeout) {
		String updateSuccessMsg = null;
		try {
			findElementVisibility(element, timeout);
//			 element = findElementsVisibility((by));
			updateSuccessMsg = getText(element, "message", 20);
//			logger.debug("Validation message is :: " + updateSuccessMsg);
			if (updateSuccessMsg.equals(messageToVerify)) {
				getTest().log(LogStatus.PASS, updateSuccessMsg + " is successfully displayed");
			} else {
				getTest().log(LogStatus.FAIL, "Success message is not successfully displayed");
//				logger.debug("Success message is not displayed");
				Assert.fail("successMessage");

//				takescreenshot function

				takeScreenshot(new Object() {
				}.getClass().getEnclosingMethod().getName());
				updateSuccessMsg = "";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updateSuccessMsg;
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
			logger.info(name + "::" + actualCharacters);
		} else {
			getTest().log(LogStatus.FAIL, "characters to check is :: " + charactersToCheck);
			logger.info(name + "::" + charactersToCheck);
//			takeScreenshot("VerifyCharactersValidation");
//			Assert.fail("VerifyCharactersValidation");
		}
	}
}
