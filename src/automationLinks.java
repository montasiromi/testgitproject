import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class automationLinks {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object 
		WebDriver driver = new ChromeDriver();
		
		//open browser and enter URL
		driver.get("https://www.amazon.com/");
		
		//All links have the tagName a
		List<WebElement>links = driver.findElements(By.tagName("a"));
		int count = 0;
		for(int i = 0; i<links.size(); i++) {
			if(links.get(i).isDisplayed()) {
				count++;
			}
		}
		
		System.out.println(count);
		System.out.println(links.size() - count);
	}
}
