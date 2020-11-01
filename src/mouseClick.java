import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseClick {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object 
		WebDriver driver = new ChromeDriver();
		
		//open browser and enter URL
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		Actions actionPerform = new Actions(driver);
		WebElement Event = driver.findElement(By.id("email"));
		actionPerform.click(Event).build().perform();
				
	}
}
