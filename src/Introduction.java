import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) {
		// Invoking browser
		System.setProperty("webderiver.chrome.drive","/Users/DELL/eclipse-workspace/Driver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		String Url="https://rahulshettyacademy.com";
		driver.get(Url);
		String Tittle=driver.getTitle();
		System.out.println("Tittle:"+Tittle);
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println("CurrentUrl:"+CurrentUrl);
		//Register User 
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.id("name")).sendKeys("Rohini");
		driver.findElement(By.id("email")).sendKeys("rohinighule091@gmail.com");
		driver.findElement(By.name("allowMarketingEmails")).click();
		driver.findElement(By.id("otp-login-btn")).click();
		
				
		
		//driver.close();
	}

}
