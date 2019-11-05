package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.leafground.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement homepage = driver.findElement(By.xpath("//li[2]//a[1]"));
	homepage.click();
//	WebElement home = driver.findElement(By.xpath("//button[@id='home']"));
//	home.click();
	WebElement pos =driver.findElement(By.id("position"));
	
}
}
