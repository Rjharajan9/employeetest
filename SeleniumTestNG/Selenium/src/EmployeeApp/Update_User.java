package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Update_User {	

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
        
        //Search for user
        Thread.sleep (12000); 
        driver.findElement(By.xpath("//input[@name = 'SearchValue']")).sendKeys("NuTe5008");
            
       //Edit User
       driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-users/div[2]/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr/td[10]/a[1]/i")).click(); 
       
       // Edit first name
       driver.findElement(By.xpath(" //input [@id= 'First name']")).clear();
       driver.findElement(By.xpath(" //input [@id= 'First name']")).sendKeys("First name");
       
       //Edit last name
       driver.findElement(By.xpath("//input [@id= 'Last name']")).clear();
       driver.findElement(By.xpath("//input [@id= 'Last name']")).sendKeys("Last name");
       
       //Edit Mobile number
       driver.findElement(By.xpath("//input [@name= 'Officenumber']")).clear();
       driver.findElement(By.xpath("//input [@name= 'Officenumber']")).sendKeys("858585858585");
       
       //Edit email id
       driver.findElement(By.xpath("//input [@name= 'Officeemailid']")).clear();
       driver.findElement(By.xpath("//input [@name= 'Officeemailid']")).sendKeys("RJHARAJANKUMARFGSKKKL@gnaail.com");
       
       //Edit Base location
       Select Base_Location = new Select(driver.findElement(By.xpath("//select[@name= 'team_location']")));
//		Base_Location.selectByVisibleText(" Stockach"); // Stockach //  Nuremberg //  Vaihingen an der Enz //  Wroclaw //  Bangalore //  Grand Rapids 
                                                        // San Luis Potosí, S.L.P.   //  Kunshan
       Base_Location.selectByIndex(4);
       
       //Edit Company name
       Select Company_Name = new Select(driver.findElement(By.xpath("//select[@name= 'comapanyname']")));
       Company_Name.selectByIndex(1); ;
       
       //Edit Designation 
       Select Designation = new Select(driver.findElement(By.xpath("//select[@name= 'dsgntn']")));
//		User_Type.selectByVisibleText("  IT"); //  IT //   Logistik //   FiBu //  Wroclaw // Zentrale Dienste 
       Designation.selectByIndex(4);
              
       // Edit user type
      Select User_Type = new Select(driver.findElement(By.xpath("//select[@name= 'usertype']")));
//		User_Type.selectByVisibleText("Internal"); //  Internal //   External 
      User_Type.selectByIndex(2);
       
       // Edit Employee type
     Select Employee_Type = new Select(driver.findElement(By.xpath("//select[@name= 'employementType']")));
//		Employee_Type.selectByVisibleText(" Temporary"); // Temporary //  Permanent 
     Employee_Type.selectByIndex(2);
     
     // Click on cancel
    // driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-users/div[4]/div/div/div[3]/div/div/button[1]")).click();
     
     //Click on update  
     driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-users/div[4]/div/div/div[3]/div/div/button[2]")).click();
   	}
}
 