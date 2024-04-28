import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:/Selenium_software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com/");
   
  // driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8779934346");
 //  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Activa5G");
  // driver.findElement(By.xpath("//button[@name='login']")).click();
   
  // driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
   
   driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abhishek");
   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Upadhyay");
   driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8779934346");
   driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("MT-15V2.0");
   driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("17");
   driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("OCT");
	    
	}

}
