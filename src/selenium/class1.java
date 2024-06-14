package selenium;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {


	//private static final String case1 = null;

	public static  void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUP KUMAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver (); {

	driver.get("https://www.facebook.com/");
Thread.sleep(4000);












		System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.manage().window().maximize();
	Thread.sleep(6000);
driver.quit();
 driver.get("https://www.instagram.com/");

		
		
		
		
		
		
		
			
}

	}

}

