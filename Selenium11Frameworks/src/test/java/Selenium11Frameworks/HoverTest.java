package Selenium11Frameworks;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class HoverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://testautomationpractice.blogspot.com/");
		WebDriverWait Wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		WebElement Point = Wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.className("dropbtn")));
		Actions action = new Actions(Driver);
		action.moveToElement(Point).perform();
	    System.out.println("hover succesfully pointed");
	    
		
		
		
	}

}
