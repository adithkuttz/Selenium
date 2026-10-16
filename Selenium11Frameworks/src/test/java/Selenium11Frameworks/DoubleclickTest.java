package Selenium11Frameworks;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DoubleclickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://testautomationpractice.blogspot.com/");
		WebDriverWait Wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		WebElement right = Wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Copy Text']")));
		Actions actions = new Actions(Driver);
		actions.doubleClick(right).perform();
		System.out.println("Double clicked");
		
		
	}

}
