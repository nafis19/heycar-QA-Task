package com.heycar.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.heycar.qa.base.BaseTest;
import com.heycar.qa.pages.HomePage;


public class HomePageTest extends BaseTest {

	
		HomePage homePage;
		
		public HomePageTest() {
			super();
		}
		
		@BeforeMethod
		public void setUp() {
			initialization();
			homePage = new HomePage();
			
		}
		
		
		@Test(priority=1)
		public void verifyHomePageTest() {
			
			String text = homePage.validateHomePageTitle();
			System.out.println(text);
			Assert.assertEquals(text, "heycar | Coches de segunda mano de la mejor calidad");
			
		}
		
		
		@Test(priority=2)
		public void navigateToProductPageTest() {
			
			homePage.navigateToProductPage();
			
		}
		
		@Test(priority=3)
		public void getProductPageURLTest() {
			
			homePage.navigateToProductPage();
			String text = homePage.getProductPageURL();
			System.out.println(text);
			
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();		
		}
}
