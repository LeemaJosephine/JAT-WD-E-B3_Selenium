package day21;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		// Step 2: Loading the URL
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Step 3: Maximize the browser
		
		driver.manage().window().maximize();
		
		// Step 4: Add implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Get the page title
		
		String title = driver.getTitle();
		
		System.out.println("Page title: "+title);
		
		// Get the current URL
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("Current URL: "+currentUrl);
		
		// Get page source
		
		String pageSource = driver.getPageSource();
		
		System.out.println("Page source: " + pageSource);
		
		
		// navigation commands
		
		driver.navigate().refresh();
		
		// Get the field values
		
		List<WebElement> fieldNames = driver.findElements(By.className("oxd-label"));
		
		for(WebElement ele : fieldNames) {
			
			String fieldName = ele.getText();
			System.out.println(fieldName);
			System.out.println(ele.getLocation());
			System.out.println(ele.getTagName());
			
		}
		
		
		// Find element for username
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		// enter the value for password
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		
		
		// Click on login button
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		// Step 5: Close the browser
		
		//driver.close();
		
		
	}

}
