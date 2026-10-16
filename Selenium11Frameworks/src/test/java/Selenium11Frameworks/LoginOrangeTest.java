package Selenium11Frameworks;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginOrangeTest {
	WebDriver Driver;
	WebDriverWait wait;
	
public LoginOrangeTest(WebDriver Driver)
{
	this.Driver = Driver;
	this.wait = new WebDriverWait(this.Driver,Duration.ofSeconds(10));
	
}
public void goTo(String url)
{
	this.Driver.get(url);
	
}
public boolean Login(String username, String password)
{
	WebElement user = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	user.clear();
	user.sendKeys(username);
	WebElement pass = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	pass.clear();
	pass.sendKeys(password);
	WebElement submitbtn = wait.until(
			ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']")));
	submitbtn.click();
	return true;
	
}
public void treaDown()
{
	this.Driver.close();
}
}