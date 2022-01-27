package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_new_User {

	public static void main(String[] args) throws Throwable {
		//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://employee.hyenaapps.com/#/"; 
	    driver.get(url);
	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Neya7432");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("123456"); 
        
        
        // Click on eye icon 
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@class ='login-font toggle-password eto-eye']"))); 
       
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click();
        
        Thread.sleep(3000);
        // Current password while changing password
        driver.findElement(By.xpath("//input[@id='currentPassword']")).sendKeys("123456");
        
        //Current password while changing password
        driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("Etoapp@123");
        
        //Current password while changing password
        driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Etoapp@123");
        
       // Login Button 
        driver.findElement(By.xpath("//button[@id='loginButton']")).click();
        
        Thread.sleep(3000);
        // Click check box
        driver.findElement(By.xpath("//input[@type ='checkbox']")).click();
        
        // Click on submit button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button [@class ='btn btn-primary']")).click();
      
    }
	}