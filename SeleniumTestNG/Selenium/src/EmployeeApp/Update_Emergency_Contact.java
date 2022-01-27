package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Update_Emergency_Contact {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		String url = "https://employee.hyenaapps.com/#/"; // For dev
		String url = "https://employee.hyenademos.com/#/";  // For Prod
	    driver.get(url);
	      	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
     // Navigate to Experience Details
        Thread.sleep (3000); 
        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/employee/profile/personalInfo"); // For dev 
        driver.navigate().to("https://employee.hyenademos.com/#/dashboard/employee/profile/personalInfo"); // For prod 
        Thread.sleep (3000);
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[7]/a/span"))); 
        
        // Click on edit 
        Thread.sleep (3000);
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-emergency-contact/div/div/form/div/div/div[7]/button"))); 
     
        // Contact person name 
        driver.findElement(By.xpath("//input [@name= 'name']")).clear(); 
        driver.findElement(By.xpath("//input [@name= 'name']")).sendKeys("Rajan kumar Jha"); 
        
        // Contact number
        driver.findElement(By.xpath("//input[@name= 'Number']")).clear(); 
        driver.findElement(By.xpath("//input[@name= 'Number']")).sendKeys("8340401597"); 
        
        // Email Id 
        driver.findElement(By.xpath("//input[@name= 'empemail']")).clear(); 
        driver.findElement(By.xpath("//input[@name= 'empemail']")).sendKeys("jharajankumar@gmail.com"); 
        
        // Address Line 1
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-emergency-contact/div/div/form/div/div/div[4]/div/input")).clear(); 
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-emergency-contact/div/div/form/div/div/div[4]/div/input")).sendKeys("vill: Suryapur, P.O: Sarangpur");
        
     // Address Line 2
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-emergency-contact/div/div/form/div/div/div[5]/div/input")).clear(); 
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-emergency-contact/div/div/form/div/div/div[5]/div/input")).sendKeys("Dist: Samastipur, Bihar, 845005");
        
        // Other Information 
        driver.findElement(By.xpath("//textarea[@name= 'OtherInformation']")).clear(); 
        driver.findElement(By.xpath("//textarea[@name= 'OtherInformation']")).sendKeys("This is done by automation");
        
        //Click on Update 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id= 'emergencyUpdate']"))); 
        
        // Click on Cancel 
//        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id= 'emergencyCancel']"))); 
       
        
        System.out.println("Emergency contact updated sucessfully.");
        
        Thread.sleep (3000);
        driver.close();
        
        
        
	}
	}
 