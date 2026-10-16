package Selenium11Frameworks;

//selenium
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//testng
import org.testng.annotations.*;
import org.testng.Assert;
public class Googletest {
	WebDriver Driver;
	GooglePOM gpom;
	
	@BeforeMethod
 public void startTest()
 {
	 this.Driver = new ChromeDriver();
	 this.gpom = new GooglePOM(Driver);
	 this.gpom.g
 
