package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		Actions mouse = new Actions(driver);
		
		WebElement toggle = driver.findElement(By.xpath("(//button[@title='Toggle'])[1]"));
		mouse.moveToElement(toggle).click().perform();
		
		List<WebElement> options = driver.findElements(By.xpath("//span[@class='rct-checkbox']/following-sibling::span[2]"));
		
		for(WebElement ele : options) {
			
			String actual = ele.getText();
			System.out.println(actual);
			String expected = "Desktop";
			
			if(actual.equalsIgnoreCase(expected)) {
				
				mouse.moveToElement(ele).click().perform();
				
			}
			
		}
		
	}

}
