package HandlingUIComponets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		//Only on static dropdowns(select tag)
		Select s = new Select(driver.findElement(By.cssSelector("select[name='country']")));
		s.selectByValue("132");
		s.selectByIndex(0);
		s.selectByVisibleText("NAURU");
		driver.close();
		

	}

}
