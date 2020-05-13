package com.demoqa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.test.base.TestBase;
import com.demoqa.test.pages.DroppablePage;
import com.demoqa.test.pages.HomePage;
import com.demoqa.test.pages.ResizablePage;

public class HomePageTest extends TestBase {
	
	HomePage homePage; 
	DroppablePage dropPage;
	ResizablePage resizePage;

	public HomePageTest() {
		super()
		
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		dropPage = new DroppablePage();
		resizePage = new ResizablePage();
		homePage = new HomePage();
	}
	
	@Test
	public void openDroppableLink(){
	 dropPage =homePage.clickonDropLink();
	}
	
	@Test
	public void openResizableLink(){
	 resizePage =homePage.clickonResizeLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
