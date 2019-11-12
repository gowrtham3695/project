package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMOuse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(" http://www.leafground.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text()='Mouse Hover']")).click();
		WebElement obj1=driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
		Actions act = new Actions(driver);
		act.moveToElement(obj1).build().perform();
		WebElement obj =driver.findElement(By.xpath("//a[text()='Selenium']"));
		obj.click();
		
	}
}
}
