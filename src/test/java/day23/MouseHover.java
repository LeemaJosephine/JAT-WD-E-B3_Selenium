package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// locate element
		
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		Actions mouse = new Actions(driver);
		//mouse.moveToElement(men).perform();
		
		//Scroll down using action class
		
		WebElement contact = driver.findElement(By.xpath(" //a[text()=' Contact Us ']"));
		//mouse.moveToElement(contact).perform();
		
		// Scroll down using jsExecutor
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", contact);
	}

}
