import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imgHW {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object 
		WebDriver driver = new ChromeDriver();
		
		//an implicit wait statement that waits 10 seconds for all items to load or else it times out
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open browser and enter URL
		driver.get("https://www.walmart.com/");
		
		//count images and print image links
				List<WebElement> imgs = driver.findElements(By.tagName("img"));
				System.out.println(imgs.size());
				
				for(int i = 0; i < imgs.size(); i++) {
					System.out.println(imgs.get(i).getAttribute("src"));
				}
	}
}