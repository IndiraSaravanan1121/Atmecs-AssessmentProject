package com.atmecs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.atmecs.BrowserSetup.BrowserSetup;

public class ValidateContextMenuItem extends BrowserSetup {

	public static void validateContextMenuItem() {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//li[@id=\"menu-item-25\"]/a"));
		action.moveToElement(element);
		action.contextClick(element).build().perform();
		WebElement elementOpen = driver.findElement(By.xpath("//li[@id='menu-item-269']/a"));

		action.moveToElement(elementOpen);
	}

}
