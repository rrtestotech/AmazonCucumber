package com.amazon.automation.parallel;

import java.util.Properties;

import org.apache.commons.lang3.exception.ExceptionUtils;

import com.amazon.automation.factory.DriverFactory;
import com.amazon.automation.pages.DemoQAHomePage;
import com.amazon.automation.pages.DemoQALoginPage;
import com.amazon.automation.pages.LoginPage;
import com.amazon.automation.util.ConfigReader;
import com.amazon.automation.util.ExcelUtil;
import com.amazon.automation.util.Loggers;
import com.amazon.automation.util.ScreenshotUtility;

import io.cucumber.java.en.Given;

public class DemoQALoginSteps  extends DriverFactory{
	
	private DemoQALoginPage loginPage;
	private Loggers logger;
	
	@Given("^click on login button$")
	public void user_is_on_login_page() throws Exception {
		logger = new Loggers();
		logger.configureLoggerSystem(new Throwable().getStackTrace()[0].getClassName());
		loginPage =new DemoQALoginPage(getDriver(),logger.loggingInstance());
		
		CommonStep.scenario.log("Click on Login Button in login page");
		
		loginPage.clickOnLoginBtn();
		
	}



}
