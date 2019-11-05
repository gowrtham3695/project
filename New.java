package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class New {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.cleartrip.com/trains");
	WebElement obj	=driver.findElement(By.xpath("//input[@id='from_station']"));
	obj.sendKeys("chennai");
	driver.findElement(By.xpath("//input[@id='to_station']")).sendKeys("madhurai");
	//1
	Select oops=new  Select (driver.findElement(By.xpath("//select[@id='trainClass']")));
	
	oops.selectByIndex(2);
//2
	Select oops1=new Select (driver.findElement(By.xpath("//select[@name='adults']")));
	oops1.selectByIndex(3);
	//3
	Select oops2=new Select (driver.findElement(By.xpath("//select[@name='male_seniors']")));
	
	oops2.selectByValue("2");
	
	//4
	 Select oops3= new Select(driver.findElement(By.xpath("//select[@id='train_female_seniors']")));
	 oops3.selectByValue("4");
	 //5
Select oops4	= new Select(driver.findElement(By.xpath("//select[@id='train_children']")));
oops4.selectByValue("3");
	driver.findElement(By.xpath("//input[@id='dpt_date']")).sendKeys("17/10/2019");
	driver.findElement(By.id("trainFormButton")).click();
	}
	

}
