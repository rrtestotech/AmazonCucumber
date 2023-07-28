package com.amazon.automation.parallel;

import java.util.Properties;

import org.apache.commons.lang3.exception.ExceptionUtils;

import com.amazon.automation.factory.DriverFactory;
import com.amazon.automation.pages.DemoQAHomePage;
import com.amazon.automation.pages.LoginPage;
import com.amazon.automation.util.ConfigReader;
import com.amazon.automation.util.ExcelUtil;
import com.amazon.automation.util.Loggers;
import com.amazon.automation.util.ScreenshotUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DemoQAHomeSteps extends DriverFactory{
	
	private Loggers logger;
	private ScreenshotUtility screenshotutility;
	private ConfigReader config;
	private String[] fullClassName = this.getClass().getName().split("[.]");
	private String className = this.getClass().getName().split("[.]")[fullClassName.length - 1];
	Properties prop;
	private DemoQAHomePage demoQAHomePage;
	
	
	@Given("click on Book Store Application")
	public void user_is_on_login_page() throws Exception {
		logger = new Loggers();
		logger.configureLoggerSystem(new Throwable().getStackTrace()[0].getClassName());
		
		config = new ConfigReader(logger.loggingInstance());
		demoQAHomePage =new DemoQAHomePage(getDriver(),logger.loggingInstance());
		logger.setLoggerInfo(" Test Execution is about to begin for "+className+" ");
		config.initprop();
		CommonStep.scenario.log("Launch the application using URL");

			CommonStep.scenario.log("Launching Application");
			
		getDriver().get(config.readLoginURLIndia());
		demoQAHomePage.clickOnBookStoreApplication();
		
	}



}
