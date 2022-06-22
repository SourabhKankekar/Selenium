package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\soura\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?clientContext=257-2810917-5934339&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg61tU7ZNTvoyKWL_TyfEfJrpnlBS5QJzQDGInWytMRZ3AAAAAQAAAABimbXScmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2F%3Fref_%253Ddv_auth_ret&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_desktop_us&openid.mode=checkid_setup&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement txt_UserID =driver.findElement(By.id("ap_email"));
		txt_UserID.sendKeys("8407982246");
		
		WebElement txt_Pass =driver.findElement(By.id("ap_password"));
		txt_Pass.sendKeys("09876566");
		// xpath by attributes
		WebElement btn_login =driver.findElement(By.xpath("//input[@type='submit']"));
		btn_login.click();
		// xpath by text
		WebElement txt_privacy=driver.findElement(By.xpath("//a[text()='Privacy Notice']"));
		txt_privacy.click();
		String sk=driver.getCurrentUrl();
		System.out.println(sk);
		Thread.sleep(5000);
		driver.close();
		
		


		
	}

}
