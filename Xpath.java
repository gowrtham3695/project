package org.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		
  WebElement obj=driver.findElement(By.xpath("//input[@name='email']"));
obj.sendKeys("gowtham01995");

System.out.println(obj.getText());
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gowtham");
System.out.println(obj.getText());
WebElement obj1=driver.findElement(By.className("_5iyx"));
System.out.println(obj.getText());

driver.findElement(By.xpath("//input[@value='Log In']")).click();
		

	}

}
