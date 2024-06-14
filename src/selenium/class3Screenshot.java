package selenium;



import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class3Screenshot {
		
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\ANUP KUMAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		     WebDriver driver= new ChromeDriver ();
		    
		     //open website
		         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		     Thread.sleep(2000);
		     driver.manage().window().maximize();
		     // username
		     WebElement txt= driver.findElement(By.xpath("//input[@placeholder='Username']"));
		     txt.sendKeys("Admin");

				TakesScreenshot ts =(TakesScreenshot)driver;
				     File src =ts.getScreenshotAs(OutputType.FILE);
				     File ravi1= new File("C:\\Users\\ANUP KUMAR\\OneDrive\\Desktop\\New folder (2)\\image.png");
				     FileUtils.copyFile(src,ravi1);
				
				
		     // password
		    WebElement ravi= driver.findElement(By.xpath("//input[@placeholder='Password']"));
		     ravi.sendKeys("admin123");
		     

				
		     //login
		     WebElement raju=driver.findElement(By.xpath("//button[@type='submit']"));
		     raju.click();
Thread.sleep(2000);
TakesScreenshot ds =(TakesScreenshot)driver;
File src1 =ds.getScreenshotAs(OutputType.FILE);
File login1= new File("C:\\Users\\ANUP KUMAR\\OneDrive\\Desktop\\New folder (2)\\image1.png");
FileUtils.copyFile(src1, login1);
Thread.sleep(5000);
				    
				     
				     
WebElement buzz=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
buzz.click();

					Thread.sleep(2000);
			         WebElement textarea= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
				     textarea.sendKeys("i am hero");
				     driver.findElement(By.xpath("//button[@type='submit']")).click();
				   TakesScreenshot rs =(TakesScreenshot)driver;
                   File src2 =rs.getScreenshotAs(OutputType.FILE);
                   File login2= new File("C:\\Users\\ANUP KUMAR\\OneDrive\\Desktop\\New folder (2)\\image1.png");
                   FileUtils.copyFile(src2, login2);
				     
				     
		     //login
		     //Thread.sleep(5000);
		    // driver.navigate().back();
		     //Thread.sleep(4000);
		     //driver.navigate().forward();
		     //driver.navigate().refresh();
		     
		     
		     
		     
	}

}
