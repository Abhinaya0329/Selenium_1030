package com.qsp.genericutility;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilityClass 
{
Actions act;
public WebDriverUtilityClass(WebDriver driver) {
	act = new Actions(driver);
}

public void doubleClick(WebElement element) {
	act.doubleClick(element).perform();
}
public void ClickAndHold(WebElement element) {
	act.doubleClick(element).perform();
}
public void DragAndDrop(WebElement element) {
	act.doubleClick(element).perform();
}
public void switchToWindow(WebDriver driver ,String expectedUrl) {
	Set<String> allWindowIds = driver.getWindowHandles();
	for( String id: allWindowIds) {
		String actUrl = driver.switchTo().window(id).getCurrentUrl();
		if(actUrl.contains(expectedUrl)) {
			break;
		}
	}
	
}

public void switchToFrame(WebDriver driver,int index) {
	driver.switchTo().frame(index);
}
public Alert switchToAlert(WebDriver driver ) {
	return driver.switchTo().alert();
}
}

