import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
	// System.out.print("hello java");
	 
	// int a = 10;
			 
			// System.out.println(a);
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
		/*
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		*/
	   
	   
	   
		
	}

	
		
	}


