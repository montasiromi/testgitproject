import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
	//create a new WebDriver 
		WebDriver driver2 = new ChromeDriver();
		//open URL and Browser
		driver2.get("https://www.timeanddate.com/worldclock/?continent=europe");
		//maximize the browser window
		driver2.manage().window().maximize();
		//assign table the value of the entire table
		WebElement table2 = driver2.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
		//assign rows2 the value of the rows in table2
		List<WebElement> rows2 = table2.findElements(By.tagName("tr"));
		//traverse through each row
		for(int n = 0; n<rows2.size(); n++) {
			List<WebElement> columns2 = rows2.get(n).findElements(By.tagName("td"));
			for(int c = 0 ; c < columns2.size(); c++) {
				System.out.println(columns2.get(c).getText());
	
			}
		}
	}
}
