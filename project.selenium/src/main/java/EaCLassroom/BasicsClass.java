package EaCLassroom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsClass {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		
		System.setProperty("webdriver.chrome.driver", "/Users/miremon/eclipse-workspace/Eclipse-Workspace/project.selenium/Driver/chromedriver");
		
		//browser open
		driver = new ChromeDriver();
		
		//Maximizing Browser Window
		driver.manage().window().maximize();
		
      	//to go any url
		driver.get("https://www.amazon.com/");
		
		
		//wait 6 sec
		Thread.sleep(6000);
		
		//Refresh
		driver.navigate().refresh();
		
		//back button
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//forward 
		driver.navigate().forward();
		
		//get session id;
		String sessionid=driver.getWindowHandle();
		System.out.println(sessionid);
		
		//getting the url in consol
	    String urlofcurrentpage=driver.getCurrentUrl();
	    System.out.println(urlofcurrentpage);
	    
	    //getting the title of the page
	    String pagetitle=driver.getTitle();
	    System.out.println(pagetitle);
		
		
		
		
		
		
		
	}
	
}
