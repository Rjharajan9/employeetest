package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Update_And_Edit_Contact_Information {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		String url = "https://employee.hyenaapps.com/#/"; // For Dev 
		String url = "https://employee.hyenademos.com/#/";  // For Prod
	    driver.get(url);
	      
	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
     // Navigate to Qualification details
        Thread.sleep (3000);        
//       driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/employee/profile/familyInfo");// For dev 
       driver.navigate().to("https://employee.hyenademos.com/#/dashboard/employee/profile/familyInfo");// For prod
        Thread.sleep (3000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[6]/a/span"))); 
        
       // Click on Edit (only in use after first update)
        Thread.sleep (3000); 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id= 'contactEdit']"))); 
        
     // Address for Permanent Address 
        driver.findElement(By.xpath("//textarea[@id = 'Address']")).clear();
        driver.findElement(By.xpath("//textarea[@id = 'Address']")).sendKeys("Rajan kumar jha #133, Ward:3, Vill: Suryapur, P.O:Sarangpur ");
        
        // City for Permanent Address 
        driver.findElement(By.xpath("//input[@id = 'City']")).clear();
        driver.findElement(By.xpath("//input[@id = 'City']")).sendKeys("Suryapur");
        
     // Country for Permanent Address 
        driver.findElement(By.xpath("//input[@name= 'country']")).clear();
        driver.findElement(By.xpath("//input[@name= 'country']")).sendKeys("India");
        
     // State for Permanent Address 
        driver.findElement(By.xpath("//input[@name= 'state']")).clear();
        driver.findElement(By.xpath("//input[@name= 'state']")).sendKeys("Bihar");
        
    // State for Permanent Address 
        driver.findElement(By.xpath("//input[@name= 'editDistrict']")).clear();
        driver.findElement(By.xpath("//input[@name= 'editDistrict']")).sendKeys("Samastipur"); 
        
     // State for Permanent Address 
        driver.findElement(By.xpath("//input[@name= 'pincode']")).clear();
        driver.findElement(By.xpath("//input[@name= 'pincode']")).sendKeys("848505");
        
        
//     // Click on Same as Permanet Address
//        driver.findElement(By.xpath("//label[@class = 'custom-control-label checbox checbox']")).click();
        
     // Address for Present Address
        driver.findElement(By.xpath("//textarea[@name= 'presentaddress']")).clear();
        driver.findElement(By.xpath("//textarea[@name= 'presentaddress']")).sendKeys("Rajan kumar jha #589, Street number: 17, Indranagar  ");
        
        // City for Present Address 
        driver.findElement(By.xpath("//input[@name= 'PresentCitys']")).clear();
        driver.findElement(By.xpath("//input[@name= 'PresentCitys']")).sendKeys("Hyderabad");
        
     // Country for Present Address 
        driver.findElement(By.xpath("//input[@name= 'PresentCountry']")).clear();
        driver.findElement(By.xpath("//input[@name= 'PresentCountry']")).sendKeys("India");
        
     // State for Present Address 
        driver.findElement(By.xpath("//input[@name= 'PresentState']")).clear();
        driver.findElement(By.xpath("//input[@name= 'PresentState']")).sendKeys("Telangana");
        
    // State for Present Address 
        driver.findElement(By.xpath("//input[@name= 'editPresentDistrict']")).clear();
        driver.findElement(By.xpath("//input[@name= 'editPresentDistrict']")).sendKeys("Hyderabad"); 
        
     // State for Present Address 
        driver.findElement(By.xpath("//input[@name= 'PresentZipCode']")).clear();
        driver.findElement(By.xpath("//input[@name= 'PresentZipCode']")).sendKeys("500033");
         
//       // Click on the Cancel button
//        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@id = 'contactCancel']"))); 
        
        // Click on the Update Button 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button [@id = 'contactUpdate']"))); 
        
        Thread.sleep (3000);
        System.out.println("Contact information updated sucessfully.");
        driver.quit();
        
	}}
 