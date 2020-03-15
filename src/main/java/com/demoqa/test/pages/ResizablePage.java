package com.demoqa.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.test.base.TestBase;
import com.demoqa.test.util.TestUtil;

public class ResizablePage extends TestBase{
	
	@FindBy(css=".ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se")
	WebElement resizableElement;
	@FindBy(id ="resizable")
	WebElement textArea;
	Actions action = new Actions(driver);
	
	
	public ResizablePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void resizeElement() {
		for (int i = 0; i <= TestUtil.NUMBER_OF_RESIZE; i++) {
			resize(resizableElement, i, 50, 50);
		}
	}
	
	public void resize(WebElement resizeElement, int numofTimes, int xOffset, int yOffset) {
		try {
		action.clickAndHold(resizeElement).moveByOffset(xOffset, yOffset).release().build().perform();
		log.info(System.lineSeparator()+"Resize number " + numofTimes +":" + System.lineSeparator() + textArea.getAttribute("style"));
		} catch (Exception e) {
		log.info("Unable to resize" + resizeElement + " - "	+ e.getStackTrace());
		}
	}
}
