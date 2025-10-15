package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		//Create an Webdriver Object
		WebDriver driver;
		
		// Open any browser
		driver = new ChromeDriver();
		
		// Type FB URL
		driver.get("https://www.facebook.com/");
		
		// Type UN & PWD
		driver.findElement(By.id("email")).sendKeys("divyasdgdsgdsgds@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sdgsfdhgfh");
		// Click on Login button
		driver.findElement(By.name("login")).click();

	}

}
