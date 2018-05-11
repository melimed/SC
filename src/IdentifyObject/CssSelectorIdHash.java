package IdentifyObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorIdHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.cssSelector("a[href='https://www.google.com.mx/imghp?hl=es-419&tab=wi']")).click();
		//id the tag has an ID the easiest way is to use Sintax="#idvalue"
		driver.findElement(By.cssSelector("#lst-ib")).sendKeys("star");
		driver.findElement(By.cssSelector("#lst-ib")).sendKeys(Keys.ENTER);
		//id the tag has an Class the easiest way is to use Sintax=".classvalue"
		driver.findElement(By.cssSelector(".gsst_e")).click();
		driver.findElement(By.cssSelector("a[class='qbtbha qbtbtxt qbclr']")).click();
		driver.findElement(By.cssSelector("#qbfile")).click();
		driver.close();
		

	}

}
