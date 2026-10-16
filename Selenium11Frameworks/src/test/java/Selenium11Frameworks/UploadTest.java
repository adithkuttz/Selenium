package Selenium11Frameworks;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://automationtesting.co.uk/fileupload.html");
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
		WebElement uploadfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fileToUpload")));
		uploadfile.sendKeys("C:\\Users\\User\\Downloads\\ISTQB_CTFL_v4.0_Sample-Exam-B-Questions_v1.7.pdf");
		WebElement submitbtn = wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
		submitbtn.click();
		System.out.println("upload succesfully");
		Driver.quit();
		
	}

}
