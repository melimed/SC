package HandlingUIComponets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarStaticaproach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String BaseURL="https://www.aeromexico.com/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		//se uso  chrome options para poder maximizar la ventana en una mac
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-fullscreen");

		driver =new ChromeDriver(options);
		driver.get(BaseURL);
		driver.findElement(By.xpath("//ul[@class='BookerTypeSelector']/li[2]/button")).click();
		driver.findElement(By.cssSelector("button.BookerCalendarPicker-placeholderButton.is-notSelected.Icon.Icon--calendar")).click();
		//Thread.sleep(3000l);
		driver.findElement(By.xpath("(//div[@class='DatePickerCalendarMonth'])[1]/ol[2]/li[28]")).click();
		driver.close();
		

	}

}
