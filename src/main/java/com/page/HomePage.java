package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.TestUtils;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained accessibility crm-addprojectbutton MuiButton-containedPrimary']")
	private WebElement PROJECT_BUTTON;

	@FindBy(xpath = "//input[@name='projectSize']")
	private WebElement PROJECT_SIZE;

	@FindBy(xpath = "//input[@name='customerName']")
	private WebElement CUSTOMER_NAME;

	@FindBy(xpath = "//input[@value='+91']")
	private WebElement CUSTOMER_CONTACT_NUMBER;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement CUSTOMER_EMAIL;

	@FindBy(xpath = "//input[@name='location']")
	private WebElement PROJECT_LOCATION;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")
	private WebElement ADD_PROJECT;
	
	@FindBy(xpath = "(//section[@title='Enquiry']//div[@class='smooth-dnd-draggable-wrapper'])[1]")
	private WebElement NEW_PROJECT_SOURCE;
	
	@FindBy(xpath = "(//section[@title='Site Visit']//div[@class='smooth-dnd-draggable-wrapper'])[1]")
	private WebElement NEW_PROJECT_DESTINATION;

	public void clickOnProjectButton() {
		TestUtils.waitForVisibilityOfElement(driver, PROJECT_BUTTON).click();
	}

	public void enterProjectSize(String projectSize) {
		TestUtils.waitForVisibilityOfElement(driver, PROJECT_SIZE).sendKeys(projectSize);
	}

	public void enterCustomerName(String customerName) {
		TestUtils.waitForVisibilityOfElement(driver, CUSTOMER_NAME).sendKeys(customerName);
	}

	public void enterCustomerNumber(String customerNumber) {
		TestUtils.waitForVisibilityOfElement(driver, CUSTOMER_CONTACT_NUMBER).sendKeys(customerNumber);
	}

	public void enterCustomerEmail(String customerEmail) {
		TestUtils.waitForVisibilityOfElement(driver, CUSTOMER_EMAIL).sendKeys(customerEmail);
	}

	public void enterProjectLocation(String projectLocation) {
		TestUtils.waitForVisibilityOfElement(driver, PROJECT_LOCATION).sendKeys(projectLocation);
	}

	public void clickOnAddProjectButton() {
		TestUtils.waitForVisibilityOfElement(driver, ADD_PROJECT).click();
	}
	
	public void dragNewProjectToSiteVisit() throws InterruptedException {
		TestUtils.dragAndDrop(driver, NEW_PROJECT_SOURCE, NEW_PROJECT_DESTINATION);
	}
	
}
