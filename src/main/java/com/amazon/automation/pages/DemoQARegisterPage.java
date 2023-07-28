package com.amazon.automation.pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazon.automation.util.ElementUtil;

public class DemoQARegisterPage extends ElementUtil {

	private WebDriver driver;
	private Logger logg;

	public DemoQARegisterPage(WebDriver driver, Logger logg) {
		super(driver, logg);
		this.logg=logg;
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

}
