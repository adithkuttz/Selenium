package Selenium11Frameworks;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://testautomationpractice.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		WebElement Name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		Name.clear();
		Name.sendKeys("Adith Suresh RK");
		WebElement Email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		Email.clear();
		Email.sendKeys("adithsureshrk@gmail.com");
		WebElement Phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
		Phone.clear();
		Phone.sendKeys("9544635288");
		WebElement Address = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("textarea")));
		Address.clear();
		Address.sendKeys("Sopanam");
		WebElement Gender = wait.until(ExpectedConditions.elementToBeClickable(By.id("male")));
		Gender.click();
		WebElement Monday = wait.until(ExpectedConditions.elementToBeClickable(By.id("monday")));
		Monday.click();
		WebElement Tuesday  = wait.until(ExpectedConditions.elementToBeClickable(By.id("tuesday")));
		Tuesday.click();
		WebElement Wednesday = wait.until(ExpectedConditions.elementToBeClickable(By.id("wednesday")));
		Wednesday.click();
		WebElement Country = wait.until(ExpectedConditions.elementToBeClickable(By.id("country")));
		Select in = new Select(Country);
		in.selectByVisibleText("India");
		String Selected = in.getFirstSelectedOption().getText();
		System.out.println(Selected);
		WebElement Colors = wait.until(ExpectedConditions.elementToBeClickable(By.id("colors")));
		Select co = new Select(Colors);
		co.selectByVisibleText("Yellow");
		String dim = co.getFirstSelectedOption().getText();
		System.out.println(dim);
		WebElement Animal = wait.until(ExpectedConditions.elementToBeClickable(By.id("animals")));
		Select An = new Select(Animal);
		An.selectByVisibleText("Lion");
		String sorted = An.getFirstSelectedOption().getText();
		System.out.println(sorted);
		WebElement Datepicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
		Datepicker.clear();
		Datepicker.sendKeys("03/01/2001");
		Datepicker.sendKeys(Keys.TAB);
		WebElement Datepickers = wait.until(ExpectedConditions.elementToBeClickable(By.id("txtDate")));
		Datepickers.click();
		WebElement month = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='ui-datepicker-month']")));
		Select mon = new Select(month);
		mon.selectByVisibleText("Jan");
		String m = mon.getFirstSelectedOption().getText();
		System.out.println(m);
		WebElement Year = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='ui-datepicker-year']")));
		Select Yea = new Select(Year);
		Yea.selectByVisibleText("2026");
		String y = Yea.getFirstSelectedOption().getText();
		System.out.println(y);
		WebElement Date = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ui-state-default'and text()='15']")));
		Date.click();
		

		
		
		
		
		
	}
	

}
