package com.bestbuy.ecommerce.testcases;

import org.testng.annotations.Test;

import com.bestbuy.ecommerce.pageobjects.SignInPage;

import base.BaseClass;

public class SignInTest extends BaseClass {

	@Test
	public void SignInCredentials() {
		SignInPage signin = new SignInPage(driver);
		signin.clickonCountry();
		signin.clickonAccount();
		signin.clickonsigninbutton1();
		signin.enterEmail(prop.getProperty("Email"));
		signin.enterPassword(prop.getProperty("Password"));
		signin.clickonsigninbutton2();
	}
	
	@Test
	public void SignInInvalidCredentials() {
		SignInPage signin = new SignInPage(driver);
		signin.clickonCountry();
		signin.clickonAccount();
		signin.clickonsigninbutton1();
		signin.enterEmail(prop.getProperty("InvalidEmail"));
		signin.enterPassword(prop.getProperty("InvalidPassword"));
		signin.clickonsigninbutton2();
	}
	
	@Test
	public void SignInInvalidEmail() {
		SignInPage signin = new SignInPage(driver);
		signin.clickonCountry();
		signin.clickonAccount();
		signin.clickonsigninbutton1();
		signin.enterEmail(prop.getProperty("InvalidEmail"));
		signin.enterPassword(prop.getProperty("Password"));
		signin.clickonsigninbutton2();
	}
	
	@Test
	public void SignInInvalidPassword() {
		SignInPage signin = new SignInPage(driver);
		signin.clickonCountry();
		signin.clickonAccount();
		signin.clickonsigninbutton1();
		signin.enterEmail(prop.getProperty("Email"));
		signin.enterPassword(prop.getProperty("InvalidPassword"));
		signin.clickonsigninbutton2();
	}
	
}
