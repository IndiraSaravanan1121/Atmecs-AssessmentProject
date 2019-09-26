package com.atmecs.TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.Constants.Constants;
import com.atmecs.Helper.ClickOperation;
import com.atmecs.Helper.MouseAction;
import com.atmecs.Pages.ValidateBlogsDate;
import com.atmecs.Properties.ReadProperties;

public class ValidateBlogs extends ValidateFooter {

	@Test(priority = 2)
	public void validateBlogDate() throws Exception {
		String insight = ReadProperties.properties("loc_insight_btn", Constants.pathProperties_file);
		MouseAction.mouseOver(insight);
		driver.findElement(By.xpath(ReadProperties.properties("loc_blogs_btn", Constants.pathProperties_file))).click();
		Thread.sleep(2000);
		ValidateBlogsDate
				.validateBlogsDate(ReadProperties.properties("loc_blogsdate_txt", Constants.pathProperties_file));
	}

	@Test(priority = 3)
	public void validateBlogText() throws Exception {
		ClickOperation.click("XPath", ReadProperties.properties("loc_readmore_link", Constants.pathProperties_file));
		String element = ReadProperties.properties("loc_breedcrumb_text", Constants.pathProperties_file);

	}

}
