package day26;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NotifcationSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Handling browser notification
		
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new EdgeDriver(options);
		
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

}
