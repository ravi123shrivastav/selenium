package selenium;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ANUP KUMAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
	driver.manage().window().maximize();
	//open browsser
 	Thread.sleep(5000);
   
	//driver.findElement(By.xpath("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette"));
 
	
   
   Actions a= new Actions(driver);
   WebElement raja= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")) ;
	
   driver.switchTo().frame(raja);
   WebElement drag= driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
   WebElement drop=  driver.findElement(By.xpath("//h4[@class='ui-widget-header']"));
   
   WebElement drag1= driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
   WebElement drop1= driver.findElement(By.xpath("//h4[@class='ui-widget-header']"));
   
   WebElement drag2=driver.findElement(By.xpath(" //img[@alt='Planning the ascent']"));
   WebElement drop2= driver.findElement(By.xpath("//h4[@class='ui-widget-header']"));
   
   WebElement drag3= driver.findElement(By.xpath(" //img[@alt='Planning the ascent']"));
   WebElement drop3= driver.findElement(By.xpath("//h4[@class='ui-widget-header']"));
   
   WebElement drag4= driver.findElement(By.xpath(" //img[@alt='Planning the ascent']"));
   WebElement drop4= driver.findElement(By.xpath("//ul[@id='gallery']"));

   
   
   
   a.dragAndDrop(drag, drop).perform();
   a.dragAndDrop(drag1, drop1).perform();
   a.dragAndDrop(drag2, drop2).perform();
   a.dragAndDrop(drag3, drop3).perform();
   a.dragAndDrop(drag4, drop4).perform();

   
   
   
   
   
   
   
   
    
  
	
    
    
    
    
    
    
    
    
    
    
    
     } 
   }