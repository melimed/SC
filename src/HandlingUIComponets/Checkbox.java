package HandlingUIComponets;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");
		//Validate if checkbox is selected by default
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).click();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		driver.close();
		

	}

}
