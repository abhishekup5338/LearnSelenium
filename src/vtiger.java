import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class vtiger {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/C:/Selenium Software/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:100/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
        driver.findElement(By.linkText("New Lead")).click();
		
		driver.findElement(By.name("salutationtype")).sendKeys("Mr.");
		
		driver.findElement(By.name("firstname")).sendKeys("Abhishek");
		
		driver.findElement(By.name("lastname")).sendKeys("Upadhyay");
		
		driver.findElement(By.name("company")).sendKeys("Shankar Mobile");
		
		driver.findElement(By.name("designation")).sendKeys("Sales Executive");
		
		driver.findElement(By.name("phone")).sendKeys("022-1234864");
		
		driver.findElement(By.name("mobile")).sendKeys("8779934346");
		
		driver.findElement(By.name("fax")).sendKeys("None");
		
		driver.findElement(By.name("email")).sendKeys("abhishekup5338@gmail.com");
		
		driver.findElement(By.name("website")).sendKeys("abhi.com");
		
		driver.findElement(By.name("leadsource")).sendKeys("Employee");
		
		driver.findElement(By.name("industry")).sendKeys("Engineering");
		
		driver.findElement(By.name("leadstatus")).sendKeys("Hot");
		
		driver.findElement(By.name("rating")).sendKeys("Active");
		
		driver.findElement(By.name("annualrevenue")).sendKeys("$130000");
		
		driver.findElement(By.name("noofemployees")).sendKeys("24");
		
		driver.findElement(By.name("yahooid")).sendKeys("abhishek286@yahoo.com");
		
		driver.findElements(By.name("assigntype")).get(1).click();
		
		driver.findElement(By.name("lane")).sendKeys("Road No.22");
		
		driver.findElement(By.name("code")).sendKeys("400604");
		
		driver.findElement(By.name("city")).sendKeys("Thane");
		
		driver.findElement(By.name("country")).sendKeys("India");
		
		driver.findElement(By.name("state")).sendKeys("Maharastra");
		
		driver.findElement(By.name("description")).sendKeys("dedicated to work");
		
		driver.findElement(By.name("button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
