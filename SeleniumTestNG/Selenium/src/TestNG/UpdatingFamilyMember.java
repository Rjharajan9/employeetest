package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdatingFamilyMember {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://employee.hyenademos.com/#/");
		
		
		// Enter correct username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("nute7414");
        
        // Enter correct password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@123"); 
                
        // Login 
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click();
        
      //Navigate to Family details 
        Thread.sleep (9000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//i [@class = 'eto-user-profile']")));
         Thread.sleep (3000);
         executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[3]/a/span"))); 
             
	}
	
	@Test
	public void AddFamilyMember() throws InterruptedException
	{
		Thread.sleep (3000);
		driver.findElement(By.xpath("//input [@id= 'nameOfFamilyMember']")).sendKeys("Lohit");
		
		// Click on Add
		Thread.sleep (3000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id= 'familyAdd']")));
	}
	
	@Test
	public void AddDateOfBirth() throws InterruptedException
	{
		// Add date of birth
		Thread.sleep (3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-family-details/div[1]/div/form/div[1]/div[2]/div/div/span/i")).click();	// Use only for updating date of birth	
        Select celender_year = new Select(driver.findElement(By.xpath("//select[@title ='Select year']")));
		celender_year.selectByVisibleText("1993");
		Select celender_month = new Select(driver.findElement(By.xpath("//select[@title ='Select month']")));
		celender_month.selectByVisibleText("Jul");
		driver.findElement(By.xpath("//div[@aria-label='Friday, July 30, 1993']")).click();	
		
		// Click on Add
		  Thread.sleep (3000);
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		 executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id= 'familyAdd']")));
	}
	
	@Test
	public void AddRelation() throws InterruptedException
	{
		//Add Relation
		Thread.sleep (3000);
		Select reltaion = new Select(driver.findElement(By.xpath("//select [@id= 'relation']")));
		reltaion.selectByVisibleText("Daughter");
	//	reltaion.selectByIndex(7);
		
		// Click on Add
				Thread.sleep (3000);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
		        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id= 'familyAdd']")));
	}
	
	
	@Test
	public void AddMobileNumber() throws InterruptedException
	{
		// Add mobile number
		Thread.sleep (3000);
		driver.findElement(By.xpath("//input [@id= 'contactNumber']")).sendKeys("66666666666");
		
		// Click on Add
				Thread.sleep (3000);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
		        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id= 'familyAdd']")));
		
	}
   
  	@AfterMethod
	public void tearDown() throws InterruptedException  
	{
		Thread.sleep (9000);
		driver.close();
	}
}
