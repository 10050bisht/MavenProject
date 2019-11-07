package mvnConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicConcept {
	WebDriver driver;
	@Test

	public void aTestCase()
	{
		String driverPath= System.getProperty("user.dir")
				 
				+"\\Browser\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

	}	
}
