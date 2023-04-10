package com.bestbuy.ecommerce.testcases;

import org.testng.annotations.Test;

import com.bestbuy.ecommerce.pageobjects.CreateAccountPage;

import base.BaseClass;

public class CreateAccountTest extends BaseClass {

	@Test
	public void verifyCreateAccount() {
		CreateAccountPage createaccount = new CreateAccountPage(driver);
		createaccount.clickonCountry();
		createaccount.clickonAccount();
		createaccount.clickoncreateaccountbutton();
		createaccount.FirstName(prop.getProperty("FirstName"));
		createaccount.LastName(prop.getProperty("LastName"));
		createaccount.Email(prop.getProperty("Email"));
		createaccount.Password(prop.getProperty("Password"));
		createaccount.ConfirmPassword(prop.getProperty("ConfirmPassword"));
		createaccount.MobilePhoneNumber(prop.getProperty("MobilePhoneNumber"));
		createaccount.clickoncheckbox();
		createaccount.clickoncreateanaccountbutton();
	}

}
