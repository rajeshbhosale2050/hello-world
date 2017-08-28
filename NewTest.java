package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	   public WebDriver driver;		
		@Test		
		public void testEasy() {
			System.setProperty("webdriver.chrome.driver",
					"D:\\SeleniumProject\\Drivers\\chromedriver.exe");
			// Launching Chrome browser.
			driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/selenium/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	


		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}