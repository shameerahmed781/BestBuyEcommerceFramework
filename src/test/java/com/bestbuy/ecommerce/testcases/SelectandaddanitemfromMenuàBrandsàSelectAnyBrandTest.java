package com.bestbuy.ecommerce.testcases;

import org.testng.annotations.Test;

import com.bestbuy.ecommerce.pageobjects.SelectandaddanitemfromMenuàBrandsàSelectAnyBrandPage;

import base.BaseClass;

public class SelectandaddanitemfromMenuàBrandsàSelectAnyBrandTest extends BaseClass {
	
	@Test
	public void verifySelectandaddanitemfromMenuàShopbyDepartment() {
		SelectandaddanitemfromMenuàBrandsàSelectAnyBrandPage page =  new SelectandaddanitemfromMenuàBrandsàSelectAnyBrandPage(driver);
		page.clickonCountry();
		page.clickonMenuButton();
		page.clickonbrandsbutton();
		page.clickonsamsung();
		page.clickonComputing();
		page.clickonaddtocartbutton();
		page.clickongotocartbutton();
	}

}
