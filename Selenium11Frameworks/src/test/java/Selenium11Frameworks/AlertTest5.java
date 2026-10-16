package Selenium11Frameworks;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://testautomationpractice.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		WebElement promptbtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("promptBtn")));
		promptbtn.click();
		Alert alert=Driver.switchTo().alert();
		String message = alert.getText();
		System.out.println(message);
		alert.sendKeys("kuttu");
		alert.accept();
		
	}

}


