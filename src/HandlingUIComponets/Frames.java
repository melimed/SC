package HandlingUIComponets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverWait wait;
		Actions a;
		String BaseURL = "http://way2automation.com/way2auto_jquery/index.php";
		System.setProperty("webdriver.chrome.driver", "/Users/Melissa/Downloads/chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 5);
		 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		a = new Actions(driver);
		driver.get(BaseURL);
		driver.findElement(By.cssSelector("a[href='#login']")).click();
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("melimed84");
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Pepisss");
		driver.findElement(By.xpath("(//input[@value=\"Submit\"])[2]")).click();
		//Only works with the Thread.Sleep line
		Thread.sleep(2000l);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='toggleNav']/li[2]/ul/li[2]")));
		a.moveToElement(driver.findElement(By.xpath("//ul[@id='toggleNav']/li[2]"))).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href='droppable.php'])[1]")));
		a.moveToElement(driver.findElement(By.xpath("(//a[@href='droppable.php'])[1]"))).click().build().perform();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//Move to frame by index
		driver.switchTo().frame(0);
		//Move to frame by location
		//driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[1]")));
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='draggable'])[1]")));
		WebElement source = driver.findElement(By.xpath("(//div[@id='draggable'])[1]"));
		WebElement target = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		a.dragAndDrop(source, target).build().perform();
		//move to default html content 
		driver.switchTo().defaultContent();
		driver.close();
		

	}

}
