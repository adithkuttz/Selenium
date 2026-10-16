package Selenium11Frameworks;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://testautomationpractice.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		WebElement Source = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		WebElement Target = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));
		Actions actions = new Actions(Driver);
		actions.dragAndDrop(Source, Target).perform();
		System.out.println("Drag and Dropped Succesfully");
		
		
	}

}
