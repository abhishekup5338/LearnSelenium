import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   
	  // driver.findElement(By.cssSelector("input[id='email']")).sendKeys("8779934346");
	   
	  driver.findElement(By.cssSelector("#email")).sendKeys("8779934346");
	  driver.findElement(By.cssSelector("#pass")).sendKeys("Abhishek");
	   
	   
	}

}
