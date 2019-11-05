package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/ ");
		driver.manage().window().maximize();
		WebElement obj=driver.findElement(By.xpath("//a[@class='gb_B gb_sc']"));
		obj.click();
		WebElement clic=driver.findElement(By.id("gb23"));
		clic.click();
		
	}

}
