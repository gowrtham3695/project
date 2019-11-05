package org.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {
	public static void main(String[] args) throws InterruptedException {

	

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\Practice\\driver\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
	driver.get("https://www.salesforce.com/in/");
	driver.manage().window().maximize();
WebElement obj=	driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
Actions act = new Actions(driver);
act.moveToElement(obj).build().perform();
driver.findElement(By.xpath("//h2[@id='login']//a[contains(@class,'text-cirrus')]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("gowtham01995@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("gowtham");
driver.findElement(By.xpath("//input[@id='Login']")).click();

	
	}
}
	