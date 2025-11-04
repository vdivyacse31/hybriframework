package com.automationexercise_testscenario;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utilities.CommonFuntions;

public class TS_08_WriteReview extends CommonFuntions {
  @Test
  public void f() throws Exception{
	  chromeBrowserLaunch();
	  driver.get("https://automationexercise.com");
	  Thread.sleep(2000);
	  	  driver.findElement(By.partialLinkText("Products")).click();
	  driver.findElement(By.name("search")).sendKeys("Kids");
	  driver.findElement(By.id("submit_search")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).sendKeys("View Product");
	  driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("name")).sendKeys("Test");
	  driver.findElement(By.id("email")).sendKeys("Test123@gmail.com");
	  driver.findElement(By.id("review")).sendKeys("Test review");
	  driver.findElement(By.id("button-review")).click();
  }
}
