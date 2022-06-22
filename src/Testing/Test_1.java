package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\soura\\\\eclipse-workspace\\\\Selenium_Project\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flygofirst.com/");
		driver.manage().window().maximize();
		
		//Finding web element for which we need to send data
		WebElement btn_oneway=driver.findElement(By.id("onewaymodal-id"));
		btn_oneway.click();
		
		WebElement txt_city= driver.findElement(By.id("roundTripbdFromView"));
		//Putting or Sending data to the Web element.
		txt_city.sendKeys("pune");
		
		WebElement txt_destination=driver.findElement(By.id("roundTripbdToInput"));
		txt_destination.sendKeys("Delhi");
		
		
		
		WebElement txt_date=driver.findElement(By.id("dp1654233966231"));
		txt_date.sendKeys("04/06/2022");
		
		WebElement txt_passanger=driver.findElement(By.className("fourcehighlight select_Div passenger_oneway"));
		txt_passanger.sendKeys("1");
		
		
		
		
		
		
	}

}
