package amazo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Browsers  {

	
	public static void main(String[] args) {
		// Invoking chrome browser
				System.setProperty("webderiver.chrome.drive","/Users/DELL/eclipse-workspace/Driver/chromedriver.exe");
			
				WebDriver driver =new ChromeDriver();
				Login  l = new Login ();	
				
		        driver.manage().window().maximize();
				driver.get(l.url);
				Actions act = new Actions (driver);
				act.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']")));
				act.click(driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span"))).build().perform();
				driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(l.username);
			    act.click(driver.findElement(By.xpath("//input[@id='continue']"))).build().perform();
			    
			    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(l.pwd);
			    act.click(driver.findElement(By.xpath("//input[@id='signInSubmit']"))).build().perform();
			    
			    String currenturl=driver.getCurrentUrl();
			    System.out.println("currentUrl="+currenturl);
			    System.out.println("mainUrl="+l.url);
			    
			    if (currenturl!=l.url) {
			    	System.out.println("user succesfully logged in");
			    	
			    }
			    else {
			    	System.out.println("login failed");
			    }
			    driver.close();
	}

}
