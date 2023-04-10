package com.bestbuy.ecommerce.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
	
	public WebDriver driver;

    public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
    @FindBy (xpath ="//img[@src = 'https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg']")
	WebElement choosecountry;
    
    @FindBy (xpath = "//span[@class='v-p-right-xxs line-clamp']")
	WebElement accountkey;
    
    @FindBy (xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
    WebElement signinbutton1;
    
    @FindBy (xpath = "//input[@id='fld-e']")
    WebElement email;
    
    @FindBy (xpath = "//input[@id='fld-p1']")
    WebElement password;
    
    @FindBy (xpath = "//button[@type='submit']")
    WebElement signinbutton2;
    
    public void clickonCountry() {
		choosecountry.click();
	}
    
    public void clickonAccount() {
		accountkey.click();
	}
    
    public void clickonsigninbutton1() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signinbutton1));
    	signinbutton1.click();
    }
    
    public void enterEmail(String Email) {
    	email.sendKeys(Email);
    }
    
    public void enterPassword(String Password) {
    	password.sendKeys(Password);
    }
    
    public void clickonsigninbutton2() {
    	signinbutton2.click();
    }

}
