package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion_test5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soura\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement txt_search=driver.findElement(By.xpath("//input[@name='q']"));
		txt_search.sendKeys("maven");
		
		Thread.sleep(5000);
//When We find List of web element must add //li to the x path expression.So that it will select list of web elements
		
		List<WebElement> auto_list=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		System.out.println(auto_list.size());
		
		for (int i=0;i<auto_list.size();i++) {
			String list=auto_list.get(i).getText();
			System.out.println(list);
			if(list.equals("maven surefire plugin")){
				auto_list.get(i).click();
			}
			
		}
		
		
	}

}
