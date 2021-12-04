package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTcThree {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        //driver.findElement(By.className("x-panel-header")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("mk pvt ltd");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("mk pvt ltd");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohanraj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kannapiran");
        
		WebElement ele1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpdwn1 = new Select(ele1);
		drpdwn1.selectByVisibleText("Other");
		
		WebElement ele2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpdwn2= new Select(ele2);
		drpdwn2.selectByValue("CATRQ_AUTOMOBILE");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("mk");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("ra");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("mr");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/1/21");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("hello");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		
		WebElement ele3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpdwn3 = new Select(ele3);
		drpdwn3.selectByVisibleText("Computer Hardware");
		
	    WebElement ele4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select drpdwn4 = new Select(ele4);
	    int size = drpdwn4.getOptions().size();
	    drpdwn4.selectByIndex(size-1);
	    
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
	    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("1234");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("test entry..ignore..");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("check discription");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("+91");
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("999900");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("mohan");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("mohan");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("mohan");
	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("coimbatore");
	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Annur");
	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("coimbatore");
	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("60028");
	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600286");
	    
	    WebElement ele5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select drpdwn5 = new Select(ele5);
	    drpdwn5.selectByValue("AA");
	    
	    
	 
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    System.out.println("Test case passed");
	    
	    
		
		
		
		
		
		
	}

}
