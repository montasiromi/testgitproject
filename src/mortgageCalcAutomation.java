import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mortgageCalcAutomation {

	//exception thorwn for sleep method
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\monta\\Documents\\automation course\\geckodriver.exe");
		
		//create driver object
		WebDriver driver = new FirefoxDriver();
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\monta\\Documents\\automation course\\chromedriver.exe");
		
		//create driver object
		//WebDriver driver = new ChromeDriver();
		
		
		//an implicit wait statement that waits 10 seconds for all items to load or else it times out
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//open browser and URL
		driver.get("https://www.mortgagecalculator.org/");
		
		//count the images in the website and print the image links
		List<WebElement> elmnt = driver.findElements(By.tagName("img"));
		System.out.println("The number of images found: "+elmnt.size());
		System.out.println("Image Links:");
		for(int i = 0; i<elmnt.size(); i++) {
			System.out.println(elmnt.get(i).getAttribute("src"));
		}
		
		//count the hidden links 
		List<WebElement>links = driver.findElements(By.tagName("a"));
		int count = 0;
		for(int i = 0; i<links.size(); i++) {
			if(links.get(i).isDisplayed()) {
				count++;
			}
		}
		//prints the total number of hidden links
		System.out.println("Number of hidden links: ");
		System.out.println(links.size() - count);
		
		
		//enter home value using ID element
		driver.findElement(By.id("homeval")).sendKeys("349000");
		
		//enter downpayment using ID element
		driver.findElement(By.id("downpayment")).sendKeys("15");
		
		//click radio button for "$" using name element
		driver.findElement(By.name("param[downpayment_type]")).click();
		
		//enter interest rate using ID element
		driver.findElement(By.id("intrstsrate")).sendKeys("7");
		
		//enter loan term via ID element
		driver.findElement(By.id("loanterm")).sendKeys("35");
		
		//create month object for month dorpdown menu
		Select month = new Select(driver.findElement(By.name("param[start_month]")));
		
		//use select byVisiableText method to pick from dropdown menu
		month.selectByVisibleText("Mar");
		
		//enter the year by ID element
		driver.findElement(By.id("start_year")).sendKeys("2021");
		
		//enter property tax amount via ID
		driver.findElement(By.id("pptytax")).sendKeys("1300");
		
		//enter PMI via ID
		driver.findElement(By.id("pmi")).sendKeys("0.7");
		
		//Enter Homeinsurance amount per year via ID
		driver.findElement(By.id("hoi")).sendKeys("1200");

		//enter HOA amount via ID
		driver.findElement(By.id("hoa")).sendKeys("50");
		
		// use Select.selectByVisibleText to choose loantype
		Select loanType = new Select(driver.findElement(By.name("param[milserve]")));
		
		
		loanType.selectByVisibleText("USDA");

		// use Select.selectByVisibleText to choose buy or refinance option
		Select buyorrefi = new Select(driver.findElement(By.name("param[refiorbuy]")));
		
		buyorrefi.selectByVisibleText("Buy");
		
		// use Select.selectByVisibleText to choose credit options
		Select credit = new Select(driver.findElement(By.id("credit_rating")));
		
		credit.selectByVisibleText("Good (620 - 719)");
		
		//click Calculate via name element through mouse actions
//		Actions clickcalculate = new Actions(driver);
//		WebElement calcbutton = driver.findElement(By.name("cal"));
//		clickcalculate.click(calcbutton).build().perform();
		
		Actions clickcalculate = new Actions(driver);
		WebElement calcbutton = driver.findElement(By.xpath(xpathExpression)("cal"));
		clickcalculate.click(calcbutton).build().perform();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\monta\\Documents\\automation course\\mortgagecalc.png"));
		
		
	    //close the browser
		//driver.close();
		

	}


}
