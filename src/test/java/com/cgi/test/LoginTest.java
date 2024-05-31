package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.DashboardPage;
import com.cgi.pages.LoginPage;
import com.cgi.utilities.DataUtils;

public class LoginTest extends AutomationWrapper {
	@Test(priority = 1, dataProvider = "commonDataProvider", dataProviderClass = DataUtils.class, groups = { "login",
			"smoke" })
	public void validLoginTest(String username, String password, String expectedValue) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		// assert the header - Dashboard
		DashboardPage dashboard=new DashboardPage(driver);
		String actualValue = dashboard.getQuickLaunchHeader();
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Test(priority = 2, dataProvider = "commonDataProvider", dataProviderClass = DataUtils.class, groups = { "login" })
	public void invalidLoginTest(String username, String password, String expectedError) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		// assert the error - Invalid credentials
		String actualError = login.getInvalidErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}
}
