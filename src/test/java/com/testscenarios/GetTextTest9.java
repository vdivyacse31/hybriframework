package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTextTest9 {
	@Test

	public void f() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opencart-prf.stepcloud.ch/index.php?route=account/login");
	
	driver.findElement(By.name("email")).sendKeys("");
	driver.findElement(By.name("password")).sendKeys("");
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	
	String errorText= driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText();
	System.out.println("errorText");

	}

}
