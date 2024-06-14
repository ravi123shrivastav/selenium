package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class8visibilityofelement {

	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\ANUP KUMAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver ();
	     //open website
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     Thread.sleep(2000);
	     driver.manage().window().maximize();
	     
	     
	   WebElement rahul= driver.findElement(By.xpath("//input[@placeholder='Username']"));
	   
	     rahul.sendKeys("Admin");
	     
	   Thread.sleep(2000);
	   WebElement ravi= driver.findElement(By.xpath("//input[@placeholder='Password']"));
	   ravi.sendKeys("admin123");
	   
	   WebElement rohan= driver.findElement(By.xpath("//button[@type='submit']"));
	   rohan.click();	     
	   
	   Thread.sleep(4000); 
	   WebElement myinfo= driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
	  
	   myinfo.click();
	   Thread.sleep(2000);
	  WebElement fe= driver.findElement(By.xpath("//label[normalize-space()='Female']"));
	   
	   if (fe.isEnabled() && fe.isSelected()) {
	  fe.click();}
	   Thread.sleep(3000);
	   WebElement save= driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']"));
	   save.click();
	   Thread.sleep(3000);
	   
	   WebElement save1= driver.findElement(By.xpath("//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']"));
	   boolean  a = save1.isDisplayed();
	   
	   
	   
	   
	   
	   
	//  WebElement male= driver.findElement(By.xpath("//label[normalize-space()='Male']")) ;
	   
	//   Thread.sleep(5000);
	 //  if (male.isEnabled() && male.isSelected()) {
	  // male.click();}
	 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	     
	     
	     
	     

	}

}
