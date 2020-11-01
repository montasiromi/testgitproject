import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class walmartScroll {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		//create driver object
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//SCROLL BY PIXEL
		//js.executeScript("window.scrollBy(0,250)", "");
		
		//SCROLL BY VISIBLE ELEMENT
		//WebElement newsletter = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/section/div[1]/div/div[1]/form/button/span"));
		//js.executeScript("arguments[0].scrollIntoView();", newsletter);
		
		//SCROLL TO THE END OF THE PAGE
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		
	}

}
