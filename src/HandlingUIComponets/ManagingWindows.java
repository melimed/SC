package HandlingUIComponets;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class ManagingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String BaseURL = "https://accounts.google.com/SignUp";
		System.setProperty("webdriver.chrome.driver", "/Users/Melissa/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(BaseURL);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts/answer/1733224?hl=es-419']")).click();
		Set<String>ids = driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid); 
		System.out.println(driver.getTitle());
		driver.close();
	}

}
