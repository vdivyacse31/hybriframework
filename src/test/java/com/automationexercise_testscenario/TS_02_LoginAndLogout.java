package com.automationexercise_testscenario;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utilities.CommonFuntions;

public class TS_02_LoginAndLogout extends CommonFuntions {
	@Test
	public void f() throws Exception {
		chromeBrowserLaunch();
		driver.get("https://automationexercise.com/products");
		Thread.sleep(2000);
		//driver.findElement(By.name("email")).sendKeys("")
	}
}
