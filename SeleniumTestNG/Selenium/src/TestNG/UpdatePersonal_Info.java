package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UpdatePersonal_Info {
	

	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://employee.hyenademos.com/#/");
		
		// Enter correct username
        driver.findElement(By.xpath("//input[@id = 'username']")).click();
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
        
     // Enter correct password
        driver.findElement(By.xpath("//input[@id = 'password']")).click();
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
                
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click();
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.close();
	}
	

}
