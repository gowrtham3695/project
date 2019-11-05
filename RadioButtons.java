package org.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> obj =driver.findElements(By.name("sex"));
		int count=obj.size();
	//	System.out.println(count);
		//========
		for(int i=0;i<count;i++)
		{
String value= obj.get(i).getText();
System.out.println(value);
//to click
obj.get(i).click();
	}
	}
}


