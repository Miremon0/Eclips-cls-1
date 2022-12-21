package EaCLassroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		
		System.setProperty("webdriver.chrome.driver", "/Users/miremon/eclipse-workspace/Eclipse-Workspace/project.selenium/Driver/chromedriver");
		
		//browser open
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		Thread.sleep(4000);
		
		//locating Email field
		WebElement emailfield=driver.findElement(By.id("email"));
		
		//click on email method
		emailfield.click();
		
		//write eal@gmail 
		emailfield.sendKeys("eal@gmail");
		
		Thread.sleep(1000);
		
		//locate password field
		WebElement passwordfield=driver.findElement(By.name("pass"));
		
		//write pass @abc123
		passwordfield.click();
		passwordfield.sendKeys("@abc123");
		
		WebElement loginbutton=driver.findElement(By.name("Login"));
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		emailfield.clear();
		
		
	}

}
