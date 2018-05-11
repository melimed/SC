package HandlingUIComponets;

import org.openqa.selenium.By;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		String BaseURL = "http://www.tizag.com/htmlT/";
		System.setProperty("webdriver.chrome.driver", "/Users/Melissa/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(BaseURL);
		
		Assert.assertTrue(driver.findElement(By.cssSelector("img[src='http://www.tizag.com/pics/tizagSugar.jpg']")).isDisplayed());
		System.out.println("si esta el elemento img");
		Assert.assertFalse(driver.findElement(By.xpath("//input[@name='cx']")).isDisplayed());
		System.out.println("no esta el elemento //input[@name='cx']");
		
		driver.close();
		
		
		

	}
	
}
