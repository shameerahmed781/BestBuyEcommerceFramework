package com.bestbuy.ecommerce.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectandaddanitemfromMenuàShopbyDepartmentPage {
	
	public WebDriver driver;

	public SelectandaddanitemfromMenuàShopbyDepartmentPage(WebDriver driver) {
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

}
