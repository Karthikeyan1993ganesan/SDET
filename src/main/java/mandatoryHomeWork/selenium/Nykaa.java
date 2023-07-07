package mandatoryHomeWork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.*;

public class Nykaa {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.nykaa.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//a[@href='/'])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String actualtitle= driver.getTitle();
		String expected = "L'Oreal Paris";
		if(actualtitle.contains(expected)) System.out.println("Title contains L'Oreal Paris");
		else System.out.println("Title Not contains L'Oreal Paris");
		driver.findElement(By.className("sort-name")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//ul[@id = 'custom-scroll']//span[text() = 'Hair Care']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text() = 'Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String s = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
		if(s.equals("Shampoo")) System.out.println("filter shampoo exist");
		else System.out.println("filter shampoo not exist");
		driver.findElement(By.xpath("//img[@src='https://images-static.nykaa.com/media/catalog/product/tr:w-220,h-220,cm-pad_resize/5/2/52d9cafLP_8901526101245_1.jpg']")).click();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
		driver.findElement(By.xpath("(//button[@type='button']//span)[2]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		String mrp=driver.findElement(By.cssSelector("div#app>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div:nth-of-type(2)>div>span:nth-of-type(2)")).getText();
		System.out.println(mrp);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText());
		driver.findElement(By.xpath("//span[text() = 'Proceed']")).click();
		
		
	


		

	
		}
}



