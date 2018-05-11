package IdentifyObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("http://www.phptravels.net/");
		driver.findElement(By.id("li_myaccount")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropdown-menu")));
		driver.findElement(By.xpath("//*[@id='li_myaccoun']/ul/li[1]/a")).click();
		driver.getCurrentUrl().equals("http://www.phptravels.net/login");
		

	}

}
