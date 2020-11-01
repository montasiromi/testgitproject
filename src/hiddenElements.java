import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenElements {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object 
		WebDriver driver = new ChromeDriver();
		
		//open browser and enter URL
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		List<WebElement> numberofElements = driver.findElements(By.tagName("input"));
		//Printing total number of hidden Elements
		System.out.println(numberofElements.size());
		
		for(int i = 0 ; i < numberofElements.size(); i++) {
			//Print all hidden input tag
			if(numberofElements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden")) {
				//check for empty text
				if(!(numberofElements.get(i).getAttribute("value").trim().isEmpty())) {
					//print all hidden Element texts
					//trim = allows you to ignore the empty spaces
					System.out.println("Hidden Element Text= " + i + " " + numberofElements.get(i).getAttribute("value").trim());
				}
			}
		}
	}
}
