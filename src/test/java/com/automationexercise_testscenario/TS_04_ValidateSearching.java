package com.automationexercise_testscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.utilities.CommonFuntions;

public class TS_04_ValidateSearching extends CommonFuntions {
  @Test
  public void f() throws Exception{
	  chromeBrowserLaunch();
	  	  driver.get("https://automationexercise.com");
	  Thread.sleep(2000);
	  	  driver.findElement(By.partialLinkText("Products")).click();
	  //driver.findElement(By.name("search")).sendKeys("Kids");
	  //driver.findElement(By.id("submit_search")).click();
  driver.findElement(By.id("search_product")).sendKeys("women");
  driver.findElement(By.id("submit_search")).click();
  
  driver.findElement(By.id("search_product")).sendKeys("max");
  driver.findElement(By.id("submit_search")).click();
  
  
  }
  


	
  }

