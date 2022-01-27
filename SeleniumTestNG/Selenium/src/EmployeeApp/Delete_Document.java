package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Delete_Document {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		String url = "https://employee.hyenaapps.com/#/"; // For Dev 
		String url = "https://employee.hyenademos.com/#/"; // For Prod 
	    driver.get(url);
	         
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
     // Navigate to Qualification details
        Thread.sleep (3000);        
//       driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/employee/profile/familyInfo");  // For Dev
       driver.navigate().to("https://employee.hyenademos.com/#/dashboard/employee/profile/familyInfo");  // For prod 
        Thread.sleep (3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[8]/a/span"))); 
        
        //Click on Delete 
        Thread.sleep (3000);
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-documents/div[1]/div/form/div[3]/table/tbody/tr[1]/td[5]/a[2]/i"))); 
        
        // Confirm Delete
        Thread.sleep (3000);
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button  [@ class = 'swal2-confirm swal2-styled']")));
        
//        // Deny Delete 
//        Thread.sleep (3000);
//        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@ class = 'swal2-deny swal2-styled']")));
        
        
        System.out.println("Document Deleted sucessfully");
        		
        Thread.sleep(3000);
        driver.close();		
	}}
 