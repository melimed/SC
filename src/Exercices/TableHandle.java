package Exercices;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "/Users/Melissa/Downloads/chromedriver");
		WebDriver driver;
		String BaseURL="http://toolsqa.com/automation-practice-table/";
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(BaseURL);
		WebElement table=driver.findElement(By.cssSelector("table.tsc_table_s13"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		int numberofrows =rows.size();
		//standar way to iterate elements
				/*for(int i=0;i<numberofrows;i++)
				{
					List<WebElement> columns= rows.get(i).findElements(By.tagName("td"));
					int numberofcolumns=columns.size();
					for(int e=0;e<numberofcolumns;e++)
					{
						if(columns.get(e).getText().contains("Arabia"))
						{
							System.out.println(columns.get(e).getText());
							break;
						}
					}
					
				}*/
		//forma nueva y mas compleja de iterar elements
		int i=0;
		for(WebElement eachrow	:rows)
		{
			List<WebElement> columns= eachrow.findElements(By.tagName("td"));
			i++;
			int numberofcolumns=columns.size();
			System.out.println("number of columns in column number "+i+" are "+numberofcolumns);
			
			for(WebElement eachcolumn:columns)
			{
				if(eachcolumn.getText().contains("China"))
				{
					System.out.println(eachcolumn.getText());
					break;
				}
			}
			
			
			
		}
		
		driver.close();
	}

}
