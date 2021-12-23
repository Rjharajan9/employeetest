package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

public class Create_post_on_social_wall {

	

	public static void main(String[] args) throws Throwable    {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://employee.hyenaapps.com/#/";
	      driver.get(url);
	      
	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("baby8266");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@123"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
            
        // Navigate to social wall
        Thread.sleep (5000);
        String clickl = Keys.chord(Keys.CONTROL,Keys.ENTER);
 		driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/ul/li[3]/a")).sendKeys(clickl);
         		 
		 //Click on create post
		 Thread.sleep (5000);	
		 driver.findElement(By.xpath("//div [@id ='descs']")).click();
		 
         //Enter post title and post discription 
		 //Thread.sleep (3000);
	     driver.findElement(By.xpath("//input [@name ='PostSocialTitle']")).sendKeys("Tested by Automation");
	     driver.findElement(By.xpath("//input [@name ='PostSocialTitle']")).sendKeys(Keys.TAB,"Tested by Automation");
	     
	     
	     //Attached file 
	     WebElement El = driver.findElement(By.id("file2")); 
	     ((RemoteWebElement) El ).setFileDetector(new LocalFileDetector()); 
	     El.sendKeys("C:\\Users\\Rajan J\\Downloads\\Pip _ A Short Animated Film by Southeastern Guide Dogs.mp4");
	     
//	     //Click on preview 
	     driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[3]/app-social/div[6]/div/div/div[3]/div[2]/button[2]")).click(); 
//	     
//	     driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[3]/app-social/div[7]/div/div/div/button")).click(); 
//	     
//	     //Request for pin
//	     driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[3]/app-social/div[5]/div/div/div[3]/div[1]/div/label/span[1]")).click();
	     
	     //Create Post
//	     driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[3]/app-social/div[5]/div/div/div[3]/div[2]/button[3]")).click();	     
	     
	}

}
