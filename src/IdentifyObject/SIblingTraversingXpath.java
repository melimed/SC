package IdentifyObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SIblingTraversingXpath {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("youtube");
		//if a tag is dynamic but you have an static sibling to hold on to to get to the dynamic one
		driver.findElement(By.xpath(".//input[@name='btnK']/following-sibling::input[1]")).click();
		driver.close();
		

	}

}
