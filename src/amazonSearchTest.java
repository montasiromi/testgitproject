import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class amazonSearchTest {

	//exception thrown for sleepmethod
	public static void main(String[] args) throws InterruptedException, IOException { 
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object 
		WebDriver driver = new ChromeDriver();
		
		//open browser and enter URL
		driver.get("https://www.amazon.com/");
		
		// search Wireless Headphones in the search bar
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wireless Headphones");
		
		//wait 3 seconds 
		Thread.sleep(3000);
		
		
		//click on the search button
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		
		//wait 3 seconds
		Thread.sleep(3000);
				
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcfile, new File("C:\\Users\\monta\\Documents\\automation course\\xyz.jpg"));
		
	}

}
