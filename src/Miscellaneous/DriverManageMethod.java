package Miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class DriverManageMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "/Users/Melissa/Downloads/chromedriver");
		WebDriver driver;
		String BaseURL="http://toolsqa.com/automation-practice-table/";
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//worked on mac too but there is another way with ChromeOptions
		driver.manage().window().fullscreen();
		driver.get(BaseURL);
		//se uso  chrome options para poder maximizar la ventana en una mac
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("start-fullscreen");
		driver.close();


	}

}
