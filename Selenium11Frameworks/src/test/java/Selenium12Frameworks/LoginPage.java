package Selenium12Frameworks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.Assert;

public class LoginPage {
WebDriver Driver;
WebDriverWait wait;
WebElement username , password , submitbtn;

public LoginPage(WebDriver Driver, WebDriverWait wait)
{
	this.Driver=Driver;
	this.wait=wait;
	this.Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	this.username= this.wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	this.password = this.wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	this.submitbtn = this .wait.until(
			ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']")));
	
	
}
public void goTo(String url)
{
	this.Driver.get(url);
}
public String login(String user,String pass)
{
	username.clear();
	username.sendKeys(user);
	password.clear();
	password.sendKeys(pass);
	submitbtn.click();
	String url = this.Driver.getCurrentUrl();
	return url;
	
}
public void leaveclick()
{
	try {
		WebElement leavebtn = this.wait.until(
				ExpectedConditions.elementToBeClickable(By.linkText("Leave")));
		leavebtn.click();
		System.out.println("leave button is clicked");
			
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	
}
public void treaDown()
{
	this.Driver.close();
	
}
}
