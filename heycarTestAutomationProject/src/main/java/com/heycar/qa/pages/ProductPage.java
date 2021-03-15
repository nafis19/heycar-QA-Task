package com.heycar.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.heycar.qa.base.BaseTest;


public class ProductPage extends BaseTest{
	
	//Page Factory
		@FindBy(xpath = "//*[@id=\"location-filter-content\"]/div[2]/div[2]/div/span[1]")
		WebElement postCodePresent;
		
		@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[2]/div[1]")
		WebElement productPageTest;
		
	
		
		public ProductPage() {
			
			PageFactory.initElements(driver, this);
		}
		
		public String validateProductPageURL() {
			
			return driver.getCurrentUrl();
		}
		
}



