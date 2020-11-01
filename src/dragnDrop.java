import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragnDrop {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object 
		WebDriver driver = new ChromeDriver();
		
		//open browser and enter URL
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(4000);
		
		//to interact with an iframe
		driver.switchTo().frame(0);
		
		Actions action1 = new Actions(driver);
		
		WebElement dropElement = driver.findElement(By.id("draggable"));
		WebElement dropsourceElement = driver.findElement(By.id("droppable"));
		
		//action1.clickAndHold(dropElement).moveToElement(dropsourceElement).release().build().perform();
		action1.dragAndDrop(dropElement, dropsourceElement).build().perform();
		
		
		

	}

}
