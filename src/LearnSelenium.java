import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Welcome to mission test hub");
		
	  System.setProperty("webdriver.chrome.driver", "C:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("8268293676");
		driver.findElement(By.name("pass")).sendKeys("Activa5G");
		driver.findElement(By.name("login")).click();
		
		
		
		
		
	}
		
	}
