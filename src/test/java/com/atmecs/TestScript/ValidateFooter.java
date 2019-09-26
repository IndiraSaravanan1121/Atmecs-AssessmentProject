package com.atmecs.TestScript;

import org.testng.annotations.Test;

import com.atmecs.BrowserSetup.BrowserSetup;
import com.atmecs.Helper.MouseAction;
import com.atmecs.Pages.ValidateContextMenuItem;
import com.atmecs.Pages.ValidationFooterPage;

public class ValidateFooter extends BrowserSetup {

	@Test(priority = 0)
	public void verifyFooter() throws Exception {
		MouseAction.scrollDown();
		ValidationFooterPage.validateFooter(driver);
	}

	@Test(priority = 1)
	public void validateContextMenu() throws Exception {
		ValidateContextMenuItem.validateContextMenuItem();

	}
}
