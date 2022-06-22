package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drp_dwn_handling {

	public static void main(String[] args) throws Exception {

// Drop down handling by using select class. We can use select class to handle the drop down.  
// only when the tag name is select. so first find out the xpath expression. 
// then create a object of a select class Select drp=new Select() and pass the web element as argument in that
// ref. var. of find element and use the ref. var. of select class to select that drop down.		
// there are 3ways to select dropdown 1).selectByIndex 2).selectByText 3).selectByVisibleText		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soura\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement drp_day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select drp=new Select(drp_day);
		drp.selectByIndex(8); // Selecting drop down by index
		Thread.sleep(2000);
		
		WebElement drp_mnth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select drpd=new Select(drp_mnth);
		drpd.selectByVisibleText("Dec");
	//	drpd.selectByValue("12"); //Selecting Drop down by Value
		Thread.sleep(2000);
		
		WebElement drp_year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select drpdy=new Select(drp_year);
		drpdy.selectByVisibleText("1996"); //Selecting Drop down by visible Text.
		Thread.sleep(4000);
		
		WebElement radio_btn=driver.findElement(By.xpath("//label[text()='Male']"));
		radio_btn.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}







