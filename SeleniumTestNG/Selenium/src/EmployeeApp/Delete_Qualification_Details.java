package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Delete_Qualification_Details {	

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
//         driver.findElement(By.xpath("//i[@class = 'eto-edit-alt text-success']")).click(); 
        
        //Click on delete
        Thread.sleep (3000);
        driver.findElement(By.xpath("// i [@class = 'eto-trash text-danger'] ")).click(); 
         
         // Confirm delete 
        driver.findElement(By.xpath("// button [@class = 'swal2-confirm swal2-styled']")).click(); 
         
//       // Deney Delete 
//        Thread.sleep (3000);
//        driver.findElement(By.xpath("// button [@class = 'swal2-cancel swal2-styled'] ")).click();
        
        }}
 