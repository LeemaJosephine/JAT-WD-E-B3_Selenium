package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.switchTo().frame(0);
		
		// source element - drag 
		WebElement source = driver.findElement(By.id("draggable"));
		
		//target element - drop 
		WebElement target = driver.findElement(By.id("droppable"));
		
		// Actions class object
		
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(source, target).perform();
	}

}
