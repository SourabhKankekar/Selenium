package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggest_prac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soura\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement txt_search=driver.findElement(By.xpath("//input[@name='q']"));
		txt_search.sendKeys("maven");
		Thread.sleep(5000);
		List<WebElement> auto_list=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		auto_list.get(4).click();
	}

}

//FindOut the X-path for all list first and then save it  into any name and give the return type as 
// List<WebElement>
// then get that ref. var. name .get() method and put the argument as a index number.