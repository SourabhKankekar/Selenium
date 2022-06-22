package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test_5_actionClass {

	public static void main(String[] args) throws InterruptedException {

//Action class is used to achieve mouse movement and keyboard action 		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soura\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//For Mouse movement find the web Element
	//	WebElement selenium_btn=driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
		
		//actions is a class 
		Actions act=new Actions(driver);//if multiple actions are there in one line then build and perform is must
	//	act.moveToElement(selenium_btn).click().build().perform();
		
		// Drag and Drop action
	//(By.xpath("(//a[@style='color:#FFFFFF;'])[5]")); here we find X-path by index	
		
		WebElement src_element=driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[5]"));
		WebElement trt_element=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(3000);
		
		
		//New Drag And Drop Action
		WebElement src_amt=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement trt_amt=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Thread.sleep(3000);
		
		
		WebElement src_sales=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement trt_sales=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		Thread.sleep(3000);
		
	//	List<WebElement> list=driver.findElements(By.xpath("//li[@class='placeholder']"));
		
		
		act.dragAndDrop(src_element, trt_element).perform();
		act.dragAndDrop(src_amt, trt_amt).perform();
		act.dragAndDrop(src_sales, trt_sales).perform();
		
	
	}

}
