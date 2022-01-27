package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Add_Document_Locationspecific {	

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
        
        // Navigate to Location Specific
        Thread.sleep (3000); 
        driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/miscellaneous/locationSpecific");
        
        //Click on the Add document 
        Thread.sleep (9000); 
       driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-locationspecific/div[1]/div/div[1]/div/button")).click();
       
     //Select document type
        Select document_type = new Select(driver.findElement(By.xpath("//select[@name= 'Type' ]")));
        document_type.selectByVisibleText("Canteen Menu"); //Canteen Menu //Plant Location Plan //Fire Escape Plan // Work Safety
       //document_type.selectByIndex(4);
        
        // Select document name
        driver.findElement(By.xpath("//input [@name= 'documentName' ]")).sendKeys("Name of document");
        
        //Select description
        driver.findElement(By.xpath("//textarea[@id= 'desc1' ]")).sendKeys("Description of the file");
        
        //Select file 
        WebElement El = driver.findElement(By.xpath("//input[@id= 'File1' ]")); 
	     El.sendKeys("E:\\RAJAN KUMAR JHA\\Testing\\Topic to dicuss.pdf");
	     
	     //Select team Location
	     Thread.sleep (3000);
	     Select Team_Location = new Select(driver.findElement(By.xpath("//select [@id= 'relation' ]")));
	   //  Team_Location.selectByVisibleText(" Team ETO Stockach"); // Team ETO Stockach  // Team ETO Nuremberg // Team EKS Vaihingen/Enz //  Team ETO Wroclaw
	                                                                //  Team ETO Kunshan //  Team ETO Bengaluru //  Team ETO Grand Rapids //  Team ETO San Luis Potosi
	       Team_Location.selectByIndex(4);
	       
	       // Add Document 
	       driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-locationspecific/div[2]/div/div/div[3]/div/div/div/button[2]")).click();
	       
	       //Cancel document
	      // driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-locationspecific/div[2]/div/div/div[3]/div/div/div/button[1]")).click();
	}
}
 
