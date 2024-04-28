import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object identification mechanism
		//locating techniques
		//how many ways you can identify an element on page
		/*
		1. By.name(name)
		2. By.id(id)
		3. By.linkText(linkText)
		4. By.partialLinkText(partialLinkText)
		5. By.tagName(tagName)
		6. By.className(className)
		7. By.xpath(xpathExpression)
		8. By.cssSelector(cssSelector)
		*/
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.name("email")).sendKeys("8779934346");
		//driver.findElement(By.name("pass")).sendKeys("Activa5G");
		
		//driver.findElement(By.linkText("Create New Account")).click();
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//driver.findElements(By.linkText("Go to")).get(2).click();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("8779934346");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Activa5G");
		
		//driver.findElement(By.className("3704LK")).sendKeys("Iphone14");
		
		
		
		
		
		
	}

	
	}


