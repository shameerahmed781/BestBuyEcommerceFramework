package com.bestbuy.ecommerce.pageobjects;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationofallMenuPage {
	
	public WebDriver driver;

	public ValidationofallMenuPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//img[@src = 'https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg']")
	WebElement choosecountry;
	
	public void clickonCountry() {
		choosecountry.click();
	}
	
	@FindBy (xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement menubutton;
	
	public void clickonMenuButton() {
		menubutton.click();
	}
	
	// Deals Validations
	@FindBy (xpath = "//button[@data-id='node-31']")
	WebElement dealsbutton;
	
	public void clickonDealsButton() {
		dealsbutton.click();
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_topdeals']")
	WebElement topdealskey;
	
	public void clickonTopDeals() {
		topdealskey.click();
	}
	
	public void validatetopdeals() {
		String ExpectedTitle = "Top Deals and Featured Offers on Electronics - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_dod']")
	WebElement dealofthedaykey;
	
	public void clickonDealoftheDay() {
		dealofthedaykey.click();
	}
	
	public void validatedealoftheday() {
		String ExpectedTitle = "Deal of the Day: Electronics Deals - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_mem']")
    WebElement totaltechmemberofferskey;
	
	public void clickonTotalTechMemberOffers() {
		totaltechmemberofferskey.click();
	}
	
	public void validatetotaltechmemberoffers() {
		String ExpectedTitle = "Top Deals on Totaltech - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_gift_ideas']")
	WebElement giftideaskey;
	
	public void clickonGiftIdeas() {
		giftideaskey.click();
	}
	
	public void validategiftideas() {
		String ExpectedTitle = "Gift Ideas 2023: Best Gifts to Give This Year - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "(//a[@data-lid='ubr_dls_bbo'])[1]")
    WebElement bestbuyoutletkey;
	
	public void clickonbestbuyoutlet() {
		bestbuyoutletkey.click();
	}
	
	public void validatebestbuyoutlet() {
		String ExpectedTitle = "Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_apple']")
	WebElement 	appleshoppingeventkey;
	
	public void clickonappleshoppingevent() {
		appleshoppingeventkey.click();
	}
	
	public void validateappleshoppingevent() {
		String ExpectedTitle = "Apple Shopping Event – Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Deals By Category Validations
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_tvs_projectors']")
	WebElement tvsandprojectorskey;
 
	public void clickontvsandprojectors() {
		tvsandprojectorskey.click();
	}
	
	public void validatetvsandprojectors() {
		String ExpectedTitle = "Top Deals on TVs and Projectors - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_com']")
	WebElement laptopsandcomputerskey;

	public void clickonlaptopsandcomputers() {
		laptopsandcomputerskey.click();
	}
	
	public void validatelaptopsandcomputers() {
		String ExpectedTitle = "Top Deals on Laptops & Computers - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_tab']")
	WebElement tabletsandereaderskey;

	public void clickontabbletsandereaders() {
		tabletsandereaderskey.click();
	}
	
	public void validatetabbletsandereaders() {
		String ExpectedTitle = "Top Deals on Tablets - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_vg']")
	WebElement videogamesandvrkey;

	public void clickonvideogamesandvr() {
		videogamesandvrkey.click();
	}
	
	public void validatevideogamesandvr() {
		String ExpectedTitle = "Top Deals on Video Games and Consoles - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_hed']")
	WebElement headphoneskey;

	public void clickonheadphones() {
		headphoneskey.click();
	}
	
	public void validateheadphones() {
		String ExpectedTitle = "Top Deals on Headphones - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_cel']")
	WebElement cellphoneskey;

	public void clickoncellphones() {
		cellphoneskey.click();
	}
	
	public void validatecellphones() {
		String ExpectedTitle = "Top Deals on Cell Phones and Accessories - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_pcgaming']")
	WebElement pcgamingkey;

	public void clickonpcgaming() {
		pcgamingkey.click();
	}
	
	public void validatepcgaming() {
		String ExpectedTitle = "Top Deals on PC Gaming Electronics - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_sbs']")
    WebElement soundbarsandspeakerskey;
	
	public void clickonsoundbarsandspeakers() {
		soundbarsandspeakerskey.click();
	}
	
	public void validatesoundbarsandspeakers() {
		String ExpectedTitle = "Top Deals on Sound Bars and Speakers - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_vsmp']")
    WebElement videoandstreamingmediaplayerskey;
	
	public void clickonvideoandstreamingmediaplayers() {
		videoandstreamingmediaplayerskey.click();
	}
	
	public void validatevideoandstreamingmediaplayers() {
		String ExpectedTitle = "Top Deals on Video and Streaming Media Players - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_shs']")
    WebElement smarthomeandnetworkingkey;	
	
	public void clickonsmarthomeandnetworking() {
		smarthomeandnetworkingkey.click();
	}
	
	public void validatesmarthomeandnetworking() {
		String ExpectedTitle = "Top Deals on Smart Home Electronics - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_toys']")
    WebElement toysgamesandcollectibleskey;
	
	public void clickontoysgamesandcollectibles() {
		toysgamesandcollectibleskey.click();
	}
	
	public void validatetoysgamesandcollectibles() {
		String ExpectedTitle = "Top Deals on Toys, Games & Collectibles - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_cc']")
    WebElement camerascamcordersanddroneskey;
	
	public void clickoncamerascamcordersanddrones() {
		camerascamcordersanddroneskey.click();
	}
	
	public void validatecamerascamcordersanddrones() {
		String ExpectedTitle = "Top Deals on Cameras and Camcorders - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_wt']")
    WebElement wearabletechnologykey;
	
	public void clickonwearabletechnology() {
		wearabletechnologykey.click();
	}
	
	public void validatewearabletechnology() {
		String ExpectedTitle = "Top Deals on Wearable Technology - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_majapp']")
    WebElement majorapplianceskey;
	
	public void clickonmajorappliances() {
		majorapplianceskey.click();
	}
	
	public void validatemajorappliances() {
		String ExpectedTitle = "Major Appliance Deals";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_smapp']")
    WebElement smallapplianceskey;
	
	public void clickonsmallappliances() {
		smallapplianceskey.click();
	}
	
	public void validatesmallappliances() {
		String ExpectedTitle = "Top Deals on Small Kitchen Appliances - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_mm']")
    WebElement moviestvshowsandmusickey;
	
	public void clickonmoviestvshowsandmusic() {
		moviestvshowsandmusickey.click();
	}
	
	public void validatemoviestvshowsandmusic() {
		String ExpectedTitle = "Top Deals on Movies and Music - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_print']")
    WebElement printersandhomeofficekey;
	
	public void clickonprintersandhomeoffice() {
		printersandhomeofficekey.click();
	}
	
	public void validateprintersandhomeoffice() {
		String ExpectedTitle = "Top Deals on Laptops & Computers - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_sl']")
    WebElement homeandoutdoorkey;
	
	public void clickonhomeandoutdoor() {
		homeandoutdoorkey.click();
	}
	
	public void validatehomeandoutdoor() {
		String ExpectedTitle = "Top Deals on Home & Outdoor - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_car']")
    WebElement carelectronicsandgpskey;
	
	public void clickoncarelectronicsandgps() {
		carelectronicsandgpskey.click();
	}
	
	public void validatecarelectronicsandgps() {
		String ExpectedTitle = "Top Deals on Car Electronics and GPS - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_td_season']")
    WebElement electrictransportationkey;

	public void clickonelectrictransportation() {
		electrictransportationkey.click();
	}
	
	public void validateelectrictransportation() {
		String ExpectedTitle = "Top Deals on Electric Transportation - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_dls_sap']")
	WebElement salesandpromotionskey;

	public void clickonsalesandpromotions() {
		salesandpromotionskey.click();
	}
	
	public void validatesalesandpromotions() {
		String ExpectedTitle = "Sales and Promotions at Best Buy: On Sale Electronics, Coupons and Promo Codes";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}

	@FindBy (xpath = "//a[@data-lid='ubr_dls_clear']")
    WebElement 	clearanceandmorekey;

	public void clickonclearanceandmore() {
		clearanceandmorekey.click();
	}
	
	public void validateclearanceandmore() {
		String ExpectedTitle = "Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Support & Services Validations
	@FindBy (xpath = "//button[@data-id='node-61']")
	WebElement supportandservicesbutton;
	
	public void clickonsupportandservicesbutton() {
		supportandservicesbutton.click();
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_help']")
	WebElement visitoursupportcenterkey;

	public void clickonvisitoursupportcenter() {
		visitoursupportcenterkey.click();
	}
	
	public void validatevisitoursupportcenter() {
		String ExpectedTitle = "Best Buy Support & Customer Service";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_sas']")
	WebElement scheduleaservicekey;

	public void clickonscheduleaservice() {
		scheduleaservicekey.click();
	}
	
	public void validatescheduleaservice() {
		String ExpectedTitle = "Schedule a Service - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_remote_support']")
	WebElement onlinesupportkey;

	public void clickononlinesupport() {
		onlinesupportkey.click();
	}
	
	public void validateonlinesupport() {
		String ExpectedTitle = "Remote Support: Geek Squad - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_manage_appointment']")
	WebElement manageanappoinmentkey;

	public void clickonmanageanappoinment() {
		manageanappoinmentkey.click();
	}
	
	public void validatemanageanappoinment() {
		String ExpectedTitle = "Appointment Finder - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_shop']")
	WebElement shopwithanexpertkey;

	public void clickonshopwithanexpert() {
		shopwithanexpertkey.click();
	}
	
	public void validateshopwithanexpert() {
		String ExpectedTitle = "Shop with an Expert - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_tyr']")
	WebElement checkrepairstatuskey;

	public void clickoncheckrepairstatus() {
		checkrepairstatuskey.click();
	}
	
	public void validatecheckrepairstatus() {
		String ExpectedTitle = "Track Your Repair - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_iha']")
	WebElement freehomeconsultationkey;

	public void clickonfreehomeconsultation() {
		freehomeconsultationkey.click();
	}
	
	public void validatefreehomeconsultation() {
		String ExpectedTitle = "Best Buy Home: Virtual and In-Home Consultation - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Learn About Services by Category Validations
	@FindBy (xpath = "//a[@data-lid='ubr_svc_css']")
	WebElement computerandtabletserviceskey;

	public void clickoncomputerandtabletservices() {
		computerandtabletserviceskey.click();
	}
	
	public void validatecomputerandtabletservices() {
		String ExpectedTitle = "Computer, Laptop & Tablet Repairs & Services by Geek Squad - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_hts']")
	WebElement tvandhometheaterserviceskey;

	public void clickontvandhometheaterservices() {
		tvandhometheaterserviceskey.click();
	}
	
	public void validatetvandhometheaterservices() {
		String ExpectedTitle = "TV & Home Theater Services: Geek Squad - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_app']")
	WebElement applianceserviceskey;

	public void clickonapplianceservices() {
		applianceserviceskey.click();
	}
	
	public void validateapplianceservices() {
		String ExpectedTitle = "Appliance Services: Geek Squad - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_cel']")
	WebElement cellphoneserviceskey;

	public void clickoncellphoneservices() {
		cellphoneserviceskey.click();
	}
	
	public void validatecellphoneservices() {
		String ExpectedTitle = "Cell Phone Services and Repair – Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_aasp']")
	WebElement appleauthorizedrepairkey;

	public void clickonappleauthorizedrepair() {
		appleauthorizedrepairkey.click();
	}
	
	public void validateappleauthorizedrepair() {
		String ExpectedTitle = "Apple Repair Services: Apple Authorized Service Provider - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_ch']")
	WebElement smarthomeserviceskey;

	public void clickonsmarthomeservices() {
		smarthomeserviceskey.click();
	}
	
	public void validatesmarthomeservices() {
		String ExpectedTitle = "Smart Home Services: Installation, Set Up & Support - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_cin']")
	WebElement carelectronicsprofessionalinstallationkey;

	public void clickoncarelectronicsprofessionalinstallation() {
		carelectronicsprofessionalinstallationkey.click();
	}
	
	public void validatecarelectronicsprofessionalinstallation() {
		String ExpectedTitle = "Car Electronics Professional Installation - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_fitness']")
	WebElement fitnessequipmentserviceskey;

	public void clickonfitnessequipmentservices() {
		fitnessequipmentserviceskey.click();
	}
	
	public void validatefitnessequipmentservices() {
		String ExpectedTitle = "Fitness Equipment Services - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_all']")
	WebElement allserviceskey;

	public void clickonallservices() {
		allserviceskey.click();
	}
	
	public void validateallservices() {
		String ExpectedTitle = "Services - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Protection & Support Plans Validations
	@FindBy (xpath = "//a[@data-lid='ubr_svc_best_buy_totaltech_membership']")
	WebElement bestbuytotaltechmembershipkey;

	public void clickonbestbuytotaltechmembership() {
		bestbuytotaltechmembershipkey.click();
	}
	
	public void validatebestbuytotaltechmembership() {
		String ExpectedTitle = "Best Buy Totaltech™ – Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_gqs']")
	WebElement geeksquadprotectionkey;

	public void clickongeeksquadprotection() {
		geeksquadprotectionkey.click();
	}
	
	public void validategeeksquadprotection() {
		String ExpectedTitle = "Geek Squad Protection - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_apl']")
	WebElement applecarekey;

	public void clickonapplecare() {
		applecarekey.click();
	}
	
	public void validateapplecare() {
		String ExpectedTitle = "AppleCare & AppleCare+ - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Additional Services Validations
	@FindBy (xpath = "//a[@data-lid='ubr_svc_gstt']")
	WebElement techtipskey;

	public void clickontechtips() {
		techtipskey.click();
	}
	
	public void validatetechtips() {
		String ExpectedTitle = "Geek Squad Tech Tips - Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_tin']")
	WebElement tradeinyourdevicekey;

	public void clickontradeinyourdevice() {
		tradeinyourdevicekey.click();
	}
	
	public void validatetradeinyourdevice() {
		String ExpectedTitle = "Best Buy Trade In Program for Computers, Cell Phones and More";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_rcy']")
	WebElement haulawayandrecyclingkey;

	public void clickonhaulawayandrecycling() {
		haulawayandrecyclingkey.click();
	}
	
	public void validatehaulawayandrecycling() {
		String ExpectedTitle = "Electronics and Appliances Recycling at Best Buy";              
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_svc_frp']")
	WebElement findreplacementpartskey;
	
	public void clickonfindreplacementparts() {
		findreplacementpartskey.click();
	}
	
	public void validatefindreplacementparts() {
		String ExpectedTitle = "PartStore.com Parts and Accessories";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Brands Validations
	@FindBy (xpath = "(//button[@class='c-button-unstyled top-four v-fw-medium'])[3]")
	WebElement brandsbutton;
	
	public void clickonbrandsbutton() {
		brandsbutton.click();
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_bbyex']")
	WebElement bestbuybrandskey;
	
	public void clickonbestbuybrands() {
		bestbuybrandskey.click();
	}
	
	public void validatebestbuybrands() {
		String ExpectedTitle = "Insignia, Rocketfish, Dynex, Platinum and Modal - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_apl']")
	WebElement applekey;
	
	public void clickonapple() {
		applekey.click();
	}
	
	public void validateapple() {
		String ExpectedTitle = "Apple – Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_see']")
	WebElement samsungkey;
	
	public void clickonsamsung() {
		samsungkey.click();
	}
	
	public void validatesamsung() {
		String ExpectedTitle = "Samsung Store – Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_msw']")
	WebElement microsoftkey;
	
	public void clickonmicrosoft() {
		microsoftkey.click();
	}
	
	public void validatemicrosoft() {
		String ExpectedTitle = "Microsoft Brand Store - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_son']")
	WebElement sonykey;
	
	public void clickonsony() {
		sonykey.click();
	}
	
	public void validatesony() {
		String ExpectedTitle = "Sony Store: Sony Electronics & Entertainment - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_int']")
	WebElement intelkey;
	
	public void clickonintel() {
		intelkey.click();
	}
	
	public void validateintel() {
		String ExpectedTitle = "Intel: Intel Powered Laptops & Desktops - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_yardbird']")
	WebElement yardbirdkey;
	
	public void clickonyardbird() {
		yardbirdkey.click();
	}
	
	public void validateyardbird() {
		String ExpectedTitle = "Yardbird – Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Featured Brands Validations
	@FindBy (xpath = "//a[@data-lid='ubr_shp_len']")
	WebElement lenovokey;
	
	public void clickonlenovo() {
		lenovokey.click();
	}
	
	public void validatelenovo() {
		String ExpectedTitle = "Lenovo Computers - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_lg']")
	WebElement lgkey;
	
	public void clickonlg() {
		lgkey.click();
	}
	
	public void validatelg() {
		String ExpectedTitle = "LG Store - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_nik']")
	WebElement nikonkey;
	
	public void clickonnikon() {
		nikonkey.click();
	}
	
	public void validatenikon() {
		String ExpectedTitle = "Nikon Cameras: Nikon Digital Cameras - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_bse']")
	WebElement bosekey;
	
	public void clickonbose() {
		bosekey.click();
	}
	
	public void validatebose() {
		String ExpectedTitle = "Bose Electronics Store, Bose Stereo Equipment - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_can']")
	WebElement canonkey;
	
	public void clickoncanon() {
		canonkey.click();
	}
	
	public void validatecanon() {
		String ExpectedTitle = "Canon Cameras, Lenses, and Accessories - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_dell']")
	WebElement dellkey;
	
	public void clickondell() {
		dellkey.click();
	}
	
	public void validatedell() {
		String ExpectedTitle = "Dell Computers - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_gp']")
	WebElement goprokey;
	
	public void clickongopro() {
		goprokey.click();
	}
	
	public void validategopro() {
		String ExpectedTitle = "GoPro Action Cameras, Drones, Mounts & Accessories - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_hp']")
	WebElement hpkey;
	
	public void clickonhp() {
		hpkey.click();
	}
	
	public void validatehp() {
		String ExpectedTitle = "HP - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_sonos']")
	WebElement sonoskey;
	
	public void clickonsonos() {
		sonoskey.click();
	}
	
	public void validatesonos() {
		String ExpectedTitle = "Sonos Systems: Home Audio & Wireless Speakers - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_all']")
	WebElement allbrandskey;
	
	public void clickonallbrands() {
		allbrandskey.click();
	}
	
	public void validateallbrands() {
		String ExpectedTitle = "Name Brands - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Specialty Shops Validations
	@FindBy (xpath = "//a[@data-lid='ubr_shp_premium_audio_video']")
	WebElement premiumaudioandvideokey;
	
	public void clickonpremiumaudioandvideo() {
		premiumaudioandvideokey.click();
	}
	
	public void validatepremiumaudioandvideo() {
		String ExpectedTitle = "Premium Audio & Video - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_pac']")
	WebElement pacifickitchenandhomekey;
	
	public void clickonpacifickitchenandhome() {
		pacifickitchenandhomekey.click();
	}
	
	public void validatepacifickitchenandhome() {
		String ExpectedTitle = "Pacific Sales Premium Appliances – Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_ces']")
	WebElement cameraexperienceshopkey;
	
	public void clickoncameraexperienceshop() {
		cameraexperienceshopkey.click();
	}
	
	public void validatecameraexperienceshop() {
		String ExpectedTitle = "Camera Experience Shop: Photography & Camera Store – Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	// Featured Validations
	@FindBy (xpath = "(//button[@class='c-button-unstyled top-four v-fw-medium'])[4]")
	WebElement featuredbutton;
	
	public void clickonfeaturedbutton() {
		featuredbutton.click();
	}
	
	@FindBy (xpath = "(//a[@class=\"hamburger-menu-flyout-list-item  \"])[1]")
	WebElement mothersgiftkey;
	
	public void clickonmothersgiftkey() {
		mothersgiftkey.click();
	}
	
	public void validatemothersgiftkey() {
		String ExpectedTitle = "Mother's Day Gift Ideas: Best Gifts For Mom - Best Buy";
	Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_ftr_lego_toys']")
	WebElement legotoyskey;
	
	public void clickonlegotoys() {
		legotoyskey.click();
	}
	
	public void validatelegotoys() {
		String ExpectedTitle = "LEGO - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_ftr_latest_from_apple']")
	WebElement latestfromapplekey;
	
	public void clickonlatestfromapple() {
		latestfromapplekey.click();
	}
	
	public void validatelatestfromapple() {
		String ExpectedTitle = "Apple – Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_ftr_smart_home_solutions']")
	WebElement smarthomesolutionskey;
	
	public void clickonsmarthomesolutions() {
		smarthomesolutionskey.click();
	}
	
	public void validatesmarthomesolutions() {
		String ExpectedTitle = "Smart Home Solutions - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_ftr_electric_transportation']")
	WebElement electrictransportationskey;
	
	public void clickonelectrictransportations() {
		electrictransportationskey.click();
	}
	
	public void validateelectrictransportations() {
		String ExpectedTitle = "Electric Transportation: Electric Vehicles - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_ftr_teen_tech_center']")
	WebElement teentechcenterkey;
	
	public void clickonteentechcenter() {
		teentechcenterkey.click();
	}
	
	public void validateteentechcenter() {
		String ExpectedTitle = "Teen Tech Centers - Best Buy";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
	}

}