package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Create obj for Action class
		Actions mouse = new Actions(driver);

		// Right click
		
//		WebElement rightClickele=  driver.findElement(By.xpath("//span[text()='right click me']"));
//		mouse.contextClick(rightClickele).perform();
//		
//		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
//		mouse.click(edit).perform();
		
		// Double click
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		mouse.doubleClick(doubleClick).perform();
		
		
	}

}
