package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HyperlinkDemo {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  
	  //Click on Forgot password? hyperlink
	  driver.findElement(By.linkText("Forgot password?")).click();
	   
	//  driver.findElement(By.partialLinkText("Forg")).click();
	  
	  
  }
}
