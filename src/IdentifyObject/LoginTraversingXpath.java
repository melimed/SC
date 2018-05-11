package IdentifyObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTraversingXpath {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.phptravels.net/login");
		// givin a permanent tag travel to the desired tag to use	
		driver.findElement(By.xpath(".//form[@id='loginfrm']/div[1]/div[5]/div[1]/div[1]/input")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath(".//input[@placeholder='Password']")).sendKeys("demouser");
		//not customize
		driver.findElement(By.xpath("//*[@id='loginfrm']/div[1]/div[5]/button")).click();
		driver.close();
		

	}

}
