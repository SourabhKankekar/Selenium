package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_4 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\soura\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//WebElement
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement txt_pass=driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement btn_login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		//Actions
		if (txt_email.isEnabled()==true && txt_pass.isDisplayed()==true) {
			txt_email.sendKeys("8407982246");}
		else {
			System.out.println("Email is Disabled");
		}
		
		
		//txt_email.sendKeys("8407982246");
		txt_pass.sendKeys("123456789");
		btn_login.click();
		
		String sk=driver.getCurrentUrl();
		System.out.println(sk);
		
		
		Thread.sleep(5000);
		driver.close();
		
		//button[@id='loginbutton']
		
		
		
	}

}
