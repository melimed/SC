package HandlingUIComponets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		String BaseURL = "https://aeromexico.com/es-mx";
		System.setProperty("webdriver.chrome.driver", "/Users/Melissa/Downloads/chromedriver");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get(BaseURL);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class=\"BookerSelect-button\"])[1]")));
		//.IsDisplayed can verified if the tag is displaying or hidden but only if is present on the html
		System.out.println(driver.findElement(By.xpath("(//button[@class=\"BookerSelect-button\"])[1]")).isDisplayed());
		driver.findElement(By.xpath("//ul[@class='BookerTypeSelector']/li[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//button[@class=\"BookerSelect-button\"])[3]")).isDisplayed());
		//Para saber si el elemto esta en el html se necesita lo siguiente
		
		int size = driver.findElements(By.cssSelector("button[id='melissa']")).size();
		if (size==0)
		{
			System.out.println("no existe");
		}
		else
		{
			System.out.println("existe");
		}
		driver.close();
		
		
		

	}
	/*//ejemplo de cacheo de exeption para elemento presente
	 * private boolean existsElement(String id) {
	    try {
	        driver.findElement(By.id(id));
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	    return true;
	}*/

}
