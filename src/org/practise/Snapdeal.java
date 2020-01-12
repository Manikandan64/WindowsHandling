package org.practise;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Ticketech\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("Iphonex");
		Thread.sleep(3000);
		
		WebElement searchbtn = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		searchbtn.click();
		
		WebElement iphonex = driver.findElement(By.xpath("//p [text()='Apple iPhone X Soft Silicon Cases Apple iPhone X - Red Soft Pu Leather Look cover']"));
		iphonex.click();
		
		String parwin = driver.getWindowHandle();
		System.out.println(parwin);
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		for (String x : allwindows) {
			if(!parwin.equals(x));
			
			driver.switchTo().window(x);
			
		}
		
		WebElement addcart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		addcart.click();
		
		driver.quit();
		
		

}}
