package com.bestbuy.ecommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidationURLPage {
	
	public WebDriver driver;
	
	public ValidationURLPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void validateurl() {
		String Expectedurl = "https://www.bestbuy.com/";
		Assert.assertEquals(Expectedurl, driver.getCurrentUrl());
	}
	
	public void validateInvalidurl() {
		String Expectedurl = "https://www.bestbuy.om/";
		Assert.assertNotEquals(Expectedurl, driver.getCurrentUrl());
	}

}
