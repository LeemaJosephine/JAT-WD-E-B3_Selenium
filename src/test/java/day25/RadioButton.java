package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		List<WebElement> options = driver.findElements(By.xpath("//label[@class='form-check-label']"));
		
		
		for(WebElement ele : options) {
			
			String textOption = ele.getText();
			
			if(textOption.equalsIgnoreCase("Yes")) {
				
				WebElement radioButton = driver.findElement(By.xpath("//input[@class='form-check-input']"));
				radioButton.click();
				
				if(radioButton.isSelected()) {
					
					System.out.println("Value selected");
				}
				
			}
		}
		
		
	}

}
