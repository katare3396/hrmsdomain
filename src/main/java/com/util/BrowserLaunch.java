package com.util;

import static com.reporting.ComplexReportFactory.closeReport;
import static com.reporting.ComplexReportFactory.closeTest;
import static com.reporting.ComplexReportFactory.getTest;

import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentTest;

public class BrowserLaunch {

	public WebDriver driver;

//	propertiesLoader 
	private final String FILE_NAME = System.getProperty("user.dir") + "/src/main/resources/testdata.properties";
	private Properties prop = new PropertiesLoader(FILE_NAME).load();

//	Browser launch  variable		
	private String browsers = prop.getProperty("browser");

	public ExtentTest test;
	public static Logger logger;

	@BeforeClass
	public void browserlaunch() {
		try {

//	Browser launch 
			if (browsers.equalsIgnoreCase("chrome")) {

//    headless run Chrome    true---headless mode  , false -- browser mode
				if (Boolean.parseBoolean(prop.getProperty("isHeadlessMode"))) {

					ChromeOptions option = new ChromeOptions();
					option.addArguments("headless");
					option.setHeadless(true);
					option.addArguments("window-size=1920x1000");
					option.addArguments("--disable-blink-features=AutomationControlled");
					driver = new ChromeDriver(option);
					System.out.println("Browser is opened in Headless mode.");
				} else {

					System.out.println("Browser is opened in Browser mode.");
					driver = new ChromeDriver();
				}

			} else if (browsers.equalsIgnoreCase("edge")) {

//	Edge Browser launch set property	
//		String driverPath = System.getProperty("user.dir") + "//src//main//resources//msedgedriver.exe";
//		System.out.println("driver path is :: " + driverPath);
//		System.setProperty("webdriver.edge.driver", driverPath);

//	headless run Edge    true---headless mode  , false -- browser mode
				if (Boolean.parseBoolean(prop.getProperty("isHeadlessMode"))) {
					EdgeOptions option = new EdgeOptions();
					option.addArguments("headless");
					option.setHeadless(true);
					option.addArguments("window-size=1920x1000");
					driver = new EdgeDriver(option);
					System.out.println("Browser is opened in Headless mode.");
				} else {
					System.out.println("Browser is opened in Browser mode.");
					driver = new EdgeDriver();
				}

			} else if (browsers.equalsIgnoreCase("opera")) {

//	 headless run Opera    true---headless mode  , false -- browser mode
				if (Boolean.parseBoolean(prop.getProperty("isHeadlessMode"))) {
//			OperaOptions option = new OperaOptions();
//			option.addArguments("headless");
//			option.setHeadless(true);
//			option.addArguments("window-size=1920x1000");
//			option.AddExtension("");
//			option.BinaryLocation ="";
//			driver = new OperaDriver(option);
					System.out.println("Browser is opened in Headless mode.");
				} else {
					System.out.println("Browser is opened in Browser mode.");
//					driver = new OperaDriver();

				}

			} else if (browsers.equalsIgnoreCase("firefox")) {

//     Firebox Browser launch binary location  (sessionnotaacreatedexception---error )
				String firefoxPath = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";

//	 headless run Firefox    true---headless mode  , false -- browser mode
				if (Boolean.parseBoolean(prop.getProperty("isHeadlessMode"))) {
					FirefoxOptions option = new FirefoxOptions();
					option.setBinary(firefoxPath);
					option.addArguments("--headless");
					option.addArguments("window-size=1920x1000");
					option.setBinary(firefoxPath);
					System.out.println("Browser is opened in Headless mode.");
					driver = new FirefoxDriver(option);
				} else {
					FirefoxOptions option = new FirefoxOptions();
					option.setBinary(firefoxPath);
					System.out.println("Browser is opened in Browser mode.");
					driver = new FirefoxDriver(option);
				}

			} else if (browsers.equalsIgnoreCase("safari")) {

//	     Firebox Browser launch binary location  (sessionnotaacreatedexception---error )
				String safariPath = "\"C:\\Program Files (x86)\\Safari\\\"";

//		 headless run Firefox    true---headless mode  , false -- browser mode
				if (Boolean.parseBoolean(prop.getProperty("isHeadlessMode"))) {
					SafariOptions option = new SafariOptions();
					option.setBrowserVersion(safariPath);
//				option.addArguments("--headless");
//				option.addArguments("window-size=1920x1000");
//				option.
//				System.out.println("Browser is opened in Headless mode.");
//				driver = new FirefoxDriver(option);	
				} else {
					SafariOptions option = new SafariOptions();
					option.setBrowserVersion(safariPath);
					System.out.println("Browser is opened in Browser mode.");
					driver = new SafariDriver();
				}

			} else {
// if browser is incorrect
				System.out.println("Please provide correct browser name");

			}

//		Url of Browser
			driver.get(prop.getProperty("base_Url"));
//		get use to maximize window
			driver.manage().window().maximize();
//		to delete the cookie
			driver.manage().deleteAllCookies();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@BeforeMethod()
	public void beforeMethod(Method method) {
//		logger = Logger.getLogger(method.getDeclaringClass().getSimpleName() + "-" + method.getName());
		test = getTest(method.getDeclaringClass().getSimpleName() + "-" + method.getName(), method.getName());
		System.out.println("Method Name - " + method.getDeclaringClass().getSimpleName() + "-" + method.getName());
//		logger.debug("Test Case Started " + method);
	}

	@AfterMethod(alwaysRun = true)
	public void reportWrapUp(ITestResult result, Method method) {

		if (!result.isSuccess()) {

			String imagePath = System.getProperty("user.dir") + "\\reports\\" + method.getName() + "_"
					+ new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

			// generate screenshot as a file object
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				// copy file object to designated location
				FileUtils.copyFile(scrFile, new File(imagePath + ".png"));
				System.out.println(imagePath + ".png");
				logger.info("Method - " + method.getName() + " failed , see the screenshot - " + imagePath + ".png");
			} catch (Exception e) {
				Assert.fail("Error while taking screenshot - " + e);
			}
		}
		closeTest(test);
	}

	@AfterSuite(alwaysRun = true)
	public void close() {
		closeReport();
	}

//driver close -- current window	
	@AfterClass(alwaysRun = true)
	public void driverclose() {
		driver.close();
	}

}
