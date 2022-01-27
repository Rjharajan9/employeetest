package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Add_Qualification_Details {	

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
        
     // Navigate to Qualification details
        Thread.sleep (3000);        
       driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/employee/profile/familyInfo"); 
        Thread.sleep (3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[4]/a/span"))); 
        
        //Enter Qualification
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-qualification-details/div[1]/div/form/div[1]/div[1]/div/div/input")).sendKeys("Rajan kumar Jha");
        
        // Select Year 
        Thread.sleep (3000);
        driver.findElement(By.xpath("//input [@id ='datepicker']")).click();
        for( int i= 0; i<=2; i++)
        {
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[3]/div[3]/table/thead/tr/th[1]")).click();
        }
        Thread.sleep (3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[3]/div[3]/table/tbody/tr/td/span[2]")).click();
        
        // Enter collage name
        Thread.sleep (3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-qualification-details/div[1]/div/form/div[1]/div[3]/div/div/input")).sendKeys("SLIIET, LONGOWAL");
       
        // Enter University name
        Thread.sleep (3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-qualification-details/div[1]/div/form/div[1]/div[4]/div/div/input")).sendKeys("SLIIET, LONGOWAL");
       
        //Submit Qualification details
        driver.findElement(By.xpath("//button[@id= 'qualificationAdd'] ")).click();
        
        //Clear Qualification Details
//        driver.findElement(By.xpath("//button[@id= 'qualificationClear'] ")).click();
	}}
 