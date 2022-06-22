package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\soura\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_name=driver.findElement(By.id("email"));
	    txt_name.sendKeys("sourabhkankekar022@gmail.com");
	    
		WebElement txt_pass=driver.findElement(By.id("pass"));
		txt_pass.sendKeys("123456789");
		
		WebElement btn_login=driver.findElement(By.id("loginbutton"));
        btn_login.click();
        
        

	    
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
