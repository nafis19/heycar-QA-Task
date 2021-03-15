package com.heycar.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.heycar.qa.base.BaseTest;
import com.heycar.qa.pages.HomePage;
import com.heycar.qa.pages.ProductPage;


public class ProductPageTest extends BaseTest {
	
		HomePage homePage;
		ProductPage productPage;
		
		public ProductPageTest() {
			super();
		}
		
		@BeforeMethod
		public void setUp() {
			initialization();
			homePage = new HomePage();
			productPage = new ProductPage();
			productPage = homePage.navigateToProductPage();
			
		}
		
		@Test
		public void verifyOnProductPageTest() {
			
			String pageURL = productPage.validateProductPageURL();
			System.out.println(pageURL);
			Assert.assertEquals(pageURL, "https://heycar.com/buscar");
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();		
	
		}

}
