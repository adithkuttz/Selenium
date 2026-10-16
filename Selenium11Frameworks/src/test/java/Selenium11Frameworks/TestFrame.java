package Selenium11Frameworks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFrame {

    public static void main(String[] args) {

        WebDriver Driver = new ChromeDriver();

        Driver.get("https://vinothqaacademy.com/iframe/");

        WebDriverWait Wait = new WebDriverWait(
                Driver, Duration.ofSeconds(20));

        Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.name("registeruser")));

        System.out.println("Successfully switched to registeruser");
        WebElement Name = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vfb-5")));
        Name.clear();
        Name.sendKeys("Kuttu");
        WebElement Names = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vfb-7")));
        Names.clear();
        Names.sendKeys("Adith");
        WebElement Gender = Wait.until(ExpectedConditions.elementToBeClickable(By.id("vfb-31-1")));
        Gender.click();
        Driver.switchTo().defaultContent();

        
    }
}