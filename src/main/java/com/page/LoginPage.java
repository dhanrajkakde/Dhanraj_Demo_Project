package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.TestUtils;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='email']")
	private WebElement EMAIL;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement PASSWORD;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SIGN_IN_BUTTON;

	public void enterEmail(String email) {
		TestUtils.waitForVisibilityOfElement(driver, EMAIL).sendKeys(email);
	}

	public void enterPassword(String password) {
		TestUtils.waitForVisibilityOfElement(driver, PASSWORD).sendKeys(password);
	}

	public void clickOnSignInButton() {
		TestUtils.waitForVisibilityOfElement(driver, SIGN_IN_BUTTON).click();
	}

}
