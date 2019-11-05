package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Edit {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("http://www.leafground.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement obj =driver.findElement(By.xpath("//div[@id='post-153']//li[1]//a[1]"));
			obj.click();
			driver.findElement(By.id("email")).sendKeys("gowtham01995@gmail.com");
			driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("gowtham");
			WebElement obj1 =driver.findElement(By.xpath("//input[@value='TestLeaf']"));
			String value = obj1.getAttribute("value");
			System.out.println(value);
			WebElement cl =driver.findElement(By.xpath("//div[4]//div[1]//div[1]//input[1]"));
			cl.clear();
			WebElement disp = driver.findElement(By.xpath("//input[@disabled='true']"));
			boolean ena=disp.isEnabled();
			System.out.println(ena);
			
			
			
			
	}

}
	

	