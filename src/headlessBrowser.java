import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessBrowser {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		//create driver object
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		System.out.println("Title of the Page: "+driver.getTitle());
		
	}
}
