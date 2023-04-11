package com.bestbuy.ecommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidationBottomLinksHomePage {
	
	public WebDriver driver;

	public ValidationBottomLinksHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//img[@src = 'https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg']")
	WebElement choosecountry;
	
	public void clickonCountry() {
		choosecountry.click();
	}
	
	// Order & Purchases
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[1]")
	WebElement checkorderstatus;
	
	public void clickoncheckorderstatus() {
		checkorderstatus.click();
	}
	
	public void validatecheckorderstatus() {
		String ExpectedTitle = "Sign In for Order Status";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[2]")
	WebElement shippingdeliveryandpickup;
	
	public void clickonshippingdeliveryandpickup() {
		shippingdeliveryandpickup.click();
	}
	
	public void validateshippingdeliveryandpickup() {
		String ExpectedTitle = "Best Buy Shipping Delivery and Store Pickup";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[3]")
	WebElement returnsandexchanges;
	
	public void clickonreturnsandexchanges() {
		returnsandexchanges.click();
	}
	
	public void validatereturnsandexchanges() {
		String ExpectedTitle = "Best Buy Return & Exchange Policy - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[4]")
	WebElement pricematchguarantee;
	
	public void clickonpricematchguarantee() {
		pricematchguarantee.click();
	}
	
	public void validatepricematchguarantee() {
		String ExpectedTitle = "Price Match Guarantee - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[5]")
	WebElement productrecalls;
	
	public void clickonproductrecalls() {
		productrecalls.click();
	}
	
	public void validateproductrecalls() {
		String ExpectedTitle = "Product Recalls - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[6]")
	WebElement tradeinprogram;
	
	public void clickontradeinprogram() {
		tradeinprogram.click();
	}
	
	public void validatetradeinprogram() {
		String ExpectedTitle = "Best Buy Trade In Program for Computers, Cell Phones and More";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[7]")
	WebElement giftcards;
	
	public void clickongiftcards() {
		giftcards.click();
	}
	
	public void validategiftcards() {
		String ExpectedTitle = "Gifts Cards and E-Gift Cards - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
    // Payment Options
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[8]")
	WebElement mybestBuycreditcard;
	
	public void clickonmybestBuycreditcard() {
		mybestBuycreditcard.click();
	}
	
	public void validatemybestBuycreditcard() {
		String ExpectedTitle = "Best Buy Credit Card: Rewards & Financing";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[9]")
	WebElement payyourbillatcitibank;
	
	public void clickonpayyourbillatcitibank() {
		payyourbillatcitibank.click();
	}
	
	public void validatepayyourbillatcitibank() {
		String ExpectedTitle = "Sign In to Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[10]")
	WebElement leasetoown;
	
	public void clickonleasetoown() {
		leasetoown.click();
	}
	
	public void validateleasetoown() {
		String ExpectedTitle = "Progressive Leasing - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Support & Services
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[11]")
	WebElement visitoursupportcenter;
	
	public void clickonvisitoursupportcenter() {
		visitoursupportcenter.click();
	}
	
	public void validatevisitoursupportcenter() {
		String ExpectedTitle = "Best Buy Support & Customer Service";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[12]")
	WebElement shopwithanexpert;
	
	public void clickonshopwithanexpert() {
		shopwithanexpert.click();
	}
	
	public void validateshopwithanexpert() {
		String ExpectedTitle = "Shop with an Expert - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[13]")
	WebElement scheduleaservice;
	
	public void clickonscheduleaservice() {
		scheduleaservice.click();
	}
	
	public void validatescheduleaservice() {
		String ExpectedTitle = "Schedule a Service - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[14]")
	WebElement manageanappointment;
	
	public void clickonmanageanappointment() {
		manageanappointment.click();
	}
	
	public void validatemanageanappointment() {
		String ExpectedTitle = "Appointment Finder - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[15]")
	WebElement protectionandsupportplans;
	
	public void clickonprotectionandsupportplans() {
		protectionandsupportplans.click();
	}
	
	public void validateprotectionandsupportplans() {
		String ExpectedTitle = "Services - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[16]")
	WebElement haulawayandrecycling;
	
	public void clickonhaulawayandrecycling() {
		haulawayandrecycling.click();
	}
	
	public void validatehaulawayandrecycling() {
		String ExpectedTitle = "Electronics and Appliances Recycling at Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[17]")
	WebElement contactus;
	
	public void clickoncontactus() {
		contactus.click();
	}
	
	public void validatecontactus() {
		String ExpectedTitle = "Contact Best Buy - Phone Numbers, Customer Service, Chat and Support.";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Rewards & Membership
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[18]")
	WebElement bestbuytotaltech;
	
	public void clickonbestbuytotaltech() {
		bestbuytotaltech.click();
	}
	
	public void validatebestbuytotaltech() {
		String ExpectedTitle = "Best Buy Totaltech™ – Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[19]")
	WebElement mybestbuy;
	
	public void clickonmybestbuy() {
		mybestbuy.click();
	}
	
	public void validatemybestbuy() {
		String ExpectedTitle = "My Best Buy Program Overview";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[20]")
	WebElement viewpointscertificates;
	
	public void clickonviewpointscertificates() {
		viewpointscertificates.click();
	}
	
	public void validateviewpointscertificates() {
		String ExpectedTitle = "Sign In to Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[21]")
	WebElement memberoffers;
	
	public void clickonmemberoffers() {
		memberoffers.click();
	}
	
	public void validatememberoffers() {
		String ExpectedTitle = "My Best Buy Member Offers - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Partnerships
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[22]")
	WebElement affiliateprogram;
	
	public void clickonaffiliateprogram() {
		affiliateprogram.click();
	}
	
	public void validateaffiliateprogram() {
		String ExpectedTitle = "Best Buy Affiliate Program - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[23]")
	WebElement advertisewithus;
	
	public void clickonadvertisewithus() {
		advertisewithus.click();
	}
	
	public void validateadvertisewithus() {
		String ExpectedTitle = "Best Buy Ads";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[24]")
	WebElement developers;
	
	public void clickondevelopers() {
		developers.click();
	}
	
	public void validatedevelopers() {
		String ExpectedTitle = "Best Buy Developer Portal";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[25]")
	WebElement bestbuyhealth;
	
	public void clickonbestbuyhealth() {
		bestbuyhealth.click();
	}
	
	public void validatebestbuyhealth() {
		String ExpectedTitle = "Best Buy Health";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[26]")
	WebElement bestbuyeducation;
	
	public void clickonbestbuyeducation() {
		bestbuyeducation.click();
	}
	
	public void validatebestbuyeducation() {
		String ExpectedTitle = "Best Buy Education - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[27]")
	WebElement bestbuybusiness;
	
	public void clickonbestbuybusiness() {
		bestbuybusiness.click();
	}
	
	public void validatebestbuybusiness() {
		String ExpectedTitle = "Best Buy for Business - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// About Best Buy
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[28]")
	WebElement corporateinformation;
	
	public void clickoncorporateinformation() {
		corporateinformation.click();
	}
	
	public void validatecorporateinformation() {
		String ExpectedTitle = "Homepage - Best Buy Corporate News and Information";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[29]")
	WebElement careers;
	
	public void clickoncareers() {
		careers.click();
	}
	
	public void validatecareers() {
		String ExpectedTitle = "Best Buy Jobs - Best Buy Jobs";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[30]")
	WebElement corporateresponsibilityandsustainability;
	
	public void clickoncorporateresponsibilityandsustainability() {
		corporateresponsibilityandsustainability.click();
	}
	
	public void validatecorporateresponsibilityandsustainability() {
		String ExpectedTitle = "Our Commitments - Best Buy Corporate News and Information";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//ul[@class=\"navigation-section-list p-none list-none\"]/li/a)[31]")
	WebElement discoverandlearn;
	
	public void clickondiscoverandlearn() {
		discoverandlearn.click();
	}
	
	public void validatediscoverandlearn() {
		String ExpectedTitle = "Discover and Learn";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// footer links
	@FindBy (xpath = "(//div[@class=\"flex justify-content-start\"]/a)[1]")
	WebElement accessibility;
	
	public void clickonaccessibility() {
		accessibility.click();
	}
	
	public void validateaccessibility() {
		String ExpectedTitle = "Accessibility - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//div[@class=\"flex justify-content-start\"]/a)[2]")
	WebElement termsandconditions;
	
	public void clickontermsandconditions() {
		termsandconditions.click();
	}
	
	public void validatetermsandconditions() {
		String ExpectedTitle = "BestBuy.com Terms and Conditions";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//div[@class=\"flex justify-content-start\"]/a)[3]")
	WebElement privacy;
	
	public void clickonprivacy() {
		privacy.click();
	}
	
	public void validateprivacy() {
		String ExpectedTitle = "Privacy Policy Hub - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//div[@class=\"flex justify-content-start\"]/a)[4]")
	WebElement interestbasedads;
	
	public void clickoninterestbasedads() {
		interestbasedads.click();
	}
	
	public void validateinterestbasedads() {
		String ExpectedTitle = "Interest-Based Ads - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//div[@class=\"flex justify-content-start\"]/a)[5]")
	WebElement stateprivacyrights;
	
	public void clickonstateprivacyrights() {
		stateprivacyrights.click();
	}
	
	public void validatestateprivacyrights() {
		String ExpectedTitle = "State Privacy Rights - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//div[@class=\"flex justify-content-start\"]/a)[6]")
	WebElement cadonotsellorsharemypersonalinformation;
	
	public void clickoncadonotsellorsharemypersonalinformation() {
		cadonotsellorsharemypersonalinformation.click();
	}
	
	public void validatecadonotsellorsharemypersonalinformation() {
		String ExpectedTitle = "Start Request - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//div[@class=\"flex justify-content-start\"]/a)[7]")
	WebElement limituseofmysensitivepersonalinformation;
	
	public void clickonlimituseofmysensitivepersonalinformation() {
		limituseofmysensitivepersonalinformation.click();
	}
	
	public void validatelimituseofmysensitivepersonalinformation() {
		String ExpectedTitle = "Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//div[@class=\"flex justify-content-start\"]/a)[8]")
	WebElement targetedadvertisingoptout;
	
	public void clickontargetedadvertisingoptout() {
		targetedadvertisingoptout.click();
	}
	
	public void validatetargetedadvertisingoptout() {
		String ExpectedTitle = "Start Request - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//div[@class=\"flex justify-content-start\"]/a)[9]")
	WebElement casupplychaintransparencyact;
    
	public void clickoncasupplychaintransparencyact() {
		casupplychaintransparencyact.click();
	}
	
	public void validatecasupplychaintransparencyact() {
		String ExpectedTitle = "California Supply Chain Transparency Act - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
}