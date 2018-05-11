package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridFistTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String nodeURL="http://192.168.0.13:5555/wd/hub";
		String BaseURL="http://www.amazon.com";
		
		//configuration for chrome
		/*System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    DesiredCapabilities capabilities =DesiredCapabilities.chrome();
	    capabilities.setBrowserName("chrome");
	    capabilities.setPlatform(Platform.ANY);
	    driver=new RemoteWebDriver(new URL(nodeURL),capabilities);*/
	    
		//Configuration for firefox
		System.setProperty("webdriver.firefox.driver", "C://geckodriver.exe");
	    DesiredCapabilities capabilities =DesiredCapabilities.firefox();
	    capabilities.setBrowserName("firefox");
	    capabilities.setPlatform(Platform.ANY);
	    driver=new RemoteWebDriver(new URL(nodeURL),capabilities);
	    
	    driver.get(BaseURL);
	    driver.getTitle();
	    System.out.println(driver.getTitle());

	}

}
