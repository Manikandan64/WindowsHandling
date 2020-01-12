package org.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSwitch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Ticketech\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Iphonex");
		
		WebElement searchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchbtn.click();
		
		WebElement iphone = driver.findElement(By.xpath("(//span[text()='Simple Mobile Prepaid - Apple iPhone XR (64GB) - Red'])[1]"));
		iphone.click();
		
		
		
		
	}

}
