package org.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Barath\\selenium\\xpath\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		
		WebElement table = driver.findElement(By.xpath("(//table[contains(@class,'rb-monthTable')])[1]"));
		
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		for (WebElement x : tRows) {
			List<WebElement> tData = x.findElements(By.tagName("td"));
			for (WebElement y : tData) {
				String text = y.getText();
				System.out.println(text);
				if (text.equals("3")) {
					y.click();
					break;
				}
			}
		}
	}
}
