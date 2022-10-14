package week1day2selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLeadsComNameEdit {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("yatheeshwar");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1])")).click();
		//driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1])")).click();
		//driver.findElement(By.xpath("//a[text()='Yatheeshwar'][1]")).click();
		System.out.println("the title of the page :  "+driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("leaftaps");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println("the edited company name :  "+driver.findElement(By.id("viewLead_companyName_sp")).getText());
		driver.close();
		
		
		

	}

}
