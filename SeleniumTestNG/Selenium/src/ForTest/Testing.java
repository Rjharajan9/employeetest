package ForTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;


public class Testing {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://employee.hyenaapps.com/#/"; // For dev
	    driver.get(url);
	      	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Raju9220");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@123"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
     // Click on Gruppe News for post
        Thread.sleep(9000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[1]/div/div"))); 
       
        //Enter post title
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[2]/form/div/div/div[1]/div/input")).sendKeys("Please Enter the post title."); // For dev 
                 
        //Enter Post Description 
        driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[2]/form/div/div/div[2]/div/ckeditor/div[2]/div[2]/div/p")).sendKeys("Please Enter the post title."); // For dev 
                                      
      //Attached file 
	     WebElement El = driver.findElement(By.xpath("//input  [@id= 'file']")); 
	     ((RemoteWebElement) El ).setFileDetector(new LocalFileDetector()); 
	     El.sendKeys("C:\\Users\\Rajan J\\Downloads\\Pip _ A Short Animated Film by Southeastern Guide Dogs.mp4");
	     
	     //  Click for select Approvers
	     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[2]/form/div/div/div[4]/div/p-multiselect/div/div[2]/div")));
	     
	     //Select approver
	     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[2]/form/div/div/div[4]/div/p-multiselect/div/div[4]/div/ul/p-multiselectitem[1]/li/div/div/span")));
	     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[2]/form/div/div/div[4]/div/p-multiselect/div/div[4]/div/ul/p-multiselectitem[4]/li/div/div/span")));
		 
	     // Select schedule
	     // Date 
	     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[2]/form/div/div/div[5]/div/span/i")));
		 Select year = new Select(driver.findElement(By.xpath("//select [@title = 'Select year']")));
		 year.selectByValue("2022");
		 Select month = new Select(driver.findElement(By.xpath("//select [@title = 'Select month']")));
		 month.selectByValue("1");
		 executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div [@aria-label= 'Friday, January 21, 2022']")));
	    // Time 
		 driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[2]/form/div/div/div[5]/div/ngb-timepicker/fieldset/div/div[1]/input")).sendKeys("22");
		 driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[2]/form/div/div/div[5]/div/ngb-timepicker/fieldset/div/div[3]/input")).sendKeys("22");
		 
		 // Request for pin
		 executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[3]/div[1]/div/label/span[1]")));
		
//		 // Click on cancel
//		 executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[3]/div[2]/button[1]")));
		 
		 // Click on preview 
		 executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[3]/div[2]/button[2]")));
		 executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[14]/div/div/div/button")));
		 
		 // Create post 
		 executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-walls/div/div/div/div[1]/app-gruppe/div[13]/div/div/div[3]/div[2]/button[3]")));
		 
		 
		System.out.println("Post created on gruppe  wall sucessfully");
		driver.close();
		 
	}}
 