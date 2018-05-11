package IdentifyObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentTraversingXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("youtube");
		driver.findElement(By.xpath(".//input[@name='btnK']")).click();
		//if a tag is dynamic but you have an static son to hold on to to get to the dynamic parent
		driver.findElement(By.xpath(".//img[@src='/images/branding/googlelogo/2x/googlelogo_color_120x44dp.png']/parent::a")).click();
		driver.close();
		

	}

}
