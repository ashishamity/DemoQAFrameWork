package com.demoqa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoqa.test.base.TestBase;
import com.demoqa.test.pages.HomePage;
import com.demoqa.test.pages.ResizablePage;

public class ResizablePageTest extends TestBase{
	ResizablePage resPage;
	HomePage homePage;
	
	
	@BeforeTest
	public void setUp() {
		initialization();
		homePage = new HomePage();
		resPage = homePage.clickonResizeLink();
	}
	
	@Test
	public void performResize() {
		resPage.resizeElement();
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
}
