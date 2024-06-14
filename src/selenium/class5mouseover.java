package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class5mouseover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUP KUMAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//open browser
		driver.navigate().to("http://www.uncodemy.com");
		driver.manage().window().maximize();
		WebElement categories= driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		Thread.sleep(3000);
     	Actions a= new Actions(driver);
        a.moveToElement(categories).perform();
        WebElement st= driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
        a.moveToElement(st).perform();
        WebElement mt= driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Software Testing']"));
        mt.click();
        WebElement home= driver.findElement(By.xpath("//li[normalize-space()='Home']"));
        home.click();
        WebElement arrow= driver.findElement(By.xpath("//select[@id='course-select']"));
        arrow.click();
        WebElement arrow2= driver.findElement(By.xpath("//select[@id='city-select']"));
        arrow2.click();
       driver.navigate().back();
       Thread.sleep(2000);
       WebElement carriculam= driver.findElement(By.xpath("//div[@class='container-fluid p-0']//a[1]//button[1]"));
       carriculam.click();
       WebElement name= driver.findElement(By.xpath("//input[@placeholder='Name']"));
       name.sendKeys("ravi");
		
		
		
		
	}

	
		
		
	}

	
		
	


