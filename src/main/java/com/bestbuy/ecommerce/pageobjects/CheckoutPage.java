package com.bestbuy.ecommerce.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

    public class CheckoutPage {

	public WebDriver driver;

	public CheckoutPage(WebDriver driver) {
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
	
	@FindBy (xpath = "(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[1]")
	WebElement applianceskey;
	
	public void clickonappliances() {
		applianceskey.click();
	}
	
	@FindBy (xpath = "(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[1]")
	WebElement majorkitchenapplianceskey;
	
	public void clickonmajorkitchenappliances() {
		majorkitchenapplianceskey.click();
	}
	
	@FindBy (xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[8]")
	WebElement microwaveskey;
	
	public void clickonmicrowaves() {
		microwaveskey.click();
	}
	
	@FindBy (xpath = "(//a[@class='flex-link'])[2]")
	WebElement countertopmicrowaveskey;
	
	public void clickoncountertopmicrowaves() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(countertopmicrowaveskey));
		countertopmicrowaveskey.click();
	}
	
	@FindBy (xpath = "(//button[@data-button-state='ADD_TO_CART'])[1]")
	WebElement addtocartbutton;
	
	public void clickonaddtocartbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(addtocartbutton));
		addtocartbutton.click();
	}
	
	@FindBy (xpath = "//a[@class='c-button c-button-secondary c-button-sm c-button-block ']")
	WebElement gotocartbutton;
	
	public void clickongotocart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(gotocartbutton));
		gotocartbutton.click();
	}
	
	@FindBy (xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement checkoutbutton;
	
	public void clickoncheckout() {
		checkoutbutton.click();
	}
	
	@FindBy (xpath = "//button[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")
	WebElement continueasguestbutton;
	
	public void clickoncontinueasguest() {
		continueasguestbutton.click();
	}
	
	@FindBy (xpath = "//input[@id='user.emailAddress']")
	WebElement email;
	
	public void clickonemailaddress() {
		email.click();
	}
	
	public void enteremailaddress(String Email) {
		email.sendKeys(Email);
	}
	
	@FindBy (xpath = "//input[@id='user.phone']")
	WebElement phonenumber;
	
	public void clickonphonenumber() {
		phonenumber.click();
	}
	
	public void enterphonenumber(String PhoneNumber) {
		phonenumber.sendKeys(PhoneNumber);
	}
	
	@FindBy (xpath = "//label[contains(text(),'Text me updates about all my orders, services and ')]")
	WebElement checkbox;
	
	public void clickoncheckbox() {
		checkbox.click();
	}
	
	@FindBy (xpath = "//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continuetopaymentinformationbutton;
	
	public void clickoncontinuetopaymentinformation() {
		continuetopaymentinformationbutton.click();
	}
	
	@FindBy (xpath = "//input[@id='number']")
	WebElement creditordebitcardnumber;
	
	public void clickoncardnumber() {
		creditordebitcardnumber.click();
	}
	
	public void entercardnumber(String CardNumber) {
		creditordebitcardnumber.sendKeys(CardNumber);
	}
	
	@FindBy (xpath = "//select[@id='expMonth']")
	WebElement month;
	
	public void clickonmonth() {
		month.click();
	}
	
	@FindBy (xpath = "//option[@value='01']")
	WebElement monthoption;
	
	public void clickonmonthoption() {
		monthoption.click();
	}
	
	@FindBy (xpath = "//select[@id='expYear']")
	WebElement year;
	
	public void clickonyear() {
		year.click();
	}
	
	@FindBy (xpath = "//option[@value='2025']")
	WebElement yearoption;
	
	public void clickonyearoption() {
		yearoption.click();
	}
	
	@FindBy (xpath = "//input[@id='cvv']")
	WebElement securitycode;
	
	public void clickonsecuritycode() {
		securitycode.click();
	}
	
	public void entercvcnumber(String CVCNumber) {
		securitycode.sendKeys(CVCNumber);
	}
	
	@FindBy (xpath = "//input[@id='first-name']")
	WebElement firstname;
	
	public void clickonfirstname() {
		firstname.click();
	}
	
	public void enterfirstname(String FirstName) {
		firstname.sendKeys(FirstName);
	}
	
	@FindBy (xpath = "//input[@id='last-name']")
	WebElement lastname;
	
	public void clickonlastname() {
		lastname.click();
	}
	
	public void enterlastname(String LastName) {
		lastname.sendKeys(LastName);
	}
	
	@FindBy (xpath = "//input[@id='address-input']")
	WebElement address;
	
	public void clickonaddress() {
		address.click();
	}
	
	public void enteraddress(String Address) {
		address.sendKeys(Address);
	}
	
	@FindBy (xpath = "//input[@id='city']")
	WebElement city;
	
	public void clickoncity() {
		city.click();
	}
	
	public void entercity(String City) {
		city.sendKeys(City);
	}
	
	@FindBy (xpath = "//select[@id='state']")
	WebElement state;
	
	public void clickonstate() {
		state.click();
	}
	
	@FindBy (xpath = "//option[@value='TX']")
	WebElement stateoption;
	
	public void clickonstateoption() {
		stateoption.click();
	}
	
	@FindBy (xpath = "//input[@id='postalCode']")
	WebElement postalcode;
	
	public void clickonpostalcode() {
		postalcode.click();
	}
	
	public void enterpostalcode(String PostalCode) {
		postalcode.sendKeys(PostalCode);
	}
	
	@FindBy (xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement placeyourorderbutton;
	
	public void clickonplaceyourorder() {
		placeyourorderbutton.click();
	}
	
	@FindBy (xpath = "//p[contains(text(),'Please enter a valid card number.')]")
	WebElement invalidcardnumbererror;
	
	public void validatepayment() {
		String ExpectedText = "Please enter a valid card number.";
		Assert.assertEquals(ExpectedText, invalidcardnumbererror.getText());
	}

}