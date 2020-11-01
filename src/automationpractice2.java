import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automationpractice2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object 
		WebDriver driver = new ChromeDriver();
		
		//an implicit wait statement that waits 10 seconds for all items to load or else it times out
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open browser and enter URL
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		Actions clicksignin = new Actions(driver);
		WebElement signinbutton = driver.findElement(By.className("login"));
		clickcalculate.click(calcbutton).build().perform();
		
		
		
	}
}
