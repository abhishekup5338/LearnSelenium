import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrolldownExample {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:100/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		
		Thread.sleep(2000);
		/*
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		*/
		//value =0 is x co-ordinates which is scroll page horizontally.
		//value =250 is y co-ordinates which is scroll page varticallt.
		// it will scroll 250 pixels.
		
		//driver.findElement(By.linkText("Home")).sendKeys(Keys.PAGE_DOWN);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//td[contains(text(),'My Top Open Invoice')]"))).perform(); 
		
		
		
		
		
		
		
		
		
		
		
	}

}
