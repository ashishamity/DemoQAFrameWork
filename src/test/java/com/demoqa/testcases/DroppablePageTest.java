package com.demoqa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoqa.test.base.TestBase;
import com.demoqa.test.pages.DroppablePage;
import com.demoqa.test.pages.HomePage;
import com.demoqa.test.util.TestUtil;

public class DroppablePageTest extends TestBase{

	HomePage homePage;
	DroppablePage dropPage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		dropPage= homePage.clickonDropLink();
	}
	
	@Test
	public void dragAndDrop(){
		 dropPage.performDragDrop();
		 Assert.assertEquals(dropPage.verifyText(), TestUtil.DROPPED);
	}
	
	@Test
	public void dragBack(){
		 dropPage.performDragDropBack();
		 Assert.assertEquals(dropPage.verifyText(), TestUtil.DROP_HERE);	
	}
	
	@AfterMethod
	public void tearDown(){
	 driver.quit();
	}

}
