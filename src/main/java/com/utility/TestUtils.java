package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class TestUtils {

	public static ExtentTest test;
	static WebDriver driver;

	public static WebElement waitForVisibilityOfElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}

	public static void dragAndDrop(WebDriver driver, WebElement source, WebElement destination)
			throws InterruptedException {
		TestUtils.waitForVisibilityOfElement(driver, source);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.clickAndHold(source).build().perform();
		act.moveToElement(destination).release(destination).build().perform();
	}

}