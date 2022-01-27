package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Change_Expiration_Time {	

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
        
        // Navigate to change password
        Thread.sleep (9000);        
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/header/div[3]/ul/li[5]/a"))); 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/header/div[3]/ul/li[5]/div/a[4]")));
        
        //click on change login Expiration Time
        Thread.sleep (3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-settings/div[1]/div/div[2]/div[2]/div/div/div/ul/li[2]/a")).click(); 
        
        //Change time 
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-settings/div[3]/div/div/div[2]/form/div/div/div/div/input")).clear();
        Thread.sleep (3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-settings/div[3]/div/div/div[2]/form/div/div/div/div/input")).sendKeys("30");
        
        //Click on Update 
        Thread.sleep (3000);
       driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-settings/div[3]/div/div/div[3]/div/div/button[2]")).click();
        
        //Click on cancel
      //   driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-settings/div[3]/div/div/div[3]/div/div/button[1]")).click();
        
        
        
        
	}
}
 