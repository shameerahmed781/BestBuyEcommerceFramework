package com.bestbuy.ecommerce.testcases;

import org.testng.annotations.Test;

import com.bestbuy.ecommerce.pageobjects.CheckoutPage;

import base.BaseClass;

public class CheckoutTest extends BaseClass {
	
	@Test
	public void verifycheckout() {
		CheckoutPage checkoutpage = new CheckoutPage(driver);
		checkoutpage.clickonCountry();
		checkoutpage.clickonMenuButton();
		checkoutpage.clickonappliances();
		checkoutpage.clickonmajorkitchenappliances();
		checkoutpage.clickonmicrowaves();
		checkoutpage.clickoncountertopmicrowaves();
		checkoutpage.clickonaddtocartbutton();
		checkoutpage.clickongotocart();
		checkoutpage.clickoncheckout();
		checkoutpage.clickoncontinueasguest();
		checkoutpage.clickonemailaddress();
		checkoutpage.enteremailaddress(prop.getProperty("Email"));
		checkoutpage.clickonphonenumber();
		checkoutpage.enterphonenumber(prop.getProperty("MobilePhoneNumber"));
		checkoutpage.clickoncheckbox();
		checkoutpage.clickoncontinuetopaymentinformation();
		checkoutpage.clickoncardnumber();
		checkoutpage.entercardnumber(prop.getProperty("CardNumber"));
		checkoutpage.clickonmonth();
		checkoutpage.clickonmonthoption();
		checkoutpage.clickonyear();
		checkoutpage.clickonyearoption();
		checkoutpage.clickonsecuritycode();
		checkoutpage.entercvcnumber(prop.getProperty("SecurityCode"));
		checkoutpage.clickonfirstname();
		checkoutpage.enterfirstname(prop.getProperty("FirstName"));
		checkoutpage.clickonlastname();
		checkoutpage.enterlastname(prop.getProperty("LastName"));
		checkoutpage.clickonaddress();
		checkoutpage.enteraddress(prop.getProperty("Address"));
		checkoutpage.clickoncity();
		checkoutpage.entercity(prop.getProperty("City"));
		checkoutpage.clickonstate();
		checkoutpage.clickonstateoption();
		checkoutpage.clickonpostalcode();
		checkoutpage.enterpostalcode(prop.getProperty("ZIPcode"));
		checkoutpage.clickonplaceyourorder();
		checkoutpage.validatepayment();
	    
	}

}
