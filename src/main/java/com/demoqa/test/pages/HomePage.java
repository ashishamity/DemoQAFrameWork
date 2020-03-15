package com.demoqa.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.test.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath ="//a[contains(text(),'Droppable')]")
	WebElement droppable;
	
	@FindBy(xpath ="//a[contains(text(),'Resizable')]")
	WebElement resizable;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public DroppablePage clickonDropLink(){
		droppable.click();
		return new DroppablePage();
	}
	
	public ResizablePage clickonResizeLink(){
		resizable.click();
		return new ResizablePage();
		
	}
}
