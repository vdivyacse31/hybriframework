package com.automationexercise_testscenario;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.utilities.CommonFuntions;

public class TS_01_Registration extends CommonFuntions {
	

	@Test
	public void tc_01() throws Exception {
		chromeBrowserLaunch();		
		driver.get("https://automationexercise.com/products");
		Thread.sleep(2000);
		verifyWebElement(By.id("submit_search"));
		takeScreenshot("TS_01_Registration_tc_01");
	}

	@Test
	public void tc_02() throws Exception {
		driver.findElement(By.linkText("Signup / Login")).click();
		Thread.sleep(2000);
		// Verify Login page displayed or not? how?
		// Take any one of the web-element from Login page
		// validate that element "email" filed is displayed or not?
		verifyWebElement(By.name("email"));
		takeScreenshot("TS_01_Registration_tc_02");
	}

}
