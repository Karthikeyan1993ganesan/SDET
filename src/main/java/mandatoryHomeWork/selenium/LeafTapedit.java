package mandatoryHomeWork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.*;


public class LeafTapedit {	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ppicartons");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("karthik");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ganesan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("gk");
		driver.findElement(By.name("departmentName")).sendKeys("ppi");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("box manufacturing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ppicartons@gmail.com");
		WebElement selectElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//Now use select
		Select select = new Select(selectElement);
		select.selectByVisibleText("Georgia");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("hi hello");
		driver.findElement(By.name("submitButton")).click();
		String actualTitle=driver.getTitle();
		String expectedTitle = "View Lead | opentaps CRM";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		}
}
