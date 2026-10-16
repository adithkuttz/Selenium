package Selenium11Frameworks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeaveTest {

    WebDriver Driver;
    WebDriverWait wait;

    public LeaveTest(WebDriver Driver) {

        this.Driver = Driver;
        this.wait = new WebDriverWait(
                this.Driver,
                Duration.ofSeconds(10)
        );
    }

    public void clickLeave() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span[text()='Leave']")
                )
        ).click();
    }

    public String getCurrentUrl() {

        return this.Driver.getCurrentUrl();
    }
}