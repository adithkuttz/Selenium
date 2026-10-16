package Selenium11Frameworks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GooglePOM {
    WebDriver driver;
    //constructor
	public  GooglePOM(WebDriver driver) {
		this.driver=driver;
	}
	//method
	public  void  goTo(String url)
	{
		this.driver.get(url);
	}
	
	public  String urlTitle() {
		String title=this.driver.getTitle();
		return title;
		
	}
	public void removeDrive()
	{
		this.driver.close();
	}
}


