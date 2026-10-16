package Selenium11Frameworks;
import java.time.Duration;

import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage {
WebDriver driver;
WebDriverWait wait;

//constructor 
public LoginPage(WebDriver driver)
{
	this.driver=driver;
	this.wait=new WebDriverWait(this.driver,Duration.ofSeconds(10));
	
}
public void goTo(String url)
{
	this.driver.get(url);
}
public boolean Login(String username,String password)
{
	WebElement user=this.wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))
			);
	user.clear();
	user.sendKeys(username);
	
	WebElement passw=this.wait.until(
	  ExpectedConditions.visibilityOfElementLocated(By.id("password"))		
			);
	passw.clear();
	passw.sendKeys(password);
	
	WebElement logbtn=this.wait.until(
			ExpectedConditions.elementToBeClickable(By.id("login-button"))
			);
	logbtn.click();
	return true;
	
}
public  void treaDown()
{
	this.driver.close();
}

}