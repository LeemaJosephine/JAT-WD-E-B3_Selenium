package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		// locate the select tag
		//Thread.sleep(1000);
		WebElement birthday_day = driver.findElement(By.id("day"));
		
		// Initialize the Select class - choose day
		
		Select day= new Select(birthday_day);
		day.selectByValue("5");
		
		// choose month
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Mar");
		
		//Choose year
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByIndex(2);
	}

}
