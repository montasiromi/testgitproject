import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BCISOtests {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\monta\\Documents\\automation course\\geckodriver.exe");
		//create driver object
		WebDriver driver = new FirefoxDriver();
		
		//an implicit wait statement that waits 10 seconds for all items to load or else it times out
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open URL
		driver.get("https://www.bcisomwei.org/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//test if website fill in works
		driver.findElement(By.name("fname")).sendKeys("Montasir");
		driver.findElement(By.name("lname")).sendKeys("Omi");
		driver.findElement(By.id("email-yui_3_17_2_1_1552579698432_3881-field")).sendKeys("montasiromi@123.com");
		//test if the "SIGN ME UP" button works
		driver.findElement(By.xpath("/html/body/div[1]/main/article/section[6]/div[2]/div/div/div/div/div/div/div/form/div[1]/div[2]/button")).click();
		
		//test the number of images on the website
		//count images and print image links
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		for(int i = 0; i < images.size(); i++) {
			System.out.println(images.get(i).getAttribute("src"));
		}
		//test to see all the unhidden links on the website
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int j = 0; j<links.size(); j++) {
			System.out.println(links.get(j).getAttribute("href"));
		}
	}

}
