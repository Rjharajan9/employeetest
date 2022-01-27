package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Make_User_as_Top_Admin {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://employee.hyenaapps.com/#/"; // For dev 
//		String url = "https://employee.hyenademos.com/#/"; // For Prod
	    driver.get(url);
	      
	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
        // Navigate to user
        Thread.sleep (3000); 
        driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/miscellaneous/user"); // For dev 
//        driver.navigate().to("https://employee.hyenademos.com/#/dashboard/miscellaneous/user"); // For Prod
        
        //Search for user
        Thread.sleep (12000); 
        driver.findElement(By.xpath("//input[@name = 'SearchValue']")).sendKeys("resa9434");
        
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        
       // make user as Top admin
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-users/div[2]/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr/td[9]/label/span[1]"))); 
      
        // Confirm for team Admin 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@class = 'swal2-confirm swal2-styled']"))); 
        
        //Deney for team admin 
//        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@class = 'swal2-cancel swal2-styled']"))); 
        
        System.out.println("User become Top Admin sucessfully.");
        
        Thread.sleep(3000);
        driver.close();     
   	}
}
 