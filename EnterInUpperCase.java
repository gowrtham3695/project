package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterInUpperCase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/b?node=17174518031&pf_rd_p=045a20ee-cf7a-4378-b0a1-dbed47029b53&pf_rd_r=94FRV69CYHT21W9VYTQE");
		Thread.sleep(5000);
		driver.manage().window().maximize();
	WebElement obj=	driver.findElement(By.id("twotabsearchtextbox"));
	Actions act = new Actions(driver);
	act.moveToElement(obj).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().contextClick().build().perform();

	}
}
