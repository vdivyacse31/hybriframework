package com.utilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonFuntions {
	// Global Variable
	public static WebDriver driver;

	// Methods
	public void chromeBrowserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser Launched successfully****");
	}

	public void firefoxBrowserLaunch() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Firefox Browser Launched successfully****");
	}

	public void edgeBrowserLaunch() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Edge Browser Launched successfully****");
	}

	// Create a method for screenshot and re-use it where ever you want
	public void takeScreenshot(String nameOfScreenshot) throws Exception {
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File(".\\screenshots\\" + nameOfScreenshot +"_"+timeStamp() + ".PNG"));
		System.out.println("Screenshot taken successfully*****");
	}

	// Get system timeStamp
	public String timeStamp() {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timestamp = df.format(d);
		return timestamp;
	}

	
	// Verify any WebElement is displayed on current screen
	public void verifyWebElement(By locator) {
		if (driver.findElements(locator).size() > 0) {
			System.out.println(locator + " locator is displayed on screen****");
		} else {
			System.out.println(locator + " locator is NOT displayed on screen****");
		}
	}

}
