package com.util;

import static com.reporting.ComplexReportFactory.closeReport;
import static com.reporting.ComplexReportFactory.closeTest;
import static com.reporting.ComplexReportFactory.getTest;

import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public WebDriver driver;

//	propertiesLoader 
	private final String FILE_NAME = System.getProperty("user.dir") + "/src/main/resources/testdata.properties";
	private Properties prop = new PropertiesLoader(FILE_NAME).load();
//	private static final Logger logger = LogManager.getLogger(BrowserLaunch.class);

//	Browser launch  variable		
	private String browsers = prop.getProperty("browser");

	public ExtentTest test;

	@BeforeClass
	public void browserlaunch() {
		try {
//			System.setProperty("log4j.configurationFile", "log4j2.xml");

//	Browser launch 
			if (browsers.equalsIgnoreCase("chrome")) {
//				logger.info("chrome browser");
				// Setup ChromeDriver using WebDriverManager
				ChromeOptions chromeOptions = new ChromeOptions();

//    headless run Chrome    true---headless mode  , false -- browser mode
				if (Boolean.parseBoolean(prop.getProperty("isHeadlessMode"))) {

					chromeOptions.addArguments("headless");
//					user can add headless mode in argument
					chromeOptions.addArguments("--headless=new");
					chromeOptions.addArguments("window-size=1920x1000");
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver(chromeOptions);
					System.out.println("Browser is opened in Headless mode.");
				} else {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					System.out.println("Browser is opened in Browser mode.");
				}

			} else if (browsers.equalsIgnoreCase("edge")) {

				// Setup ChromeDriver using WebDriverManager
				EdgeOptions edgeOptions = new EdgeOptions();

//	headless run Edge    true---headless mode  , false -- browser mode
				if (Boolean.parseBoolean(prop.getProperty("isHeadlessMode"))) {
					edgeOptions.addArguments("headless");
					edgeOptions.addArguments("--headless=new");
					edgeOptions.addArguments("window-size=1920x1000");
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver(edgeOptions);
					System.out.println("Browser is opened in Headless mode.");
				} else {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					System.out.println("Browser is opened in Browser mode.");

				}

			} else if (browsers.equalsIgnoreCase("firefox")) {

				// Setup Firefox using WebDriverManager
				FirefoxOptions firefoxOptions = new FirefoxOptions();

//	 headless run Firefox    true---headless mode  , false -- browser mode
				if (Boolean.parseBoolean(prop.getProperty("isHeadlessMode"))) {
					firefoxOptions.addArguments("--headless");
					firefoxOptions.addArguments("window-size=1920x1000");
					driver = new FirefoxDriver(firefoxOptions);
					System.out.println("Browser is opened in Headless mode.");
				} else {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					System.out.println("Browser is opened in Browser mode.");
				}
			} else if (browsers.equalsIgnoreCase("safari")) {

//		 headless run Safari    true---headless mode  , false -- browser mode
				if (Boolean.parseBoolean(prop.getProperty("isHeadlessMode"))) {
					SafariOptions safarioptions = new SafariOptions();
					safarioptions.setCapability("headless", true);
					System.out.println("Browser is opened in Headless mode.");
				} else {
					driver = new SafariDriver();
					System.out.println("Browser is opened in Browser mode.");
				}
			} else {
// if browser is incorrect
				System.out.println("Browser is incorrect");
			}

//		Url of Browser
			driver.get(prop.getProperty("base_Url"));
//		get use to maximize window
			driver.manage().window().maximize();
//		to delete the cookie
			driver.manage().deleteAllCookies();

		} catch (Exception e) {
			getTest().log(LogStatus.FAIL, browsers + " :Something went wrong :: --- " + e);
		}

	}

	@BeforeMethod(alwaysRun = true)
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
//				logger.info("Method - " + method.getName() + " failed , see the screenshot - " + imagePath + ".png");
			} catch (Exception e) {
				getTest().log(LogStatus.FAIL, getTest().addScreenCapture(imagePath + ".png"));

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
