package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Change_Password {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://employee.hyenaapps.com/#/";
	    driver.get(url);
	      
	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("baby8266");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
        // Navigate to change password
        Thread.sleep (9000);        
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/header/div[3]/ul/li[5]/a"))); 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/header/div[3]/ul/li[5]/div/a[3]"))); 
        
        //Current password
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[2]/div/div/div[2]/form/div/div[1]/div/div/input")).sendKeys("Etoapp@1234"); 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[2]/div/div/div[2]/form/div/div[1]/div/div/span"))); 
     
        //New password
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[2]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("Etoapp@123"); 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[2]/div/div/div[2]/form/div/div[2]/div/div/span[1]")));
        
      //Confirm password
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[2]/div/div/div[2]/form/div/div[3]/div/div/input")).sendKeys("Etoapp@123"); 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[2]/div/div/div[2]/form/div/div[3]/div/div/span[1]")));

        //Update password
        Thread.sleep (3000); 
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[2]/div/div/div[2]/div/div/div/button[2]")).click();
    
        //cancel
//        Thread.sleep (3000); 
//        driver.findElement(By.xpath("//button [@class = 'btn btn-primary1']")).click();
	}
}
 
