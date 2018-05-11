package Miscellaneous;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "/Users/Melissa/Downloads/chromedriver");
		WebDriver driver;
		String BaseURL="http://www.google.com";
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(BaseURL);
		Set<Cookie> abc=driver.manage().getCookies();
		System.out.println(abc.size());
		driver.manage().deleteAllCookies();
		Set<Cookie> abcd=driver.manage().getCookies();
		System.out.println(abcd.size());
		
		driver.close();


	}

}
