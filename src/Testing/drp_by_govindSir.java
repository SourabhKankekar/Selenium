package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drp_by_govindSir {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Batch_10_Selenium\\Drivers\\chromedriver_win32 (4)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/newtours/register.php");
	    driver.manage().window().maximize();
	    
	    // dropdown
	    WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
	    
	    handleDropDown(drp_country,"ANTARCTICA");
	    handleDropDown(drp_country,"ANTARCTICA");
	    
	    Select drp=new Select(drp_country);
	   
	   // drp.selectByIndex(4);
	    Thread.sleep(2000);
	   // drp.selectByValue("AMERICAN SAMOA");
	    
	    System.out.println(drp.getFirstSelectedOption().getText());
	    
	    
	    // deal --> drop options ---> 
	    List<WebElement> optionlist=drp.getOptions();
	    System.out.println(optionlist.size()); // 264
	    
	    Thread.sleep(2000);
	    for(int i=0;i<optionlist.size();i++) {
	    	Thread.sleep(2000);
	    	String option=optionlist.get(i).getText();
	    	System.out.println(option);
	    	
	    	drp.selectByVisibleText("ANTARCTICA");
	    	
	    	if(optionlist.get(i).getText().equals("ANTARCTICA")) { // condition
	    		 drp.selectByVisibleText("ANTARCTICA");
	    		 break;
	    	}
	    }   
	}
	
	public static void handleDropDown(WebElement element,String text) {
		Select drp=new Select(element);
		drp.selectByVisibleText(text);
	}
	}


