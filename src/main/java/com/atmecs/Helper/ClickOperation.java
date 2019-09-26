package com.atmecs.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.BrowserSetup.BrowserSetup;

public class ClickOperation extends BrowserSetup {

	public void pressEnter(String locatorType, String element) {
		try {
			switch ("locatorType") {
			case "ClassName":
				driver.findElement(By.className(element)).sendKeys(Keys.ENTER);
				break;
			case "CssSelector":
				driver.findElement(By.cssSelector(element)).sendKeys(Keys.ENTER);
				break;
			case "Id":
				driver.findElement(By.id(element)).sendKeys(Keys.ENTER);
				break;
			case "LinkText":
				driver.findElement(By.linkText(element)).sendKeys(Keys.ENTER);
				break;
			case "Name":
				driver.findElement(By.name(element)).sendKeys(Keys.ENTER);
				break;
			case "PartialLinkText":
				driver.findElement(By.partialLinkText(element)).sendKeys(Keys.ENTER);
				break;
			case "TagName":
				driver.findElement(By.tagName(element)).sendKeys(Keys.ENTER);
				break;
			case "XPath":
				driver.findElement(By.xpath(element)).sendKeys(Keys.ENTER);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pressTab(String locatorType, String element) {
		try {
			switch ("locatorType") {
			case "ClassName":
				driver.findElement(By.className(element)).sendKeys(Keys.TAB);
				break;
			case "CssSelector":
				driver.findElement(By.cssSelector(element)).sendKeys(Keys.TAB);
				break;
			case "Id":
				driver.findElement(By.id(element)).sendKeys(Keys.TAB);
				break;
			case "LinkText":
				driver.findElement(By.linkText(element)).sendKeys(Keys.TAB);
				break;
			case "Name":
				driver.findElement(By.name(element)).sendKeys(Keys.TAB);
				break;
			case "PartialLinkText":
				driver.findElement(By.partialLinkText(element)).sendKeys(Keys.TAB);
				break;
			case "TagName":
				driver.findElement(By.tagName(element)).sendKeys(Keys.TAB);
				break;
			case "XPath":
				driver.findElement(By.xpath(element)).sendKeys(Keys.TAB);
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(String locatorType, String locator) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try {
			switch ("locatorType") {
			case "ClassName":
				wait.until(ExpectedConditions.elementToBeClickable(By.className(locator)));
				driver.findElement(By.className(locator)).click();
				break;
			case "CssSelector":
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
				driver.findElement(By.cssSelector(locator)).click();
				break;
			case "Id":
				wait.until(ExpectedConditions.elementToBeClickable(By.id(locator)));
				driver.findElement(By.id(locator)).click();
				break;
			case "LinkText":
				wait.until(ExpectedConditions.elementToBeClickable(By.linkText(locator)));
				driver.findElement(By.linkText(locator)).click();
				break;
			case "Name":
				wait.until(ExpectedConditions.elementToBeClickable(By.name(locator)));
				driver.findElement(By.name(locator)).click();
				break;
			case "PartialLinkText":
				wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(locator)));
				driver.findElement(By.partialLinkText(locator)).click();
				break;
			case "TagName":
				wait.until(ExpectedConditions.elementToBeClickable(By.tagName(locator)));
				driver.findElement(By.tagName(locator)).click();
				break;
			case "XPath":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
				driver.findElement(By.xpath(locator)).click();
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}