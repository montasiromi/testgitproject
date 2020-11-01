import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class scrolling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		//create driver object
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//SCROLL BY PIXEL
		//js.executeScript("window.scrollBy(0,1000)", "");
		
		//SCROLL BY VISIBLE ELEMENT
		//WebElement kindle = driver.findElement(By.xpath("   "));
		//js.executeScript("arguments[0].scrollIntoView();", kindle);
		
		//SCROLL TO THE END OF THE PAGE
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		
	}

}
