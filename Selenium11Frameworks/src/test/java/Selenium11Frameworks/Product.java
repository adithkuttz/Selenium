package Selenium11Frameworks;

import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;
public class Product {
WebDriver driver;
LoginPage product;
@BeforeMethod
public void stratLogin()
{
	this.driver=new ChromeDriver();
	this.product=new LoginPage(this.driver);
	this.product.goTo("https://www.saucedemo.com/");
	this.product.Login("standard_user", "secret_sauce");
	
}
@Test
public void productSelect()
{
	String currentUrl=this.product.product("item_4_title_link");
	
}
@AfterMethod
public void treaDown()
{
	this.product.treaDown();
}

}
