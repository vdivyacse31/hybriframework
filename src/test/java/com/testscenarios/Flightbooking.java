package com.testscenarios;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Flightbooking {
  @Test
  public void basedemoflightdemo() throws Exception {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://blazedemo.com/");
	  
	// dropdown code

			new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
			new Select(driver.findElement(By.name("toPort"))).selectByContainsVisibleText("London");
			
			driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
			driver.findElement(By.id("inputName")).sendKeys("aaa");
			driver.findElement(By.id("address")).sendKeys("Broadland");
			driver.findElement(By.name("city")).sendKeys(" Ash");
			driver.findElement(By.name("state")).sendKeys("Nc");
			driver.findElement(By.name("zipCode")).sendKeys("23567");
			new Select(driver.findElement(By.name("cardType"))).selectByVisibleText("American Express");
			driver.findElement(By.id("creditCardNumber")).sendKeys("23456787654");
			driver.findElement(By.id("creditCardMonth")).sendKeys("12");
			driver.findElement(By.id("creditCardYear")).sendKeys("2025");
			driver.findElement(By.id("nameOnCard")).sendKeys("Test");
			driver.findElement(By.name("rememberMe")).click();
			driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
			
			Thread.sleep(6000);
			
			// take screenshot code
			File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(abc, new File("C:\\Users\\divya\\eclipse-workspace\\Hybrid_Famework\\screenshots\\blazedemo.com"));
			
			
			
	  
			
  }
}
