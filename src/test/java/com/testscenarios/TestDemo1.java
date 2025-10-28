package com.testscenarios;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestDemo1 {
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.automationtesting.in/Register.html");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("aaa");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("bbb");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Broadland");
	  driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("aaa@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("4567898345");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
	  driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
	//  driver.findElement(By.id("msdd")).sendKeys("Arabic");
	  new Select(driver.findElement(By.id("Skills"))).selectByVisibleText("APIs");
	  new Select(driver.findElement(By.id("yearbox"))).selectByVisibleText("1920");
	  new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"))).selectByVisibleText("July");
	  new Select(driver.findElement(By.id("daybox"))).selectByVisibleText("10");
	  
  }
  
}
