package org.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreenTech {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.greenstechnologys.com/");
	Thread.sleep(5000);
	WebElement obj1 = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='body-wrapper']/div[@id='content-wrapper']/div[@id='article-wrapper']/p[1]"));
	String text =obj1.getText();
	System.out.println(text);
	WebElement obj=driver.findElement(By.linkText("CONTACT US"));
	obj.click();
	
	driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("gowtham");
	driver.findElement(By.xpath("//input[@type='email'][1]")).sendKeys("gowtham0199@gmail.com");
	
}
}

