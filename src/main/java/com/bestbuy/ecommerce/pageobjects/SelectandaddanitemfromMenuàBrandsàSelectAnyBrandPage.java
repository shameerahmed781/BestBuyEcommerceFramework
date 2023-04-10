package com.bestbuy.ecommerce.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectandaddanitemfromMenuàBrandsàSelectAnyBrandPage {
	
	public WebDriver driver;

	public SelectandaddanitemfromMenuàBrandsàSelectAnyBrandPage(WebDriver driver) {
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
	
	@FindBy (xpath = "//button[@data-id='node-86']")
	WebElement brandsbutton;
	
	public void clickonbrandsbutton() {
		brandsbutton.click();
	}
	
	@FindBy (xpath = "//a[@data-lid='ubr_shp_see']")
	WebElement samsungkey;
	
	public void clickonsamsung() {
		samsungkey.click();
	}
	
	@FindBy (xpath = "//a[@data-track='LP_NAVCOMPUTING_SOL42855']")
	WebElement navcomputing;
	
	public void clickonComputing() {
		navcomputing.click();
	}
	
	@FindBy (xpath = "(//button[@data-button-state='ADD_TO_CART'])[1]")
	WebElement addtocartbutton;
	
	public void clickonaddtocartbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(addtocartbutton));
		addtocartbutton.click();
	}
	
	@FindBy (xpath = "//a[@data-track='Attach Modal: Go to cart']")
	WebElement gotocartbutton;
	
	public void clickongotocartbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(gotocartbutton));
		gotocartbutton.click();
	}

}
