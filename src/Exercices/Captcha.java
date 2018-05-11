package Exercices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Captcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String BaseURL = "https://patrickhlauke.github.io/recaptcha/";
		
		driver.get(BaseURL);
		//direct approach 
		/*driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("button#recaptcha-verify-button")).click();*/
		//method approach
		int number = findframenumber(driver,By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
		driver.switchTo().defaultContent();
		int number1 = findframenumber(driver,By.cssSelector("button#recaptcha-verify-button"));
		driver.switchTo().frame(number1);
		driver.findElement(By.cssSelector("button#recaptcha-verify-button")).click();
		
		

	}
	public static int findframenumber(WebDriver driver, By by)
	{
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		for(i=0;i<framecount; i++)
		{
			driver.switchTo().frame(i);
			int elementcount = driver.findElements(by).size();
			if(elementcount>0)
			{
				break;
			}
			else
			{
				//switch back to main content so the loop continue on the main content and not the frame(0) 
				driver.switchTo().defaultContent();
			}
			
		}
		driver.switchTo().defaultContent();
		return i;
	}
	
	

}
