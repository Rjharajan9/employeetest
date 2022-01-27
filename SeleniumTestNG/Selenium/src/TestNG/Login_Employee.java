package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Employee {
     
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String url = "https://employee.hyenaapps.com/#/";
	    driver.get(url);		
	}
	
	
	
	
	
	@Test
	public void invalidPassword() 
	{
		// Enter valid username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
     
     // Enter invalid password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click();
        
      //  System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        		
	}
	
	
	
	
	
	@Test
	public void invalidUsernameAndPassword() 
	{
		// Enter valid username
        driver.findElement(By.xpath("//input[@id = 'username']")).click();
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu633");
        
     // Enter invalid password
        driver.findElement(By.xpath("//input[@id = 'password']")).click();
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@124"); 
         
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click();
   	
	}
	
	
	
	
	
	@Test
	public void invalidusername() 
	{
		// Enter invalid username
        driver.findElement(By.xpath("//input[@id = 'username']")).click();
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu633");
        
     // Enter valid password
        driver.findElement(By.xpath("//input[@id = 'password']")).click();
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
   
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click();
	
	}
	
	
	
	
	
	@Test
	public void withoutUsernameAndPassword() 
	{
		
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click();     
    
	}
	
	
	
	
	
	@Test
	public void blockuser() 
	{
		// Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).click();
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("baby8266");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).click();
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@13"); 
        
     // Login
        for (int i =0; i <= 5; i++) {
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click();
    }
	}
	
	
	
	
	
	
	@Test
	public void correctUsernameAndPassword() 
	{
		// Enter correct username
        driver.findElement(By.xpath("//input[@id = 'username']")).click();
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
        
     // Enter correct password
        driver.findElement(By.xpath("//input[@id = 'password']")).click();
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
                
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click();
		
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.close();
	}
	
}
