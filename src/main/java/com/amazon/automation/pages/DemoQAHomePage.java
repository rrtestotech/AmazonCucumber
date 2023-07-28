package com.amazon.automation.pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.automation.util.ElementUtil;

public class DemoQAHomePage extends ElementUtil {

	private WebDriver driver;
	private Logger logg;
	public DemoQAHomePage(WebDriver driver, Logger logg) {
		super(driver, logg);
		this.logg=logg;
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	

	@FindBy(xpath="//h5[text()='Book Store Application']/parent::div/preceding-sibling::div[1]/parent::div") WebElement BookSStoreLnk;
	
	public void clickOnBookStoreApplication() {
		clickElement(BookSStoreLnk);
		
	}
	
	
	
}
