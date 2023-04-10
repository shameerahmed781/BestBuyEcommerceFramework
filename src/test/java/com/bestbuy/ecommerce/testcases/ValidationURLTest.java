package com.bestbuy.ecommerce.testcases;

import org.testng.annotations.Test;

import com.bestbuy.ecommerce.pageobjects.ValidationURLPage;

import base.BaseClass;

public class ValidationURLTest extends BaseClass{

	@Test
	public void verifyURL() {
		ValidationURLPage url = new ValidationURLPage(driver);
		url.validateurl();
	}
	
	@Test
	public void verifyInvalidURL() {
		ValidationURLPage url = new ValidationURLPage(driver);
		url.validateInvalidurl();
	}

}
