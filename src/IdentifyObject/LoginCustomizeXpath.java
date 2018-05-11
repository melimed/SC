package IdentifyObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCustomizeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Melissa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.phptravels.net/login");
		// sintax= .//tagname[@attribute='value'], use the unique attribute so this would not be cofuse with another part on the page
		driver.findElement(By.xpath(".//input[@type='email']")).sendKeys("user@phptravels.com");
		driver.findElement(By.xpath(".//input[@placeholder='Password']")).sendKeys("demouser");
		//not customize
		driver.findElement(By.xpath("//*[@id='loginfrm']/div[1]/div[5]/button")).click();
		//dinamic element with 
		System.out.println(driver.findElements(By.xpath("//form[starts-with(@id,'loginfr')]")).size());
		System.out.println(driver.findElements(By.xpath("//input[contains(@type,'email')]")).size());
		//end-with does not work with selenium
		System.out.println(driver.findElements(By.xpath("//form[ends-with(@id,'frm')]")).size());
		
		driver.close();
		

	}

}
