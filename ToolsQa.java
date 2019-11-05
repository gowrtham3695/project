package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolsQa {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\Practice\\driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		WebElement tab = table.findElement(By.xpath("//td[contains(text(),'China')]//following::td[4]"));

		String s=tab.getText();
		System.out.println(s);
}}
