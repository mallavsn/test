package seleniumjava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 {
	
	@Test
	void test2() {	
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\malla\\eclipse-workspace\\test\\src\\test\\resources\\drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.yahoo.com");
		
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\malla\\Downloads\\Chrome-se\\chromedriver-win64-116\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Users\\malla\\Downloads\\Chrome-se\\chrome-win64-116\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.yahoo.com");*/
		
		/*ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setBrowserVersion("116"); //you can specify any desired version
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com/"); */
		
		

	}
	}


