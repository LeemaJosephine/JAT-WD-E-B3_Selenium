package day27;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://uitestingplayground.com/ajax");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("ajaxButton")).click();
	
//		// Step 1: Set the time Duration
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		
//		// Step 2: Set the condition to wait
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
//		
//		// Step 3: Perform your action
//		WebElement textElement = driver.findElement(By.className("bg-success"));
//		System.out.println(textElement.getText());
		
		// Fluent Wait
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))   // Duration
				.pollingEvery(Duration.ofMillis(100)) // Customize the inyterval
				.withMessage("Increase the time");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
		WebElement textElement = driver.findElement(By.className("bg-success"));
		System.out.println(textElement.getText());
			
		// Take screenshot
		
		// Capture the screenshot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Mention the target path
		
		File dest = new File("D:\\NewWorkSpace\\JAT-WD-E-B3\\snap\\HomePage.png");
		
		// Move source to dest
		
		FileUtils.copyFile(source, dest);
		
		
		
	}

}
