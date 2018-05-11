package HandlingUIComponets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class IsEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		String BaseURL = "http://www.phptravels.net/";
		System.setProperty("webdriver.chrome.driver", "/Users/Melissa/Downloads/chromedriver");
		driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get(BaseURL);
		//IsEnabled check the attribute disbled="value" this if not display o tag is true by default
		System.out.println(driver.findElement(By.cssSelector("input[name='arrival']")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("div#sidebar_left")).isEnabled());
		driver.navigate().to("https://www.makemytrip.com/");
		System.out.println(driver.findElement(By.xpath("//div[@id='fd-wrap']/div[2]/h2")).getText());
		
		driver.close();
		
	}

}
