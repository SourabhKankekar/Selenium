package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projet1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soura\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
		// Navigate
		driver.navigate().to("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Back
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Forward
		driver.navigate().forward();
		Thread.sleep(4000);
		
		//To get Current URL
		System.out.println(driver.getCurrentUrl());
		// To get title
		System.out.println(driver.getTitle());
		
		
		
		driver.close();
		
		
	}

}
