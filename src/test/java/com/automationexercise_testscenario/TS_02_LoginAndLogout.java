package com.automationexercise_testscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utilities.CommonFuntions;

public class TS_02_LoginAndLogout extends CommonFuntions {
	@Parameters("browserName")
	@Test
	public void f(String browserName) throws Exception {

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
		driver.findElement(By.linkText("Signup / Login")).click();
		driver.findElement(By.name("email")).sendKeys("div30Oct2025_073249@gamil.com");
		driver.findElement(By.name("password")).sendKeys("Test123");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		takeScreenshot("TS_02_LoginAndLogout");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		takeScreenshot("TS_02_LoginAndLogout");

	}
}
