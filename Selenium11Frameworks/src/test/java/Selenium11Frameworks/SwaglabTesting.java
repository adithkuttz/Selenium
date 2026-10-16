package Selenium11Frameworks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;

public class SwaglabTesting {
WebDriver Driver;
LoginPage ig;

@BeforeMethod
public void StartUrl()
{
	this.Driver = new ChromeDriver();
	this.ig = new LoginPage(this.Driver);
	this.ig.goTo("https://www.saucedemo.com/");
	
}
@Test
public void LoginTesting()
{
	boolean log = this.ig.Login("error_user","secret_sauce");
	if (log)
	{
	    System.out.println("Login Successfully");
	}
	else
	{
	    System.out.println("Login failed");
	}
}
	@AfterMethod
	public void treaDown() {

	    this.ig.treaDown();
	}





	















}
