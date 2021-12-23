package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Block_User_With_Invalid_Login {

	public static void main(String[] args) {
		//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://employee.hyenaapps.com/#/"; 
	    driver.get(url);
	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).click();
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).click();
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@123"); 
        
        // Click on eye icon 
       // driver.findElement(By.xpath("//span[@class = 'login-font toggle-password eto-eye-off']")).click();
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click();
    }


	}


