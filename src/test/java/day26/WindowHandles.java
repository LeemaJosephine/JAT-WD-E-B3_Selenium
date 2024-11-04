package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		System.out.println("Parent window address " + driver.getWindowHandle());
		driver.findElement(By.xpath("(//button[contains(text(),'click')])[1]")).click();
		
		// Get set of windows
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		// Convert Set to List
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		// Pick up the particular window and switch to it
		
		driver.switchTo().window(windows.get(1));
		
		
		System.out.println("Child window address " + driver.getWindowHandle());
		
		
	}

}
