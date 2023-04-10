package com.bestbuy.ecommerce.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchforandAddtoCartPage {
	
public WebDriver driver;
	
    public SearchforandAddtoCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
    @FindBy (xpath ="//img[@src = 'https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg']")
	WebElement choosecountry;
    
    @FindBy (xpath = "//input[@id='gh-search-input']")
    WebElement elementsearch;
    
    @FindBy (xpath = "//button[@title='submit search']")
    WebElement searchbutton;
    
    @FindBy (xpath = "(//a[@href='/site/samsung-galaxy-a54-5g-128gb-graphite-verizon/6538058.p?skuId=6538058'])[2]")
    WebElement product;
    
    @FindBy (xpath ="//button[@data-button-state='ADD_TO_PACKAGE_MOBILE']")
    WebElement addtocartbutton;
    
    @FindBy (xpath ="//button[@data-track='Verizon']")
    WebElement verisonbutton;

    @FindBy (xpath = "//button[@data-track='continue']")
    WebElement continuebutton1;

    @FindBy (xpath = "//button[@class='c-button c-button-secondary c-button-lg nice-choice-page__continue-button']")
    WebElement letsgetstartedbutton;

    @FindBy (xpath = "//label[@for='transactions-page__no']")
    WebElement nooptionkey;

    @FindBy (xpath ="//button[@class='c-button c-button-secondary c-button-lg c-button-block transactions-page__continue-button']")
    WebElement continuebutton2;

    @FindBy (xpath = "//button[@class='c-button c-button-outline c-button-lg c-button-block gray-outline-button']")
    WebElement nothanksbutton;

    @FindBy (xpath = "//button[@id='cnxfta-enterprise-trade-in-continue']")
    WebElement continuewithouttradeinbutton;

    @FindBy (xpath = "(//button[@class='c-show-hide-trigger c-accordion-trigger p-200 py-lg-300 px-lg-none flex align-items-center accordion-selection__button-dropdown'])[2]")    
    WebElement getnewnumberbutton;

    @FindBy (xpath = "//button[@cijinteractionname='Continue_New_Number']")
    WebElement continuebutton3;

    @FindBy (xpath ="//button[@id='cnxfta-plan-selection-select-plan-button-5']")
    WebElement verisonplanbutton;

    @FindBy (xpath = "//button[@id='cnxfta-plan-selection-continue-button']")  
    WebElement continuebutton4;

    @FindBy (xpath = "//button[@class='c-button c-button-secondary c-button-lg c-button-block fluid-buttons-s']")
    WebElement continuebutton5;
    
    @FindBy (xpath ="//*[contains(text(),'Your device has been added to your cart')]")
    WebElement addedtocart;

    @FindBy (xpath = "//button[@id='cnxfta-go-to-cart-banner-go-to-cart']")
    WebElement gotocartbutton;
    
    public void clickonCountry() {
		choosecountry.click();
	}
    
    public void clickonsearch() {
    	elementsearch.click();
    }
    
    public void entersearchitem(String SearchItem) {
    	elementsearch.sendKeys(SearchItem);
    }
    
    public void clickonsearchbutton() {
    	searchbutton.click();
	}
    
    public void clickonproduct() {
    	product.click();
	}
    
    public void clickonaddtocartbutton() {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("scrollBy(0,1000)");
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(addtocartbutton));
    	addtocartbutton.click();
    }
    
    public void clickonletsgetstartedbutton() {
    	letsgetstartedbutton.click();
    }
    
    public void clickonnooptionkey() {
    	nooptionkey.click();
    	continuebutton2.click();
    }
    
    public void clickonnothanksbutton() {
    	nothanksbutton.click();
    }
    
    public void clickoncontinuewithouttradeinbutton() {
    	continuewithouttradeinbutton.click();
    }
    
    public void clickongetnewnumberbutton() {
    	getnewnumberbutton.click();
    	continuebutton3.click();
    }
    
    public void clickonverisonplanbutton() {
    	verisonplanbutton.click();
    	continuebutton4.click();
    }

    public void clickoncontinuebutton() {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("arguments[0].click()", continuebutton5);
    }
    
    public void validateaddedtocart() {
    	String ExpectedText ="Your device has been added to your cart";
    	Assert.assertEquals(ExpectedText, addedtocart.getText());
    }
    
    public void clickongotocartbutton() {
    	gotocartbutton.click();
    }

}