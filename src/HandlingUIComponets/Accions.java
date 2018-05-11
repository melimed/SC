package HandlingUIComponets;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Accions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String BaseURL = "http://www.amazon.com/";
		System.setProperty("webdriver.chrome.driver", "/Users/Melissa/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(BaseURL);
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-prime']/span[2]"));
		WebElement searchbox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		
		//moveToElement then Clicking on it then pressing Shift key then entering word
		a.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().pause(2000).build().perform();
		//MouseOver an element with moveToElement action pause to see the message when mouseover it and then clicking the context menu
		a.moveToElement(move).pause(3000).contextClick().build().perform();
		driver.close();

	}

}
