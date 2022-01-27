package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Edit_Qualification_Details {	

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
        
     // Navigate to Qualification details
        Thread.sleep (3000);        
       driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/employee/profile/familyInfo"); 
        Thread.sleep (3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[4]/a/span"))); 
        
        // Search Qualification
        driver.findElement(By.xpath("//input [@name= 'SearchValue'] ")).sendKeys("B.Tech");
        
        //Click on Edit 
        Thread.sleep (3000);   
         driver.findElement(By.xpath("//i[@class = 'eto-edit-alt text-success']")).click(); 
          
        //Enter Qualification
        driver.findElement(By.xpath("// input [@ name= 'qualifications'] ")).clear();
        driver.findElement(By.xpath("// input [@ name= 'qualifications'] ")).sendKeys("10th");
        
        
        // Select Year 
        Thread.sleep (3000);
        driver.findElement(By.xpath("// input [@ id  = 'datepickerupdate'] ")).click();
        for( int i= 0; i<=1; i++)
        {
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[3]/div[3]/table/thead/tr/th[1]")).click();
        }
        Thread.sleep (3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[3]/div[3]/table/tbody/tr/td/span[2]")).click();
        
        // Enter college name
        Thread.sleep (3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-qualification-details/div[2]/div/div/div[2]/form/div/div[3]/div/div/input")).clear();
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-qualification-details/div[2]/div/div/div[2]/form/div/div[3]/div/div/input")).sendKeys("High school tiswara suryapur");
       
        // Enter University name
        Thread.sleep (3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-qualification-details/div[2]/div/div/div[2]/form/div/div[4]/div/div/input")).clear();
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-qualification-details/div[2]/div/div/div[2]/form/div/div[4]/div/div/input")).sendKeys("Bihar Board");
       
        //Submit Qualification details
        driver.findElement(By.xpath("// button[@ id= 'qualificationUpdate']")).click();
        
        //Clear Qualification Details
//        driver.findElement(By.xpath("//button[@id= 'qualificationUpdateCancel'] ")).click();
        
	}}
 
