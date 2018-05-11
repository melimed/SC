package HandlingUIComponets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar {

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
		while(!driver.findElement(By.xpath("(//h2[@class='DatePickerCalendarMonth-month u-titleSection'])[1]")).getText().contains("enero"))
		{
			driver.findElement(By.cssSelector(".Icon.Icon--calendarArrowRight")).click();
		}
		
		//grab the common attribute put into a list and iterate
		WebElement divone = driver.findElement(By.xpath("(//div[@class='DatePickerCalendarMonth'])[1]"));
		WebElement divtwo = driver.findElement(By.xpath("(//div[@class='DatePickerCalendarMonth'])[2]"));
		int count =divone.findElements(By.cssSelector("li.DatePickerCalendarMonth-dayListItem")).size();
		int counttwo =divtwo.findElements(By.cssSelector("li.DatePickerCalendarMonth-dayListItem")).size();
		List<WebElement> days = divone.findElements(By.cssSelector("li.DatePickerCalendarMonth-dayListItem"));
		List<WebElement> daysdivtwo = divtwo.findElements(By.cssSelector("li.DatePickerCalendarMonth-dayListItem"));
		
		for(int i=0;i<count;i++)
		{
			boolean contain = days.get(i).getAttribute("class").contains("is-disabled");
			
			if (contain==false)
			{
				String text = days.get(i).findElement(By.cssSelector("h4.DatePickerCalendarMonth-dayNumber")).getText();
				if(text.contains("29"))
				{
					days.get(i).click();
					break;
				}
				
				
			}
			
		}
		for(int i=0;i<counttwo;i++)
		{
			boolean contain = daysdivtwo.get(i).getAttribute("class").contains("is-disabled");
			
			if (contain==false)
			{
				String text=daysdivtwo.get(i).findElement(By.cssSelector("h4.DatePickerCalendarMonth-dayNumber")).getText();
				if(text.contains("1"))
				{
					daysdivtwo.get(i).click();
					break;
				}
				
			}
		}
		
	
		//driver.close();
		

	}

}
