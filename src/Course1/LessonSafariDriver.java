package Course1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LessonSafariDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		driver.get("http:\\www.youtube.com");
		driver.close();

	}

}
