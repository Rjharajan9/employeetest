package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Delete_Experience_Details {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://employee.hyenaapps.com/#/"; // For dev
//		String url = "https://employee.hyenademos.com/#/";  // For Prod
	    driver.get(url);
	      	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
     // Navigate to Experience Details
        Thread.sleep (3000);        
       driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/employee/profile/personalInfo"); // For Dev 
        JavascriptExecutor executor = (JavascriptExecutor) driver;
//       executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/nav/ul/li[4]/a"))); // For prod
        Thread.sleep (3000);
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[5]/a/span"))); 
        
        //Click on delete Experience
        Thread.sleep (3000);
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-experience-details/div[1]/div/form/div[2]/div[2]/table/tbody/tr[1]/td[7]/a[2]/i"))); 
           
        // Confirm Delete 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("// button [@class = 'swal2-confirm swal2-styled']")));
        
        // Deney Delete
//        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("// button [@class = 'swal2-deny swal2-styled']"))); 
        
        System.out.println("Experience details deleted sucessfully");
        
        driver.close();
       		
	}
	}
 