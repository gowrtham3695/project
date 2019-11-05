package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GreenTec {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		//WebElement obj=driver.findElement(By.xpath("//p[contains(text(),'is a leading Training and Placements company in Ch')]"));
		Actions acc = new Actions(driver);
		acc.moveToElement(driver.findElement(By.xpath("//font[contains(text(),'GREENS TECHNOLOGY')]"))).doubleClick().perform();
		
	}
}