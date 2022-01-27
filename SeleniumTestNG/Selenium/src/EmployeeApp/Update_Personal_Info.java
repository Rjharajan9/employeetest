package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Update_Personal_Info {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://employee.hyenaapps.com/#/";
	    driver.get(url);
	            
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("baby8266");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@123"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
     //Navigate to my profile
        Thread.sleep (5000);
        driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/employee/profile/personalInfo");
           
        // Click on Edit for user updating their profile
        Thread.sleep (3000);
        driver.findElement(By.xpath("//button [@id ='PerosonalEdits']")).click();
                
        //Update the Phone number
        Thread.sleep (3000);
        driver.findElement(By.xpath("//input[@id = 'personalMobile'] ")).clear();
        driver.findElement(By.xpath("//input[@id = 'personalMobile'] ")).sendKeys("9999999999999");
        
      //Update the email
        driver.findElement(By.xpath("//input[@name='personal_email']")).clear();
        driver.findElement(By.xpath("//input[@name='personal_email']")).sendKeys("rjha@gmail.com");
        
      //Submit gender first time
        /*Select gender = new Select(driver.findElement(By.xpath("//select[@id='Gender']")));
		gender.selectByVisibleText("Male");
		gender.selectByIndex(1);*/
        
        // Update gender
        Select gender = new Select(driver.findElement(By.xpath("//select [@id = 'editGender']")));
//		gender.selectByVisibleText("Male");
		gender.selectByIndex(3); 
                
      //Submit Marital Status first time
		/*Select status = new Select(driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-personal-info/div/div/form/div/div/form[2]/div/div/select")));
		status.selectByVisibleText("Married");
		status.selectByIndex(1);*/
				
		//Update marital status
		Select status = new Select(driver.findElement(By.xpath("//select [@formcontrolname= 'editMaritalStatus']")));
//		status.selectByVisibleText("Divorced");
		status.selectByIndex(4);
		
      //Update the Date of birth
		driver.findElement(By.xpath("//i[@class='eto-calendar-alt']")).click();	// Use only for updating date of birth		
		Select celender_month = new Select(driver.findElement(By.xpath("//select[@title ='Select month']")));
		celender_month.selectByVisibleText("Apr");
		Select celender_year = new Select(driver.findElement(By.xpath("//select[@title ='Select year']")));
		celender_year.selectByVisibleText("1994");
		driver.findElement(By.xpath("//div[@aria-label='Wednesday, April 27, 1994']")).click();	
		
      //Update the passport
		driver.findElement(By.xpath("//input [@id='passport_no']")).clear();	
		driver.findElement(By.xpath("//input [@id='passport_no']")).sendKeys("OKbjd78966544");
		
      //Update the UID
		driver.findElement(By.xpath("//input [@name ='unique']")).clear();
		driver.findElement(By.xpath("//input [@name ='unique']")).sendKeys("8455ERTff");
		
      //Update the Driving licence
		driver.findElement(By.xpath("//input [@id ='driving_licence_number']")).click();
		driver.findElement(By.xpath("//input [@id ='driving_licence_number']")).sendKeys("848505Ap");
		
      //Update the Blood group
		Select blood_grp = new Select(driver.findElement(By.xpath("//select [@name ='bld']")));
//		blood_grp.selectByVisibleText("Male");
		blood_grp.selectByIndex(3);
		
      //Update the Religion
		driver.findElement(By.xpath("//input [@name ='religion']")).clear();
		driver.findElement(By.xpath("//input [@name ='religion']")).sendKeys("Hinduism");
		
      //Update the Nationality
		driver.findElement(By.xpath("//input [@name ='nationality']")).clear();
		driver.findElement(By.xpath("//input [@name ='nationality']")).sendKeys("India");
		
		// submit the form for first time
	//	driver.findElement(By.xpath("//button[@id = 'PersonalEdit']")).click();
				
		// updating the personal info
		driver.findElement(By.xpath("//button [@id= 'personalUpdate']")).click();    
		
		
	     	     
	}

}
