import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open browser and enter URL
		driver.get("https://www.facebook.com/reg/");
		
		WebElement fn = driver.findElement(By.name("firstname"));
		WebElement ln = driver.findElement(By.name("lastname"));
		
		sendKeys(driver, fn, 20,"Java");
		
		sendKeys(driver, ln, 20, "Selenium");
	}
	
	public static void sendKeys(WebDriver driver, WebElement locator, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locator));
		locator.sendKeys(value);
	}
}
