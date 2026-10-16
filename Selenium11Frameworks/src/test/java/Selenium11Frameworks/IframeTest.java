package Selenium11Frameworks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframeTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver Driver = new ChromeDriver();

        Driver.get("https://demo.automationtesting.in/Frames.html");
        Driver.switchTo().frame(0);
        WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
        WebElement Frame = wait.until(
        		ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
        Frame.clear();
        Frame.sendKeys("hai");
        System.out.println("message sended");
        
        
        		
        
    }
}