package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownDemo {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  //Click on Create new account button
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	   //dropdown code
	  new Select(driver.findElement(By.id("month"))).selectByVisibleText("Dec");
	  new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("17");
	  new Select(driver.findElement(By.id("year"))).selectByVisibleText("1956");
  }
}
