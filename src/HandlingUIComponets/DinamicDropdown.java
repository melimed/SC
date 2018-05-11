package HandlingUIComponets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DinamicDropdown {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='COK']")).click();
		//Use Xpath and -- to select dinamic dropdown instance
		driver.findElement(By.xpath("(//a[@value='IXE'])[2]")).click();
		driver.close();
		

	}

}
