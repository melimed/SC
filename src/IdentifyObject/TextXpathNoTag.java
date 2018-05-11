package IdentifyObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextXpathNoTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//Don't have the tag cause system is still developing you can use the actual text between the unknown tag
		driver.findElement(By.xpath(".//*[text()='Imágenes']")).click();
		
		driver.findElement(By.id("lst-ib")).sendKeys("star");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		driver.close();
		

	}

}
