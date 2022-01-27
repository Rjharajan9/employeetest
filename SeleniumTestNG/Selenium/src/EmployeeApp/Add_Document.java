package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;


public class Add_Document {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://employee.hyenaapps.com/#/"; //for dev 
//		String url = "https://employee.hyenademos.com/#/"; //for Prod 
	    driver.get(url);
	      
	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Shsu6333");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
     // Navigate to Qualification details
        Thread.sleep (3000);        
       driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/employee/profile/familyInfo"); // For dev 
//       driver.navigate().to("https://employee.hyenademos.com/#/dashboard/employee/profile/familyInfo"); // For Prod 
        Thread.sleep (3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[8]/a/span"))); 
        
        //Select Document Type
        Select Document_Type = new Select(driver.findElement(By.xpath("//select [@id = 'doc']")));
        Document_Type.selectByVisibleText("Aadhar Card"); // Aadhar Card  // PAN Card // Passport //  Offer Letter  //  Appointment Letter  //Form 16
//        Document_Type.selectByIndex(1);
        
        //Update document Name 
        Thread.sleep (3000);  
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-documents/div[1]/div/form/div[1]/div[2]/div/div/input")).sendKeys("Aadhar card");
        
        // Update Description
        driver.findElement(By.xpath("//textarea[@id = 'desc']")).sendKeys("Aadhar card");
        
        //Upload Document 
        WebElement El = driver.findElement(By.id("file2")); 
	     ((RemoteWebElement) El ).setFileDetector(new LocalFileDetector()); 
	     El.sendKeys("C:\\Users\\Rajan J\\Downloads\\APHYD13183550000010359_new.pdf");
	     
//	     // Click on clear
//	     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@id = 'documentClear']"))); 
	       
	     // Click on submit 
	     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@id = 'documentAdd']"))); 
	     
	     System.out.println("Document Added Sucessfully.");
	     
	     Thread.sleep(3000);
	     driver.close();
	}}
 