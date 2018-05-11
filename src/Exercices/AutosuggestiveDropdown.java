package Exercices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "/Users/Melissa/Downloads/chromedriver");
		WebDriver driver;
		String BaseURL="https://fantasycricket.dream11.com/in/";
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(BaseURL);
		driver.findElement(By.cssSelector("input#m_rtxtEmail1")).sendKeys("meli");
		driver.findElement(By.xpath("//ul/li[@title='meli@gmail.com']")).click();
		
		
		
		
	}

}
