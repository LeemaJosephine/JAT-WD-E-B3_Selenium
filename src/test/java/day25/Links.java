package day25;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void verifyLink(String url, String text) throws IOException {
		
		 
		try {
			URL link = new URL(url);
			HttpURLConnection httpConnection = (HttpURLConnection) link.openConnection();
			httpConnection.connect();
			
			if(httpConnection.getResponseCode() == 200) {
				
				System.out.println("Valid link "+ httpConnection.getResponseMessage());
			} else {
				
				System.out.println("Broken link " + httpConnection.getResponseMessage());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Connection failed " + text +"=> "+url);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No.of links: " + links.size());
		
		for(WebElement ele: links) {
			
			String url = ele.getAttribute("href");
			String text = ele.getText();
			
//			if(text.equalsIgnoreCase("About")) {
//				
//				ele.click();
//				List<WebElement> link = driver.findElements(By.tagName("a"));
//				System.out.println("No.of links: " + link.size());
//			}
			
			verifyLink(url,text);
		
		}
		
	}

}
