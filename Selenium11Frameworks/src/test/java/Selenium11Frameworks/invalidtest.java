package Selenium11Frameworks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class invalidtest {

	public static void main(String[] args) {
		// Invalid test
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://practice.expandtesting.com/login");
		
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		WebElement username = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		username.clear();
		username.sendKeys("adith");
		WebElement Password = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		Password.clear();
		Password.sendKeys("adith@123!");
		WebElement loginbtn = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-bg btn-primary d-block w-100']")));
		loginbtn.click();
		Driver.quit();
	}

}
