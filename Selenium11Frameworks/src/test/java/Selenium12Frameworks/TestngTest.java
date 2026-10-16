package Selenium12Frameworks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Selenium11Frameworks.LoginOrangeTest;

import org.testng.Assert;

public class TestngTest {
WebDriver Driver;
LoginOrangeTest LO;
	
	@BeforeMethod
public void StartUrl()
{
		this.Driver = new ChromeDriver();
		this.LO = new LoginOrangeTest(this.Driver);
		this.LO.goTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@Test
public void OrangeValid()
{
	boolean log=this.LO.Login("Admin","admin123");
	if(log)
	{
		System.out.println("login Succesfully");
		
	
	}
	else {
		System.out.println("login Failed");
	}
	
	
}
@AfterMethod
public void treaDown()
{
	this.LO.treaDown();
}
}
