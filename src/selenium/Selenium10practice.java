package selenium;

import java.awt.Window;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium10practice {
	

	public static void main( String []args) {
		
	System.setProperty("WebDriver.Chrome.Driver","\"C:\\\\Users\\\\ANUP KUMAR\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe\");");
	
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[@title='Make your next career move to our brilliant company.']")).click();
	
	String parentwindow = driver.getWindowHandle();
	Set<String> allwindow= driver.getWindowHandles();
	for(String rahul: allwindow) {
	if(!(parentwindow.contentEquals(rahul))) {
		
	
		
		driver.switchTo().window(rahul);
	}
	  
	    
	     }
		
	WebElement ttt=	driver.findElement(By.xpath("//input[@id='u_0_5u_7p']"));
		ttt.sendKeys("raviravi");
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	

	
	 
	
