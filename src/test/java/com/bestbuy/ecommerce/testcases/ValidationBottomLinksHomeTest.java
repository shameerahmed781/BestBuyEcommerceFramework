package com.bestbuy.ecommerce.testcases;

import org.testng.annotations.Test;

import com.bestbuy.ecommerce.pageobjects.ValidationBottomLinksHomePage;

import base.BaseClass;

public class ValidationBottomLinksHomeTest extends BaseClass {

	@Test(priority=1)
	public void verifyBottomLinksHome1() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickoncheckorderstatus();
		bottomlink.validatecheckorderstatus();
	}
	
	@Test(priority=2)
	public void verifyBottomLinksHome2() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();	
		bottomlink.clickonshippingdeliveryandpickup();
		bottomlink.validateshippingdeliveryandpickup();
	}	
	
	@Test(priority=3)
	public void verifyBottomLinksHome3() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonreturnsandexchanges();
		bottomlink.validatereturnsandexchanges();
	}
	
	@Test(priority=4)
	public void verifyBottomLinksHome4() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonpricematchguarantee();
		bottomlink.validatepricematchguarantee();
	}
	
	@Test(priority=5)
	public void verifyBottomLinksHome5() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonproductrecalls();
		bottomlink.validateproductrecalls();
	}
	
	@Test(priority=6)
	public void verifyBottomLinksHome6() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickontradeinprogram();
		bottomlink.validatetradeinprogram();
	}
	
	@Test(priority=7)
	public void verifyBottomLinksHome7() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickongiftcards();
		bottomlink.validategiftcards();
	}
	
	@Test(priority=8)
	public void verifyBottomLinksHome8() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonmybestBuycreditcard();
		bottomlink.validatemybestBuycreditcard();
	}
	
	@Test(priority=9)
	public void verifyBottomLinksHome9() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonpayyourbillatcitibank();
		bottomlink.validatepayyourbillatcitibank();
	}
	
	@Test(priority=10)
	public void verifyBottomLinksHome10() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonleasetoown();
		bottomlink.validateleasetoown();
	}
	
	@Test(priority=11)
	public void verifyBottomLinksHome11() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonvisitoursupportcenter();
		bottomlink.validatevisitoursupportcenter();
	}
	
	@Test(priority=12)
	public void verifyBottomLinksHome12() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonshopwithanexpert();
		bottomlink.validateshopwithanexpert();
	}
	
	@Test(priority=13)
	public void verifyBottomLinksHome13() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonscheduleaservice();
		bottomlink.validatescheduleaservice();
	}
	
	@Test(priority=14)
	public void verifyBottomLinksHome14() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonmanageanappointment();
		bottomlink.validatemanageanappointment();
	}
	
	@Test(priority=15)
	public void verifyBottomLinksHome15() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonprotectionandsupportplans();
		bottomlink.validateprotectionandsupportplans();
	}
	
	@Test(priority=16)
	public void verifyBottomLinksHome16() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonhaulawayandrecycling();
		bottomlink.validatehaulawayandrecycling();
	}
	
	@Test(priority=17)
	public void verifyBottomLinksHome17() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickoncontactus();
		bottomlink.validatecontactus();
	}
	
	@Test(priority=18)
	public void verifyBottomLinksHome18() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonbestbuytotaltech();
		bottomlink.validatebestbuytotaltech();
	}
	
	@Test(priority=19)
	public void verifyBottomLinksHome19() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonmybestbuy();
		bottomlink.validatemybestbuy();
	}
	
	@Test(priority=20)
	public void verifyBottomLinksHome20() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonviewpointscertificates();
		bottomlink.validateviewpointscertificates();
	}
	
	@Test(priority=21)
	public void verifyBottomLinksHome21() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonmemberoffers();
		bottomlink.validatememberoffers();
	}
	
	@Test(priority=22)
	public void verifyBottomLinksHome22() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonaffiliateprogram();
		bottomlink.validateaffiliateprogram();
	}
	
	@Test(priority=23)
	public void verifyBottomLinksHome23() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonadvertisewithus();
		bottomlink.validateadvertisewithus();
	}
	
	@Test(priority=24)
	public void verifyBottomLinksHome24() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickondevelopers();
		bottomlink.validatedevelopers();
	}
	
	@Test(priority=25)
	public void verifyBottomLinksHome25() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonbestbuyhealth();
		bottomlink.validatebestbuyhealth();
	}
	
	@Test(priority=26)
	public void verifyBottomLinksHome26() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonbestbuyeducation();
		bottomlink.validatebestbuyeducation();
	}
	
	@Test(priority=27)
	public void verifyBottomLinksHome27() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonbestbuybusiness();
		bottomlink.validatebestbuybusiness();
	}
	
	@Test(priority=28)
	public void verifyBottomLinksHome28() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickoncorporateinformation();
		bottomlink.validatecorporateinformation();
	}
	
	@Test(priority=29)
	public void verifyBottomLinksHome29() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickoncareers();
		bottomlink.validatecareers();
	}
	
	@Test(priority=30)
	public void verifyBottomLinksHome30() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickoncorporateresponsibilityandsustainability();
		bottomlink.validatecorporateresponsibilityandsustainability();
	}
	
	@Test(priority=31)
	public void verifyBottomLinksHome31() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickondiscoverandlearn();
		bottomlink.validatediscoverandlearn();
	}
	
	// footer links verify
	@Test(priority=32)
	public void verifyBottomLinksHome32() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonaccessibility();
		bottomlink.validateaccessibility();
	}
	
	@Test(priority=33)
	public void verifyBottomLinksHome33() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickontermsandconditions();
		bottomlink.validatetermsandconditions();
	}
	
	@Test(priority=34)
	public void verifyBottomLinksHome34() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonprivacy();
		bottomlink.validateprivacy();
	}
	
	@Test(priority=35)
	public void verifyBottomLinksHome35() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickoninterestbasedads();
		bottomlink.validateinterestbasedads();
	}
	
	@Test(priority=36)
	public void verifyBottomLinksHome36() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonstateprivacyrights();
		bottomlink.validatestateprivacyrights();
	}
	
	@Test(priority=37)
	public void verifyBottomLinksHome37() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickoncadonotsellorsharemypersonalinformation();
		bottomlink.validatecadonotsellorsharemypersonalinformation();
	}
	
	@Test(priority=38)
	public void verifyBottomLinksHome38() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickonlimituseofmysensitivepersonalinformation();
		bottomlink.validatelimituseofmysensitivepersonalinformation();
	}
	
	@Test(priority=39)
	public void verifyBottomLinksHome39() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickontargetedadvertisingoptout();
		bottomlink.validatetargetedadvertisingoptout();
	}
	
	@Test(priority=40)
	public void verifyBottomLinksHome40() {
		ValidationBottomLinksHomePage bottomlink = new ValidationBottomLinksHomePage(driver);
		bottomlink.clickonCountry();
		bottomlink.clickoncasupplychaintransparencyact();
		bottomlink.validatecasupplychaintransparencyact();
	}
	
}
