package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.partialLinkText("Iframe with in an Iframe")).click();
		
		// Switch to parent frame
		
		driver.switchTo().frame(1);
		
		// switch to child frame
		
		driver.switchTo().frame(0);
		
		// Access the text box of the child frame
		driver.findElement(By.tagName("input")).sendKeys("Sample text");
		
		//Switch from child frame to default content
//		driver.switchTo().defaultContent();
//		driver.findElement(By.partialLinkText("Single Iframe")).click();
		
		// Switch from child frame to parent
		
		driver.switchTo().parentFrame();
		String text = driver.findElement(By.tagName("h5")).getText();
		System.out.println(text);
		
		//Switch from parent frame to default content
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Single Iframe")).click();

		
		
	}

}
