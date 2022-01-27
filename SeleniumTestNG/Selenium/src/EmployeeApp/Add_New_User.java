package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Add_New_User {	

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
        
        // Navigate to user
        Thread.sleep (3000); 
        driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/miscellaneous/user");
        
        //Click on add user
        Thread.sleep (9000); 
        driver.findElement(By.xpath("//i[@class= 'eto-plus']")).click();
       
       // Add First name
       driver.findElement(By.xpath("//input [@formcontrolname= 'firstName']")).sendKeys("First name");
       
       //Add last name
       driver.findElement(By.xpath("//input [@formcontrolname= 'lastName']")).sendKeys("Last name");
       
       //Add Mobile number
       driver.findElement(By.xpath("//input [@formcontrolname= 'officeMobile']")).sendKeys("858585858585");
       
       //Add email id
       driver.findElement(By.xpath("//input [@formcontrolname= 'officeEmail']")).sendKeys("RJHARAJANKUMARFGSKKKL@gnaail.com");
       
       //Add Base location
       Select Base_Location = new Select(driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-users/div[3]/div/div/div[2]/form/div/div/div[5]/div/select")));
//		Base_Location.selectByVisibleText(" Stockach"); // Stockach //  Nuremberg //  Vaihingen an der Enz //  Wroclaw //  Bangalore //  Grand Rapids 
                                                        // San Luis Potosí, S.L.P.   //  Kunshan
       Base_Location.selectByIndex(4);
       
       //Add Company name
       Thread.sleep (3000);
       Select Company_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname = 'CompanyName']")));
       Company_Name.selectByIndex(2); 
//       Company_Name.selectByVisibleText(" ETO GRUPPE Beteiligungen GmbH");
       
       //Add Department
       Thread.sleep (3000);
       Select Department_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname = 'Department']")));
       Department_Name.selectByIndex(2); 
     //  Department_Name.selectByVisibleText(" Infrastructure"); // Infrastructure //  Workplace //  Supply Chain Mangement //  Finance
       
       //Add Designation 
       Select Designation = new Select(driver.findElement(By.xpath("//select[@formcontrolname = 'Designation']")));
//		User_Type.selectByVisibleText("  IT"); //  IT //   Logistik //   FiBu //  Wroclaw // Zentrale Dienste 
       Designation.selectByIndex(4);
              
       // Add user type
      Select User_Type = new Select(driver.findElement(By.xpath("//select[@formcontrolname = 'UserType']")));
//		User_Type.selectByVisibleText("Internal"); //  Internal //   External 
      User_Type.selectByIndex(2);
       
       // Add Employee type
     Select Employee_Type = new Select(driver.findElement(By.xpath("//select[@formcontrolname = 'EmploymentType']")));
//		Employee_Type.selectByVisibleText(" Temporary"); // Temporary //  Permanent 
     Employee_Type.selectByIndex(2);
     
     // Add on cancel
//    driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-users/div[3]/div/div/div[3]/div/div/button[1]")).click();
     
     //Add on update  
     driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-users/div[3]/div/div/div[3]/div/div/button[2]")).click();
   	}
}
 