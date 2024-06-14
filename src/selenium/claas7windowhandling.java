package selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class claas7windowhandling {

	public static void main(String[] args) throws InterruptedException{
   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUP KUMAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		WebElement inst= driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		inst.click();
		String parentwindow=driver.getWindowHandle();
		Set<String>allwindow= driver.getWindowHandles();
		//by ireatetive
		for(String ravi:allwindow) {
			if(!(parentwindow.contentEquals(ravi))) {
			
			driver.switchTo().window(ravi);
		}
		
		}
		
		
		
		WebElement user= driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("ravishrivastav");
		Thread.sleep(3000);
		
		WebElement rahul=driver.findElement(By.xpath("//input[@name='password']"));
		rahul.sendKeys("ravishrivastav");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.quit();
		
		
		
		
		
		
//	]//
	}

	
}
		
