package com.heycar.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.heycar.qa.base.BaseTest;

public class HomePage extends BaseTest{

	//Page Factory
		@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/button[2]")
		WebElement AcceptCookiesBtn;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/main/div[1]/div[1]/div/div[1]/div[2]/div/div/div[2]/div/div/label/input")
		WebElement postCodeField;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/main/div[1]/div[1]/div/div[1]/div[2]/div/div/div[5]/div/a/button")
		WebElement SearchBtn;
		
		@FindBy(xpath = "//*[@id=\"location-filter-content\"]/div[2]/div[2]/div/span[1]")
		WebElement postCodePresent;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[2]/div[1]")
		WebElement productPageTest;
		
	
		
		public HomePage() {
			
			wait = new WebDriverWait(driver, 15, 50);
			PageFactory.initElements(driver, this);
		}
		
		public String validateHomePageTitle() {
			
			return driver.getTitle();
		}
		
		public ProductPage navigateToProductPage() {
			
			AcceptCookiesBtn.click();
			postCodeField.sendKeys("08001 Barcelona");
			SearchBtn.click();
			wait.until(ExpectedConditions.visibilityOf(productPageTest));
			
			return new ProductPage();
			
	}
	
		public String getProductPageURL() {
			
			return driver.getCurrentUrl();
		}
		
	
}
