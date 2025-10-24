package com.testscenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HyperlinkTest8 {
	@Test
	
	public void A() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://phptravels.com/demo/");
		
		//click on About us link
		driver.findElement(By.linkText("About Us")).click();
		

	}
	
}
