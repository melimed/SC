package IdentifyObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//sintax for CssSelector for identify sintax="tag[attribute='value']"
		driver.findElement(By.cssSelector("a[href='https://www.google.com.mx/imghp?hl=es-419&tab=wi']")).click();
		
		driver.findElement(By.cssSelector("input[id='lst-ib']")).sendKeys("star");
		driver.findElement(By.cssSelector("input[id='lst-ib']")).sendKeys(Keys.ENTER);
		driver.close();
		

	}

}
