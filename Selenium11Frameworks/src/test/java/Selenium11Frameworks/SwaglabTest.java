package Selenium11Frameworks;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SwaglabTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement sl= Driver.findElement(By.tagName("select"));
		Select country = new Select(sl);
		country.selectByVisibleText("India");
		String selected=country.getFirstSelectedOption().getText();
		List <WebElement> alloption=country.getOptions();
		System.out.println(alloption);
		alloption.forEach(item -> System.out.print(item.getText()));
		Driver.quit();
		}
	    


}
