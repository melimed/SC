package IdentifyObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.get("http:\\www.qaclickacademy.com");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul/li[2]/a")));
		driver.findElement(By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul/li[2]/a")).click();
		driver.close();

	}

}
