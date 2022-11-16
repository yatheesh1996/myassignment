package marathon_3_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClassSalesForce {
	public ChromeDriver driver;
	public String filename;
	public int sheetindex;

	@Parameters ({"url","username","pwd"})
	@BeforeMethod
	public void preConditionMethod(String url,String username, String pwd) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver=new ChromeDriver(ch);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-r7")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("content");
		driver.findElement(By.xpath("//mark[text()='Content']/parent::p")).click();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException{
		
		return IntegrateDataFromXLToSalesforce.readDataFromExcel(filename, sheetindex);
		
	}
	
	@AfterMethod
	public void postConditionMethod() {
		driver.close();
	}

}
