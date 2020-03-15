package com.demoqa.test.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.test.base.TestBase;
import com.demoqa.test.util.TestUtil;

public class DroppablePage extends TestBase {
	
	@FindBy(id="draggable")
	WebElement source;
	
	@FindBy(id="droppable")
	WebElement target;
	
	Actions builder = new Actions(driver);
	
	public DroppablePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void performDragDrop(){
		 builder.dragAndDrop(source, target).perform();
	}

	public String verifyText(){
		String text = target.getText();
		return text;
	}
	
	public void performDragDropBack(){
		 builder.dragAndDropBy(target, 150, 150).perform();
		 TestUtil.changeText(target);
	}
}
