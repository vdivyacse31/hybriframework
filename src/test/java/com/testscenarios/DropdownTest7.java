package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


		public class DropdownTest7 {
			@Test
					public void Abc() {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://blazedemo.com/");
				// create a new account button
				// driver.findElement(By.xpath("//html/body/div[3]/form/select[1]")).click();
				
				//dropdown code
				
				new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
				new Select(driver.findElement(By.name("toPort"))).selectByContainsVisibleText("London");
			}
			}


