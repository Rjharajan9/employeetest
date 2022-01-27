package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpdatePersonal_Info {
	

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
        
      //Navigate to my profile
        Thread.sleep (9000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//i [@class = 'eto-user-profile']")));   
        
        Thread.sleep (9000);
        // Click on Edit for user updating their profile
           executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@id= 'PerosonalEdits']")));   
           
	}
	
	@Test
	public void UpdatePhonenumber() throws InterruptedException 
	{
		 Thread.sleep (9000);
        driver.findElement(By.xpath("//input[@id = 'personalMobile'] ")).clear();
        driver.findElement(By.xpath("//input[@id = 'personalMobile'] ")).sendKeys("55555533330");
        
        // updating the personal info
        Thread.sleep (9000);
     	driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();
	}
	
	@Test
	public void updateEmail() throws InterruptedException
	{
		//Update the email
		Thread.sleep (9000);
        driver.findElement(By.xpath("//input[@name='personal_email']")).clear();
        driver.findElement(By.xpath("//input[@name='personal_email']")).sendKeys("rjha@gmail.com");
        
     // updating the personal info
        Thread.sleep (9000);
     	driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();
	}
	
	
	@Test
	public void updateGender() throws InterruptedException
	{
//		//Submit gender first time
//        Select gender = new Select(driver.findElement(By.xpath("//select[@id='Gender']")));
//		gender.selectByVisibleText("Male");
//		gender.selectByIndex(1);
        
        // Update gender
		 Thread.sleep (9000);
        Select gender = new Select(driver.findElement(By.xpath("//select [@id = 'editGender']")));
//		gender.selectByVisibleText("Male");
		gender.selectByIndex(3); 
		
	     // updating the personal info
        Thread.sleep (9000);
     	driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();
	}
	
	
	@Test
	public void updateMaritalStatus() throws InterruptedException
	{
		//Submit Marital Status first time
		/*Select status = new Select(driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-personal-info/div/div/form/div/div/form[2]/div/div/select")));
		status.selectByVisibleText("Married");
		status.selectByIndex(1);*/
						
		//Update marital status
		 Thread.sleep (9000);
		Select status = new Select(driver.findElement(By.xpath("//select [@formcontrolname= 'editMaritalStatus']")));
//		status.selectByVisibleText("Divorced");
		status.selectByIndex(4);
		
	     // updating the personal info
        Thread.sleep (9000);
     	driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();
	}
	 
	@Test 
	public void UpdateDateofBirth() throws InterruptedException
	{
		//Update the Date of birth
		Thread.sleep (9000);
		driver.findElement(By.xpath("//i[@class='eto-calendar-alt']")).click();	// Use only for updating date of birth	
		Select celender_year = new Select(driver.findElement(By.xpath("//select[@title ='Select year']")));
		celender_year.selectByVisibleText("1994");
		Select celender_month = new Select(driver.findElement(By.xpath("//select[@title ='Select month']")));
		celender_month.selectByVisibleText("Apr");
		driver.findElement(By.xpath("//div[@aria-label='Wednesday, April 27, 1994']")).click();
		
		// updating the personal info
        Thread.sleep (9000);
     	driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();
	}
	
	@Test
	public void UpdatePassPortNumber() throws InterruptedException
	{
		 //Update the passport
		 Thread.sleep (9000);
		driver.findElement(By.xpath("//input [@id='passport_no']")).clear();	
		driver.findElement(By.xpath("//input [@id='passport_no']")).sendKeys("OKbjd78966544");
		
		// updating the personal info
        Thread.sleep (9000);
     	driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();
	}
	
	@Test
	public void UpdateUID() throws InterruptedException
	{
		 //Update the UID
		 Thread.sleep (9000);
		driver.findElement(By.xpath("//input [@name ='unique']")).clear();
		driver.findElement(By.xpath("//input [@name ='unique']")).sendKeys("8455ERTff");
		
		// updating the personal info
        Thread.sleep (9000);
     	driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();
	}
	
	@Test
	public void UpdateDrivingLicence() throws InterruptedException
	{
		 //Update the Driving licence
		 Thread.sleep (9000);
		driver.findElement(By.xpath("//input [@id ='driving_licence_number']")).click();
		driver.findElement(By.xpath("//input [@id ='driving_licence_number']")).sendKeys("848505Ap");
		
		// updating the personal info
        Thread.sleep (9000);
     	driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();
	}
	
	@Test
	public void UpdatebloodGroup() throws InterruptedException
	{
		//Update the Blood group
		 Thread.sleep (9000);
				Select blood_grp = new Select(driver.findElement(By.xpath("//select [@name ='bld']")));
//				blood_grp.selectByVisibleText("Male");
				blood_grp.selectByIndex(3);
				
				// updating the personal info
		        Thread.sleep (9000);
		     	driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();
	}
	
	@Test
	public void UpdateReligion() throws InterruptedException
	{
		//Update the Religion
		 Thread.sleep (9000);
		driver.findElement(By.xpath("//input [@name ='religion']")).clear();
		driver.findElement(By.xpath("//input [@name ='religion']")).sendKeys("Hinduism");
				
		// updating the personal info
		   Thread.sleep (9000);
		   driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();
	}
	
	@Test
	public void UpdateNationality() throws InterruptedException
	{
		//Update the Nationality
		  Thread.sleep (9000);
			driver.findElement(By.xpath("//input [@name ='nationality']")).clear();
			driver.findElement(By.xpath("//input [@name ='nationality']")).sendKeys("India");
				
//		 updating the personal info
		 Thread.sleep (9000);
		 driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException  
	{
		Thread.sleep (9000);
		driver.close();
	}
	

}
