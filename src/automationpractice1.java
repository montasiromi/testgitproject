import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class automationpractice1 {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object 
		WebDriver driver = new ChromeDriver();
		
		//an implicit wait statement that waits 10 seconds for all items to load or else it times out
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open browser and enter URL
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		//count images and print image links
				List<WebElement> imgs = driver.findElements(By.tagName("img"));
				System.out.println(imgs.size());
				
				for(int i = 0; i < imgs.size(); i++) {
					System.out.println(imgs.get(i).getAttribute("src"));
				}
				
		//count the hidden links 
				List<WebElement>hidden = driver.findElements(By.tagName("a"));
				int count = 0;
				for(int i = 0; i<hidden.size(); i++) {
					if(hidden.get(i).isDisplayed()) {
						count++;
					}
				}
				//prints the total number of hidden links
				System.out.println("Number of hidden links: ");
				System.out.println(hidden.size() - count);
				
				
		
		
		driver.findElement(By.id("email")).sendKeys("montasiromi@xyz.com");
		driver.findElement(By.id("passwd")).sendKeys("12334567");
		
		Actions clicks = new Actions(driver);
		WebElement signinbutton = driver.findElement(By.xpath("//*[@id='SubmitLogin']/span"));
		clicks.click(signinbutton).build().perform();
		
		
		driver.findElement(By.id("email_create")).sendKeys("montasiromi@xyz.com");
		
		
		WebElement createacct = driver.findElement(By.xpath("//*[@id='SubmitCreate']/span"));
		clicks.click(createacct).build().perform();

		//search hats
		driver.findElement(By.id("search_query_top")).sendKeys("hats");
		driver.findElement(By.name("submit_search")).click();
		
		//takes a Screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\monta\\Documents\\automation course\\practicepage.jpg"));
		
	}
}
