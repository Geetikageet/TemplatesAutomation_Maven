package com.MavenTemplates.Automate;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SurfforPrizes {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://campaign.odicci.com/#/4826ea1c563ce938a61f");
		driver.findElement(By.id("1042")).click();
		driver.findElement(By.id("1042")).sendKeys("Geetika");
		driver.findElement(By.id("1043")).click();
		driver.findElement(By.id("1043")).sendKeys("S");
		driver.findElement(By.id("1040")).click();
		driver.findElement(By.id("1040")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.id("10402")).click();
		driver.findElement(By.id("10402")).sendKeys("1993geetika@gmail.com");
		
		driver.findElement(By.id("1096")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"canvas\"]")).click();
		driver.quit();
		
	}
}
