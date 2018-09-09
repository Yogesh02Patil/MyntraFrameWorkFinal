package com.myntra.testframework.testcases;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.myntra.testframework.dataprovider.DataProviderFromConfig;
import com.myntra.testframework.factory.BrowserFactory;
import com.myntra.testframework.factory.DataProviderFactory;
import com.myntra.testframework.factory.ExtentReportFactory;
import com.myntra.testframework.pageobject.LoginPageObject;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageTestCases {

	WebDriver driver;
	LoginPageObject page;
	ExtentTest logger;

	@BeforeTest
	public void beforeTest() throws Exception {
		driver = BrowserFactory.getDriver("firefox");
		page = new LoginPageObject();
		PageFactory.initElements(driver, page);
		logger = ExtentReportFactory.getReport("C:\\Users\\Yogesh\\git\\NewProject\\MyntraProject\\Report\\report.html",
				"LoginTestCaseReport");

	}

	@BeforeMethod
	public void beforeMethod() throws Exception {
		driver.get(DataProviderFactory.getDataProviderFromConfig().getUrl());

		logger.log(LogStatus.INFO, "Negavite to Login Page URL of Mintra");
	}

	@Test
	public void checkYourAccountLink() {
		assertNotNull(page.getYourAccountLink(), "Your Account Link is Not Present");
		logger.log(LogStatus.INFO, " Account Link is Present");
	}

	@Test
	public void checkLoginSignUpLink() {
		page.getYourAccountLink().click();
		assertNotNull(page.getMouseover(), "Login and Sign up Link is Not Present");
		logger.log(LogStatus.INFO, "Login_Sign up Link is Present");
	}

	@Test
	public void chechLoginButton() {

		page.getYourAccountLink().click();
		page.getLoginButton().click();
		assertEquals(driver.getTitle(), "Login");
		logger.log(LogStatus.INFO, "Login Button Link is Working");

	}

	@AfterMethod
	public void afterMethod() throws Exception {
		driver.get(DataProviderFactory.getDataProviderFromConfig().getUrl());
	}

	@AfterTest
	public void closeAll() {
		ExtentReportFactory.closeReport(logger);
	}

}
