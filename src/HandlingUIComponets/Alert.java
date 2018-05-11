package HandlingUIComponets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String BaseURL ="http://www.tizag.com/javascriptT/javascriptalert.php";
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(BaseURL);
		//alert one button
		driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
		driver.switchTo().alert().accept();
		//confirmation two buttons cancel-ok
		driver.findElement(By.cssSelector("a[href='http://www.tizag.com/javascriptT/javascriptconfirm.php']")).click();;
		driver.findElement(By.cssSelector("input[value='Leave Tizag.com']")).click();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		//confirmation alert with text input
		driver.findElement(By.cssSelector("a[href='http://www.tizag.com/javascriptT/javascriptprompt.php']")).click();;
		driver.findElement(By.cssSelector("input[value='Say my name!']")).click();
		driver.switchTo().alert().sendKeys("melissa");
		driver.switchTo().alert().accept();
		String s = driver.switchTo().alert().getText();
		
		if (s.contains("melissa"))
		{
			driver.switchTo().alert().accept();
			driver.close();
		}
		else
		{
			System.out.println("no es melissa "+ s);
			driver.switchTo().alert().dismiss();
		}
			
		
		
		
	}


}
