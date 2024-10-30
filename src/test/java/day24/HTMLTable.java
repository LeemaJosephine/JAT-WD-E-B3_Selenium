package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		List<WebElement> rows = driver.findElements(By.xpath("(//table)[1]//tr"));
		List<WebElement> cols = driver.findElements(By.xpath("(//table)[1]//th"));
		
		int row_size = rows.size();
		int cols_size = cols.size();
		
		System.out.println(row_size);
		System.out.println(cols_size);
		
		for(int i=1; i<=row_size;i++) {
			
			for(int j=1; j<=cols_size;j++) {
				
				String value = driver.findElement(By.xpath("(//table)[1]//tr["+i+"]//td["+j+"]")).getText();
				System.out.println(value);
			}
		}
		
		
	}

}
