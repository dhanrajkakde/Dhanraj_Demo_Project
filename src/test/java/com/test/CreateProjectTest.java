package com.test;

/**
 * @author dhanraj kakde
 */

import org.testng.annotations.Test;
import com.page.HomePage;
import com.page.LoginPage;
import com.utility.BaseTest;

import net.bytebuddy.utility.RandomString;

public class CreateProjectTest extends BaseTest {

	LoginPage login;
	HomePage home;

	@Test()
	public void verifyProjectCreateSuccessfully() throws InterruptedException {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		login.enterEmail("solarladdertest787@yopmail.com");
		login.enterPassword("password");
		login.clickOnSignInButton();
		home.clickOnProjectButton();
		home.enterProjectSize("7");
		home.enterCustomerName("Dhanraj" + RandomString.make());
		home.enterCustomerNumber("8830576944");
		home.enterCustomerEmail("Dhanraj@gmail.com");
		home.enterProjectLocation("Mumbai");
		home.clickOnAddProjectButton();
		home.dragNewProjectToSiteVisit();
	}
}
