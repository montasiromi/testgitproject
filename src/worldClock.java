import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class worldClock {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/worldclock/");
		
	    WebElement table = driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
		
	    
	    List <WebElement> rows = table.findElements(By.tagName("tr"));
	   for(int i = 0 ; i<rows.size(); i++) {
	    	List <WebElement> columns = rows.get(i).findElements(By.tagName("td"));
	    	for(int j = 0; j<columns.size(); j++) {
	    		System.out.println(columns.get(j).getText()+"   ");
	    	}
	    }
	
	}
}
