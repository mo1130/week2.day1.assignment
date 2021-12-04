package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTcOne {

	public static void main(String[] args) {
		/*
		 * Open the browser,, Load the URL ,Maximize the browser, Enter UserName, Enter
		 * Password ,Click Login, Click CRM/SFA, Click Contacts Tab, Click Create Contact,
		 * Type First Name ,Type Last Name ,Click Create Contact Button ,Print the first
		 * name and browser title, Close the browser
		 */
       
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Mohanraj");
        driver.findElement(By.id("lastNameField")).sendKeys("Kannapiran");
        driver.findElement(By.className("smallSubmit")).click();
        String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
        System.out.println(text);
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
        
        
        
		
		
		
	}

}
