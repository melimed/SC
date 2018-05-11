package HandlingUIComponets;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sincronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Melissa/Downloads/chromedriver");
		WebDriver driver;
		String BaseURL = "https://aeromexico.com/es-mx";
		driver = new ChromeDriver();
		//implicit wait will wait until 5 seconds before raising an exception
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get(BaseURL);
		//Explicit wait will wait until 10 seconds for and specific element (button) to be at some status.(clickable)
		WebDriverWait wait = new WebDriverWait(driver, 4);
 
		driver.findElement(By.xpath("//div[@class='BookerDestinations']/ul/li")).click();
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@title='Button']"))));
		element.click();
		driver.close();
		

	}

}
