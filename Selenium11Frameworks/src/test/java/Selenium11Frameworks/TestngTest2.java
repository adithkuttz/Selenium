package Selenium11Frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngTest2 {

    WebDriver Driver;

    LoginOrangeTest Login;
    LeaveTest Leave;

    @BeforeMethod
    public void StartLogin() {

        this.Driver = new ChromeDriver();

        // Create Login Page Object
        this.Login = new LoginOrangeTest(this.Driver);

        // Create Leave Page Object
        this.Leave = new LeaveTest(this.Driver);

        // Open OrangeHRM login page
        this.Login.goTo(
            "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
        );

        // Login
        this.Login.Login("Admin", "admin123");
    }

    @Test
    public void LeaveSelect() {

        this.Leave.clickLeave();
        String actualUrl = this.Leave.getCurrentUrl();

        String expectedUrl =
            "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList";
        Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("Correct Leave Page Opened");
    }

    @AfterMethod
    public void tearDown() {

        this.Driver.quit();
    }
}