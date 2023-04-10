package com.bestbuy.ecommerce.testcases;

import org.testng.annotations.Test;

import com.bestbuy.ecommerce.pageobjects.SearchforandAddtoCartPage;

import base.BaseClass;

public class SearchforandAddtoCartTest extends BaseClass {

	@Test
	public void verifySearchforandAddtoCartPage() {
		SearchforandAddtoCartPage searchforandaddtocart = new SearchforandAddtoCartPage(driver);
		searchforandaddtocart.clickonCountry();
		searchforandaddtocart.clickonsearch();
		searchforandaddtocart.entersearchitem(prop.getProperty("SearchItem"));
		searchforandaddtocart.clickonsearchbutton();
		searchforandaddtocart.clickonproduct();
		searchforandaddtocart.clickonaddtocartbutton();
		searchforandaddtocart.clickonletsgetstartedbutton();
		searchforandaddtocart.clickonnooptionkey();
		searchforandaddtocart.clickonnothanksbutton();
		searchforandaddtocart.clickoncontinuewithouttradeinbutton();
		searchforandaddtocart.clickongetnewnumberbutton();
		searchforandaddtocart.clickonverisonplanbutton();
		searchforandaddtocart.clickoncontinuebutton();
		searchforandaddtocart.validateaddedtocart();
		searchforandaddtocart.clickongotocartbutton();
	}

}