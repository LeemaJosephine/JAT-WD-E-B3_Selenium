package day23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Locate search bar using id.
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		
		// Locate search bar using name
		
		//driver.findElement(By.name("field-keywords")).sendKeys("phones");
		
		// Locate serach bar using compound class name 
		
//		List<WebElement> findElements = driver.findElements(By.className("nav-input nav-progressive-attribute"));
//		
//		System.out.println(findElements);
		
		// Get all the links from the active page
//		
//		List<WebElement> findElements = driver.findElements(By.tagName("a"));
//		
//		for(WebElement ele : findElements) {
//			
//			System.out.println(ele.getText());
//		}
		
		// Using Link Text
		
		//driver.findElement(By.linkText("MX Player")).click();
		
		//driver.findElement(By.partialLinkText("MX")).click();
		
		//locate search bar using css selector - id
		
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("mobile");
		
		// locate element using css selector class name
		
//		List<WebElement> findElements = driver.findElements(By.cssSelector("input.nav-input"));
//		
//		for(WebElement ele : findElements) {
//			
//			System.out.println(ele.getAttribute("id"));
//		}
		
		// using css selector attribute
		
		//driver.findElement(By.cssSelector("a[href=\"/deals?ref_=nav_cs_gb\"]")).click();
		
		// search bar using attribute based xpath
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		
		// using text based xpath
		
		//driver.findElement(By.xpath("//a[text()='MX Player']")).click();
		
		// usinf partial match xpath
		
		//driver.findElement(By.xpath("//a[contains(text(),'MX')]")).click();
		
		// using index/collection based xpath
		
		driver.findElement(By.xpath("(//input[contains(@class,'nav-input')])[1]")).sendKeys("mobile");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
