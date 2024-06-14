package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class6switchtoalret {



	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\ANUP KUMAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver ();
	     //open website
	     driver.get("https://demo.automationtesting.in/Alerts.html");
	     Thread.sleep(1000);
	     driver.manage().window().maximize();
	    

	     WebElement alert1= driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']"));
	     Thread.sleep(2000);
	     
        
	     
	     
	     WebElement c= driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	     c.click();
	     Thread.sleep(2000);
	    Alert a=driver.switchTo().alert();
	   
	    a.accept();
	    
	  
    
	     Thread.sleep(1000);
	    WebElement alert2= driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
	    alert2.click();
	   
		
	    
	  
	    Thread.sleep(2000);
	    WebElement cl= driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']"));
	     cl.click();
		   a.dismiss();
		   
		 Thread.sleep(1000) ;
		 WebElement rc= driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
		 rc.click();
		
		 driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		 Thread.sleep(4000);
		// driver.findElement(By.xpath("//button[@class='btn btn-info']")).sendKeys("abc");
	     a.accept();
	}

}
