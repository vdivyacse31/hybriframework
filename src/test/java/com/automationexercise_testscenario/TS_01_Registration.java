package com.automationexercise_testscenario;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
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
	
	@Test
	public void tc_03() throws Exception {
			driver.findElement(By.name("email")).sendKeys("tet@gmail.com");
			 driver.findElement(By.name("password")).sendKeys("test");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
			}
 @Test
 public void tc_04() throws Exception {
	 driver.findElement(By.name("name")).sendKeys("Div");
	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("div@gamil.com");
	 driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
 }
@Test
public void tc_05() throws Exception {
	driver.findElement(By.name("title")).click();
	//driver.findElement(By.id("name")).sendKeys("Div");
	//driver.findElement(By.id("email")).sendKeys("div@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test123");
	new Select(driver.findElement(By.id("days"))).selectByVisibleText("8");
	new Select(driver.findElement(By.id("months"))).selectByVisibleText("May");
	new Select(driver.findElement(By.id("years"))).selectByVisibleText("2021");
	driver.findElement(By.name("optin")).click();
	driver.findElement(By.id("first_name")).sendKeys("test");
	driver.findElement(By.id("last_name")).sendKeys("Tes");
	driver.findElement(By.id("company")).sendKeys("TDE");
	driver.findElement(By.name("address1")).sendKeys("42321 test");
	driver.findElement(By.name("address2")).sendKeys("Tes222");
	new Select(driver.findElement(By.name("country"))).selectByVisibleText("India");
	driver.findElement(By.name("state")).sendKeys("Vir");
	driver.findElement(By.name("city")).sendKeys("Bro");
	driver.findElement(By.name("zipcode")).sendKeys("23456");
	driver.findElement(By.name("mobile_number")).sendKeys("2345678978");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();
	
	
	
	
}
 
}
