package Selenium12Frameworks;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.Assert;

public class LoginTest {
WebDriver Driver;
WebDriverWait wait;
LoginPage lg;

@Test(priority = 0)
public void StartTest()
{
	this.Driver= new ChromeDriver();
	this.Driver.manage().window().maximize();
	this.wait = new WebDriverWait(this.Driver,Duration.ofSeconds(10));
	this.lg = new LoginPage(this.Driver,this.wait);
	//this.lg.goTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
}
@Test(priority = 1)
public void loginTester()
{
	String currenturl = this.lg.login("Admin","admin123");
	Assert.assertEquals(currenturl,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	
}
@Test(priority = 2)
public void leaveAssignTest() throws InterruptedException
{
	this.lg.leaveclick();
	WebElement assignleave = this.wait.until(
			ExpectedConditions.elementToBeClickable(By.linkText("Assign Leave")));
	assignleave.click();
	
	WebElement empname = this.wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder = 'Type for hints...']")));
	empname.clear();
	empname.sendKeys("A8DCo 4Ys 010Z");
	WebElement leaveType = wait.until(
		    ExpectedConditions.elementToBeClickable(
		        By.xpath("//label[text()='Leave Type']/following::div[contains(@class,'oxd-select-text')][1]")
		    )
		);

		leaveType.click();

		WebElement personal = wait.until(
		    ExpectedConditions.elementToBeClickable(
		        By.xpath("//div[@role='option']//span[text()='CAN - Personal']")
		    )
		);

		personal.click();
		
	WebElement DateStart = this.wait.until(
			   ExpectedConditions.visibilityOfElementLocated(
			       By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]")
			    )
			);

		DateStart.clear();
		DateStart.sendKeys("2026-08-08");


		
	WebElement Comment = this.wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
	Comment.clear();
	Comment.sendKeys("Heavy fever and Headache Please grant me the leave");
	WebElement assignbtn = this.wait.until(
			ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']")));
	assignbtn.click();
	
	}

}
