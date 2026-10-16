package Selenium11Frameworks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgTest {

	
@Test
 public void verifyGoogle()
 {
	 WebDriver Driver = new ChromeDriver();
	 Driver.get("https://www.google.com");
	 String Title = Driver.getTitle();
	 Assert.assertEquals(Title,"google");
	 Driver.quit();
	 
    }
}