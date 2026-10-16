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

public class TourismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://testautomationpractice.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		WebElement nm = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		nm.clear();
		nm.sendKeys("adith");
		WebElement mail = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		mail.clear();
		mail.sendKeys("abc@gmail.com");
		WebElement number = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
		number.clear();
		number.sendKeys("9876543345");
		WebElement key = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("textarea")));
		key.clear();
		key.sendKeys("Al Qiydah Dubai");
		WebElement Gender = wait.until(
				ExpectedConditions.elementToBeClickable(By.id("male")));
		Gender.click();
		WebElement tue = wait.until(
				ExpectedConditions.elementToBeClickable(By.id("tuesday")));
		tue.click();
		WebElement wed = wait.until(
				ExpectedConditions.elementToBeClickable(By.id("wednesday")));
		wed.click();
		WebElement thur = wait.until(
				ExpectedConditions.elementToBeClickable(By.id("thursday")));
		thur.click();
		WebElement fri = wait.until(
				ExpectedConditions.elementToBeClickable(By.id("friday")));
		fri.click();
		WebElement sat = wait.until(
				ExpectedConditions.elementToBeClickable(By.id("saturday")));
		sat.click();
		WebElement c1 = wait.until(
				ExpectedConditions.elementToBeClickable(By.id("country")));
		Select country = new Select(c1);
		country.selectByVisibleText("India");
		String selected = country.getFirstSelectedOption().getText();
		System.out.println(selected);
		WebElement c2 = wait.until(
				ExpectedConditions.elementToBeClickable(By.id("colors")));
		Select color=new Select(c2);
		color.selectByVisibleText("Blue");
		String colors = color.getFirstSelectedOption().getText();
		System.out.println(colors);
		WebElement c3 = wait.until(
				ExpectedConditions.elementToBeClickable(By.id("animals")));
		Select Animals = new Select(c3);
		Animals.selectByVisibleText("Lion");
		String e1 = Animals.getFirstSelectedOption().getText();
		System.out.println(e1);
		WebElement DateStart = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
		DateStart.clear();
		DateStart.sendKeys("01/01/2026");
		DateStart.sendKeys(Keys.TAB);
		WebElement Datelong = wait.until(
				ExpectedConditions.elementToBeClickable(By.id("txtDate")));
		Datelong.click();
		WebElement month = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='ui-datepicker-month']")));
		Select Month = new Select(month);
		Month.selectByVisibleText("Jan");
		WebElement year = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='ui-datepicker-year']")));
		Select Year = new Select(year);
		Year.selectByVisibleText("2026");
		WebElement Date = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ui-state-default'and text()='15']")));
		Date.click();
		WebElement DateBegin = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("start-date")));
		DateBegin.clear();
		DateBegin.sendKeys("01-01-2026");
		WebElement Dateaway = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("end-date")));
		Dateaway.clear();
		Dateaway.sendKeys("15-01-2026");
		WebElement submitbtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("submit-btn")));
		submitbtn.click();
		
	}

}
