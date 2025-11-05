package com.automationexercise_testscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utilities.CommonFuntions;

public class TS_04_ValidateSearching extends CommonFuntions {

	@Parameters("browserName")
	@Test
	public void searchProduct(String browserName) throws Exception {
		if (browserName.equalsIgnoreCase("Firefox")) {
			firefoxBrowserLaunch();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			edgeBrowserLaunch();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			chromeBrowserLaunch();
		} else {
			System.out.println("Please provide valid browser name***");
		}

		driver.get("https://automationexercise.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Products")).click();
		// driver.findElement(By.name("search")).sendKeys("Kids");
		// driver.findElement(By.id("submit_search")).click();
		driver.findElement(By.id("search_product")).sendKeys("women");
		driver.findElement(By.id("submit_search")).click();

		driver.findElement(By.id("search_product")).sendKeys("max");
		driver.findElement(By.id("submit_search")).click();

	}

}
