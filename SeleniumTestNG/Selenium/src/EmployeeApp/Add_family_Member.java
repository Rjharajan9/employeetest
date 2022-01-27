package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Add_family_Member {

	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		String url = "https://employee.hyenaapps.com/#/"; // For Dev 
		String url = "https://employee.hyenademos.com/#/";  // For dev 
	    driver.get(url);
	     
	       
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Shsu6333");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
        //Navigate to Family details 
        Thread.sleep (9000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//i [@class = 'eto-user-profile']")));
         Thread.sleep (3000);
         executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[3]/a/span"))); 
                                   
        //Add family member name
        driver.findElement(By.xpath("//input [@id= 'nameOfFamilyMember']")).sendKeys("Lohit");
         
        // Add date of birth
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id=\"content\"]/app-my-profile/div[2]/div[2]/app-family-details/div[1]/div/form/div[1]/div[2]/div/div/span/i"))); 	
        Select celender_year = new Select(driver.findElement(By.xpath("//select[@title ='Select year']")));
		//celender_year.selectByVisibleText("1993");
		celender_year.selectByValue("1993");
		Select celender_month = new Select(driver.findElement(By.xpath("//select[@title ='Select month']")));
//		celender_month.selectByVisibleText("Jul");
		celender_month.selectByValue("7");
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@aria-label='Friday, July 30, 1993']")));
		
		// Add  Relation 
		Select reltaion = new Select(driver.findElement(By.xpath("//select [@id= 'relation']")));
		reltaion.selectByVisibleText("Daughter");
	//	reltaion.selectByIndex(7);
		
		// Add mobile number
		driver.findElement(By.xpath("//input [@id= 'contactNumber']")).sendKeys("66666666666");
		
        // Add member
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id= 'familyAdd']")));
		
		// Clear data
//		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id= 'familyClear']")));
		
		Thread.sleep (3000);
		System.out.println("Family member added sucessfully.");
		
		Thread.sleep (3000);
		driver.quit();
	}
}
