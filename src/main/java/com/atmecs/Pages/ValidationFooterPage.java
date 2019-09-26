package com.atmecs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.BrowserSetup.BrowserSetup;
import com.atmecs.Constants.Constants;
import com.atmecs.Helper.ClickOperation;
import com.atmecs.Helper.MouseAction;
import com.atmecs.Properties.ReadProperties;

public class ValidationFooterPage extends BrowserSetup {

	public static void validateFooter(WebDriver driver) throws Exception {
		String Footer = driver
				.findElement(By.xpath(ReadProperties.properties("loc_footerlink_txt", Constants.pathProperties_file)))
				.getText();
		System.out.println(Footer);

		MouseAction.scrollUp();
		ClickOperation.click("xpath", ReadProperties.properties("loc_aboutus_btn", Constants.pathProperties_file));
		MouseAction.scrollDown();
		String aboutusFooter = driver
				.findElement(By.xpath(ReadProperties.properties("loc_footerlink_txt", Constants.pathProperties_file)))
				.getText();

		FooterPage.validatefooterPage(aboutusFooter);
	}

}
