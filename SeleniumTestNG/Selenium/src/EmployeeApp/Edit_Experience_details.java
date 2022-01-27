package EmployeeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Edit_Experience_details {	

	public static void main(String[] args) throws Throwable    {
		
	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","E:\\RAJAN KUMAR JHA\\Testing\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		String url = "https://employee.hyenaapps.com/#/"; // For dev
		String url = "https://employee.hyenademos.com/#/";  // For Prod
	    driver.get(url);
	      	      
	   // Enter username
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("shsu6333");
        
     // Enter password
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Etoapp@1234"); 
        
     // Login
        driver.findElement(By.xpath("//button[@id = 'loginButton']")).click(); 
        
     // Navigate to Experience Details
        Thread.sleep (3000);        
//       driver.navigate().to("https://employee.hyenaapps.com/#/dashboard/employee/profile/personalInfo"); // For Dev 
        JavascriptExecutor executor = (JavascriptExecutor) driver;
       executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/nav/ul/li[4]/a"))); // For prod
        Thread.sleep (3000);
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[1]/div[2]/nav/ul/li[5]/a/span"))); 
        
        //Click on edit 
        Thread.sleep (3000);
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-experience-details/div[1]/div/form/div[2]/div[2]/table/tbody/tr[1]/td[7]/a[1]/i"))); 
           
      // Edit company name 
        Thread.sleep (3000);
        driver.findElement(By.xpath("//input [@name= 'organizationsName'] ")).clear();
        driver.findElement(By.xpath("//input [@name= 'organizationsName'] ")).sendKeys("Savisoft pvt ltd");
        
      // Edit  Role 
        driver.findElement(By.xpath("// input [@name = 'designations' ]")).clear();
        driver.findElement(By.xpath("// input [@name = 'designations' ]")).sendKeys("Software automation test engineer");
        
        // Add Location 
        driver.findElement(By.xpath("// input [@name = 'locations' ]")).clear();
        driver.findElement(By.xpath("// input [@name = 'locations' ]")).sendKeys("Bihar, muzaffarpur");
        
        // Add Date of Joining 
        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-experience-details/div[2]/div/div/div[2]/form/div/div[2]/div/div/span/i"))); 
        Select joiningYear = new Select(driver.findElement(By.xpath("//select[@title ='Select year']")));
        joiningYear.selectByVisibleText("2019");
        Select joiningMonth = new Select(driver.findElement(By.xpath("//select[@title ='Select month']")));
        joiningMonth.selectByVisibleText("May");
	    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@aria-label='Monday, May 6, 2019']"))); 
	    
	    // Add Date of releving 
	    Thread.sleep (3000);
	    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("/html/body/app-root/app-main-view/body/div[1]/div/div/div/app-my-profile/div[2]/div[2]/app-experience-details/div[2]/div/div/div[2]/form/div/div[4]/div/div/span/i"))); 
        Select relevingYear = new Select(driver.findElement(By.xpath("//select[@title ='Select year']")));
        relevingYear.selectByVisibleText("2021");
        Select relevingMonth = new Select(driver.findElement(By.xpath("//select[@title ='Select month']")));
        relevingMonth.selectByVisibleText("May");
	    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@aria-label='Tuesday, May 18, 2021']"))); 
	    
	    // Update  Experience 
	    Thread.sleep (3000);
	    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("// button [@id = 'experienceUpdate' ]")));
	    
	    // Clear Update 
//	    Thread.sleep (3000);
//	    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("// button [@id = 'experienceClear']")));
		
	}}
 