
package  Exercices;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExcercisesEbayLInks {


	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://www.ebay.com/");
		int count = driver.findElements(By.xpath("//a")).size();
		System.out.println("Number of link on the page");
		System.out.println(count);
		//all links
		/*for(int i=0; i<count; i++)
		{
			System.out.println(driver.findElements(By.tagName("a")).get(i).getText());
			System.out.println(driver.findElements(By.tagName("a")).get(i).getAttribute("href"));
		}*/
		WebElement col = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]"));
		int colcount = col.findElements(By.tagName("a")).size();
		System.out.println("Number of link on the footer column 2");
		System.out.println(colcount);
		//links on column 2
		String beforeclicking =driver.getTitle();
		for(int i=0;i<colcount;i++)
		{
			
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Desarrolladores"))
			{
				
				col.findElements(By.tagName("a")).get(i).click();
				break;
			}

			
		}
		//Thread.sleep(2000l);
		String afterclicking = driver.getTitle();
		if (beforeclicking != afterclicking)
		{
			boolean div = driver.findElement(By.xpath("//a[@href='/developer-sandbox']")).isDisplayed();
			boolean text = driver.getPageSource().contains("Developer\n" + 
					"                                                    Sandbox");
			if((text==true)&&(div==true))
			{
				System.out.println("passed");
			}
			
			
		}
		else
		{
			System.out.println("failed");
			
		}
		driver.close();
		

	}

}
