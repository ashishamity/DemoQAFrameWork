package com.demoqa.test.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.demoqa.test.base.TestBase;

public class TestUtil extends TestBase{

	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 40;
	public static int NUMBER_OF_RESIZE = 3;
	public static String DROPPED = "Dropped!";
	public static String DROP_HERE = "Drop here";
	
	
	public static void changeText(WebElement target){
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].innerHTML='" + "Drop here" + "'", target);
	}
	
	
	
}
