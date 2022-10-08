package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yatheeshwar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sekar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("yatheesh");
		driver.findElement(By.name("departmentName")).sendKeys("Testing department");
		driver.findElement(By.name("description")).sendKeys("write down anyhting about the page");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("yatheeshwarsekar@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("testleaf_automation");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("Ajithkumar");
		driver.findElement(By.className("smallSubmit")).click();
		String t = driver.getTitle();
		System.out.println(t);
		
		
		
		
	}

}
