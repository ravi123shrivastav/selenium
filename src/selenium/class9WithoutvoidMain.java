package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class9WithoutvoidMain {

	String driverPath = "C:\\Users\\ANUP KUMAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

	WebDriver driver= new ChromeDriver (); 
		void Navigate() throws InterruptedException {
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		     Thread.sleep(2000);
	}
	 	void Credentials(String a,String b) throws InterruptedException{
	 		
	 		 driver.manage().window().maximize();
		     //pour username
		     WebElement txt= driver.findElement(By.xpath("//input[@placeholder='Username']"));
		     txt.sendKeys(a);
		     //pour password
		     WebElement ravi= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		     ravi.sendKeys(b);
		     //login
		     
		     
		     
		     
		     WebElement raju=driver.findElement(By.xpath("//button[@type='submit']"));
		     raju.click();
		     Thread.sleep(3000);
	 	}
	 	void Credentials2(String d) throws InterruptedException {
	 		 WebElement buzz=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
		     buzz.click();
		     Thread.sleep(5000);
	         WebElement textarea= driver.findElement(By.xpath( "//textarea[@placeholder=\"What's on your mind?\"]"));
		     textarea.sendKeys(d);
		    WebElement post= driver.findElement(By.xpath("//button[@type='submit']"));
		     post.click();
	 		
	 		
		}

		
		

}