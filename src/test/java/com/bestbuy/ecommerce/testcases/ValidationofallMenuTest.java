package com.bestbuy.ecommerce.testcases;

import org.testng.annotations.Test;

import com.bestbuy.ecommerce.pageobjects.ValidationofallMenuPage;

import base.BaseClass;

public class ValidationofallMenuTest extends BaseClass {
	
	// Deals Validations
	@Test(priority=1)
	public void verifyTopDeals() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonTopDeals();
		allmenu.validatetopdeals();
	}
	
	@Test(priority=2)
	public void verifyDealoftheDay() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonDealoftheDay();
		allmenu.validatedealoftheday();
	}
	
	@Test(priority=3)
	public void verifyTotalTechMemberOffers() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonTotalTechMemberOffers();
		allmenu.validatetotaltechmemberoffers();
	}
	
	@Test(priority=4)
	public void verifyGiftIdeas() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonGiftIdeas();
		allmenu.validategiftideas();
	}
	
	@Test(priority=5)
	public void verifybestbuyoutlet() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonbestbuyoutlet();
		allmenu.validatebestbuyoutlet();
	}
	
	@Test(priority=6)
	public void verifyappleshoppingevent() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonappleshoppingevent();
		allmenu.validateappleshoppingevent();
	}
	
	// Deals By Category Validations
	@Test(priority=7)
	public void verifytvsandprojectors() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickontvsandprojectors();
		allmenu.validatetvsandprojectors();
	}
	
	@Test(priority=8)
	public void verifylaptopsandcomputers() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonlaptopsandcomputers();
		allmenu.validatelaptopsandcomputers();
	}
	
	@Test(priority=9)
	public void verifytabbletsandereaders() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickontabbletsandereaders();
		allmenu.validatetabbletsandereaders();
	}
	
	@Test(priority=10)
	public void verifyvideogamesandvr() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonvideogamesandvr();
		allmenu.validatevideogamesandvr();
	}
	
	@Test(priority=11)
	public void verifyheadphones() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonheadphones();
		allmenu.validateheadphones();
	}
	
	@Test(priority=12)
	public void verifycellphones() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickoncellphones();
		allmenu.validatecellphones();
	}
	
	@Test(priority=13)
	public void verifypcgaming() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonpcgaming();
		allmenu.validatepcgaming();
	}
	
	@Test(priority=14)
	public void verifysoundbarsandspeakers() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonsoundbarsandspeakers();
		allmenu.validatesoundbarsandspeakers();
	}
	
	@Test(priority=15)
	public void verifyvideoandstreamingmediaplayers() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonvideoandstreamingmediaplayers();
		allmenu.validatevideoandstreamingmediaplayers();
	}
	
	@Test(priority=16)
	public void verifysmarthomeandnetworking() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonsmarthomeandnetworking();
		allmenu.validatesmarthomeandnetworking();
	}
	
	@Test(priority=17)
	public void verifytoysgamesandcollectibles() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickontoysgamesandcollectibles();
		allmenu.validatetoysgamesandcollectibles();
	}
	
	@Test(priority=18)
	public void verifycamerascamcordersanddrones() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickoncamerascamcordersanddrones();
		allmenu.validatecamerascamcordersanddrones();
	}
	
	@Test(priority=19)
	public void verifywearabletechnology() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonwearabletechnology();
		allmenu.validatewearabletechnology();
	}
	
	@Test(priority=20)
	public void verifymajorappliances() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonmajorappliances();
		allmenu.validatemajorappliances();
	}
	
	@Test(priority=21)
	public void verifysmallappliances() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonsmallappliances();
		allmenu.validatesmallappliances();
	}
	
	@Test(priority=22)
	public void verifymoviestvshowsandmusic() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonmoviestvshowsandmusic();
		allmenu.validatemoviestvshowsandmusic();
	}
	
	@Test(priority=23)
	public void verifyprintersandhomeoffice() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonprintersandhomeoffice();
		allmenu.validateprintersandhomeoffice();
	}
	
	@Test(priority=24)
	public void verifyhomeandoutdoor() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonhomeandoutdoor();
		allmenu.validatehomeandoutdoor();
	}
	
	@Test(priority=25)
	public void verifycarelectronicsandgps() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickoncarelectronicsandgps();
		allmenu.validatecarelectronicsandgps();
	}
	
	@Test(priority=26)
	public void verifyelectrictransportation() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonelectrictransportation();
		allmenu.validateelectrictransportation();
	}
	
	@Test(priority=27)
	public void verifysalesandpromotions() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonsalesandpromotions();
		allmenu.validatesalesandpromotions();
	}
	
	@Test(priority=28)
	public void verifyclearanceandmore() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonDealsButton();
		allmenu.clickonclearanceandmore();
		allmenu.validateclearanceandmore();
	}
	
	// Support & Services Validations
	@Test(priority=29)
	public void verifysupportandservices() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonvisitoursupportcenter();
		allmenu.validatevisitoursupportcenter();
	}
	
	@Test(priority=30)
	public void verifyscheduleaservice() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonscheduleaservice();
		allmenu.validatescheduleaservice();
	}
	
	@Test(priority=31)
	public void verifyonlinesupport() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickononlinesupport();
		allmenu.validateonlinesupport();
	}
	
	@Test(priority=32)
	public void verifymanageanappoinment() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonmanageanappoinment();
		allmenu.validatemanageanappoinment();
	}
	
	@Test(priority=33)
	public void verifyshopwithanexpert() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonshopwithanexpert();
		allmenu.validateshopwithanexpert();
	}
	
	@Test(priority=34)
	public void verifycheckrepairstatus() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickoncheckrepairstatus();
		allmenu.validatecheckrepairstatus();
	}
	
	@Test(priority=35)
	public void verifyfreehomeconsultation() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonfreehomeconsultation();
		allmenu.validatefreehomeconsultation();
	}
	
	// Learn About Services by Category Validations
	@Test(priority=36)
	public void verifycomputerandtabletservices() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickoncomputerandtabletservices();
		allmenu.validatecomputerandtabletservices();
	}
	
	@Test(priority=37)
	public void verifytvandhometheaterservices() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickontvandhometheaterservices();
		allmenu.validatetvandhometheaterservices();
	}
	
	@Test(priority=38)
	public void verifyapplianceservices() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonapplianceservices();
		allmenu.validateapplianceservices();
	}
	
	@Test(priority=39)
	public void verifycellphoneservices() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickoncellphoneservices();
		allmenu.validatecellphoneservices();
	}
	
	@Test(priority=40)
	public void verifyappleauthorizedrepair() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonappleauthorizedrepair();
		allmenu.validateappleauthorizedrepair();
	}
	
	@Test(priority=41)
	public void verifysmarthomeservices() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonsmarthomeservices();
		allmenu.validatesmarthomeservices();
	}
	
	@Test(priority=42)
	public void verifycarelectronicsprofessionalinstallation() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickoncarelectronicsprofessionalinstallation();
		allmenu.validatecarelectronicsprofessionalinstallation();
	}
	
	@Test(priority=43)
	public void verifyfitnessequipmentservices() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonfitnessequipmentservices();
		allmenu.validatefitnessequipmentservices();
	}
	
	@Test(priority=44)
	public void verifyallservices() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonallservices();
		allmenu.validateallservices();
	}
	
	// Protection & Support Plans Validations
	@Test(priority=45)
	public void verifybestbuytotaltechmembership() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonbestbuytotaltechmembership();
		allmenu.validatebestbuytotaltechmembership();
	}
	
	@Test(priority=46)
	public void verifygeeksquadprotection() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickongeeksquadprotection();
		allmenu.validategeeksquadprotection();
	}
	
	@Test(priority=47)
	public void verifyapplecare() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonapplecare();
		allmenu.validateapplecare();
	}
	
	// Additional Services Validations
	@Test(priority=48)
	public void verifytechtips() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickontechtips();
		allmenu.validatetechtips();
	}
	
	@Test(priority=49)
	public void verifytradeinyourdevice() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickontradeinyourdevice();
		allmenu.validatetradeinyourdevice();
	}
	
	@Test(priority=50)
	public void verifyhaulawayandrecycling() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonhaulawayandrecycling();
		allmenu.validatehaulawayandrecycling();
	}
	
	@Test(priority=51)
	public void verifyfindreplacementparts() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonsupportandservicesbutton();
		allmenu.clickonfindreplacementparts();
		allmenu.validatefindreplacementparts();
	}
	
	// Brands Validation
	@Test(priority=52)
	public void verifybestbuybrands() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonbestbuybrands();
		allmenu.validatebestbuybrands();
	}
	
	@Test(priority=53)
	public void verifyapple() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonapple();
		allmenu.validateapple();
	}
	
	@Test(priority=54)
	public void verifysamsung() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonsamsung();
		allmenu.validatesamsung();
	}
	
	@Test(priority=55)
	public void verifymicrosoft() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonmicrosoft();
		allmenu.validatemicrosoft();
	}
	
	@Test(priority=56)
	public void verifysony() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonsony();
		allmenu.validatesony();
	}
	
	@Test(priority=57)
	public void verifyintel() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonintel();
		allmenu.validateintel();
	}
	
	@Test(priority=58)
	public void verifyyardbird() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonyardbird();
		allmenu.validateyardbird();
	}
	
	// Featured Brands Validation
	@Test(priority=59)
	public void verifylenovo() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonlenovo();
		allmenu.validatelenovo();
	}
	
	@Test(priority=60)
	public void verifylg() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonlg();
		allmenu.validatelg();
	}
	
	@Test(priority=61)
	public void verifynikon() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonnikon();
		allmenu.validatenikon();
	}
	
	@Test(priority=62)
	public void verifybose() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonbose();
		allmenu.validatebose();
	}
	
	@Test(priority=63)
	public void verifycanon() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickoncanon();
		allmenu.validatecanon();
	}
	
	@Test(priority=64)
	public void verifydell() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickondell();
		allmenu.validatedell();
	}
	
	@Test(priority=65)
	public void verifygopro() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickongopro();
		allmenu.validategopro();
	}
	
	@Test(priority=66)
	public void verifyhp() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonhp();
		allmenu.validatehp();
	}
	
	@Test(priority=67)
	public void verifysonos() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonsonos();
		allmenu.validatesonos();
	}
	
	@Test(priority=68)
	public void verifyallbrands() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonallbrands();
		allmenu.validateallbrands();
	}
	
	// Specialty Shops Validations
	@Test(priority=69)
	public void verifypremiumaudioandvideo() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonpremiumaudioandvideo();
		allmenu.validatepremiumaudioandvideo();
	}
	
	@Test(priority=70)
	public void verifypacifickitchenandhome() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickonpacifickitchenandhome();
		allmenu.validatepacifickitchenandhome();
	}
	
	@Test(priority=71)
	public void verifycameraexperienceshop() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonbrandsbutton();
		allmenu.clickoncameraexperienceshop();
		allmenu.validatecameraexperienceshop();
	}
	
	@Test(priority=72)
	public void verifyeastergiftideas() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonfeaturedbutton();
		allmenu.clickonmothersgiftkey();
		allmenu.validatemothersgiftkey();
	}
	
	@Test(priority=73)
	public void verifylegotoys() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonfeaturedbutton();
		allmenu.clickonlegotoys();
		allmenu.validatelegotoys();
	}
	
	@Test(priority=74)
	public void verifylatestfromapple() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonfeaturedbutton();
		allmenu.clickonlatestfromapple();
		allmenu.validatelatestfromapple();
	}
	
	@Test(priority=75)
	public void verifysmarthomesolutions() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonfeaturedbutton();
		allmenu.clickonsmarthomesolutions();
		allmenu.validatesmarthomesolutions();
	}
	
	@Test(priority=76)
	public void verifyelectrictransportations() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonfeaturedbutton();
		allmenu.clickonelectrictransportations();
		allmenu.validateelectrictransportations();
	}
	
	@Test(priority=77)
	public void verifyteentechcenter() {
		ValidationofallMenuPage allmenu = new ValidationofallMenuPage(driver);
		allmenu.clickonCountry();
		allmenu.clickonMenuButton();
		allmenu.clickonfeaturedbutton();
		allmenu.clickonteentechcenter();
		allmenu.validateteentechcenter();
	}
	
}