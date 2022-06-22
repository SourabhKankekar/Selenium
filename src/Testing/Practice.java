package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soura\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search_box=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search_box.sendKeys("Kolhapur");
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		Thread.sleep(2000);
		list.get(2).click();
		driver.close();
	}

}
