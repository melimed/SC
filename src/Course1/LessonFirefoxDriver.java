package Course1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LessonFirefoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/Users/Melissa/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\www.google.com");
		driver.close();
		

	}

}
