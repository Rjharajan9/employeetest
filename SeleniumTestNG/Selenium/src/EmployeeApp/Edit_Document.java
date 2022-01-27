package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;


public class Edit_Document {	

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
    //   driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/employee/profile/familyInfo"); // For Dev
       driver.navigate().to("https://employee.hyenademos.com/#/dashboard/employee/profile/familyInfo"); // For Prod
        Thread.sleep (3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[8]/a/span"))); 
        
   
        //Click on Edit
        Thread.sleep (3000);
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-documents/div[1]/div/form/div[3]/table/tbody/tr[1]/td[5]/a[1]/i"))); 
        
        //Edit document Name 
        Thread.sleep (6000);  
        driver.findElement(By.xpath("//input  [@ id = 'name']")).clear();
        driver.findElement(By.xpath("//input  [@ id = 'name']")).sendKeys("Aadhar card");
        
        // Edit Description
        driver.findElement(By.xpath("//textarea[@id = 'description']")).clear();
        driver.findElement(By.xpath("//textarea[@id = 'description']")).sendKeys("Aadhar card for job");
        
        //Edit Document 
        WebElement El = driver.findElement(By.xpath("//input [@name = 'File']")); 
	     ((RemoteWebElement) El ).setFileDetector(new LocalFileDetector()); 
	     El.sendKeys("C:\\Users\\Rajan J\\Downloads\\APHYD13183550000010359_new.pdf");
	     
//	     // Click on cancel
//	     Thread.sleep (3000); 
//	     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@id = 'documentUpdateCancel']"))); 
	     
	     // Click on Update 
	     Thread.sleep (3000);
	     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@id = 'documentUpdate']"))); 
	     
	     Thread.sleep (3000);
	     System.out.println("Document Edited Sucessfully.");
	     
	     driver.close();
	     
	}}
 