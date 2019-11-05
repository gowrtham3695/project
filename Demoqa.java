package org.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqa {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get(" https://www.toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	Thread.sleep(5000);
	
	WebElement	obj1=driver.findElement(By.xpath("//input[@name='firstname']"));
	obj1.sendKeys("gowtham");
		
	
WebElement	obj=driver.findElement(By.xpath("//input[@id='lastname']"));
obj.sendKeys("b");
driver.findElement(By.xpath("//input[@id='sex-0']")).click();
driver.findElement(By.xpath("//input[@value='1']")).click();
driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("16-10-2019");
driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
driver.findElement(By.xpath("//input[@type='file']")).click();
driver.findElement(By.xpath("//input[value='Selenium IDE']")).click();
Select click = new Select (driver.findElement(By.xpath("//select[@id='continents']")));
click.selectByValue("EU");



}
}
