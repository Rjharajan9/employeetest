package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginAndLogout {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://employee.hyenaapps.com/#/";
	    driver.get(url);
	      
	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
     // Click on Logout
        Thread.sleep (9000);        
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/header/div[3]/ul/li[5]/a"))); 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//i[@class='eto-logout']")));
        
        // Confirm Logout
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@class='swal2-confirm swal2-styled']")));
        
        //Deney Logout
//        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@class='swal2-deny swal2-styled']")));
       
        
   	}
}
 