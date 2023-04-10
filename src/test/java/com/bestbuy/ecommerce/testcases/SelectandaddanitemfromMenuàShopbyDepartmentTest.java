package com.bestbuy.ecommerce.testcases;

import org.testng.annotations.Test;

import com.bestbuy.ecommerce.pageobjects.SelectandaddanitemfromMenuàShopbyDepartmentPage;

import base.BaseClass;

public class SelectandaddanitemfromMenuàShopbyDepartmentTest extends BaseClass {

	@Test
	public void verifySelectandaddanitemfromMenuàShopbyDepartment() {
		SelectandaddanitemfromMenuàShopbyDepartmentPage page = new SelectandaddanitemfromMenuàShopbyDepartmentPage(driver);
		page.clickonCountry();
		page.clickonMenuButton();
		page.clickonappliances();
		page.clickonmajorkitchenappliances();
		page.clickonmicrowaves();
		page.clickoncountertopmicrowaves();
		page.clickonaddtocartbutton();
		page.clickongotocart();
	}

}
