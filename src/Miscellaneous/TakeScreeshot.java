package Miscellaneous;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;;
    
public class TakeScreeshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chromedriver", "/Users/Melissa/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://www.google.com");
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/Melissa/Downloads/screenshot.png"));
    }
}
