package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\ANUP KUMAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver ();
	     //open website
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     Thread.sleep(2000);
	     driver.manage().window().maximize();
	     //pour username
	     WebElement txt= driver.findElement(By.xpath("//input[@placeholder='Username']"));
	     txt.sendKeys("Admin");
	     //pour password
	     WebElement ravi= driver.findElement(By.xpath("//input[@placeholder='Password']"));
	     ravi.sendKeys("admin123");
	     //login
	     WebElement raju=driver.findElement(By.xpath("//button[@type='submit']"));
	     raju.click();
	     Thread.sleep(3000);
	     WebElement buzz=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
	     buzz.click();
	     Thread.sleep(5000);
         WebElement textarea= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
	     textarea.sendKeys("i am hero");
	     WebElement post= driver.findElement(By.xpath("//button[@type='submit']"));
	     post.click();
	     Thread.sleep(3000);
	     WebElement claim= driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));
	     claim.click();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	

}
}