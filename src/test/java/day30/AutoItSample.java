package day30;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItSample {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//a[@title='PDF to Word']")).click();
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\OneDrive\\Desktop\\AutoIT_Script\\uploadPDFfile.exe");
		
		driver.findElement(By.xpath("//span[text()='Convert to WORD']")).click();
	}

}
