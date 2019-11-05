package org.xpath;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[text()='Login & Signup']")).click();
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("gowtham01995@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gowtham3695@");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		Thread.sleep(5000);
	WebElement obj =	driver.findElement(By.xpath("//button[@class='vh79eN']"));
	Actions act = new Actions(driver);
	act.click(obj).build().perform();
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 7 (Black, 32 GB)']")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for (String k : allwindow) {
			if(!k.equals(parentwindow)) {
				driver.switchTo().window(k);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
			}
			
		}
		
		
	}

}
