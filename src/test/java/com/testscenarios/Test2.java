package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.findElement(By.name("email")).sendKeys("Sreenivastest@yahho.com");
		driver.findElement(By.name("password")).sendKeys("Sreenivas123");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();

	}

}
