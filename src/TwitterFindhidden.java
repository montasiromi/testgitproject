import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class TwitterFindhidden {

	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object 
		WebDriver driver = new ChromeDriver();
		
		//open browser and enter URL
		driver.get("https://twitter.com/");
		
		Thread.sleep(4000);
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		int count = 0;
		for(int i = 0; i<link.size(); i++) {
			if(link.get(i).isDisplayed()) {
				count++;
			}
			
		}
		System.out.println(count);
		System.out.println(link.size() - count);
		
		List<WebElement> elmnt = driver.findElements(By.tagName("input"));
		System.out.println(elmnt.size());
		
		for(int i = 0; i<elmnt.size(); i++) {
			if(elmnt.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden")) {
				if(!(elmnt.get(i).getAttribute("value").trim().isEmpty())) {
					
				} 
			}
		}
		
	}

}
