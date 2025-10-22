package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTextDemo {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationexercise.com/login");
	  
	  driver.findElement(By.name("email")).sendKeys("sdfsdgsdgsdqwe@fewgsdg.sdfd");
	  driver.findElement(By.name("password")).sendKeys("sdgdsg");
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	  
	  String errorText =  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p")).getText();
		System.out.println(errorText);
  }
}
