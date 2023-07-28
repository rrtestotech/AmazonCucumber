package com.amazon.automation.pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.automation.util.ElementUtil;

public class DemoQALoginPage extends ElementUtil {
	private WebDriver driver;
	private Logger logg;

	public DemoQALoginPage(WebDriver driver, Logger logg) {
		super(driver, logg);
		this.logg=logg;
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

	@FindBy(xpath="//li[@class='btn btn-light ']/span[text()='Login']") WebElement loginBtn;
	
	public void clickOnLoginBtn() throws InterruptedException {
		clickElementUsingJavscriptExecutor(loginBtn);
		
	}
	
}
