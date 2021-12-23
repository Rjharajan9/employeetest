package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Add_family_Member {

	

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
        
        // Navigate to Family details
        Thread.sleep (3000);        
       driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/employee/profile/familyInfo"); 
        Thread.sleep (3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[3]/a/span")).click(); 
                                     
        //Add family member name
        driver.findElement(By.xpath("//input [@id= 'nameOfFamilyMember']")).sendKeys("Rajan Kumar Jha");
        
        // Add date of birth
        driver.findElement(By.xpath("//i[@class='eto-calendar-alt']")).click();	// Use only for updating date of birth		
		Select celender_month = new Select(driver.findElement(By.xpath("//select[@title ='Select month']")));
		celender_month.selectByVisibleText("Apr");
		Select celender_year = new Select(driver.findElement(By.xpath("//select[@title ='Select year']")));
		celender_year.selectByVisibleText("1994");
		driver.findElement(By.xpath("//div[@aria-label='Wednesday, April 27, 1994']")).click();	
		
		// Add  Relation 
		Select reltaion = new Select(driver.findElement(By.xpath("//select [@id= 'relation']")));
//		blood_grp.selectByVisibleText("Daughter");
		reltaion.selectByIndex(7);
		
		// Add mobile number
		driver.findElement(By.xpath("//input [@id= 'contactNumber']")).sendKeys("9464969357");
		
        // Add member
		//driver.findElement(By.xpath("//button[@id= 'familyAdd']")).click();
		
		// Clear data
		driver.findElement(By.xpath("//button[@id= 'familyClear']")).click();
	}
}
