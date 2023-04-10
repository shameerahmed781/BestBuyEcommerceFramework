package com.bestbuy.ecommerce.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class CreateAccountPage { 
	public WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//img[@src = 'https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg']")
	WebElement choosecountry;
	
	@FindBy (xpath = "//span[@class='v-p-right-xxs line-clamp']")
	WebElement accountkey;
	
	@FindBy (xpath = "//a[contains(@role,'button')][2]")
	WebElement createaccountbutton;
	
	@FindBy (xpath = "//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy (xpath ="//input[@id='lastName']")
	WebElement lastname;
	
	@FindBy (xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy (xpath = "//input[@id='fld-p1']")
	WebElement password;
	
	@FindBy (xpath = "//input[@id='reenterPassword']")
	WebElement confirmpassword;
	
	@FindBy (xpath = "//input[@id='phone']")
	WebElement mobilephonenumber;
	
	@FindBy (xpath = "//label[@for='is-recovery-phone']")
	WebElement checkbox;
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement createanaccountbutton;
	
	public void clickonCountry() {
		choosecountry.click();
	}
	
	public void clickonAccount() {
		accountkey.click();
	}
	
	public void clickoncreateaccountbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(createaccountbutton));
		createaccountbutton.click();
	}
	
	public void FirstName(String FirstName) {
		firstname.sendKeys(FirstName);
	}
	
	public void LastName(String LastName) {
		lastname.sendKeys(LastName);
	}
	
	public void Email(String Email) {
		email.sendKeys(Email);
	}
	
	public void Password(String Password) {
		password.sendKeys(Password);
	}
	
	public void ConfirmPassword(String ConfirmPassword) {
		confirmpassword.sendKeys(ConfirmPassword);
	}
	
	public void MobilePhoneNumber(String MobilePhoneNumber) {
		mobilephonenumber.sendKeys(MobilePhoneNumber);
	}
	
	public void clickoncheckbox() {
		checkbox.click();
	}
	
	public void clickoncreateanaccountbutton() {
		createanaccountbutton.click();
	}

}
