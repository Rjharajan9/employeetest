package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Add_Contact_Member {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://employee.hyenaapps.com/#/";  // Dev Link
//		String url = "https://employee.hyenademos.com/#/";  // Prod link 
	    driver.get(url);
	           
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
        // Navigate to Help & support
        Thread.sleep (3000); 
        driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/miscellaneous/help");  //For Dev 
//        driver.navigate().to("https://employee.hyenademos.com/#/dashboard/miscellaneous/help"); // For Prod
       
        // Click on Add member
        Thread.sleep (3000); 
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//i [@class = 'eto-plus']")));        
        
        //Select support type
        Select status = new Select(driver.findElement(By.xpath("//select[@id = 'Supporttype']")));
//		status.selectByVisibleText("HR"); //Finance //Network
		status.selectByIndex(3);
        
		 //Select Name
		driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-help/div[2]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("Rajan kumar jha");
		
		//Select Email
		driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-help/div[2]/div/div/div[2]/form/div/div[3]/div/div/input")).sendKeys("rjharajankumar@gmail.com");
		
		//Select Phone number
		driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-help/div[2]/div/div/div[2]/form/div/div[4]/div/div/input")).sendKeys("9464969357");
		
		//Select Other info
		driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-help/div[2]/div/div/div[2]/form/div/div[5]/div/div/textarea")).sendKeys("Details for help");
		
		//Click on cancel button
//		Thread.sleep (6000);
//		driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-help/div[2]/div/div/div[3]/div/div/button[1]")).click();
		 
		//Click on add button
		Thread.sleep (6000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-help/div[2]/div/div/div[3]/div/div/button[2]")).click();
		
		System.out.println("Contact Mamber Added sucessfully");
		driver.close();
		
	}
}
 
