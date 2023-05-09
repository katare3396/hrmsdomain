package com.util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatement {

	WebDriver driver;

	public WaitStatement(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement findElementVisibility(final WebElement ele, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {

			wait.until(ExpectedConditions.visibilityOf(ele));
//			wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("")));
		} catch (Exception e) {
			return null;
		}
		return ele;
	}

	public boolean findElementInVisibility(final WebElement ele, int time) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		try {
			return wait.until(ExpectedConditions.invisibilityOf(ele));
		} catch (Exception e) {
			System.out.println();
			return true;
		}
	}

	public WebElement findElementClickable(final WebElement ele, int time) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
//			wait.until((ExpectedCondition<Boolean>) _webDriver -> (_webDriver.findElement(by) != null));
		} catch (Exception e) {
			System.out.println();
			return null;
		}
		return ele;
	}

	public WebElement findElementsVisibility(final By by) {

		List<WebElement> webElements = driver.findElements(by);
		for (WebElement ele : webElements) {
			try {
				if (ele.isDisplayed()) {
					return ele;
				}
			} catch (Exception e) {
				System.out.println();
				return null;
			}
		}
		return null;
	}

	public WebElement waitForInVisibilityOfElement(final By by, int time) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		try {

			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
		} catch (Exception e) {
			System.out.println();
			return null;
		}
		return driver.findElement(by);
	}

	public WebElement waitForVisibilityOfElement(final By by, Duration time) {

		WebDriverWait wait = new WebDriverWait(driver, time);
		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
		} catch (Exception e) {
			System.out.println();
			return null;

		}
		return driver.findElement(by);
	}

	// Creating a custom function
	public void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='2px solid red'", element);

	}
}
