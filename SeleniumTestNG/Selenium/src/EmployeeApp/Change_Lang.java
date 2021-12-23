package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Change_Lang {
	
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
        
        // Change language
        Thread.sleep (6000);    
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@id= 'languageDropdown']")));
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/header/div[3]/ul/li[1]/div/button[4]/span")));   
        
        //To change in English --> /html/body/app-root/app-main-view/body/div[1]/div/header/div[3]/ul/li[1]/div/button[1]/span
        //To change in German --> /html/body/app-root/app-main-view/body/div[1]/div/header/div[3]/ul/li[1]/div/button[2]/span
       //To change in Polish -->  /html/body/app-root/app-main-view/body/div[1]/div/header/div[3]/ul/li[1]/div/button[3]/span
      //To change in chinese -->  /html/body/app-root/app-main-view/body/div[1]/div/header/div[3]/ul/li[1]/div/button[4]/span
      //To change in Spanish -->  /html/body/app-root/app-main-view/body/div[1]/div/header/div[3]/ul/li[1]/div/button[5]/span
        
	}
}
