package com.atmecs.BrowserSetup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import com.atmecs.Constants.Constants;
import com.atmecs.Properties.ReadProperties;
import com.atmecs.Report.ExtendReport;
import com.atmecs.Report.LogReport;

/**
 * @author indira.saravanan
 *
 */
public class BrowserSetup extends ExtendReport {

	LogReport log = new LogReport();

	@BeforeTest
	public void setup() throws IOException {

		test = extent.createTest("Browser Started");

		switch (ReadProperties.properties("browsername", Constants.configProperties_path)) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.chrome_path);
			driver = new ChromeDriver(); // create new instance for chrome driver
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.firefox_path);
			driver = new FirefoxDriver(); // create new instance for firefox driver
			break;

		case "IEDriver":
			System.setProperty("webdriver.ie.driver", Constants.iedriver_path);
			driver = new InternetExplorerDriver(); // create new instance for ie driver
			break;
		}

		// pass application URL
		driver.get(ReadProperties.properties("url", Constants.configProperties_path));

		log.logReport("Browser Opened");
		// maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void endReport() {
		log.logReport("Browser closed");
		driver.close();
		extent.flush();
	}

}
