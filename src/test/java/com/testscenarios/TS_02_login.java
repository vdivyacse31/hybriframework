package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_02_login {
	@Test
	public void tc_01_login_negativetesting() {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.findElement(By.name("email")).sendKeys("Sree@adc.com");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		//get the error message from UI print into console using get text method
		//validate error message through code
		String errormessage = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p")).getText();
		System.out.println(errormessage);

	}

	@Test
	public void tc_02_loginwithvalidcredentials() {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.findElement(By.name("email")).sendKeys("Sreenivastest@yahho.com");
		driver.findElement(By.name("password")).sendKeys("Sreenivas123");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	}
}
