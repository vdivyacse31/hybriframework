package com.automationexercise_testscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.utilities.CommonFuntions;

public class TS_03_ShoppingCart extends CommonFuntions{
  @Test
  public void f() throws Exception {
	  chromeBrowserLaunch();
	  driver.get("https://automationexercise.com");
	  Thread.sleep(2000);
	  	  driver.findElement(By.partialLinkText("Products")).click();
	  driver.findElement(By.name("search")).sendKeys("Kids");
	  driver.findElement(By.id("submit_search")).click();
	  Thread.sleep(2000);
	  //driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).sendKeys("View Product");
	  JavascriptExecutor jse=(JavascriptExecutor)driver;
	  jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")));
	  
	  driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
	 // driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).sendKeys("View Cart");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"product-13\"]/td[6]/a/i")).click();
	  takeScreenshot("TS_03_ShoppingCart");
	  
	  driver.quit();
	  
  }
}
