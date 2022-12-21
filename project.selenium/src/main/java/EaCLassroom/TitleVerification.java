package EaCLassroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TitleVerification {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		
		System.setProperty("webdriver.chrome.driver", "/Users/miremon/eclipse-workspace/Eclipse-Workspace/project.selenium/Driver/chromedriver");
		
		//browser open
		driver = new ChromeDriver();
		
		//Maximizing Browser Window
		driver.manage().window().maximize();
		
		
	//	driver.get("https://www.facebook.com");
		
	  // Thread.sleep(2000);
		
		//WebElement passwordfield1=driver.findElement(By.xpath("//input[@aria-label='Password']"));
	//	passwordfield1.sendKeys("abc");

	//	Thread.sleep(2000);
	//	WebElement create_an_acc=driver.findElement(By.linkText("Create new account"));
	//	create_an_acc.click();

		 //  Thread.sleep(3000);
		   
		  // WebElement custom=driver.findElement(By.xpath("(//input[@name='sex'])[3]"));
		  // custom.click();

		driver.get("https://www.amazon.com");
		WebElement accandlist=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions abc=new Actions(driver);
		abc.moveToElement(accandlist).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
