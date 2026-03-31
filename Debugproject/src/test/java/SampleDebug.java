import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDebug {
	
	
	public void sample() {
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://mail.google.com/mail/u/0/#inbox");
		 
		 driver.manage().window().maximize();
		 driver.quit();
	}

}
